package com.Infinity.MiningDimension.world.feature;

import com.Infinity.MiningDimension.utils.ModTags;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;
import org.antlr.v4.tool.Rule;

import java.util.List;
import java.util.Objects;

public class ModReplaceables {
    public static final RuleTest END_ORE_REPLACEABLES = new TagMatchTest(ModTags.Blocks.END_BASE_STONE);
    public static BlockState toBlock(String tag){
        ResourceLocation itemLocation = new ResourceLocation(tag);
        return Objects.requireNonNull(ForgeRegistries.BLOCKS.getValue(itemLocation)).defaultBlockState();
    }
    public static final List<OreConfiguration.TargetBlockState> COAL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("minecraft:coal_ore")));
    public static final List<OreConfiguration.TargetBlockState> COPPER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("minecraft:copper_ore")));
    public static final List<OreConfiguration.TargetBlockState> IRON_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("minecraft:iron_ore")));
    public static final List<OreConfiguration.TargetBlockState> GOLD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("minecraft:gold_ore")));
    public static final List<OreConfiguration.TargetBlockState> LAPIS_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("minecraft:lapis_ore")));
    public static final List<OreConfiguration.TargetBlockState> REDSTONE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("minecraft:redstone_ore")));
    public static final List<OreConfiguration.TargetBlockState> DIAMOND_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("minecraft:diamond_ore")));
    public static final List<OreConfiguration.TargetBlockState> EMERALD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("minecraft:emerald_ore")));
    public static final List<OreConfiguration.TargetBlockState> INFINITY_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("infinity_nexus_mod:infinity_ore")));
    public static final List<OreConfiguration.TargetBlockState> DARK_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("evilcraft:dark_ore")));
    public static final List<OreConfiguration.TargetBlockState> URANINITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("powah:uraninite_ore_dense")));
    public static final List<OreConfiguration.TargetBlockState> GOBBER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("gobber2:gobber2_ore")));
    public static final List<OreConfiguration.TargetBlockState> OSMIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("mekanism:osmium_ore")));
    public static final List<OreConfiguration.TargetBlockState> FLUORITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("mekanism:fluorite_ore")));
    public static final List<OreConfiguration.TargetBlockState> DRACONIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("draconicevolution:overworld_draconium_ore")));
    public static final List<OreConfiguration.TargetBlockState> PROSPERITY_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("mysticalagriculture:prosperity_ore")));
    public static final List<OreConfiguration.TargetBlockState> INFERIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("mysticalagriculture:inferium_ore")));
    public static final List<OreConfiguration.TargetBlockState> APATITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("thermal:apatite_ore")));
    public static final List<OreConfiguration.TargetBlockState> CINNABAR_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("thermal:cinnabar_ore")));
    public static final List<OreConfiguration.TargetBlockState> NITER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("thermal:niter_ore")));
    public static final List<OreConfiguration.TargetBlockState> SULFUR_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("thermal:sulfur_ore")));
    public static final List<OreConfiguration.TargetBlockState> TIN_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("thermal:tin_ore")));
    public static final List<OreConfiguration.TargetBlockState> BAUXITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("immersiveenginering:ore_aluminum")));
    public static final List<OreConfiguration.TargetBlockState> LEAD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("thermal:lead_ore")));
    public static final List<OreConfiguration.TargetBlockState> NICKEL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("thermal:nickel_ore")));
    public static final List<OreConfiguration.TargetBlockState> RUBY_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("thermal:ruby_ore")));
    public static final List<OreConfiguration.TargetBlockState> SAPPHIRE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("thermal:sapphire_ore")));
    public static final List<OreConfiguration.TargetBlockState> URANIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("immersiveenginering:uranium_ore")));
    public static final List<OreConfiguration.TargetBlockState> CERTUS_QUARTZ_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("ae2:quartz_ore")));
    public static final List<OreConfiguration.TargetBlockState> EXPETRIFIED_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("forbiden_arcanus:expestrified_ore")));
    public static final List<OreConfiguration.TargetBlockState> ARCANE_CRYSTAL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("forbiden_arcanus:arcane_crystal_ore")));
    public static final List<OreConfiguration.TargetBlockState> BITUMINOUS_SAND_ORE_REPLACEABLES = List.of(OreConfiguration.target(new TagMatchTest(Tags.Blocks.SAND), toBlock("thermal:oil_sand")));
    public static final List<OreConfiguration.TargetBlockState> BITUMINOUS_RED_SAND_ORE_REPLACEABLES = List.of(OreConfiguration.target(new TagMatchTest(Tags.Blocks.SAND_RED), toBlock("thermal:oil_red_sand")));
    public static final List<OreConfiguration.TargetBlockState> ELEMENTIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, toBlock("mythicbotany:elementium_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_COAL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("minecraft:deepslate_coal_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_COPPER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("minecraft:deepslate_copper_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_IRON_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("minecraft:deepslate_iron_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_GOLD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("minecraft:deepslate_gold_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_LAPIS_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("minecraft:deepslate_lapis_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_REDSTONE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("minecraft:deepslate_redstone_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_DIAMOND_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("minecraft:deepslate_diamond_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_EMERALD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("minecraft:deepslate_emerald_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_DARK_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("evilcraft:dark_ore_deepslate")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANINITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("powah:deepslate_uraninite_ore_dense")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_GOBBER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("gobber2:gobber2_ore_deepslate")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_OSMIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("mekanism:deepslate_osmium_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_FLUORITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("mekanism:deepslate_fluorite_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_DRACONIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("draconicevolution:deepslate_draconium_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_PROSPERITY_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("mysticalagriculture:deepslate_prosperity_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_INFERIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("mysticalagriculture:deepslate_inferium_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_APATITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("thermal:deepslate_apatite_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_CINNABAR_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("thermal:deepslate_cinnabar_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_NITER_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("thermal:deepslate_niter_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_SULFUR_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("thermal:deepslate_sulfur_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_TIN_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("thermal:deepslate_tin_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_BAUXITE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("immersiveenginering:deepslate_ore_aluminum")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_LEAD_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("thermal:deepslate_lead_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_NICKEL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("thermal:deepslate_nickel_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_RUBY_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("thermal:deepslate_ruby_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_SAPPHIRE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("thermal:deepslate_sapphire_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_URANIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("immersiveenginering:deepslate_ore_uranium")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_CERTUS_QUARTZ_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("ae2:deepslate_quartz_ore")));
    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_ARCANE_CRYSTAL_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("forbiden_arcanus:deepslate_arcane_crystal_ore")));
    public static final List<OreConfiguration.TargetBlockState> DRAGONSTONE_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, toBlock("mythicbotany:dragonstone_ore")));

}
