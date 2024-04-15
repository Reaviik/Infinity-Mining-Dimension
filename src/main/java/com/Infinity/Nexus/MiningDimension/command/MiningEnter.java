package com.Infinity.Nexus.MiningDimension.command;

import com.Infinity.Nexus.MiningDimension.InfinityNexusDim;
import com.Infinity.Nexus.MiningDimension.config.ModCommonConfigs;
import com.Infinity.Nexus.MiningDimension.world.dimension.ModDimensions;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.Util;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.TicketType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.EntityTeleportEvent;

import java.io.*;

public class MiningEnter {
    private static final SimpleCommandExceptionType INVALID_POSITION =
            new SimpleCommandExceptionType(new TranslatableComponent("commands.teleport.invalidPosition"));

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("mining").executes(MiningEnter::execute));
        dispatcher.register(Commands.literal("minerar").executes(MiningEnter::execute));
        dispatcher.register(Commands.literal("mina").executes(MiningEnter::execute));
        dispatcher.register(Commands.literal("mine").executes(MiningEnter::execute));
    }

    private static int execute(CommandContext<CommandSourceStack> command) throws CommandSyntaxException {
        if (command.getSource().getEntity() instanceof Player player) {
            ResourceKey<Level> dimension = ModDimensions.MINING_KEY;
            ResourceKey<Level> dimension2 = Level.OVERWORLD;
            ServerLevel lev = player.getLevel().dimension() == dimension ? player.getServer().getLevel(dimension2) : player.getServer().getLevel(dimension);
            teleport(player, lev, ModCommonConfigs.X.get(), ModCommonConfigs.Y.get(), ModCommonConfigs.Z.get());
        }
        return Command.SINGLE_SUCCESS;
    }

    private static void teleport(Entity entity, ServerLevel destinationLevel, double x, double y, double z) throws CommandSyntaxException {
        EntityTeleportEvent.TeleportCommand event = ForgeEventFactory.onEntityTeleportCommand(entity, x, y, z);
        if (event.isCanceled()) return;

        x = event.getTargetX();
        y = event.getTargetY();
        z = event.getTargetZ();

        BlockPos blockPos = new BlockPos(x, y, z);
        if (!Level.isInSpawnableBounds(blockPos)) return;

        if (!(entity instanceof ServerPlayer player)) throw INVALID_POSITION.create();

        ChunkPos chunkPos = new ChunkPos(new BlockPos(x, y, z));
        if (player.getLevel().dimension() == ServerLevel.OVERWORLD) {
            savePlayerCoordinates(player.getName().getString(), player.getX(), player.getY(), player.getZ());
        }
        destinationLevel.getChunkSource().addRegionTicket(
                TicketType.POST_TELEPORT,
                chunkPos,
                1,
                player.getId()
        );

        if (destinationLevel != player.getLevel() && !player.isSleeping() && destinationLevel != player.getServer().getLevel(Level.OVERWORLD)) {
            player.stopRiding();
            player.changeDimension(destinationLevel);
            player.teleportTo(destinationLevel, x, y, z, 0f, 0f);
            player.sendMessage(new TranslatableComponent("Woooooosh"), Util.NIL_UUID);

        } else if (destinationLevel == player.getServer().getLevel(Level.OVERWORLD) && !player.isSleeping()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(InfinityNexusDim.folder + "/" + player.getName().getString() + ".json"))){
                File folder = new File(InfinityNexusDim.folder + "/" + player.getName().getString() + ".json");
                if (folder.exists()) {
                    JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

                    double oldX = jsonObject.get("x").getAsDouble();
                    double oldY = jsonObject.get("y").getAsDouble();
                    double oldZ = jsonObject.get("z").getAsDouble();

                    player.stopRiding();
                    player.changeDimension(destinationLevel);
                    player.teleportTo(destinationLevel, oldX, oldY, oldZ, 0f, 0f);
                    player.sendMessage(new TranslatableComponent("Retornando para casa"), Util.NIL_UUID);
                }
                // Do whatever is needed with the loaded coordinates
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        player.onUpdateAbilities();
    }
    public static void savePlayerCoordinates(String playerName, double x, double y, double z) {
        JsonObject playerData = new JsonObject();
        playerData.addProperty("playerName", playerName);
        playerData.addProperty("x", x);
        playerData.addProperty("y", y);
        playerData.addProperty("z", z);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(playerData);

        File folder = new File(InfinityNexusDim.folder);
        if (!folder.exists()) {
            folder.mkdirs(); // Cria os diretórios se não existirem
        }

        try (FileWriter file = new FileWriter(InfinityNexusDim.folder +"/"+ playerName + ".json")) {
            file.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
