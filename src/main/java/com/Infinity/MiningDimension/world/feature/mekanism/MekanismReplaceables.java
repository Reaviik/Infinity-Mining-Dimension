package com.Infinity.MiningDimension.world.feature.mekanism;

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

public class MekanismReplaceables {
    public static final List<OreConfiguration.TargetBlockState> OSMIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("mekanism:osmium_ore")));
    public static final List<OreConfiguration.TargetBlockState> TIN_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("mekanism:tin_ore")));
    public static final List<OreConfiguration.TargetBlockState> LEAD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("mekanism:lead_ore")));
    public static final List<OreConfiguration.TargetBlockState> URANIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("mekanism:uranium_ore")));
    public static final List<OreConfiguration.TargetBlockState> FLUORITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("mekanism:fluorite_ore")));

    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_OSMIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("mekanism:deepslate_osmium_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_TIN_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("mekanism:deepslate_tin_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_LEAD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("mekanism:deepslate_lead_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("mekanism:deepslate_uranium_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_FLUORITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("mekanism:deepslate_fluorite_ore")));

}
