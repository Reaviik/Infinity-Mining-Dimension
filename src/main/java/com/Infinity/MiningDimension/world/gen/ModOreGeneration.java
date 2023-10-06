package com.Infinity.MiningDimension.world.gen;

import com.Infinity.MiningDimension.InfinityMiningDimension;
import com.Infinity.MiningDimension.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import terrablender.core.TerraBlenderForge;

import java.util.List;
import java.util.Objects;

public class ModOreGeneration extends TerraBlenderForge {
        public static void generateOres(final BiomeLoadingEvent event) {
            List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

            System.out.println("\n\n\nBioma Raw\n"+event.getName()+"\n\n\n");
            if(event.getCategory() == Biome.BiomeCategory.MUSHROOM) {
                System.out.println("\n\n\nBioma?\n"+event.getName()+"\n\n\n");
                base.add(ModPlacedFeatures.COAL);
                base.add(ModPlacedFeatures.COPPER);
                base.add(ModPlacedFeatures.IRON);
                base.add(ModPlacedFeatures.GOLD);
                base.add(ModPlacedFeatures.LAPIS);
                base.add(ModPlacedFeatures.REDSTONE);
                base.add(ModPlacedFeatures.DIAMOND);
                base.add(ModPlacedFeatures.EMERALD);
                base.add(ModPlacedFeatures.INFINITY);
                base.add(ModPlacedFeatures.DARK);
                base.add(ModPlacedFeatures.URANINITE);
                base.add(ModPlacedFeatures.GOBBER);
                base.add(ModPlacedFeatures.OSMIUM);
                base.add(ModPlacedFeatures.FLUORITE);
                base.add(ModPlacedFeatures.DRACONIUM);
                base.add(ModPlacedFeatures.PROSPERITY);
                base.add(ModPlacedFeatures.INFERIUM);
                base.add(ModPlacedFeatures.APATITE);
                base.add(ModPlacedFeatures.CINNABAR);
                base.add(ModPlacedFeatures.NITER);
                base.add(ModPlacedFeatures.SULFUR);
                base.add(ModPlacedFeatures.TIN);
                base.add(ModPlacedFeatures.BAUXITE);
                base.add(ModPlacedFeatures.LEAD);
                base.add(ModPlacedFeatures.NICKEL);
                base.add(ModPlacedFeatures.RUBY);
                base.add(ModPlacedFeatures.SAPPHIRE);
                base.add(ModPlacedFeatures.URANIUM);
                base.add(ModPlacedFeatures.CERTUS_QUARTZ);
                base.add(ModPlacedFeatures.EXPETRIFIED);
                base.add(ModPlacedFeatures.ARCANE_CRYSTAL);
                base.add(ModPlacedFeatures.BITUMINOUS_SAND);
                base.add(ModPlacedFeatures.BITUMINOUS_RED_SAND);
                base.add(ModPlacedFeatures.ELEMENTIUM);
                base.add(ModPlacedFeatures.DEEPSLATE_COAL);
                base.add(ModPlacedFeatures.DEEPSLATE_COPPER);
                base.add(ModPlacedFeatures.DEEPSLATE_IRON);
                base.add(ModPlacedFeatures.DEEPSLATE_GOLD);
                base.add(ModPlacedFeatures.DEEPSLATE_LAPIS);
                base.add(ModPlacedFeatures.DEEPSLATE_REDSTONE);
                base.add(ModPlacedFeatures.DEEPSLATE_DIAMOND);
                base.add(ModPlacedFeatures.DEEPSLATE_EMERALD);
                base.add(ModPlacedFeatures.DEEPSLATE_DARK);
                base.add(ModPlacedFeatures.DEEPSLATE_URANINITE);
                base.add(ModPlacedFeatures.DEEPSLATE_GOBBER);
                base.add(ModPlacedFeatures.DEEPSLATE_OSMIUM);
                base.add(ModPlacedFeatures.DEEPSLATE_FLUORITE);
                base.add(ModPlacedFeatures.DEEPSLATE_DRACONIUM);
                base.add(ModPlacedFeatures.DEEPSLATE_PROSPERITY);
                base.add(ModPlacedFeatures.DEEPSLATE_INFERIUM);
                base.add(ModPlacedFeatures.DEEPSLATE_APATITE);
                base.add(ModPlacedFeatures.DEEPSLATE_CINNABAR);
                base.add(ModPlacedFeatures.DEEPSLATE_NITER);
                base.add(ModPlacedFeatures.DEEPSLATE_SULFUR);
                base.add(ModPlacedFeatures.DEEPSLATE_TIN);
                base.add(ModPlacedFeatures.DEEPSLATE_BAUXITE);
                base.add(ModPlacedFeatures.DEEPSLATE_LEAD);
                base.add(ModPlacedFeatures.DEEPSLATE_NICKEL);
                base.add(ModPlacedFeatures.DEEPSLATE_RUBY);
                base.add(ModPlacedFeatures.DEEPSLATE_SAPPHIRE);
                base.add(ModPlacedFeatures.DEEPSLATE_URANIUM);
                base.add(ModPlacedFeatures.DEEPSLATE_CERTUS_QUARTZ);
                base.add(ModPlacedFeatures.DEEPSLATE_ARCANE_CRYSTAL);
                base.add(ModPlacedFeatures.DRAGONSTONE);
            }
        }
    }