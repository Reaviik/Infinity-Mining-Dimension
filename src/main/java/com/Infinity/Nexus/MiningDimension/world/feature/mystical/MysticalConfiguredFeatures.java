package com.Infinity.Nexus.MiningDimension.world.feature.mystical;

import com.Infinity.Nexus.MiningDimension.config.MysticalCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class MysticalConfiguredFeatures {
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PROSPERITY_ORE = FeatureUtils.register("imd_mystical_prosperity_ore", Feature.ORE, new OreConfiguration(MysticalReplaceables.PROSPERITY_ORE_REPLACEABLES, MysticalCommonConfigs.PROSPERITY_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> INFERIUM_ORE = FeatureUtils.register("imd_mystical_inferium_ore", Feature.ORE, new OreConfiguration(MysticalReplaceables.INFERIUM_ORE_REPLACEABLES, MysticalCommonConfigs.INFERIUM_SIZE.get()));
    
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_PROSPERITY_ORE = FeatureUtils.register("imd_mystical_deepslate_prosperity_ore", Feature.ORE, new OreConfiguration(MysticalReplaceables.DEEPSLATE_PROSPERITY_ORE_REPLACEABLES, MysticalCommonConfigs.DEEPSLATE_PROSPERITY_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_INFERIUM_ORE = FeatureUtils.register("imd_mystical_deepslate_inferium_ore", Feature.ORE, new OreConfiguration(MysticalReplaceables.DEEPSLATE_INFERIUM_ORE_REPLACEABLES, MysticalCommonConfigs.DEEPSLATE_INFERIUM_SIZE.get()));
    
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_PROSPERITY_ORE = FeatureUtils.register("imd_mystical_nether_prosperity_ore", Feature.ORE, new OreConfiguration(MysticalReplaceables.NETHER_PROSPERITY_ORE_REPLACEABLES, MysticalCommonConfigs.NETHER_PROSPERITY_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_SOULSTONE_ORE = FeatureUtils.register("imd_mystical_nether_soulstone_ore", Feature.ORE, new OreConfiguration(MysticalReplaceables.NETHER_SOULSTONE_ORE_REPLACEABLES, MysticalCommonConfigs.NETHER_SOULSTONE_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_SOULIUM_ORE = FeatureUtils.register("imd_mystical_nether_soulium_ore", Feature.ORE, new OreConfiguration(MysticalReplaceables.NETHER_SOULIUM_ORE_REPLACEABLES, MysticalCommonConfigs.NETHER_SOULIUM_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_INFERIUM_ORE = FeatureUtils.register("imd_mystical_nether_inferium_ore", Feature.ORE, new OreConfiguration(MysticalReplaceables.NETHER_INFERIUM_ORE_REPLACEABLES, MysticalCommonConfigs.NETHER_INFERIUM_SIZE.get()));
    
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_PROSPERITY_ORE = FeatureUtils.register("imd_mystical_end_prosperity_ore", Feature.ORE, new OreConfiguration(MysticalReplaceables.END_PROSPERITY_ORE_REPLACEABLES, MysticalCommonConfigs.END_PROSPERITY_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_INFERIUM_ORE = FeatureUtils.register("imd_mystical_end_inferium_ore", Feature.ORE, new OreConfiguration(MysticalReplaceables.END_INFERIUM_ORE_REPLACEABLES, MysticalCommonConfigs.END_INFERIUM_SIZE.get()));
    
}
