package com.Infinity.MiningDimension.event;

import com.Infinity.MiningDimension.InfinityMiningDimension;
import com.Infinity.MiningDimension.command.MiningEnter;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = InfinityMiningDimension.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event){
        MiningEnter.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event) {
        if(!event.getPlayer().isRemoved()) {
            event.getPlayer().getPersistentData().putIntArray(InfinityMiningDimension.MOD_ID + "homepos",
                    event.getOriginal().getPersistentData().getIntArray(InfinityMiningDimension.MOD_ID + "homepos"));
        }
    }
}
