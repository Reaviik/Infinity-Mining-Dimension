package com.Infinity.MiningDimension.item;

import com.Infinity.MiningDimension.InfinityMiningDimension;
import com.Infinity.MiningDimension.item.custom.PortalActivator;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfinityMiningDimension.MOD_ID);

        //Catalyst
    public static final RegistryObject<Item> CATALYST = ITEMS.register("portal_activator", PortalActivator::new);
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
