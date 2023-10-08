package com.Infinity.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class PowahCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> POWAH;

    public static final ForgeConfigSpec.ConfigValue<Integer> URANINITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> URANINITE_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> URANINITE_POOR_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> URANINITE_POOR_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> URANINITE_DENSE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> URANINITE_DENSE_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DRY_ICE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DRY_ICE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_URANINITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_URANINITE_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_URANINITE_POOR_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_URANINITE_POOR_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_URANINITE_DENSE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_URANINITE_DENSE_SIZE;


    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        POWAH = BUILDER.comment("Powah Configurations")
                .define("powah_gen_ores", true);

        URANINITE_VEINS = BUILDER.comment("Powah").define("uraninite_veins_per_chunk", 9);
        URANINITE_SIZE = BUILDER.comment("Powah").define("uraninite_vein_size", 8);
        URANINITE_POOR_VEINS = BUILDER.comment("Powah").define("uraninite_poor_veins_per_chunk", 4);
        URANINITE_POOR_SIZE = BUILDER.comment("Powah").define("uraninite_poor_vein_size", 8);
        URANINITE_DENSE_VEINS = BUILDER.comment("Powah").define("uraninite_dense_veins_per_chunk", 1);
        URANINITE_DENSE_SIZE = BUILDER.comment("Powah").define("uraninite_dense_vein_size", 8);

        DRY_ICE_VEINS = BUILDER.comment("Powah").define("dry_ice_veins_per_chunk", 9);
        DRY_ICE_SIZE = BUILDER.comment("Powah").define("dry_ice_vein_size", 8);

        DEEPSLATE_URANINITE_VEINS = BUILDER.comment("Powah").define("deepslate_uraninite_veins_per_chunk", 9);
        DEEPSLATE_URANINITE_SIZE = BUILDER.comment("Powah").define("deepslate_uraninite_vein_size", 8);
        DEEPSLATE_URANINITE_POOR_VEINS = BUILDER.comment("Powah").define("deepslate_uraninite_poor_veins_per_chunk", 4);
        DEEPSLATE_URANINITE_POOR_SIZE = BUILDER.comment("Powah").define("deepslate_uraninite_poor_vein_size", 8);
        DEEPSLATE_URANINITE_DENSE_VEINS = BUILDER.comment("Powah").define("deepslate_uraninite_dense_veins_per_chunk", 1);
        DEEPSLATE_URANINITE_DENSE_SIZE = BUILDER.comment("Powah").define("deepslate_uraninite_dense_vein_size", 8);
        //----------------------------------------------//----------------------------------------------//


        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
