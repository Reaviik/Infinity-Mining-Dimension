package com.Infinity.MiningDimension.world.feature.misc;

import com.Infinity.MiningDimension.config.MiscCommonConfigs;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

public class MiscConfiguredFeatures {
    //Infinity Nexus
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> INFINITY = FeatureUtils.register("imd_misc_infinity_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.INFINITY_ORE_REPLACEABLES, MiscCommonConfigs.INFINITY_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_INFINITY_ORE = FeatureUtils.register("imd_misc_deepslate_infinity_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.DEEPSLATE_INFINITY_ORE_REPLACEABLES, MiscCommonConfigs.DEEPSLATE_INFINITY_SIZE.get()));
    //Evil Craft
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DARK_ORE = FeatureUtils.register("imd_misc_dark_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.DARK_ORE_REPLACEABLES, MiscCommonConfigs.DARK_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_DARK_ORE = FeatureUtils.register("imd_misc_deepslate_dark_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.DEEPSLATE_DARK_ORE_REPLACEABLES, MiscCommonConfigs.DEEPSLATE_DARK_SIZE.get()));
    //Forbiden Arcanus
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> EXPETRIFIED_ORE = FeatureUtils.register("imd_misc_expetrified_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.EXPETRIFIED_ORE_REPLACEABLES, MiscCommonConfigs.EXPETRIFIED_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ARCANE_CRYSTAL_ORE = FeatureUtils.register("imd_misc_arcane_crystal_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.ARCANE_CRYSTAL_ORE_REPLACEABLES, MiscCommonConfigs.ARCANE_CRYSTAL_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_ARCANE_CRYSTAL_ORE = FeatureUtils.register("imd_misc_deepslate_arcane_crystal_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.DEEPSLATE_ARCANE_CRYSTAL_ORE_REPLACEABLES, MiscCommonConfigs.DEEPSLATE_ARCANE_CRYSTAL_SIZE.get()));
    //Mythic Botany
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ELEMENTIUM_ORE = FeatureUtils.register("imd_misc_elementium_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.ELEMENTIUM_ORE_REPLACEABLES, MiscCommonConfigs.ELEMENTIUM_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DRAGONSTONE_ORE = FeatureUtils.register("imd_misc_dragonstone_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.DRAGONSTONE_ORE_REPLACEABLES, MiscCommonConfigs.DRAGONSTONE_SIZE.get()));
    //Applied energistics 2
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CERTUS_QUARTZ_ORE = FeatureUtils.register("imd_misc_certus_quartz_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.CERTUS_QUARTZ_ORE_REPLACEABLES, MiscCommonConfigs.CERTUS_QUARTZ_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEEPSLATE_CERTUS_QUARTZ_ORE = FeatureUtils.register("imd_misc_deepslate_certus_quartz_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.DEEPSLATE_CERTUS_QUARTZ_ORE_REPLACEABLES, MiscCommonConfigs.DEEPSLATE_CERTUS_QUARTZ_SIZE.get()));
    //Big Reactors
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> YELLORITE_ORE = FeatureUtils.register("imd_misc_yellorite_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.YELLORITE_ORE_REPLACEABLES, MiscCommonConfigs.YELLORITE_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_BENITOIDE_ORE = FeatureUtils.register("imd_misc_nether_benitoite_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.NETHER_BENITOIDE_ORE_REPLACEABLES, MiscCommonConfigs.NETHER_BENITOIDE_SIZE.get()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> END_ANGLESITE_ORE = FeatureUtils.register("imd_misc_end_anglesite_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.END_ANGLESITE_ORE_REPLACEABLES, MiscCommonConfigs.END_ANGLESITE_SIZE.get()));
    //Occultism
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_IESNIUM_ORE = FeatureUtils.register("imd_misc_nether_iesnium_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.NETHER_IESNIUM_ORE_REPLACEABLES, MiscCommonConfigs.NETHER_IESNIUM_SIZE.get()));
    //Tinkers
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> NETHER_COBALT_ORE = FeatureUtils.register("imd_misc_nether_cobalt_ore", Feature.ORE, new OreConfiguration(MiscReplaceables.NETHER_COBALT_ORE_REPLACEABLES, MiscCommonConfigs.NETHER_COBALT_SIZE.get()));

}
