package com.Infinity.Nexus.MiningDimension.world;

import com.Infinity.Nexus.MiningDimension.InfinityNexusDim;
import com.Infinity.Nexus.MiningDimension.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InfinityNexusDim.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }
}