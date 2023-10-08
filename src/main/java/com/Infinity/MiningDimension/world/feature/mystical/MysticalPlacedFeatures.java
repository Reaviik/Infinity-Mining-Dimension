package com.Infinity.MiningDimension.world.feature.mystical;

import com.Infinity.MiningDimension.config.MysticalCommonConfigs;
import com.Infinity.MiningDimension.world.feature.ModPlacedFeatures;
import com.Infinity.MiningDimension.world.feature.ModOrePlacement;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class MysticalPlacedFeatures {
 public static final Holder<PlacedFeature> MYSTICAL_PROSPERITY = PlacementUtils.register("imd_mystical_prosperity", MysticalConfiguredFeatures.PROSPERITY_ORE, ModOrePlacement.commonOrePlacement(MysticalCommonConfigs.PROSPERITY_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 public static final Holder<PlacedFeature> MYSTICAL_INFERIUM = PlacementUtils.register("imd_mystical_inferium", MysticalConfiguredFeatures.INFERIUM_ORE, ModOrePlacement.commonOrePlacement(MysticalCommonConfigs.INFERIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.stoneMaxY))));
 
 public static final Holder<PlacedFeature> MYSTICAL_DEEPSLATE_PROSPERITY = PlacementUtils.register("imd_mystical_deepslate_prosperity", MysticalConfiguredFeatures.DEEPSLATE_PROSPERITY_ORE, ModOrePlacement.commonOrePlacement(MysticalCommonConfigs.DEEPSLATE_PROSPERITY_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 public static final Holder<PlacedFeature> MYSTICAL_DEEPSLATE_INFERIUM = PlacementUtils.register("imd_mystical_deepslate_inferium", MysticalConfiguredFeatures.DEEPSLATE_INFERIUM_ORE, ModOrePlacement.commonOrePlacement(MysticalCommonConfigs.DEEPSLATE_INFERIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.deepslateMaxY))));
 
 public static final Holder<PlacedFeature> MYSTICAL_NETHER_PROSPERITY = PlacementUtils.register("imd_mystical_netehr_prosperity", MysticalConfiguredFeatures.NETHER_PROSPERITY_ORE, ModOrePlacement.commonOrePlacement(MysticalCommonConfigs.NETHER_PROSPERITY_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMaxY))));
 public static final Holder<PlacedFeature> MYSTICAL_NETHER_SOULIUM = PlacementUtils.register("imd_mystical_netehr_soulium", MysticalConfiguredFeatures.NETHER_SOULIUM_ORE, ModOrePlacement.commonOrePlacement(MysticalCommonConfigs.NETHER_SOULIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMaxY))));
 public static final Holder<PlacedFeature> MYSTICAL_NETHER_INFERIUM = PlacementUtils.register("imd_mystical_netehr_inferium", MysticalConfiguredFeatures.NETHER_INFERIUM_ORE, ModOrePlacement.commonOrePlacement(MysticalCommonConfigs.NETHER_INFERIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.netherrackMaxY))));
 
 public static final Holder<PlacedFeature> MYSTICAL_END_PROSPERITY = PlacementUtils.register("imd_mystical_end_prosperity", MysticalConfiguredFeatures.END_PROSPERITY_ORE, ModOrePlacement.commonOrePlacement(MysticalCommonConfigs.END_PROSPERITY_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.endStoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.endStoneMaxY))));
 public static final Holder<PlacedFeature> MYSTICAL_END_INFERIUM = PlacementUtils.register("imd_mystical_end_inferium", MysticalConfiguredFeatures.END_INFERIUM_ORE, ModOrePlacement.commonOrePlacement(MysticalCommonConfigs.END_INFERIUM_VEINS.get(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(ModPlacedFeatures.endStoneMinY), VerticalAnchor.aboveBottom(ModPlacedFeatures.endStoneMaxY))));
}
