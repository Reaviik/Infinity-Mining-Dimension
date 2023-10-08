package com.Infinity.MiningDimension.world.feature.powah;

import com.Infinity.MiningDimension.utils.ModTags;
import com.Infinity.MiningDimension.world.feature.ModReplaceables;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Objects;

public class PowahReplaceables {
    public static final List<OreConfiguration.TargetBlockState> URANINITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:uraninite_ore")));
    public static final List<OreConfiguration.TargetBlockState> URANINITE_POOR_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:uraninite_ore_poor")));
    public static final List<OreConfiguration.TargetBlockState> URANINITE_DENSE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:uraninite_ore_dense")));

    public static final List<OreConfiguration.TargetBlockState> DRY_ICE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:dry_ice")));

    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANINITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:deepslate_uraninite_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANINITE_POOR_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:deepslate_uraninite_ore_poor")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANINITE_DENSE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("powah:deepslate_uraninite_ore_dense")));
}
