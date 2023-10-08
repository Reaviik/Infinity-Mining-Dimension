package com.Infinity.MiningDimension.world;

import com.Infinity.MiningDimension.InfinityMiningDimension;
import com.Infinity.MiningDimension.block.custom.InfinityMiningPortal;
import com.Infinity.MiningDimension.world.dimension.ModDimensions;
import com.Infinity.MiningDimension.world.gen.ModOreGeneration;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InfinityMiningDimension.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }

}