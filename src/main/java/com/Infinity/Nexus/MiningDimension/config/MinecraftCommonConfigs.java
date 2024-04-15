package com.Infinity.Nexus.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MinecraftCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> MINECRAFT;
    public static final ForgeConfigSpec.ConfigValue<Integer> COAL_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> COAL_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> COPPER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> COPPER_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> IRON_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> IRON_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> GOLD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> GOLD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> LAPIS_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> LAPIS_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> REDSTONE_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DIAMOND_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DIAMOND_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMERALD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMERALD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_COAL_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_COAL_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_COPPER_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_COPPER_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_IRON_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_IRON_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_GOLD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_GOLD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_LAPIS_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_LAPIS_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_REDSTONE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_REDSTONE_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_DIAMOND_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_DIAMOND_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_EMERALD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_EMERALD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_GOLD_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_GOLD_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_QUARTZ_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_DEBRIS_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_DEBRIS_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_SOULSAND_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_SOULSAND_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_MAGMA_BLOCK_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_MAGMA_BLOCK_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> CLAY_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> CLAY_SIZE;
    //----------------------------------//----------------------------------//

    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        MINECRAFT = BUILDER.comment("Minecraft Vanilla Configurations")
                .define("minecraft_gen_ores", true);

        COAL_VEINS = BUILDER.comment("Minecraft").define("coal_veins_per_chunk", 4);
        COAL_SIZE = BUILDER.comment("Minecraft").define("coal_vein_size", 6);
        COPPER_VEINS = BUILDER.comment("Minecraft").define("copper_veins_per_chunk", 4);
        COPPER_SIZE = BUILDER.comment("Minecraft").define("copper_vein_size", 6);
        IRON_VEINS = BUILDER.comment("Minecraft").define("iron_veins_per_chunk", 4);
        IRON_SIZE = BUILDER.comment("Minecraft").define("iron_vein_size", 6);
        GOLD_VEINS = BUILDER.comment("Minecraft").define("gold_veins_per_chunk", 4);
        GOLD_SIZE = BUILDER.comment("Minecraft").define("gold_vein_size", 6);
        LAPIS_VEINS = BUILDER.comment("Minecraft").define("lapis_veins_per_chunk", 4);
        LAPIS_SIZE = BUILDER.comment("Minecraft").define("lapis_vein_size", 6);
        REDSTONE_VEINS = BUILDER.comment("Minecraft").define("redstone_veins_per_chunk", 4);
        REDSTONE_SIZE = BUILDER.comment("Minecraft").define("redstone_vein_size", 6);
        DIAMOND_VEINS = BUILDER.comment("Minecraft").define("diamond_veins_per_chunk", 4);
        DIAMOND_SIZE = BUILDER.comment("Minecraft").define("diamond_vein_size", 6);
        EMERALD_VEINS = BUILDER.comment("Minecraft").define("emerald_veins_per_chunk", 4);
        EMERALD_SIZE = BUILDER.comment("Minecraft").define("emerald_vein_size", 6);

        DEEPSLATE_COAL_VEINS = BUILDER.comment("Minecraft").define("deepslate_coal_veins_per_chunk", 4);
        DEEPSLATE_COAL_SIZE = BUILDER.comment("Minecraft").define("deepslate_coal_vein_size", 6);
        DEEPSLATE_COPPER_VEINS = BUILDER.comment("Minecraft").define("deepslate_copper_veins_per_chunk", 4);
        DEEPSLATE_COPPER_SIZE = BUILDER.comment("Minecraft").define("deepslate_copper_vein_size", 6);
        DEEPSLATE_IRON_VEINS = BUILDER.comment("Minecraft").define("deepslate_iron_veins_per_chunk", 4);
        DEEPSLATE_IRON_SIZE = BUILDER.comment("Minecraft").define("deepslate_iron_vein_size", 6);
        DEEPSLATE_GOLD_VEINS = BUILDER.comment("Minecraft").define("deepslate_gold_veins_per_chunk", 4);
        DEEPSLATE_GOLD_SIZE = BUILDER.comment("Minecraft").define("deepslate_gold_vein_size", 6);
        DEEPSLATE_LAPIS_VEINS = BUILDER.comment("Minecraft").define("deepslate_lapis_veins_per_chunk", 4);
        DEEPSLATE_LAPIS_SIZE = BUILDER.comment("Minecraft").define("deepslate_lapis_vein_size", 6);
        DEEPSLATE_REDSTONE_VEINS = BUILDER.comment("Minecraft").define("deepslate_redstone_veins_per_chunk", 4);
        DEEPSLATE_REDSTONE_SIZE = BUILDER.comment("Minecraft").define("deepslate_redstone_vein_size", 6);
        DEEPSLATE_DIAMOND_VEINS = BUILDER.comment("Minecraft").define("deepslate_diamond_veins_per_chunk", 4);
        DEEPSLATE_DIAMOND_SIZE = BUILDER.comment("Minecraft").define("deepslate_diamond_vein_size", 6);
        DEEPSLATE_EMERALD_VEINS = BUILDER.comment("Minecraft").define("deepslate_emerald_veins_per_chunk", 4);
        DEEPSLATE_EMERALD_SIZE = BUILDER.comment("Minecraft").define("deepslate_emerald_vein_size", 6);

        NETHER_GOLD_VEINS = BUILDER.comment("Minecraft").define("nether_gold_veins_per_chunk", 16);
        NETHER_GOLD_SIZE = BUILDER.comment("Minecraft").define("nether_gold_vein_size", 24);
        NETHER_QUARTZ_VEINS = BUILDER.comment("Minecraft").define("nether_quartz_veins_per_chunk", 12);
        NETHER_QUARTZ_SIZE = BUILDER.comment("Minecraft").define("nether_quartz_vein_size", 16);
        NETHER_DEBRIS_VEINS = BUILDER.comment("Minecraft").define("nether_debris_veins_per_chunk", 1);
        NETHER_DEBRIS_SIZE = BUILDER.comment("Minecraft").define("nether_debris_vein_size", 6);
        NETHER_SOULSAND_VEINS = BUILDER.comment("Minecraft").define("nether_soulsand_veins_per_chunk", 16);
        NETHER_SOULSAND_SIZE = BUILDER.comment("Minecraft").define("nether_soulsand_vein_size", 26);
        NETHER_MAGMA_BLOCK_VEINS = BUILDER.comment("Minecraft").define("nether_magma_block_veins_per_chunk", 16);
        NETHER_MAGMA_BLOCK_SIZE = BUILDER.comment("Minecraft").define("nether_magma_block_vein_size", 46);
        CLAY_VEINS = BUILDER.comment("Minecraft").define("clay_veins_per_chunk", 16);
        CLAY_SIZE = BUILDER.comment("Minecraft").define("clay_vein_size", 16);
        //----------------------------------------------//----------------------------------------------//

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
