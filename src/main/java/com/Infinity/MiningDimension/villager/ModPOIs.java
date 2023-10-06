package com.Infinity.MiningDimension.villager;

import com.Infinity.MiningDimension.InfinityMiningDimension;
import com.Infinity.MiningDimension.block.ModBlocks;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {

    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, InfinityMiningDimension.MOD_ID);

    public static final RegistryObject<PoiType> INFINITY_MINING_PORTAL =
            POI.register("infinity_mining_portal", () -> new PoiType("infinity_mining_portal",
                    PoiType.getBlockStates(ModBlocks.INFINITY_MINING_PORTAL.get()), 0, 1));


    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
