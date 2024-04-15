package com.Infinity.Nexus.MiningDimension.world.feature.draconic;

import com.Infinity.Nexus.MiningDimension.config.DraconicCommonConfigs;
import com.Infinity.Nexus.MiningDimension.world.feature.ModOrePlacement;
import com.Infinity.Nexus.MiningDimension.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class DraconicPlacedFeatures {
 public static final Holder<PlacedFeature> DRACONIC_DRACONIUM = PlacementUtils.register("imd_draconic_draconium", DraconicConfiguredFeatures.DRACONIUM_ORE, ModOrePlacement.commonOrePlacement(DraconicCommonConfigs.DRACONIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));

 public static final Holder<PlacedFeature> DRACONIC_DEEPSLATE_DRACONIUM = PlacementUtils.register("imd_draconic_deepslate_draconium", DraconicConfiguredFeatures.DEEPSLATE_DRACONIUM_ORE, ModOrePlacement.commonOrePlacement(DraconicCommonConfigs.DEEPSLATE_DRACONIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));

 public static final Holder<PlacedFeature> DRACONIC_NETHER_DRACONIUM = PlacementUtils.register("imd_draconic_netehr_draconium", DraconicConfiguredFeatures.NETHER_DRACONIUM_ORE, ModOrePlacement.commonOrePlacement(DraconicCommonConfigs.NETHER_DRACONIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMaxY))));

 public static final Holder<PlacedFeature> DRACONIC_END_DRACONIUM = PlacementUtils.register("imd_draconic_end_draconium", DraconicConfiguredFeatures.END_DRACONIUM_ORE, ModOrePlacement.commonOrePlacement(DraconicCommonConfigs.END_DRACONIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.endStoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.endStoneMaxY))));

}
