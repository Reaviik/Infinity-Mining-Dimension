package com.Infinity.Nexus.MiningDimension.config;

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


        APATITE_VEINS = BUILDER.comment("Thermal").define("apatite_veins_per_chunk", 1);
        APATITE_SIZE = BUILDER.comment("Thermal").define("apatite_vein_size", 4);
        CINNABAR_VEINS = BUILDER.comment("Thermal").define("cinnabar_veins_per_chunk", 1);
        CINNABAR_SIZE = BUILDER.comment("Thermal").define("cinnabar_vein_size", 4);
        NITER_VEINS = BUILDER.comment("Thermal").define("niter_veins_per_chunk", 1);
        NITER_SIZE = BUILDER.comment("Thermal").define("niter_vein_size", 4);
        SULFUR_VEINS = BUILDER.comment("Thermal").define("sulfur_veins_per_chunk", 1);
        SULFUR_SIZE = BUILDER.comment("Thermal").define("sulfur_vein_size", 4);
        TIN_VEINS = BUILDER.comment("Thermal").define("tin_veins_per_chunk", 1);
        TIN_SIZE = BUILDER.comment("Thermal").define("tin_vein_size", 4);
        LEAD_VEINS = BUILDER.comment("Thermal").define("lead_veins_per_chunk", 1);
        LEAD_SIZE = BUILDER.comment("Thermal").define("lead_vein_size", 4);
        NICKEL_VEINS = BUILDER.comment("Thermal").define("nickel_veins_per_chunk", 1);
        NICKEL_SIZE = BUILDER.comment("Thermal").define("nickel_vein_size", 4);
        SILVER_VEINS = BUILDER.comment("Thermal").define("silver_veins_per_chunk", 1);
        SILVER_SIZE = BUILDER.comment("Thermal").define("silver_vein_size", 4);
        RUBY_VEINS = BUILDER.comment("Thermal").define("ruby_veins_per_chunk", 1);
        RUBY_SIZE = BUILDER.comment("Thermal").define("ruby_vein_size", 4);
        SAPPHIRE_VEINS = BUILDER.comment("Thermal").define("sapphire_veins_per_chunk", 1);
        SAPPHIRE_SIZE = BUILDER.comment("Thermal").define("sapphire_vein_size", 4);

        BITUMINOUS_SAND_VEINS = BUILDER.comment("Thermal").define("bituminous_sand_veins_per_chunk", 5);
        BITUMINOUS_SAND_SIZE = BUILDER.comment("Thermal").define("bituminous_sand_vein_size", 1);

        BITUMINOUS_RED_SAND_VEINS = BUILDER.comment("Thermal").define("bituminous_red_sand_veins_per_chunk", 5);
        BITUMINOUS_RED_SAND_SIZE = BUILDER.comment("Thermal").define("bituminous_red_sand_vein_size", 1);

        DEEPSLATE_APATITE_VEINS = BUILDER.comment("Thermal").define("deepslate_apatite_veins_per_chunk", 1);
        DEEPSLATE_APATITE_SIZE = BUILDER.comment("Thermal").define("deepslate_apatite_vein_size", 4);
        DEEPSLATE_CINNABAR_VEINS = BUILDER.comment("Thermal").define("deepslate_cinnabar_veins_per_chunk", 1);
        DEEPSLATE_CINNABAR_SIZE = BUILDER.comment("Thermal").define("deepslate_cinnabar_vein_size", 4);
        DEEPSLATE_NITER_VEINS = BUILDER.comment("Thermal").define("deepslate_niter_veins_per_chunk", 1);
        DEEPSLATE_NITER_SIZE = BUILDER.comment("Thermal").define("deepslate_niter_vein_size", 4);
        DEEPSLATE_SULFUR_VEINS = BUILDER.comment("Thermal").define("deepslate_sulfur_veins_per_chunk", 1);
        DEEPSLATE_SULFUR_SIZE = BUILDER.comment("Thermal").define("deepslate_sulfur_vein_size", 4);
        DEEPSLATE_TIN_VEINS = BUILDER.comment("Thermal").define("deepslate_tin_veins_per_chunk", 1);
        DEEPSLATE_TIN_SIZE = BUILDER.comment("Thermal").define("deepslate_tin_vein_size", 4);
        DEEPSLATE_LEAD_VEINS = BUILDER.comment("Thermal").define("deepslate_lead_veins_per_chunk", 1);
        DEEPSLATE_LEAD_SIZE = BUILDER.comment("Thermal").define("deepslate_lead_vein_size", 4);
        DEEPSLATE_NICKEL_VEINS = BUILDER.comment("Thermal").define("deepslate_nickel_veins_per_chunk", 1);
        DEEPSLATE_NICKEL_SIZE = BUILDER.comment("Thermal").define("deepslate_nickel_vein_size", 4);
        DEEPSLATE_SILVER_VEINS = BUILDER.comment("Thermal").define("deepslate_silver_veins_per_chunk", 1);
        DEEPSLATE_SILVER_SIZE = BUILDER.comment("Thermal").define("deepslate_silver_vein_size", 4);
        DEEPSLATE_RUBY_VEINS = BUILDER.comment("Thermal").define("deepslate_ruby_veins_per_chunk", 1);
        DEEPSLATE_RUBY_SIZE = BUILDER.comment("Thermal").define("deepslate_ruby_vein_size", 4);
        DEEPSLATE_SAPPHIRE_VEINS = BUILDER.comment("Thermal").define("deepslate_sapphire_veins_per_chunk", 1);
        DEEPSLATE_SAPPHIRE_SIZE = BUILDER.comment("Thermal").define("deepslate_sapphire_vein_size", 4);
        //----------------------------------------------//----------------------------------------------//

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
