package com.Infinity.MiningDimension;

import com.Infinity.MiningDimension.block.custom.InfinityMiningPortal;
import com.Infinity.MiningDimension.config.*;
import com.Infinity.MiningDimension.villager.ModPOIs;
import com.Infinity.MiningDimension.world.dimension.ModDimensions;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(InfinityMiningDimension.MOD_ID)
public class InfinityMiningDimension
{

    public static final String MOD_ID = "infinity_mining_dimension";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogManager.getLogger();
    public InfinityMiningDimension ()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModDimensions.registry();
        ModPOIs.register(eventBus);

        eventBus.addListener(this::clientSetup);
        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModCommonConfigs.SPEC, "InfinityMiningDimension/imd.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MinecraftCommonConfigs.SPEC, "InfinityMiningDimension/minecraft.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DraconicCommonConfigs.SPEC, "InfinityMiningDimension/draconic.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GobberCommonConfigs.SPEC, "InfinityMiningDimension/gobber.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ImmersiveCommonConfigs.SPEC, "InfinityMiningDimension/immersive.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MekanismCommonConfigs.SPEC, "InfinityMiningDimension/mekanism.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MiscCommonConfigs.SPEC, "InfinityMiningDimension/misc.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MysticalCommonConfigs.SPEC, "InfinityMiningDimension/mystical.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, PowahCommonConfigs.SPEC, "InfinityMiningDimension/powah.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ThermalCommonConfigs.SPEC, "InfinityMiningDimension/thermal.toml");


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }
    public void clientSetup(final FMLClientSetupEvent event){
    }
    private void setup(final FMLCommonSetupEvent event)
    {

        LOGGER.info("   §4_____§5_   __§9__________§3_   ______§b_______  __");
        LOGGER.info("  §4/_  _§5/ | / §9/ ____/  _§3/ | / /  _§b/_  __| \\/ /");
        LOGGER.info("   §4/ /§5/  |/ §9/ /_   / /§3/  |/ // /  §b/ /   \\  / ");
        LOGGER.info(" §4_/ /§5/ /|  §9/ __/ _/ /§3/ /|  // /  §b/ /    / /  ");
        LOGGER.info("§4/___§5/_/ |_§9/_/   /___§3/_/ |_/___/ §b/_/    /_/   ");
        LOGGER.info("§b        Infinity Mining Dimension");

    }
}
