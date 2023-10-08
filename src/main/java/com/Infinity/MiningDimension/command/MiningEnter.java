package com.Infinity.MiningDimension.command;

import com.Infinity.MiningDimension.config.ModCommonConfigs;
import com.Infinity.MiningDimension.world.dimension.ModDimensions;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.Util;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.TicketType;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.EntityTeleportEvent;

import java.util.Objects;
import java.util.UUID;

public class MiningEnter {
    private static final SimpleCommandExceptionType INVALID_POSITION =
            new SimpleCommandExceptionType(new TranslatableComponent("commands.teleport.invalidPosition"));

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("mining").executes(MiningEnter::execute));
    }

    private static int execute(CommandContext<CommandSourceStack> command) throws CommandSyntaxException {
        if (command.getSource().getEntity() instanceof Player player) {
            ResourceKey<Level> dimension = ModDimensions.MINING_KEY;
            ServerLevel lev = player.getServer().getLevel(dimension);
            teleport(player, lev, ModCommonConfigs.X.get(), ModCommonConfigs.Y.get(), ModCommonConfigs.Z.get(), 0f, 0f);
        }
        return Command.SINGLE_SUCCESS;
    }

    private static void teleport(Entity entity,ServerLevel destination_level,double x,double y,double z,float yaw,float pitch) throws CommandSyntaxException {

        EntityTeleportEvent.TeleportCommand event = ForgeEventFactory.onEntityTeleportCommand(entity, x, y, z);
        if (event.isCanceled()) {
            return;
        }
        x = event.getTargetX();
        y = event.getTargetY();
        z = event.getTargetZ();
        BlockPos blockpos = new BlockPos(x, y, z);
        if (Level.isInSpawnableBounds(blockpos)) {
            yaw = Mth.wrapDegrees(yaw);
            pitch = Mth.wrapDegrees(pitch);
            if (entity instanceof ServerPlayer player) {
                ChunkPos chunkpos = new ChunkPos(new BlockPos(x, y, z));
                destination_level.getChunkSource().addRegionTicket(
                        TicketType.POST_TELEPORT,
                        chunkpos,
                        1,
                        player.getId()
                );
                if (destination_level != player.level && !player.isSleeping()) {
                    player.stopRiding();
                    player.remove(Entity.RemovalReason.CHANGED_DIMENSION);
                    player.teleportTo(destination_level, x, y, z, yaw, pitch);
                    player.sendMessage(new TranslatableComponent("Woooooosh"), Util.NIL_UUID);
                } else {
                    player.sendMessage(new TranslatableComponent("Tente não estar dormindo"), Util.NIL_UUID);
                    return;
                }
                player.onUpdateAbilities();
            } else {
                throw INVALID_POSITION.create();
            }
        }
    }
}
