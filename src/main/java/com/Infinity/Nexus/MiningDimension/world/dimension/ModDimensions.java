package com.Infinity.Nexus.MiningDimension.world.dimension;

import com.Infinity.Nexus.MiningDimension.InfinityNexusDim;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;


public class ModDimensions {
    public static final ResourceKey<Level> MINING_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(InfinityNexusDim.MOD_ID, "infinity_mining_dimension"));

    public static final ResourceKey<Level> VOID_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(InfinityNexusDim.MOD_ID, "spawn"));

    public static final ResourceKey<DimensionType> MINING_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, MINING_KEY.getRegistryName());

    public static final ResourceKey<DimensionType> VOID_TYPE =
            ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, VOID_KEY.getRegistryName());

    public static void registry() {
        System.out.println("Registrando Dimensions for "+ InfinityNexusDim.MOD_ID);
    }
}
