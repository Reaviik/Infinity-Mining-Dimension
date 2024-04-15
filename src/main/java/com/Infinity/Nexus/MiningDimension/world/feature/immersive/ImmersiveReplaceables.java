package com.Infinity.Nexus.MiningDimension.world.feature.immersive;

import com.Infinity.Nexus.MiningDimension.world.feature.ModReplaceables;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class ImmersiveReplaceables {
    public static final List<OreConfiguration.TargetBlockState> BAUXITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:ore_aluminum")));
    public static final List<OreConfiguration.TargetBlockState> LEAD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:ore_lead")));
    public static final List<OreConfiguration.TargetBlockState> NICKEL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:ore_nickel")));
    public static final List<OreConfiguration.TargetBlockState> SILVER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:ore_silver")));
    public static final List<OreConfiguration.TargetBlockState> URANIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:ore_uranium")));

    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_BAUXITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:deepslate_ore_aluminum")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_LEAD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:deepslate_ore_lead")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_NICKEL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:deepslate_ore_nickel")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_SILVER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:deepslate_ore_silver")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:deepslate_ore_uranium")));

}
