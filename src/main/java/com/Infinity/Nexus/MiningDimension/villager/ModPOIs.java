package com.Infinity.Nexus.MiningDimension.villager;

import com.Infinity.Nexus.MiningDimension.InfinityNexusDim;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPOIs {

    public static final DeferredRegister<PoiType> POI
            = DeferredRegister.create(ForgeRegistries.POI_TYPES, InfinityNexusDim.MOD_ID);

    public static final RegistryObject<PoiType> INFINITY_MINING_PORTAL =
            POI.register("infinity_mining_portal", () -> new PoiType("infinity_mining_portal",
                    PoiType.getBlockStates(Blocks.COBBLESTONE), 0, 1));


    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
