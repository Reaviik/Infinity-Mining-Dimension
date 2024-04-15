package com.Infinity.Nexus.MiningDimension.utils;

import com.Infinity.Nexus.MiningDimension.InfinityNexusDim;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;


public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> END_STONE_REPLACEABLES
                = tag("end_stone_replaceables");
        public static final TagKey<Block> SAND_REPLACEABLES
                = tag("sand_replaceables");
        public static final TagKey<Block> RED_SAND_REPLACEABLES
                = tag("red_sand_replaceables");
        public static final TagKey<Block> GRAVEL_REPLACEABLES
                = tag("gravel_replaceables");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(InfinityNexusDim.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        //---------------------------------------------//---------------------------------------------//
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(InfinityNexusDim.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}