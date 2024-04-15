package com.Infinity.Nexus.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MekanismCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> MEKANISM;

    public static final ForgeConfigSpec.ConfigValue<Integer> OSMIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> OSMIUM_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> TIN_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> TIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> LEAD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> LEAD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> URANIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> URANIUM_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> FLUORITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> FLUORITE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_OSMIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_OSMIUM_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_TIN_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_TIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_LEAD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_LEAD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_URANIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_URANIUM_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_FLUORITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_FLUORITE_SIZE;

    //----------------------------------//----------------------------------//
    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        MEKANISM = BUILDER.comment("Mekanism Configurations")
                .define("mekanism_gen_ores", true);

        OSMIUM_VEINS = BUILDER.comment("Mekanism").define("osmium_veins_per_chunk", 1);
        OSMIUM_SIZE = BUILDER.comment("Mekanism").define("osmium_vein_size", 4);
        LEAD_VEINS = BUILDER.comment("Mekanism").define("lead_veins_per_chunk", 1);
        LEAD_SIZE = BUILDER.comment("Mekanism").define("lead_vein_size", 4);
        TIN_VEINS = BUILDER.comment("Mekanism").define("tin_veins_per_chunk", 1);
        TIN_SIZE = BUILDER.comment("Mekanism").define("tin_vein_size", 4);
        URANIUM_VEINS = BUILDER.comment("Mekanism").define("uranium_veins_per_chunk", 1);
        URANIUM_SIZE = BUILDER.comment("Mekanism").define("uranium_vein_size", 4);
        FLUORITE_VEINS = BUILDER.comment("Mekanism").define("fluorite_veins_per_chunk", 1);
        FLUORITE_SIZE = BUILDER.comment("Mekanism").define("fluorite_vein_size", 4);

        DEEPSLATE_OSMIUM_VEINS = BUILDER.comment("Mekanism").define("deepslate_osmium_veins_per_chunk", 1);
        DEEPSLATE_OSMIUM_SIZE = BUILDER.comment("Mekanism").define("deepslate_osmium_vein_size", 4);
        DEEPSLATE_LEAD_VEINS = BUILDER.comment("Mekanism").define("deepslate_lead_veins_per_chunk", 1);
        DEEPSLATE_LEAD_SIZE = BUILDER.comment("Mekanism").define("deepslate_lead_vein_size", 4);
        DEEPSLATE_TIN_VEINS = BUILDER.comment("Mekanism").define("deepslate_tin_veins_per_chunk", 1);
        DEEPSLATE_TIN_SIZE = BUILDER.comment("Mekanism").define("deepslate_tin_vein_size", 4);
        DEEPSLATE_URANIUM_VEINS = BUILDER.comment("Mekanism").define("deepslate_uranium_veins_per_chunk", 1);
        DEEPSLATE_URANIUM_SIZE = BUILDER.comment("Mekanism").define("deepslate_uranium_vein_size", 4);
        DEEPSLATE_FLUORITE_VEINS = BUILDER.comment("Mekanism").define("deepslate_fluorite_veins_per_chunk", 1);
        DEEPSLATE_FLUORITE_SIZE = BUILDER.comment("Mekanism").define("deepslate_fluorite_vein_size", 4);
        //----------------------------------------------//----------------------------------------------//


        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
