package com.Infinity.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ImmersiveCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> IMMERSIVE;

    public static final ForgeConfigSpec.ConfigValue<Integer> BAUXITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> BAUXITE_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> LEAD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> LEAD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NICKEL_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NICKEL_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> URANIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> URANIUM_SIZE;



    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_BAUXITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_BAUXITE_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_SILVER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_SILVER_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_LEAD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_LEAD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_NICKEL_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_NICKEL_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_URANIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_URANIUM_SIZE;


    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        IMMERSIVE = BUILDER.comment("Immersive Engineering Configurations")
                .define("immersive_gen_ores", true);

        BAUXITE_VEINS = BUILDER.comment("Immersive").define("bauxite_veins_per_chunk", 9);
        BAUXITE_SIZE = BUILDER.comment("Immersive").define("bauxite_vein_size", 8);
        LEAD_VEINS = BUILDER.comment("Immersive").define("lead_veins_per_chunk", 9);
        LEAD_SIZE = BUILDER.comment("Immersive").define("lead_vein_size", 8);
        SILVER_VEINS = BUILDER.comment("Immersive").define("silver_veins_per_chunk", 9);
        SILVER_SIZE = BUILDER.comment("Immersive").define("silver_vein_size", 8);
        NICKEL_VEINS = BUILDER.comment("Immersive").define("nickel_veins_per_chunk", 9);
        NICKEL_SIZE = BUILDER.comment("Immersive").define("nickel_vein_size", 8);
        URANIUM_VEINS = BUILDER.comment("Immersive").define("uranium_veins_per_chunk", 9);
        URANIUM_SIZE = BUILDER.comment("Immersive").define("uranium_vein_size", 8);

        DEEPSLATE_BAUXITE_VEINS = BUILDER.comment("Immersive").define("deepslate_bauxite_veins_per_chunk", 9);
        DEEPSLATE_BAUXITE_SIZE = BUILDER.comment("Immersive").define("deepslate_bauxite_vein_size", 8);
        DEEPSLATE_LEAD_VEINS = BUILDER.comment("Immersive").define("deepslate_lead_veins_per_chunk", 9);
        DEEPSLATE_LEAD_SIZE = BUILDER.comment("Immersive").define("deepslate_lead_vein_size", 8);
        DEEPSLATE_NICKEL_VEINS = BUILDER.comment("Immersive").define("deepslate_nickel_veins_per_chunk", 9);
        DEEPSLATE_NICKEL_SIZE = BUILDER.comment("Immersive").define("deepslate_nickel_vein_size", 8);
        DEEPSLATE_SILVER_VEINS = BUILDER.comment("Immersive").define("deepslate_silver_veins_per_chunk", 9);
        DEEPSLATE_SILVER_SIZE = BUILDER.comment("Immersive").define("deepslate_silver_vein_size", 8);
        DEEPSLATE_URANIUM_VEINS = BUILDER.comment("Immersive").define("deepslate_uranium_veins_per_chunk", 9);
        DEEPSLATE_URANIUM_SIZE = BUILDER.comment("Immersive").define("deepslate_uranium_vein_size", 8);


        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
