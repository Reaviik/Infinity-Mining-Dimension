package com.Infinity.MiningDimension.block;

import com.Infinity.MiningDimension.InfinityMiningDimension;
import com.Infinity.MiningDimension.block.custom.InfinityMiningPortal;
import com.Infinity.MiningDimension.item.ModItems;
import com.Infinity.MiningDimension.tab.ModTabs;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InfinityMiningDimension.MOD_ID);
    //Portal
    public static final RegistryObject<Block> INFINITY_MINING_PORTAL = registerBlockWithoutBlockItem("infinity_mining_dimension_portal",
            InfinityMiningPortal::new);
    public static final RegistryObject<Block> INFINITY_MINING_PORTAL_FRAME = registerBlock("infinity_mining_dimension_portal_frame",
            () -> new Block(BlockBehaviour.Properties.of(Material.ICE_SOLID).noOcclusion().requiresCorrectToolForDrops()
                    .strength(15f)), ModTabs.INFINITY_MINING_DIMENSION, Rarity.UNCOMMON,
            "tooltip.infinity_mining_dimension:infinity_mining_dimension_portal_frame");


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
     private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab,Rarity rarity,String tooltip) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, rarity,tooltip);
        return toReturn;
    }


    //Tooltip
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> blocks, CreativeModeTab tab, String tooltipKey){
        RegistryObject<T> toReturn = BLOCKS.register(name, blocks);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }
//New
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),  new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent("tooltip.infinity_mining_dimension.pressShift"));
                if(Screen.hasShiftDown()) {
                    pTooltip.remove(1);
                    pTooltip.add(new TranslatableComponent(tooltipKey));
                }
            }
        });
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, Rarity rarity, String tooltip) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab).rarity(rarity)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
