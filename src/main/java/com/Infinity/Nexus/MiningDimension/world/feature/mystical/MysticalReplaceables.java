package com.Infinity.Nexus.MiningDimension.world.feature.mystical;

import com.Infinity.Nexus.MiningDimension.world.feature.ModReplaceables;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class MysticalReplaceables {
    public static final List<OreConfiguration.TargetBlockState> PROSPERITY_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("mysticalagriculture:prosperity_ore")));
    public static final List<OreConfiguration.TargetBlockState> INFERIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("mysticalagriculture:inferium_ore")));

    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_PROSPERITY_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("mysticalagriculture:deepslate_prosperity_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_INFERIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("mysticalagriculture:deepslate_inferium_ore")));

    public static final List<OreConfiguration.TargetBlockState> NETHER_PROSPERITY_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("mysticalagradditions:nether_prosperity_ore")));
    public static final List<OreConfiguration.TargetBlockState> NETHER_SOULSTONE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("mysticalagriculture:soulstone")));
    public static final List<OreConfiguration.TargetBlockState> NETHER_SOULIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("mysticalagriculture:soulium_ore")));
    public static final List<OreConfiguration.TargetBlockState> NETHER_INFERIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("mysticalagradditions:nether_inferium_ore")));

    public static final List<OreConfiguration.TargetBlockState> END_PROSPERITY_ORE_REPLACEABLES = List.of(OreConfiguration.target(ModReplaceables.END_ORE_REPLACEABLES, ModReplaceables.toBlock("mysticalagradditions:end_prosperity_ore")));
    public static final List<OreConfiguration.TargetBlockState> END_INFERIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(ModReplaceables.END_ORE_REPLACEABLES, ModReplaceables.toBlock("mysticalagradditions:end_inferium_ore")));

}
