package com.Infinity.MiningDimension.world.feature;

import com.Infinity.MiningDimension.utils.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class ModReplaceables {
    public static final RuleTest END_ORE_REPLACEABLES = new TagMatchTest(ModTags.Blocks.END_STONE_REPLACEABLES);
    public static final RuleTest SAND_ORE_REPLACEABLES = new TagMatchTest(ModTags.Blocks.SAND_REPLACEABLES);
    public static final RuleTest RED_SAND_ORE_REPLACEABLES = new TagMatchTest(ModTags.Blocks.RED_SAND_REPLACEABLES);
    public static final RuleTest GRAVEL_ORE_REPLACEABLES = new TagMatchTest(ModTags.Blocks.GRAVEL_REPLACEABLES);
    public static BlockState toBlock(String tag){
        ResourceLocation itemLocation = new ResourceLocation(tag);
        return Objects.requireNonNull(ForgeRegistries.BLOCKS.getValue(itemLocation)).defaultBlockState();
    }
}
