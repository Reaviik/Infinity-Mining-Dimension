package com.Infinity.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ThermalCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> THERMAL;
    public static final ForgeConfigSpec.ConfigValue<Integer> APATITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> APATITE_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> CINNABAR_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> CINNABAR_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NITER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NITER_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> SULFUR_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> SULFUR_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> TIN_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> TIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> LEAD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> LEAD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NICKEL_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NICKEL_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> SILVER_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> RUBY_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> RUBY_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> SAPPHIRE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> SAPPHIRE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> BITUMINOUS_SAND_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> BITUMINOUS_SAND_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> BITUMINOUS_RED_SAND_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> BITUMINOUS_RED_SAND_SIZE;


    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_APATITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_APATITE_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_CINNABAR_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_CINNABAR_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_NITER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_NITER_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_SULFUR_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_SULFUR_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_TIN_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_TIN_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_LEAD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_LEAD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_SILVER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_SILVER_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_NICKEL_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_NICKEL_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_RUBY_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_RUBY_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_SAPPHIRE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_SAPPHIRE_SIZE;
    //----------------------------------//----------------------------------//


    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        THERMAL = BUILDER.comment("Thermal Configurations")
                .define("thermal_gen_ores", true);


        APATITE_VEINS = BUILDER.comment("Thermal").define("apatite_veins_per_chunk", 9);
        APATITE_SIZE = BUILDER.comment("Thermal").define("apatite_vein_size", 8);
        CINNABAR_VEINS = BUILDER.comment("Thermal").define("cinnabar_veins_per_chunk", 9);
        CINNABAR_SIZE = BUILDER.comment("Thermal").define("cinnabar_vein_size", 8);
        NITER_VEINS = BUILDER.comment("Thermal").define("niter_veins_per_chunk", 9);
        NITER_SIZE = BUILDER.comment("Thermal").define("niter_vein_size", 8);
        SULFUR_VEINS = BUILDER.comment("Thermal").define("sulfur_veins_per_chunk", 9);
        SULFUR_SIZE = BUILDER.comment("Thermal").define("sulfur_vein_size", 8);
        TIN_VEINS = BUILDER.comment("Thermal").define("tin_veins_per_chunk", 9);
        TIN_SIZE = BUILDER.comment("Thermal").define("tin_vein_size", 8);
        LEAD_VEINS = BUILDER.comment("Thermal").define("lead_veins_per_chunk", 9);
        LEAD_SIZE = BUILDER.comment("Thermal").define("lead_vein_size", 8);
        NICKEL_VEINS = BUILDER.comment("Thermal").define("nickel_veins_per_chunk", 9);
        NICKEL_SIZE = BUILDER.comment("Thermal").define("nickel_vein_size", 8);
        SILVER_VEINS = BUILDER.comment("Thermal").define("silver_veins_per_chunk", 9);
        SILVER_SIZE = BUILDER.comment("Thermal").define("silver_vein_size", 8);
        RUBY_VEINS = BUILDER.comment("Thermal").define("ruby_veins_per_chunk", 9);
        RUBY_SIZE = BUILDER.comment("Thermal").define("ruby_vein_size", 8);
        SAPPHIRE_VEINS = BUILDER.comment("Thermal").define("sapphire_veins_per_chunk", 9);
        SAPPHIRE_SIZE = BUILDER.comment("Thermal").define("sapphire_vein_size", 9);

        BITUMINOUS_SAND_VEINS = BUILDER.comment("Thermal").define("bituminous_sand_veins_per_chunk", 9);
        BITUMINOUS_SAND_SIZE = BUILDER.comment("Thermal").define("bituminous_sand_vein_size", 8);

        BITUMINOUS_RED_SAND_VEINS = BUILDER.comment("Thermal").define("bituminous_red_sand_veins_per_chunk", 9);
        BITUMINOUS_RED_SAND_SIZE = BUILDER.comment("Thermal").define("bituminous_red_sand_vein_size", 8);

        DEEPSLATE_APATITE_VEINS = BUILDER.comment("Thermal").define("deepslate_apatite_veins_per_chunk", 9);
        DEEPSLATE_APATITE_SIZE = BUILDER.comment("Thermal").define("deepslate_apatite_vein_size", 8);
        DEEPSLATE_CINNABAR_VEINS = BUILDER.comment("Thermal").define("deepslate_cinnabar_veins_per_chunk", 9);
        DEEPSLATE_CINNABAR_SIZE = BUILDER.comment("Thermal").define("deepslate_cinnabar_vein_size", 8);
        DEEPSLATE_NITER_VEINS = BUILDER.comment("Thermal").define("deepslate_niter_veins_per_chunk", 9);
        DEEPSLATE_NITER_SIZE = BUILDER.comment("Thermal").define("deepslate_niter_vein_size", 8);
        DEEPSLATE_SULFUR_VEINS = BUILDER.comment("Thermal").define("deepslate_sulfur_veins_per_chunk", 9);
        DEEPSLATE_SULFUR_SIZE = BUILDER.comment("Thermal").define("deepslate_sulfur_vein_size", 8);
        DEEPSLATE_TIN_VEINS = BUILDER.comment("Thermal").define("deepslate_tin_veins_per_chunk", 9);
        DEEPSLATE_TIN_SIZE = BUILDER.comment("Thermal").define("deepslate_tin_vein_size", 8);
        DEEPSLATE_LEAD_VEINS = BUILDER.comment("Thermal").define("deepslate_lead_veins_per_chunk", 9);
        DEEPSLATE_LEAD_SIZE = BUILDER.comment("Thermal").define("deepslate_lead_vein_size", 8);
        DEEPSLATE_NICKEL_VEINS = BUILDER.comment("Thermal").define("deepslate_nickel_veins_per_chunk", 9);
        DEEPSLATE_NICKEL_SIZE = BUILDER.comment("Thermal").define("deepslate_nickel_vein_size", 8);
        DEEPSLATE_SILVER_VEINS = BUILDER.comment("Thermal").define("deepslate_silver_veins_per_chunk", 9);
        DEEPSLATE_SILVER_SIZE = BUILDER.comment("Thermal").define("deepslate_silver_vein_size", 8);
        DEEPSLATE_RUBY_VEINS = BUILDER.comment("Thermal").define("deepslate_ruby_veins_per_chunk", 9);
        DEEPSLATE_RUBY_SIZE = BUILDER.comment("Thermal").define("deepslate_ruby_vein_size", 8);
        DEEPSLATE_SAPPHIRE_VEINS = BUILDER.comment("Thermal").define("deepslate_sapphire_veins_per_chunk", 9);
        DEEPSLATE_SAPPHIRE_SIZE = BUILDER.comment("Thermal").define("deepslate_sapphire_vein_size", 8);
        //----------------------------------------------//----------------------------------------------//

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
