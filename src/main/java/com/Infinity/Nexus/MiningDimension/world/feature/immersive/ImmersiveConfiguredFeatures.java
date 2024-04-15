package com.Infinity.Nexus.MiningDimension.world.feature.immersive;

import com.Infinity.Nexus.MiningDimension.config.ImmersiveCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class ImmersiveConfiguredFeatures {
   public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BAUXITE_ORE = FeatureUtils.register("imd_immersive_bauxite_ore", Feature.ORE, new OreConfiguration(ImmersiveReplaceables.BAUXITE_ORE_REPLACEABLES, ImmersiveCommonConfigs.BAUXITE_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LEAD_ORE = FeatureUtils.register("imd_immersive_lead_ore", Feature.ORE, new OreConfiguration(ImmersiveReplaceables.LEAD_ORE_REPLACEABLES, ImmersiveCommonConfigs.LEAD_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SILVER_ORE = FeatureUtils.register("imd_immersive_silver_ore", Feature.ORE, new OreConfiguration(ImmersiveReplaceables.SILVER_ORE_REPLACEABLES, ImmersiveCommonConfigs.SILVER_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NICKEL_ORE = FeatureUtils.register("imd_immersive_nickel_ore", Feature.ORE, new OreConfiguration(ImmersiveReplaceables.NICKEL_ORE_REPLACEABLES, ImmersiveCommonConfigs.NICKEL_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> URANIUM_ORE = FeatureUtils.register("imd_immersive_uranium_ore", Feature.ORE, new OreConfiguration(ImmersiveReplaceables.URANIUM_ORE_REPLACEABLES, ImmersiveCommonConfigs.URANIUM_SIZE.get()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_BAUXITE_ORE = FeatureUtils.register("imd_immersive_deepslate_bauxite_ore", Feature.ORE, new OreConfiguration(ImmersiveReplaceables.DEEPSLATE_BAUXITE_ORE_REPLACEABLES, ImmersiveCommonConfigs.DEEPSLATE_BAUXITE_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_LEAD_ORE = FeatureUtils.register("imd_immersive_deepslate_lead_ore", Feature.ORE, new OreConfiguration(ImmersiveReplaceables.DEEPSLATE_LEAD_ORE_REPLACEABLES, ImmersiveCommonConfigs.DEEPSLATE_LEAD_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_SILVER_ORE = FeatureUtils.register("imd_immersive_deepslate_silver_ore", Feature.ORE, new OreConfiguration(ImmersiveReplaceables.DEEPSLATE_SILVER_ORE_REPLACEABLES, ImmersiveCommonConfigs.DEEPSLATE_SILVER_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_NICKEL_ORE = FeatureUtils.register("imd_immersive_deepslate_nickel_ore", Feature.ORE, new OreConfiguration(ImmersiveReplaceables.DEEPSLATE_NICKEL_ORE_REPLACEABLES, ImmersiveCommonConfigs.DEEPSLATE_NICKEL_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_URANIUM_ORE = FeatureUtils.register("imd_immersive_deepslate_uranium_ore", Feature.ORE, new OreConfiguration(ImmersiveReplaceables.DEEPSLATE_URANIUM_ORE_REPLACEABLES, ImmersiveCommonConfigs.DEEPSLATE_URANIUM_SIZE.get()));
    

}
