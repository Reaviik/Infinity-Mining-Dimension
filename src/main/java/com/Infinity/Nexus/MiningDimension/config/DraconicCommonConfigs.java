package com.Infinity.Nexus.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class DraconicCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> DRACONIC;

    public static final ForgeConfigSpec.ConfigValue<Integer> DRACONIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DRACONIUM_SIZE;


    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_DRACONIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_DRACONIUM_SIZE;


    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_DRACONIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_DRACONIUM_SIZE;


    public static final ForgeConfigSpec.ConfigValue<Integer> END_DRACONIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> END_DRACONIUM_SIZE;


    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        DRACONIC = BUILDER.comment("Draconic Configurations")
                .define("draconic_gen_ores", true);


        DRACONIUM_VEINS = BUILDER.comment("Draconic").define("draconium_veins_per_chunk", 1);
        DRACONIUM_SIZE = BUILDER.comment("Draconic").define("draconium_vein_size", 4);

        DEEPSLATE_DRACONIUM_VEINS = BUILDER.comment("Draconic").define("deepslate_draconium_veins_per_chunk", 1);
        DEEPSLATE_DRACONIUM_SIZE = BUILDER.comment("Draconic").define("deepslate_draconium_vein_size", 4);

        NETHER_DRACONIUM_VEINS = BUILDER.comment("Draconic").define("nether_draconium_veins_per_chunk", 1);
        NETHER_DRACONIUM_SIZE = BUILDER.comment("Draconic").define("nether_draconium_vein_size", 4);

        END_DRACONIUM_VEINS = BUILDER.comment("Draconic").define("end_draconium_veins_per_chunk", 1);
        END_DRACONIUM_SIZE = BUILDER.comment("Draconic").define("end_draconium_vein_size", 4);


        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
