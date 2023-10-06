package com.Infinity.MiningDimension.tab;

import com.Infinity.MiningDimension.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab INFINITY_MINING_DIMENSION = new CreativeModeTab("infinity_mining_dimension") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CATALYST.get());
        }
    };
}
