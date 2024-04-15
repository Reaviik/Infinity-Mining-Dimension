package com.Infinity.Nexus.MiningDimension.world.feature.gobber;

import com.Infinity.Nexus.MiningDimension.config.GobberCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class GobberConfiguredFeatures {
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GOBBER_ORE = FeatureUtils.register("imd_gobber_gobber_ore", Feature.ORE, new OreConfiguration(GobberReplaceables.GOBBER_ORE_REPLACEABLES, GobberCommonConfigs.GOBBER_SIZE.get()));
    
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_GOBBER_ORE = FeatureUtils.register("imd_gobber_deepslate_gobber_ore", Feature.ORE, new OreConfiguration(GobberReplaceables.DEEPSLATE_GOBBER_ORE_REPLACEABLES, GobberCommonConfigs.DEEPSLATE_GOBBER_SIZE.get()));
    
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_GOBBER_ORE = FeatureUtils.register("imd_gobber_nether_gobber_ore", Feature.ORE, new OreConfiguration(GobberReplaceables.NETHER_GOBBER_ORE_REPLACEABLES, GobberCommonConfigs.NETHER_GOBBER_SIZE.get()));
    
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_GOBBER_ORE = FeatureUtils.register("imd_gobber_end_gobber_ore", Feature.ORE, new OreConfiguration(GobberReplaceables.END_GOBBER_ORE_REPLACEABLES, GobberCommonConfigs.END_GOBBER_SIZE.get()));
}
