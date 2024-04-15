package com.Infinity.Nexus.MiningDimension.world.feature.powah;

import com.Infinity.Nexus.MiningDimension.config.PowahCommonConfigs;
import com.Infinity.Nexus.MiningDimension.world.feature.ModOrePlacement;
import com.Infinity.Nexus.MiningDimension.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class PowahPlacedFeatures {
 public static final Holder<PlacedFeature> POWAH_URANINITE = PlacementUtils.register("imd_powah_uraninite", PowahConfiguredFeatures.URANINITE_ORE, ModOrePlacement.commonOrePlacement(PowahCommonConfigs.URANINITE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> POWAH_URANINITE_POOR = PlacementUtils.register("imd_powah_uraninite_poor", PowahConfiguredFeatures.URANINITE_POOR_ORE, ModOrePlacement.commonOrePlacement(PowahCommonConfigs.URANINITE_POOR_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> POWAH_URANINITE_DENSE = PlacementUtils.register("imd_powah_uraninite_dense", PowahConfiguredFeatures.URANINITE_DENSE_ORE, ModOrePlacement.commonOrePlacement(PowahCommonConfigs.URANINITE_DENSE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));

 public static final Holder<PlacedFeature> POWAH_DRY_ICE = PlacementUtils.register("imd_powah_dry_ice", PowahConfiguredFeatures.DRY_ICY_ORE, ModOrePlacement.commonOrePlacement(PowahCommonConfigs.DRY_ICE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));

 public static final Holder<PlacedFeature> POWAH_DEEPSLATE_URANINITE = PlacementUtils.register("imd_powah_deepslate_uraninite", PowahConfiguredFeatures.DEEPSLATE_URANINITE_ORE, ModOrePlacement.commonOrePlacement(PowahCommonConfigs.DEEPSLATE_URANINITE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> POWAH_DEEPSLATE_URANINITE_POOR = PlacementUtils.register("imd_powah_deepslate_uraninite_poor", PowahConfiguredFeatures.DEEPSLATE_URANINITE_POOR_ORE, ModOrePlacement.commonOrePlacement(PowahCommonConfigs.DEEPSLATE_URANINITE_POOR_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> POWAH_DEEPSLATE_URANINITE_DENSE = PlacementUtils.register("imd_powah_deepslate_uraninite_dense", PowahConfiguredFeatures.DEEPSLATE_URANINITE_DENSE_ORE, ModOrePlacement.commonOrePlacement(PowahCommonConfigs.DEEPSLATE_URANINITE_DENSE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 
}
