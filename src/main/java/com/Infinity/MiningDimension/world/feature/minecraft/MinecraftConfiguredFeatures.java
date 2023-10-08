package com.Infinity.MiningDimension.world.feature.minecraft;

import com.Infinity.MiningDimension.config.MinecraftCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class MinecraftConfiguredFeatures {
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> COAL_ORE = FeatureUtils.register("imd_coal_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.COAL_ORE_REPLACEABLES, MinecraftCommonConfigs.COAL_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> COPPER_ORE = FeatureUtils.register("imd_copper_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.COPPER_ORE_REPLACEABLES, MinecraftCommonConfigs.COPPER_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> IRON_ORE = FeatureUtils.register("imd_iron_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.IRON_ORE_REPLACEABLES, MinecraftCommonConfigs.IRON_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GOLD_ORE = FeatureUtils.register("imd_gold_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.GOLD_ORE_REPLACEABLES, MinecraftCommonConfigs.GOLD_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> LAPIS_ORE = FeatureUtils.register("imd_lapis_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.LAPIS_ORE_REPLACEABLES, MinecraftCommonConfigs.LAPIS_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> REDSTONE_ORE = FeatureUtils.register("imd_redstone_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.REDSTONE_ORE_REPLACEABLES, MinecraftCommonConfigs.REDSTONE_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DIAMOND_ORE = FeatureUtils.register("imd_diamond_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.DIAMOND_ORE_REPLACEABLES, MinecraftCommonConfigs.DIAMOND_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> EMERALD_ORE = FeatureUtils.register("imd_emerald_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.EMERALD_ORE_REPLACEABLES, MinecraftCommonConfigs.EMERALD_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_COAL_ORE = FeatureUtils.register("imd_deepslate_coal_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.DEEPSLATE_COAL_ORE_REPLACEABLES, MinecraftCommonConfigs.DEEPSLATE_COAL_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_COPPER_ORE = FeatureUtils.register("imd_deepslate_copper_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.DEEPSLATE_COPPER_ORE_REPLACEABLES, MinecraftCommonConfigs.DEEPSLATE_COPPER_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_IRON_ORE = FeatureUtils.register("imd_deepslate_iron_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.DEEPSLATE_IRON_ORE_REPLACEABLES, MinecraftCommonConfigs.DEEPSLATE_IRON_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_GOLD_ORE = FeatureUtils.register("imd_deepslate_gold_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.DEEPSLATE_GOLD_ORE_REPLACEABLES, MinecraftCommonConfigs.DEEPSLATE_GOLD_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_LAPIS_ORE = FeatureUtils.register("imd_deepslate_lapis_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.DEEPSLATE_LAPIS_ORE_REPLACEABLES, MinecraftCommonConfigs.DEEPSLATE_LAPIS_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_REDSTONE_ORE = FeatureUtils.register("imd_deepslate_redstone_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.DEEPSLATE_REDSTONE_ORE_REPLACEABLES, MinecraftCommonConfigs.DEEPSLATE_REDSTONE_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_DIAMOND_ORE = FeatureUtils.register("imd_deepslate_diamond_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.DEEPSLATE_DIAMOND_ORE_REPLACEABLES, MinecraftCommonConfigs.DEEPSLATE_DIAMOND_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_EMERALD_ORE = FeatureUtils.register("imd_deepslate_emerald_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.DEEPSLATE_EMERALD_ORE_REPLACEABLES, MinecraftCommonConfigs.DEEPSLATE_EMERALD_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_GOLD_ORE = FeatureUtils.register("imd_nether_gold_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.NETHER_GOLD_ORE_REPLACEABLES, MinecraftCommonConfigs.NETHER_GOLD_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_QUARTZ_ORE = FeatureUtils.register("imd_nether_quartz_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.NETHER_QUARTZ_ORE_REPLACEABLES, MinecraftCommonConfigs.NETHER_QUARTZ_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_DEBRIS_ORE = FeatureUtils.register("imd_nether_debris_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.NETHER_DEBRIS_ORE_REPLACEABLES, MinecraftCommonConfigs.NETHER_DEBRIS_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_SOULSAND_ORE = FeatureUtils.register("imd_nether_soulsand_ore", Feature.ORE, new OreConfiguration(MinecraftReplaceables.NETHER_SOULSAND_ORE_REPLACEABLES, MinecraftCommonConfigs.NETHER_SOULSAND_SIZE.get()));

}
