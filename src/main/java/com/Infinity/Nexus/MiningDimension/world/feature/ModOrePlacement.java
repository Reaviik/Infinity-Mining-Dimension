package com.Infinity.Nexus.MiningDimension.world.feature;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier veinsPerChunk, PlacementModifier heightRangePlacement) {
        return List.of(veinsPerChunk, InSquarePlacement.spread(), heightRangePlacement, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int veinsPerChunk, PlacementModifier heightRangePlacement) {
            return orePlacement(CountPlacement.of(veinsPerChunk), heightRangePlacement);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}