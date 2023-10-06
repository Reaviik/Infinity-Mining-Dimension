package com.Infinity.MiningDimension;

import com.Infinity.MiningDimension.block.ModBlocks;
import com.Infinity.MiningDimension.config.ModCommonConfigs;
import com.Infinity.MiningDimension.item.ModItems;
import com.Infinity.MiningDimension.villager.ModPOIs;
import com.Infinity.MiningDimension.world.dimension.ModDimensions;
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
@Mod(InfinityMiningDimension.MOD_ID)
public class InfinityMiningDimension
{

    public static final String MOD_ID = "infinity_mining_dimension";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogManager.getLogger();
    public InfinityMiningDimension ()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModDimensions.registry();
        ModPOIs.register(eventBus);

        eventBus.addListener(this::clientSetup);
        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ModCommonConfigs.SPEC, "infinity_mining_dimension-common.toml");


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
