package com.Infinity.Nexus.MiningDimension;

import com.Infinity.Nexus.MiningDimension.config.*;
import com.Infinity.Nexus.MiningDimension.villager.ModPOIs;
import com.Infinity.Nexus.MiningDimension.world.dimension.ModDimensions;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(InfinityNexusDim.MOD_ID)
public class InfinityNexusDim
{

    public static String folder = "config/InfinityNexus/InfinityMiningDimension/Locations";
    public static String pluginLog = "§f[§4I§9N§bP§f]: §7";
    public static final String MOD_ID = "infinity_mining_dimension";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogManager.getLogger();
    public InfinityNexusDim()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModDimensions.registry();
        ModPOIs.register(eventBus);

        eventBus.addListener(this::clientSetup);
        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModCommonConfigs.SPEC, "InfinityNexus/infinity_mining_dimension.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MinecraftCommonConfigs.SPEC, "InfinityNexus/InfinityMiningDimension/imd_minecraft.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DraconicCommonConfigs.SPEC, "InfinityNexus/InfinityMiningDimension/imd_draconic.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GobberCommonConfigs.SPEC, "InfinityNexus/InfinityMiningDimension/imd_gobber.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ImmersiveCommonConfigs.SPEC, "InfinityNexus/InfinityMiningDimension/imd_immersive.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MekanismCommonConfigs.SPEC, "InfinityNexus/InfinityMiningDimension/imd_mekanism.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MiscCommonConfigs.SPEC, "InfinityNexus/InfinityMiningDimension/imd_misc.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MysticalCommonConfigs.SPEC, "InfinityNexus/InfinityMiningDimension/imd_mystical.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, PowahCommonConfigs.SPEC, "InfinityNexus/InfinityMiningDimension/imd_powah.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ThermalCommonConfigs.SPEC, "InfinityNexus/InfinityMiningDimension/imd_thermal.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, VaultHunterCommonConfigs.SPEC, "InfinityNexus/InfinityMiningDimension/imd_vaulthunters.toml");


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
