package com.Infinity.Nexus.MiningDimension.event;

import com.Infinity.Nexus.MiningDimension.InfinityNexusDim;
import com.Infinity.Nexus.MiningDimension.command.MiningEnter;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InfinityNexusDim.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event){
        MiningEnter.register(event.getDispatcher());
    }

    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event) {
        if(!event.getPlayer().isRemoved()) {
            event.getPlayer().getPersistentData().putIntArray(InfinityNexusDim.MOD_ID + "homepos",
                    event.getOriginal().getPersistentData().getIntArray(InfinityNexusDim.MOD_ID + "homepos"));
        }
    }
}
