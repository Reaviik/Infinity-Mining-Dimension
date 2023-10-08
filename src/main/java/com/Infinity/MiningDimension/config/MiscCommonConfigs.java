package com.Infinity.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MiscCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//

    public static final ForgeConfigSpec.ConfigValue<Boolean> TINKERS;
    public static final ForgeConfigSpec.ConfigValue<Boolean> INFINITY;
    public static final ForgeConfigSpec.ConfigValue<Boolean> EVILCRAFT;
    public static final ForgeConfigSpec.ConfigValue<Boolean> AE2;
    public static final ForgeConfigSpec.ConfigValue<Boolean> FORBIDEN;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MYTHIC_BOTANY;
    public static final ForgeConfigSpec.ConfigValue<Boolean> EXTREME_REACTORS;
    public static final ForgeConfigSpec.ConfigValue<Boolean> OCCULTISM;

    public static final ForgeConfigSpec.ConfigValue<Integer> INFINITY_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> INFINITY_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DARK_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DARK_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> YELLORITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> YELLORITE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> CERTUS_QUARTZ_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> CERTUS_QUARTZ_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> EXPETRIFIED_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> EXPETRIFIED_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> ARCANE_CRYSTAL_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> ARCANE_CRYSTAL_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> ELEMENTIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> ELEMENTIUM_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_INFINITY_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_INFINITY_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_DARK_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_DARK_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_CERTUS_QUARTZ_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_CERTUS_QUARTZ_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_ARCANE_CRYSTAL_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_ARCANE_CRYSTAL_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DRAGONSTONE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DRAGONSTONE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BENITOIDE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_BENITOIDE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_COBALT_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_COBALT_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_IESNIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_IESNIUM_SIZE;


    public static final ForgeConfigSpec.ConfigValue<Integer> END_ANGLESITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> END_ANGLESITE_SIZE;

    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        TINKERS = BUILDER.comment("Tinkers Configurations")
                .define("tinkers_gen_ores", true);

        INFINITY = BUILDER.comment("Infinity Configurations")
                .define("infinity_gen_ores", true);

        EVILCRAFT = BUILDER.comment("Evilcraft Configurations")
                .define("evilcraft_gen_ores", true);

        AE2 = BUILDER.comment("Applied Energistics 2 Configurations")
                .define("ae2_gen_ores", true);

        FORBIDEN = BUILDER.comment("Forbiden and Arcanus Configurations")
                .define("forbiden_gen_ores", true);

        MYTHIC_BOTANY = BUILDER.comment("Mythic Botany Configurations")
                .define("mythic_botany_gen_ores", true);

        EXTREME_REACTORS = BUILDER.comment("Extreme Reactors Configurations")
                .define("extreme_reactors_gen_ores", true);

        OCCULTISM = BUILDER.comment("Occultism Configurations")
                .define("occultism_gen_ores", true);

        //----------------------------------------------//----------------------------------------------//


        INFINITY_VEINS = BUILDER.comment("Misc").define("infinity_veins_per_chunk", 9);
        INFINITY_SIZE = BUILDER.comment("Misc").define("infinity_vein_size", 8);
        DEEPSLATE_INFINITY_VEINS = BUILDER.comment("Misc").define("deepslate_infinity_veins_per_chunk", 9);
        DEEPSLATE_INFINITY_SIZE = BUILDER.comment("Misc").define("deepslate_infinity_vein_size", 8);

        DARK_VEINS = BUILDER.comment("Misc").define("dark_veins_per_chunk", 9);
        DARK_SIZE = BUILDER.comment("Misc").define("dark_vein_size", 8);
        DEEPSLATE_DARK_VEINS = BUILDER.comment("Misc").define("deepslate_dark_veins_per_chunk", 9);
        DEEPSLATE_DARK_SIZE = BUILDER.comment("Misc").define("deepslate_dark_vein_size", 8);

        EXPETRIFIED_VEINS = BUILDER.comment("Misc").define("expetrified_veins_per_chunk", 9);
        EXPETRIFIED_SIZE = BUILDER.comment("Misc").define("expetrified_vein_size", 8);
        ARCANE_CRYSTAL_VEINS = BUILDER.comment("Misc").define("arcane_crystal_veins_per_chunk", 9);
        ARCANE_CRYSTAL_SIZE = BUILDER.comment("Misc").define("arcane_crystal_vein_size", 8);
        DEEPSLATE_ARCANE_CRYSTAL_VEINS = BUILDER.comment("Misc").define("deepslate_arcane_crystal_veins_per_chunk", 9);
        DEEPSLATE_ARCANE_CRYSTAL_SIZE = BUILDER.comment("Misc").define("deepslate_arcane_crystal_vein_size", 8);

        CERTUS_QUARTZ_VEINS = BUILDER.comment("Misc").define("certus_quartz_veins_per_chunk", 9);
        CERTUS_QUARTZ_SIZE = BUILDER.comment("Misc").define("certus_quartz_vein_size", 8);
        DEEPSLATE_CERTUS_QUARTZ_VEINS = BUILDER.comment("Misc").define("deepslate_certus_quartz_veins_per_chunk", 9);
        DEEPSLATE_CERTUS_QUARTZ_SIZE = BUILDER.comment("Misc").define("deepslate_certus_quartz_vein_size", 8);

        ELEMENTIUM_VEINS = BUILDER.comment("Misc").define("elementium_veins_per_chunk", 9);
        ELEMENTIUM_SIZE = BUILDER.comment("Misc").define("elementium_vein_size", 8);
        DRAGONSTONE_VEINS = BUILDER.comment("Misc").define("dragonstone_veins_per_chunk", 9);
        DRAGONSTONE_SIZE = BUILDER.comment("Misc").define("dragonstone_vein_size", 8);


        YELLORITE_VEINS = BUILDER.comment("Misc").define("uranium_veins_per_chunk", 9);
        YELLORITE_SIZE = BUILDER.comment("Misc").define("uranium_vein_size", 8);
        NETHER_BENITOIDE_VEINS = BUILDER.comment("Misc").define("nether_benitoide_veins_per_chunk", 1);
        NETHER_BENITOIDE_SIZE = BUILDER.comment("Misc").define("nether_benitoide_vein_size", 8);
        END_ANGLESITE_VEINS = BUILDER.comment("Misc").define("end_anglesite_veins_per_chunk", 1);
        END_ANGLESITE_SIZE = BUILDER.comment("Misc").define("end_anglesite_vein_size", 8);

        NETHER_COBALT_VEINS = BUILDER.comment("Misc").define("nether_cobalt_veins_per_chunk", 1);
        NETHER_COBALT_SIZE = BUILDER.comment("Misc").define("nether_cobalt_vein_size", 8);

        NETHER_IESNIUM_VEINS = BUILDER.comment("Misc").define("nether_iesnium_veins_per_chunk", 1);
        NETHER_IESNIUM_SIZE = BUILDER.comment("Misc").define("nether_iesnium_vein_size", 8);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
