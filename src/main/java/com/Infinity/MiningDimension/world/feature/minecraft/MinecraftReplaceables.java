package com.Infinity.MiningDimension.world.feature.minecraft;

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

public class MinecraftReplaceables {
    public static final List<OreConfiguration.TargetBlockState> COAL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:coal_ore")));
    public static final List<OreConfiguration.TargetBlockState> COPPER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:copper_ore")));
    public static final List<OreConfiguration.TargetBlockState> IRON_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:iron_ore")));
    public static final List<OreConfiguration.TargetBlockState> GOLD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:gold_ore")));
    public static final List<OreConfiguration.TargetBlockState> LAPIS_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:lapis_ore")));
    public static final List<OreConfiguration.TargetBlockState> REDSTONE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:redstone_ore")));
    public static final List<OreConfiguration.TargetBlockState> DIAMOND_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:diamond_ore")));
    public static final List<OreConfiguration.TargetBlockState> EMERALD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:emerald_ore")));

    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_COAL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:deepslate_coal_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_COPPER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:deepslate_copper_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_IRON_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:deepslate_iron_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_GOLD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:deepslate_gold_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_LAPIS_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:deepslate_lapis_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_REDSTONE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:deepslate_redstone_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_DIAMOND_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:deepslate_diamond_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_EMERALD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:deepslate_emerald_ore")));

    public static final List<OreConfiguration.TargetBlockState> NETHER_GOLD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:nether_gold_ore")));
    public static final List<OreConfiguration.TargetBlockState> NETHER_QUARTZ_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:nether_quartz_ore")));
    public static final List<OreConfiguration.TargetBlockState> NETHER_DEBRIS_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:ancient_debris")));
    public static final List<OreConfiguration.TargetBlockState> NETHER_SOULSAND_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("minecraft:soul_sand")));
}
