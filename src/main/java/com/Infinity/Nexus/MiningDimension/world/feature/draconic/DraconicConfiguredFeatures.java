package com.Infinity.Nexus.MiningDimension.world.feature.draconic;

import com.Infinity.Nexus.MiningDimension.config.DraconicCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class DraconicConfiguredFeatures {
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DRACONIUM_ORE = FeatureUtils.register("imd_draconic_draconium_ore", Feature.ORE, new OreConfiguration(DraconicReplaceables.DRACONIUM_ORE_REPLACEABLES, DraconicCommonConfigs.DRACONIUM_SIZE.get()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_DRACONIUM_ORE = FeatureUtils.register("imd_draconic_deepslate_draconium_ore", Feature.ORE, new OreConfiguration(DraconicReplaceables.DEEPSLATE_DRACONIUM_ORE_REPLACEABLES, DraconicCommonConfigs.DEEPSLATE_DRACONIUM_SIZE.get()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_DRACONIUM_ORE = FeatureUtils.register("imd_draconic_nether_draconium_ore", Feature.ORE, new OreConfiguration(DraconicReplaceables.NETHER_DRACONIUM_ORE_REPLACEABLES, DraconicCommonConfigs.NETHER_DRACONIUM_SIZE.get()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_DRACONIUM_ORE = FeatureUtils.register("imd_draconic_end_draconium_ore", Feature.ORE, new OreConfiguration(DraconicReplaceables.END_DRACONIUM_ORE_REPLACEABLES, DraconicCommonConfigs.END_DRACONIUM_SIZE.get()));

}
