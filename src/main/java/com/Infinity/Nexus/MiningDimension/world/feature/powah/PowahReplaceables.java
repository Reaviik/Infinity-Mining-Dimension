package com.Infinity.Nexus.MiningDimension.world.feature.powah;

import com.Infinity.Nexus.MiningDimension.world.feature.ModReplaceables;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class PowahReplaceables {
    public static final List<OreConfiguration.TargetBlockState> URANINITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:uraninite_ore")));
    public static final List<OreConfiguration.TargetBlockState> URANINITE_POOR_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:uraninite_ore_poor")));
    public static final List<OreConfiguration.TargetBlockState> URANINITE_DENSE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:uraninite_ore_dense")));

    public static final List<OreConfiguration.TargetBlockState> DRY_ICE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:dry_ice")));

    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANINITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:deepslate_uraninite_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANINITE_POOR_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:deepslate_uraninite_ore_poor")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANINITE_DENSE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:deepslate_uraninite_ore_dense")));
}
