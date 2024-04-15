package com.Infinity.Nexus.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class VaultHunterCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> VALTHUNTERS;

    public static final ForgeConfigSpec.ConfigValue<Integer> ALEXANDRITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> ALEXANDRITE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> ASHIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> ASHIUM_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> BENITOITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> BENITOITE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> BLACK_OPAL_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> BLACK_OPAL_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> BOMIGNITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> BOMIGNITE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> ECHO_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> ECHO_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> GORGINITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> GORGINITE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> ISKALLIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> ISKALLIUM_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> LARIMAR_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> LARIMAR_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> PAINITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> PAINITE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> PETZANITE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> PETZANITE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> SPARKLETINE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> SPARKLETINE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> TUBIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> TUBIUM_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> UPALINE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> UPALINE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> WUTODIE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> WUTODIE_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> XENIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> XENIUM_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> CHROMATIC_IRON_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> CHROMATIC_IRON_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> VAULT_STONE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> VAULT_STONE_SIZE;


    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        VALTHUNTERS = BUILDER.comment("ValtHunters Configurations")
                .define("valthunters_gen_ores", true);

        ALEXANDRITE_VEINS = BUILDER.comment("Vault Hunters").define("alexandrite_veins_per_chunk", 1);
        ALEXANDRITE_SIZE = BUILDER.comment("Vault Hunters").define("alexandrite_vein_size", 4);

        ASHIUM_VEINS = BUILDER.comment("Vault Hunters").define("ashium_veins_per_chunk", 1);
        ASHIUM_SIZE = BUILDER.comment("Vault Hunters").define("ashium_vein_size", 4);

        BENITOITE_VEINS = BUILDER.comment("Vault Hunters").define("benitoite_veins_per_chunk", 1);
        BENITOITE_SIZE = BUILDER.comment("Vault Hunters").define("benitoite_vein_size", 4);

        BLACK_OPAL_VEINS = BUILDER.comment("Vault Hunters").define("black_opal_veins_per_chunk", 1);
        BLACK_OPAL_SIZE = BUILDER.comment("Vault Hunters").define("black_opal_vein_size", 4);

        BOMIGNITE_VEINS = BUILDER.comment("Vault Hunters").define("bomignite_veins_per_chunk", 1);
        BOMIGNITE_SIZE = BUILDER.comment("Vault Hunters").define("bomignite_vein_size", 4);

        ECHO_VEINS = BUILDER.comment("Vault Hunters").define("echo_veins_per_chunk", 1);
        ECHO_SIZE = BUILDER.comment("Vault Hunters").define("echo_vein_size", 4);

        GORGINITE_VEINS = BUILDER.comment("Vault Hunters").define("gorginite_veins_per_chunk", 1);
        GORGINITE_SIZE = BUILDER.comment("Vault Hunters").define("gorginite_vein_size", 4);

        ISKALLIUM_VEINS = BUILDER.comment("Vault Hunters").define("iskallium_veins_per_chunk", 1);
        ISKALLIUM_SIZE = BUILDER.comment("Vault Hunters").define("iskallium_vein_size", 4);

        LARIMAR_VEINS = BUILDER.comment("Vault Hunters").define("larimar_veins_per_chunk", 1);
        LARIMAR_SIZE = BUILDER.comment("Vault Hunters").define("larimar_vein_size", 4);

        PAINITE_VEINS = BUILDER.comment("Vault Hunters").define("painite_veins_per_chunk", 1);
        PAINITE_SIZE = BUILDER.comment("Vault Hunters").define("painite_vein_size", 4);

        PETZANITE_VEINS = BUILDER.comment("Vault Hunters").define("petzanite_veins_per_chunk", 1);
        PETZANITE_SIZE = BUILDER.comment("Vault Hunters").define("petzanite_vein_size", 4);

        SPARKLETINE_VEINS = BUILDER.comment("Vault Hunters").define("sparkletine_veins_per_chunk", 1);
        SPARKLETINE_SIZE = BUILDER.comment("Vault Hunters").define("sparkletine_vein_size", 4);

        TUBIUM_VEINS = BUILDER.comment("Vault Hunters").define("tubium_veins_per_chunk", 1);
        TUBIUM_SIZE = BUILDER.comment("Vault Hunters").define("tubium_vein_size", 4);

        UPALINE_VEINS = BUILDER.comment("Vault Hunters").define("upaline_veins_per_chunk", 1);
        UPALINE_SIZE = BUILDER.comment("Vault Hunters").define("upaline_vein_size", 4);

        WUTODIE_VEINS = BUILDER.comment("Vault Hunters").define("wutodie_veins_per_chunk", 1);
        WUTODIE_SIZE = BUILDER.comment("Vault Hunters").define("wutodie_vein_size", 4);

        XENIUM_VEINS = BUILDER.comment("Vault Hunters").define("xenium_veins_per_chunk", 1);
        XENIUM_SIZE = BUILDER.comment("Vault Hunters").define("xenium_vein_size", 4);

        CHROMATIC_IRON_VEINS = BUILDER.comment("Vault Hunters").define("chromatic_iron_veins_per_chunk", 3);
        CHROMATIC_IRON_SIZE = BUILDER.comment("Vault Hunters").define("chromatic_iron_vein_size", 4);

        VAULT_STONE_VEINS = BUILDER.comment("Vault Hunters").define("vault_stone_veins_per_chunk", 3);
        VAULT_STONE_SIZE = BUILDER.comment("Vault Hunters").define("vault_stone_vein_size", 4);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
