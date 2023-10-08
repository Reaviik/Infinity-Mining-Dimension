package com.Infinity.MiningDimension.world.feature.mekanism;

import com.Infinity.MiningDimension.config.MekanismCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class MekanismConfiguredFeatures {
     public static final Holder<ConfiguredFeature<OreConfiguration, ?>> OSMIUM_ORE = FeatureUtils.register("imd_mekanism_osmium_ore", Feature.ORE, new OreConfiguration(MekanismReplaceables.OSMIUM_ORE_REPLACEABLES, MekanismCommonConfigs.OSMIUM_SIZE.get()));
     public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TIN_ORE = FeatureUtils.register("imd_mekanism_tin_ore", Feature.ORE, new OreConfiguration(MekanismReplaceables.TIN_ORE_REPLACEABLES, MekanismCommonConfigs.TIN_SIZE.get()));
     public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LEAD_ORE = FeatureUtils.register("imd_mekanism_lead_ore", Feature.ORE, new OreConfiguration(MekanismReplaceables.LEAD_ORE_REPLACEABLES, MekanismCommonConfigs.LEAD_SIZE.get()));
     public static final Holder<ConfiguredFeature<OreConfiguration, ?>> URANIUM_ORE = FeatureUtils.register("imd_mekanism_uranium_ore", Feature.ORE, new OreConfiguration(MekanismReplaceables.URANIUM_ORE_REPLACEABLES, MekanismCommonConfigs.URANIUM_SIZE.get()));
     public static final Holder<ConfiguredFeature<OreConfiguration, ?>> FLUORITE_ORE = FeatureUtils.register("imd_mekanism_fluorite_ore", Feature.ORE, new OreConfiguration(MekanismReplaceables.FLUORITE_ORE_REPLACEABLES, MekanismCommonConfigs.FLUORITE_SIZE.get()));

     public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_OSMIUM_ORE = FeatureUtils.register("imd_mekanism_deepslate_osmium_ore", Feature.ORE, new OreConfiguration(MekanismReplaceables.DEEPSLATE_OSMIUM_ORE_REPLACEABLES, MekanismCommonConfigs.DEEPSLATE_OSMIUM_SIZE.get()));
     public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_TIN_ORE = FeatureUtils.register("imd_mekanism_deepslate_osmium_tin_ore", Feature.ORE, new OreConfiguration(MekanismReplaceables.DEEPSLATE_TIN_ORE_REPLACEABLES, MekanismCommonConfigs.DEEPSLATE_TIN_SIZE.get()));
     public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_LEAD_ORE = FeatureUtils.register("imd_mekanism_deepslate_osmium_lead_ore", Feature.ORE, new OreConfiguration(MekanismReplaceables.DEEPSLATE_LEAD_ORE_REPLACEABLES, MekanismCommonConfigs.DEEPSLATE_LEAD_SIZE.get()));
     public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_URANIUM_ORE = FeatureUtils.register("imd_mekanism_deepslate_osmium_uranium_ore", Feature.ORE, new OreConfiguration(MekanismReplaceables.DEEPSLATE_URANIUM_ORE_REPLACEABLES, MekanismCommonConfigs.DEEPSLATE_URANIUM_SIZE.get()));
     public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_FLUORITE_ORE = FeatureUtils.register("imd_mekanism_deepslate_fluorite_ore", Feature.ORE, new OreConfiguration(MekanismReplaceables.DEEPSLATE_FLUORITE_ORE_REPLACEABLES, MekanismCommonConfigs.DEEPSLATE_FLUORITE_SIZE.get()));

}
