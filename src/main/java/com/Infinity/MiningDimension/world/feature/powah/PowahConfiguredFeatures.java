package com.Infinity.MiningDimension.world.feature.powah;

import com.Infinity.MiningDimension.config.PowahCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class PowahConfiguredFeatures {
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> URANINITE_ORE = FeatureUtils.register("imd_powah_uraninite_ore", Feature.ORE, new OreConfiguration(PowahReplaceables.URANINITE_ORE_REPLACEABLES, PowahCommonConfigs.URANINITE_SIZE.get()));
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> URANINITE_POOR_ORE = FeatureUtils.register("imd_powah_uraninite_poor_ore", Feature.ORE, new OreConfiguration(PowahReplaceables.URANINITE_POOR_ORE_REPLACEABLES, PowahCommonConfigs.URANINITE_POOR_SIZE.get()));
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> URANINITE_DENSE_ORE = FeatureUtils.register("imd_powah_uraninite_dense_ore", Feature.ORE, new OreConfiguration(PowahReplaceables.URANINITE_DENSE_ORE_REPLACEABLES, PowahCommonConfigs.URANINITE_DENSE_SIZE.get()));

   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DRY_ICY_ORE = FeatureUtils.register("imd_powah_dry_ice_ore", Feature.ORE, new OreConfiguration(PowahReplaceables.DRY_ICE_ORE_REPLACEABLES, PowahCommonConfigs.DRY_ICE_SIZE.get()));

   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_URANINITE_ORE = FeatureUtils.register("imd_powah_deepslate_uraninite_ore", Feature.ORE, new OreConfiguration(PowahReplaceables.DEEPSLATE_URANINITE_ORE_REPLACEABLES, PowahCommonConfigs.DEEPSLATE_URANINITE_SIZE.get()));
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_URANINITE_POOR_ORE = FeatureUtils.register("imd_powah_deepslate_uraninite_poor_ore", Feature.ORE, new OreConfiguration(PowahReplaceables.DEEPSLATE_URANINITE_POOR_ORE_REPLACEABLES, PowahCommonConfigs.DEEPSLATE_URANINITE_POOR_SIZE.get()));
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_URANINITE_DENSE_ORE = FeatureUtils.register("imd_powah_deepslate_uraninite_dense_ore", Feature.ORE, new OreConfiguration(PowahReplaceables.DEEPSLATE_URANINITE_DENSE_ORE_REPLACEABLES, PowahCommonConfigs.DEEPSLATE_URANINITE_DENSE_SIZE.get()));
    

}
