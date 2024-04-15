package com.Infinity.Nexus.MiningDimension.world.feature.misc;

import com.Infinity.Nexus.MiningDimension.world.feature.ModReplaceables;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class MiscReplaceables {
    //Infinity Nexus
    public static final List<OreConfiguration.TargetBlockState> INFINITY_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("infinity_nexus_mod:infinity_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_INFINITY_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("infinity_nexus_mod:deepslate_infinity_ore")));
    //Evil Craft
    public static final List<OreConfiguration.TargetBlockState> DARK_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("evilcraft:dark_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_DARK_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("evilcraft:dark_ore_deepslate")));
    //Forbiden Arcanus
    public static final List<OreConfiguration.TargetBlockState> EXPETRIFIED_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("forbidden_arcanus:expetrified_ore")));
    public static final List<OreConfiguration.TargetBlockState> ARCANE_CRYSTAL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("forbidden_arcanus:arcane_crystal_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_ARCANE_CRYSTAL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("forbidden_arcanus:deepslate_arcane_crystal_ore")));
    //Mythic Botany
    public static final List<OreConfiguration.TargetBlockState> ELEMENTIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(ModReplaceables.SAND_ORE_REPLACEABLES, ModReplaceables.toBlock("mythicbotany:elementium_ore")));
    public static final List<OreConfiguration.TargetBlockState> DRAGONSTONE_ORE_REPLACEABLES = List.of(OreConfiguration.target(ModReplaceables.SAND_ORE_REPLACEABLES, ModReplaceables.toBlock("mythicbotany:dragonstone_ore")));
    //Applied energistics 2
    public static final List<OreConfiguration.TargetBlockState> CERTUS_QUARTZ_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("ae2:quartz_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_CERTUS_QUARTZ_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("ae2:deepslate_quartz_ore")));
    //Big Reactors
    public static final List<OreConfiguration.TargetBlockState> YELLORITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("bigreactors:yellorite_ore")));
    public static final List<OreConfiguration.TargetBlockState> NETHER_BENITOIDE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("bigreactors:benitoite_ore")));
    public static final List<OreConfiguration.TargetBlockState> END_ANGLESITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(ModReplaceables.END_ORE_REPLACEABLES, ModReplaceables.toBlock("bigreactors:anglesite_ore")));
    //Tinkers
    public static final List<OreConfiguration.TargetBlockState> NETHER_COBALT_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("tconstruct:cobalt_ore")));
    //Occultism
    public static final List<OreConfiguration.TargetBlockState> OCCULTISM_SILVER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("occultism:silver_ore")));
    public static final List<OreConfiguration.TargetBlockState> OCCULTISM_DEEPSLATE_SILVER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("occultism:deepslate_ore_silver")));
    public static final List<OreConfiguration.TargetBlockState> OCCULTISM_NETHER_NATURAL_IESNIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("occultism:iesnium_ore_natural")));
    public static final List<OreConfiguration.TargetBlockState> OCCULTISM_NETHER_IESNIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("occultism:iesnium_ore")));

}
