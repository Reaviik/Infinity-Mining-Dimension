package com.Infinity.Nexus.MiningDimension.world.feature.gobber;

import com.Infinity.Nexus.MiningDimension.config.GobberCommonConfigs;
import com.Infinity.Nexus.MiningDimension.world.feature.ModOrePlacement;
import com.Infinity.Nexus.MiningDimension.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class GobberPlacedFeatures {
 public static final Holder<PlacedFeature> GOBBER_GOBBER = PlacementUtils.register("imd_gobber_gobbee", GobberConfiguredFeatures.GOBBER_ORE, ModOrePlacement.commonOrePlacement(GobberCommonConfigs.GOBBER_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));

 public static final Holder<PlacedFeature> GOBBER_DEEPSLATE_GOBBER = PlacementUtils.register("imd_gobber_deepslate_gobber", GobberConfiguredFeatures.DEEPSLATE_GOBBER_ORE, ModOrePlacement.commonOrePlacement(GobberCommonConfigs.DEEPSLATE_GOBBER_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));

 public static final Holder<PlacedFeature> GOBBER_NETHER_GOBBER = PlacementUtils.register("imd_gobber_netehr_gobber", GobberConfiguredFeatures.NETHER_GOBBER_ORE, ModOrePlacement.commonOrePlacement(GobberCommonConfigs.NETHER_GOBBER_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMaxY))));

 public static final Holder<PlacedFeature> GOBBER_END_GOBBER = PlacementUtils.register("imd_gobber_end_gobber", GobberConfiguredFeatures.END_GOBBER_ORE, ModOrePlacement.commonOrePlacement(GobberCommonConfigs.END_GOBBER_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.endStoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.endStoneMaxY))));
 
}
