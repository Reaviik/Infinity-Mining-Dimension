package com.Infinity.Nexus.MiningDimension.world.gen;

import com.Infinity.Nexus.MiningDimension.InfinityNexusDim;
import com.Infinity.Nexus.MiningDimension.config.*;
import com.Infinity.Nexus.MiningDimension.world.feature.draconic.DraconicPlacedFeatures;
import com.Infinity.Nexus.MiningDimension.world.feature.gobber.GobberPlacedFeatures;
import com.Infinity.Nexus.MiningDimension.world.feature.immersive.ImmersivePlacedFeatures;
import com.Infinity.Nexus.MiningDimension.world.feature.mekanism.MekanismPlacedFeatures;
import com.Infinity.Nexus.MiningDimension.world.feature.minecraft.MinecraftPlacedFeatures;
import com.Infinity.Nexus.MiningDimension.world.feature.misc.MiscPlacedFeatures;
import com.Infinity.Nexus.MiningDimension.world.feature.mystical.MysticalPlacedFeatures;
import com.Infinity.Nexus.MiningDimension.world.feature.powah.PowahPlacedFeatures;
import com.Infinity.Nexus.MiningDimension.world.feature.thermal.ThermalPlacedFeatures;
import com.Infinity.Nexus.MiningDimension.world.feature.vaulthunters.VaultHuntersPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Objects;

public class ModOreGeneration {
        public static void generateOres(final BiomeLoadingEvent event) {
            List<Holder<PlacedFeature>> base = event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);
            if(Objects.equals(event.getName(), new ResourceLocation(InfinityNexusDim.MOD_ID + ":infinity_mining_biome"))) {
                if(MinecraftCommonConfigs.MINECRAFT.get()) {
                    base.add(MinecraftPlacedFeatures.MINECRAFT_COAL);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_COPPER);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_IRON);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_GOLD);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_LAPIS);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_REDSTONE);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_DIAMOND);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_EMERALD);

                    base.add(MinecraftPlacedFeatures.MINECRAFT_DEEPSLATE_COAL);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_DEEPSLATE_COPPER);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_DEEPSLATE_IRON);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_DEEPSLATE_GOLD);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_DEEPSLATE_LAPIS);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_DEEPSLATE_REDSTONE);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_DEEPSLATE_DIAMOND);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_DEEPSLATE_EMERALD);

                    base.add(MinecraftPlacedFeatures.MINECRAFT_NETHER_GOLD);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_NETHER_QUARTZ);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_NETHER_DEBRIS);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_NETHER_SOULSAND);
                    base.add(MinecraftPlacedFeatures.MINECRAFT_NETHER_MAGMA_BLOCK);
                    base.add(MinecraftPlacedFeatures.CLAY_BLOCK);

                }
                if(MekanismCommonConfigs.MEKANISM.get()) {
                    base.add(MekanismPlacedFeatures.MEKANISM_OSMIUM);
                    base.add(MekanismPlacedFeatures.MEKANISM_TIN);
                    base.add(MekanismPlacedFeatures.MEKANISM_LEAD);
                    base.add(MekanismPlacedFeatures.MEKANISM_URANIUM);
                    base.add(MekanismPlacedFeatures.MEKANISM_FLUORITE);

                    base.add(MekanismPlacedFeatures.MEKANISM_DEEPSLATE_OSMIUM);
                    base.add(MekanismPlacedFeatures.MEKANISM_DEEPSLATE_TIN);
                    base.add(MekanismPlacedFeatures.MEKANISM_DEEPSLATE_LEAD);
                    base.add(MekanismPlacedFeatures.MEKANISM_DEEPSLATE_URANIUM);
                    base.add(MekanismPlacedFeatures.MEKANISM_DEEPSLATE_FLUORITE);
                }
                if (ThermalCommonConfigs.THERMAL.get()) {

                    base.add(ThermalPlacedFeatures.THERMAL_APATITE);
                    base.add(ThermalPlacedFeatures.THERMAL_CINNABAR);
                    base.add(ThermalPlacedFeatures.THERMAL_NITER);
                    base.add(ThermalPlacedFeatures.THERMAL_SULFUR);
                    base.add(ThermalPlacedFeatures.THERMAL_TIN);
                    base.add(ThermalPlacedFeatures.THERMAL_LEAD);
                    base.add(ThermalPlacedFeatures.THERMAL_NICKEL);
                    base.add(ThermalPlacedFeatures.THERMAL_SILVER);
                    base.add(ThermalPlacedFeatures.THERMAL_RUBY);
                    base.add(ThermalPlacedFeatures.THERMAL_SAPPHIRE);

                    base.add(ThermalPlacedFeatures.THERMAL_BITUMINOUS_SAND);
                    base.add(ThermalPlacedFeatures.THERMAL_BITUMINOUS_RED_SAND);

                    base.add(ThermalPlacedFeatures.THERMAL_DEEPSLATE_APATITE);
                    base.add(ThermalPlacedFeatures.THERMAL_DEEPSLATE_CINNABAR);
                    base.add(ThermalPlacedFeatures.THERMAL_DEEPSLATE_NITER);
                    base.add(ThermalPlacedFeatures.THERMAL_DEEPSLATE_SULFUR);
                    base.add(ThermalPlacedFeatures.THERMAL_DEEPSLATE_TIN);
                    base.add(ThermalPlacedFeatures.THERMAL_DEEPSLATE_LEAD);
                    base.add(ThermalPlacedFeatures.THERMAL_DEEPSLATE_NICKEL);
                    base.add(ThermalPlacedFeatures.THERMAL_DEEPSLATE_SILVER);
                    base.add(ThermalPlacedFeatures.THERMAL_DEEPSLATE_RUBY);
                    base.add(ThermalPlacedFeatures.THERMAL_DEEPSLATE_SAPPHIRE);
                }
                if (ImmersiveCommonConfigs.IMMERSIVE.get()) {

                    base.add(ImmersivePlacedFeatures.IMMERSIVE_BAUXITE);
                    base.add(ImmersivePlacedFeatures.IMMERSIVE_SILVER);
                    base.add(ImmersivePlacedFeatures.IMMERSIVE_LEAD);
                    base.add(ImmersivePlacedFeatures.IMMERSIVE_NICKEL);
                    base.add(ImmersivePlacedFeatures.IMMERSIVE_URANIUM);

                    base.add(ImmersivePlacedFeatures.IMMERSIVE_DEEPSLATE_BAUXITE);
                    base.add(ImmersivePlacedFeatures.IMMERSIVE_DEEPSLATE_SILVER);
                    base.add(ImmersivePlacedFeatures.IMMERSIVE_DEEPSLATE_LEAD);
                    base.add(ImmersivePlacedFeatures.IMMERSIVE_DEEPSLATE_NICKEL);
                    base.add(ImmersivePlacedFeatures.IMMERSIVE_DEEPSLATE_URANIUM);

                }
                if (DraconicCommonConfigs.DRACONIC.get()) {

                    base.add(DraconicPlacedFeatures.DRACONIC_DRACONIUM);

                    base.add(DraconicPlacedFeatures.DRACONIC_DEEPSLATE_DRACONIUM);

                    base.add(DraconicPlacedFeatures.DRACONIC_NETHER_DRACONIUM);

                    base.add(DraconicPlacedFeatures.DRACONIC_END_DRACONIUM);
                }
                if (GobberCommonConfigs.GOBBER.get()) {

                    base.add(GobberPlacedFeatures.GOBBER_GOBBER);

                    base.add(GobberPlacedFeatures.GOBBER_DEEPSLATE_GOBBER);

                    base.add(GobberPlacedFeatures.GOBBER_NETHER_GOBBER);

                    base.add(GobberPlacedFeatures.GOBBER_END_GOBBER);
                }
                if (MysticalCommonConfigs.MYSTICAL.get()) {

                    base.add(MysticalPlacedFeatures.MYSTICAL_PROSPERITY);
                    base.add(MysticalPlacedFeatures.MYSTICAL_INFERIUM);

                    base.add(MysticalPlacedFeatures.MYSTICAL_DEEPSLATE_PROSPERITY);
                    base.add(MysticalPlacedFeatures.MYSTICAL_DEEPSLATE_INFERIUM);

                    base.add(MysticalPlacedFeatures.MYSTICAL_NETHER_PROSPERITY);
                    base.add(MysticalPlacedFeatures.MYSTICAL_NETHER_SOULSTONE);
                    base.add(MysticalPlacedFeatures.MYSTICAL_NETHER_SOULIUM);
                    base.add(MysticalPlacedFeatures.MYSTICAL_NETHER_INFERIUM);

                    base.add(MysticalPlacedFeatures.MYSTICAL_END_PROSPERITY);
                    base.add(MysticalPlacedFeatures.MYSTICAL_END_INFERIUM);
                }
                if (PowahCommonConfigs.POWAH.get()) {

                    base.add(PowahPlacedFeatures.POWAH_URANINITE);
                    base.add(PowahPlacedFeatures.POWAH_URANINITE_POOR);
                    base.add(PowahPlacedFeatures.POWAH_URANINITE_DENSE);

                    base.add(PowahPlacedFeatures.POWAH_DRY_ICE);

                    base.add(PowahPlacedFeatures.POWAH_DEEPSLATE_URANINITE);
                    base.add(PowahPlacedFeatures.POWAH_DEEPSLATE_URANINITE_POOR);
                    base.add(PowahPlacedFeatures.POWAH_DEEPSLATE_URANINITE_DENSE);
                }
                if (MiscCommonConfigs.TINKERS.get()) {

                    base.add(MiscPlacedFeatures.MISC_NETHER_COBALT);
                }
                if (MiscCommonConfigs.INFINITY.get()) {

                    base.add(MiscPlacedFeatures.MISC_INFINITY);

                    base.add(MiscPlacedFeatures.MISC_DEEPSLATE_INFINITY);
                }
                if (MiscCommonConfigs.EVILCRAFT.get()) {

                    base.add(MiscPlacedFeatures.MISC_DARK);

                    base.add(MiscPlacedFeatures.MISC_DEEPSLATE_DARK);
                }
                if (MiscCommonConfigs.AE2.get()) {

                    base.add(MiscPlacedFeatures.MISC_CERTUS_QUARTZ);

                    base.add(MiscPlacedFeatures.MISC_DEEPSLATE_CERTUS_QUARTZ);
                }
                if (MiscCommonConfigs.FORBIDEN.get()) {

                    base.add(MiscPlacedFeatures.MISC_EXPETRIFIED);
                    base.add(MiscPlacedFeatures.MISC_ARCANE_CRYSTAL);

                    base.add(MiscPlacedFeatures.MISC_DEEPSLATE_ARCANE_CRYSTAL);
                }
                if (MiscCommonConfigs.MYTHIC_BOTANY.get()) {

                    base.add(MiscPlacedFeatures.MISC_ELEMENTIUM);
                    base.add(MiscPlacedFeatures.MISC_DRAGONSTONE);
                }
                if (MiscCommonConfigs.EXTREME_REACTORS.get()) {

                    base.add(MiscPlacedFeatures.MISC_YELLORITE);

                    base.add(MiscPlacedFeatures.MISC_NETHER_BENITOIDE);

                    base.add(MiscPlacedFeatures.MISC_END_ANGLESITE);
                }
                if (MiscCommonConfigs.OCCULTISM.get()) {
                    base.add(MiscPlacedFeatures.OCCULTISM_SILVER);
                    base.add(MiscPlacedFeatures.OCCULTISM_DEEPSLATE_SILVER);
                    base.add(MiscPlacedFeatures.OCCULTISM_NETHER_IESNIUM);
                    base.add(MiscPlacedFeatures.OCCULTISM_NETHER_NATURAL_IESNIUM);
                }
                if(VaultHunterCommonConfigs.VALTHUNTERS.get()){
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_ALEXANDRITE);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_ASHIUM);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_BENITOITE);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_BLACK_OPAL);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_BOMIGNITE);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_ECHO);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_GORGINITE);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_ISKALLIUM);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_LARIMAR);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_PAINITE);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_PETZANITE);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_SPARKLETINE);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_TUBIUM);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_UPALINE);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_WUTODIE);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_XENIUM);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_VAULT_STONE);
                    base.add(VaultHuntersPlacedFeatures.VAUTHUNTERS_CHROMATIC_IRON);
                }
            }
        }
    }