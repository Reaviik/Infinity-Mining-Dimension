package com.Infinity.MiningDimension.world.feature.immersive;

import com.Infinity.MiningDimension.config.ImmersiveCommonConfigs;
import com.Infinity.MiningDimension.world.feature.ModOrePlacement;
import com.Infinity.MiningDimension.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ImmersivePlacedFeatures {
 public static final Holder<PlacedFeature> IMMERSIVE_BAUXITE = PlacementUtils.register("imd_immersive_bauxite", ImmersiveConfiguredFeatures.BAUXITE_ORE, ModOrePlacement.commonOrePlacement(ImmersiveCommonConfigs.BAUXITE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> IMMERSIVE_LEAD = PlacementUtils.register("imd_immersive_lead", ImmersiveConfiguredFeatures.LEAD_ORE, ModOrePlacement.commonOrePlacement(ImmersiveCommonConfigs.LEAD_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> IMMERSIVE_NICKEL = PlacementUtils.register("imd_immersive_nickel", ImmersiveConfiguredFeatures.NICKEL_ORE, ModOrePlacement.commonOrePlacement(ImmersiveCommonConfigs.NICKEL_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> IMMERSIVE_SILVER = PlacementUtils.register("imd_immersive_silver", ImmersiveConfiguredFeatures.SILVER_ORE, ModOrePlacement.commonOrePlacement(ImmersiveCommonConfigs.SILVER_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> IMMERSIVE_URANIUM = PlacementUtils.register("imd_immersive_uranium", ImmersiveConfiguredFeatures.URANIUM_ORE, ModOrePlacement.commonOrePlacement(ImmersiveCommonConfigs.URANIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));

 public static final Holder<PlacedFeature> IMMERSIVE_DEEPSLATE_BAUXITE = PlacementUtils.register("imd_immersive_deepslate_bauxite", ImmersiveConfiguredFeatures.DEEPSLATE_BAUXITE_ORE, ModOrePlacement.commonOrePlacement(ImmersiveCommonConfigs.DEEPSLATE_BAUXITE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> IMMERSIVE_DEEPSLATE_LEAD = PlacementUtils.register("imd_immersive_deepslate_lead", ImmersiveConfiguredFeatures.DEEPSLATE_LEAD_ORE, ModOrePlacement.commonOrePlacement(ImmersiveCommonConfigs.DEEPSLATE_LEAD_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> IMMERSIVE_DEEPSLATE_NICKEL = PlacementUtils.register("imd_immersive_deepslate_nickel", ImmersiveConfiguredFeatures.DEEPSLATE_NICKEL_ORE, ModOrePlacement.commonOrePlacement(ImmersiveCommonConfigs.DEEPSLATE_NICKEL_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> IMMERSIVE_DEEPSLATE_SILVER = PlacementUtils.register("imd_immersive_deepslate_silver", ImmersiveConfiguredFeatures.DEEPSLATE_SILVER_ORE, ModOrePlacement.commonOrePlacement(ImmersiveCommonConfigs.DEEPSLATE_SILVER_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> IMMERSIVE_DEEPSLATE_URANIUM = PlacementUtils.register("imd_immersive_deepslate_uranium", ImmersiveConfiguredFeatures.DEEPSLATE_URANIUM_ORE, ModOrePlacement.commonOrePlacement(ImmersiveCommonConfigs.DEEPSLATE_URANIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));

}
