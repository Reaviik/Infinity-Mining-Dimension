package com.Infinity.MiningDimension.world.feature.draconic;

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

public class DraconicReplaceables {
    public static final List<OreConfiguration.TargetBlockState> DRACONIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModReplaceables.toBlock("draconicevolution:overworld_draconium_ore")));

    public static final List<OreConfiguration.TargetBlockState> DEEPSLATE_DRACONIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModReplaceables.toBlock("draconicevolution:deepslate_draconium_ore")));

    public static final List<OreConfiguration.TargetBlockState> NETHER_DRACONIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModReplaceables.toBlock("draconicevolution:nether_draconium_ore")));

    public static final List<OreConfiguration.TargetBlockState> END_DRACONIUM_ORE_REPLACEABLES = List.of(OreConfiguration.target(ModReplaceables.END_ORE_REPLACEABLES, ModReplaceables.toBlock("draconicevolution:end_draconium_ore")));

}
