package com.Infinity.MiningDimension.world.feature.immersive;

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

public class ImmersiveReplaceables {
    public static final List<OreConfiguration.TargetBlockState> BAUXITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveenginering:ore_aluminum")));
    public static final List<OreConfiguration.TargetBlockState> LEAD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveenginering:ore_lead")));
    public static final List<OreConfiguration.TargetBlockState> NICKEL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveenginering:ore_nickel")));
    public static final List<OreConfiguration.TargetBlockState> SILVER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveenginering:ore_silver")));
    public static final List<OreConfiguration.TargetBlockState> URANIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveenginering:ore_uranium")));

    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_BAUXITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:deepslate_ore_aluminum")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_LEAD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveenginering:deepslate_ore_lead")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_NICKEL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveenginering:deepslate_ore_nickel")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_SILVER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveenginering:deepslate_ore_silver")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("immersiveengineering:deepslate_ore_uranium")));

}
