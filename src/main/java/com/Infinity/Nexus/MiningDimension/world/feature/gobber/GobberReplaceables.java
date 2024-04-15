package com.Infinity.Nexus.MiningDimension.world.feature.gobber;

import com.Infinity.Nexus.MiningDimension.world.feature.ModReplaceables;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class GobberReplaceables {
    public static final List<OreConfiguration.TargetBlockState> GOBBER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("gobber2:gobber2_ore")));

    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_GOBBER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("gobber2:gobber2_ore_deepslate")));

    public static final List<OreConfiguration.TargetBlockState> NETHER_GOBBER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("gobber2:gobber2_ore_nether")));

    public static final List<OreConfiguration.TargetBlockState> END_GOBBER_ORE_REPLACEABLES = List.of(OreConfiguration.target(ModReplaceables.END_ORE_REPLACEABLES, ModReplaceables.toBlock("gobber2:gobber2_ore_end")));

}
