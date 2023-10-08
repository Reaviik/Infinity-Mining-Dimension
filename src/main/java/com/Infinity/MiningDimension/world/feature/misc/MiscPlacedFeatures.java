package com.Infinity.MiningDimension.world.feature.misc;

import com.Infinity.MiningDimension.config.MiscCommonConfigs;
import com.Infinity.MiningDimension.config.MiscCommonConfigs;
import com.Infinity.MiningDimension.world.feature.ModOrePlacement;
import com.Infinity.MiningDimension.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class MiscPlacedFeatures {
 //Infinity Nexus
 public static final Holder<PlacedFeature> MISC_INFINITY = PlacementUtils.register("imd_misc_infinity", MiscConfiguredFeatures.INFINITY, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.INFINITY_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> MISC_DEEPSLATE_INFINITY = PlacementUtils.register("imd_misc_deepslate_infinity", MiscConfiguredFeatures.DEEPSLATE_INFINITY_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.DEEPSLATE_INFINITY_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 //Evil Craft
 public static final Holder<PlacedFeature> MISC_DARK = PlacementUtils.register("imd_misc_dark", MiscConfiguredFeatures.DARK_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.DARK_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> MISC_DEEPSLATE_DARK = PlacementUtils.register("imd_misc_deepslate_dark", MiscConfiguredFeatures.DEEPSLATE_DARK_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.DEEPSLATE_DARK_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 //Forbiden Arcanus
 public static final Holder<PlacedFeature> MISC_EXPETRIFIED = PlacementUtils.register("imd_misc_expetrified", MiscConfiguredFeatures.EXPETRIFIED_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.EXPETRIFIED_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> MISC_ARCANE_CRYSTAL = PlacementUtils.register("imd_misc_arcane_crystal", MiscConfiguredFeatures.ARCANE_CRYSTAL_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.ARCANE_CRYSTAL_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> MISC_DEEPSLATE_ARCANE_CRYSTAL = PlacementUtils.register("imd_misc_deepslate_arcane_crystal", MiscConfiguredFeatures.DEEPSLATE_ARCANE_CRYSTAL_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.DEEPSLATE_ARCANE_CRYSTAL_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 //Mythic Botany
 public static final Holder<PlacedFeature> MISC_ELEMENTIUM = PlacementUtils.register("imd_misc_elementium", MiscConfiguredFeatures.ELEMENTIUM_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.ELEMENTIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.sandMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.sandMaxY))));
 public static final Holder<PlacedFeature> MISC_DRAGONSTONE = PlacementUtils.register("imd_misc_dragonstone", MiscConfiguredFeatures.DRAGONSTONE_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.DRAGONSTONE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.sandMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.sandMaxY))));
 //Applied energistics 2
 public static final Holder<PlacedFeature> MISC_CERTUS_QUARTZ = PlacementUtils.register("imd_misc_certus_quartz", MiscConfiguredFeatures.CERTUS_QUARTZ_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.CERTUS_QUARTZ_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> MISC_DEEPSLATE_CERTUS_QUARTZ = PlacementUtils.register("imd_misc_deepslate_certus_quartz", MiscConfiguredFeatures.DEEPSLATE_CERTUS_QUARTZ_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.DEEPSLATE_CERTUS_QUARTZ_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 //Big Reactors
 public static final Holder<PlacedFeature> MISC_YELLORITE = PlacementUtils.register("imd_misc_yellorite", MiscConfiguredFeatures.YELLORITE_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.YELLORITE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> MISC_NETHER_BENITOIDE = PlacementUtils.register("imd_misc_nether_benitoide", MiscConfiguredFeatures.NETHER_BENITOIDE_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.NETHER_BENITOIDE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMaxY))));
 public static final Holder<PlacedFeature> MISC_END_ANGLESITE = PlacementUtils.register("imd_misc_end_anglesite", MiscConfiguredFeatures.END_ANGLESITE_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.END_ANGLESITE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.endStoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.endStoneMaxY))));
 //Occultism
 public static final Holder<PlacedFeature> MISC_NETHER_IESNIUM = PlacementUtils.register("imd_misc_nether_iesnium", MiscConfiguredFeatures.NETHER_IESNIUM_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.NETHER_IESNIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMaxY))));
 //Tinkers
 public static final Holder<PlacedFeature> MISC_NETHER_COBALT = PlacementUtils.register("imd_misc_nether_cobalt", MiscConfiguredFeatures.NETHER_COBALT_ORE, ModOrePlacement.commonOrePlacement(MiscCommonConfigs.NETHER_COBALT_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMaxY))));

}
