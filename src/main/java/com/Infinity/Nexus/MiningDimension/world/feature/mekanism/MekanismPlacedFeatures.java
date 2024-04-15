package com.Infinity.Nexus.MiningDimension.world.feature.mekanism;

import com.Infinity.Nexus.MiningDimension.config.MekanismCommonConfigs;
import com.Infinity.Nexus.MiningDimension.world.feature.ModOrePlacement;
import com.Infinity.Nexus.MiningDimension.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class MekanismPlacedFeatures {
  public static final Holder<PlacedFeature>MEKANISM_OSMIUM = PlacementUtils.register("imd_mekanism_osmium", MekanismConfiguredFeatures.OSMIUM_ORE, ModOrePlacement.commonOrePlacement(MekanismCommonConfigs.OSMIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
  public static final Holder<PlacedFeature>MEKANISM_TIN= PlacementUtils.register("imd_mekanism_tin", MekanismConfiguredFeatures.TIN_ORE, ModOrePlacement.commonOrePlacement(MekanismCommonConfigs.TIN_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
  public static final Holder<PlacedFeature>MEKANISM_LEAD = PlacementUtils.register("imd_mekanism_lead", MekanismConfiguredFeatures.LEAD_ORE, ModOrePlacement.commonOrePlacement(MekanismCommonConfigs.LEAD_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
  public static final Holder<PlacedFeature>MEKANISM_URANIUM = PlacementUtils.register("imd_mekanism_uranium", MekanismConfiguredFeatures.URANIUM_ORE, ModOrePlacement.commonOrePlacement(MekanismCommonConfigs.URANIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> MEKANISM_FLUORITE = PlacementUtils.register("imd_mekanism_fluorite", MekanismConfiguredFeatures.FLUORITE_ORE, ModOrePlacement.commonOrePlacement(MekanismCommonConfigs.FLUORITE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));

 public static final Holder<PlacedFeature> MEKANISM_DEEPSLATE_OSMIUM = PlacementUtils.register("imd_mekanism_deepslate_osmium_ore", MekanismConfiguredFeatures.DEEPSLATE_OSMIUM_ORE, ModOrePlacement.commonOrePlacement(MekanismCommonConfigs.DEEPSLATE_OSMIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> MEKANISM_DEEPSLATE_TIN = PlacementUtils.register("imd_mekanism_deepslate_tin", MekanismConfiguredFeatures.DEEPSLATE_TIN_ORE, ModOrePlacement.commonOrePlacement(MekanismCommonConfigs.DEEPSLATE_TIN_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> MEKANISM_DEEPSLATE_LEAD = PlacementUtils.register("imd_mekanism_deepslate_lead", MekanismConfiguredFeatures.DEEPSLATE_LEAD_ORE, ModOrePlacement.commonOrePlacement(MekanismCommonConfigs.DEEPSLATE_LEAD_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> MEKANISM_DEEPSLATE_URANIUM = PlacementUtils.register("imd_mekanism_deepslate_uranium", MekanismConfiguredFeatures.DEEPSLATE_URANIUM_ORE, ModOrePlacement.commonOrePlacement(MekanismCommonConfigs.DEEPSLATE_URANIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> MEKANISM_DEEPSLATE_FLUORITE = PlacementUtils.register("imd_mekanism_deepslate_fluorite", MekanismConfiguredFeatures.DEEPSLATE_FLUORITE_ORE, ModOrePlacement.commonOrePlacement(MekanismCommonConfigs.DEEPSLATE_FLUORITE_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));

}
