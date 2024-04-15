package com.Infinity.Nexus.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class GobberCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> GOBBER;

    public static final ForgeConfigSpec.ConfigValue<Integer> GOBBER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> GOBBER_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_GOBBER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_GOBBER_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_GOBBER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_GOBBER_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> END_GOBBER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> END_GOBBER_SIZE;


    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        GOBBER = BUILDER.comment("Gobber").comment("Gobber Configurations")
                .define("gobber_gen_ores", true);

        GOBBER_VEINS = BUILDER.comment("Gobber").define("gobber_veins_per_chunk", 1);
        GOBBER_SIZE = BUILDER.comment("Gobber").define("gobber_vein_size", 4);

        DEEPSLATE_GOBBER_VEINS = BUILDER.comment("Gobber").define("deepslate_gobber_veins_per_chunk", 1);
        DEEPSLATE_GOBBER_SIZE = BUILDER.comment("Gobber").define("deepslate_gobber_vein_size", 4);

        NETHER_GOBBER_VEINS = BUILDER.comment("Gobber").define("nether_gobber_veins_per_chunk", 1);
        NETHER_GOBBER_SIZE = BUILDER.comment("Gobber").define("nether_gobber_vein_size", 4);

        END_GOBBER_VEINS = BUILDER.comment("Gobber").define("end_gobber_veins_per_chunk", 1);
        END_GOBBER_SIZE = BUILDER.comment("Gobber").define("end_gobber_vein_size", 4);

        //----------------------------------------------//----------------------------------------------//


        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
