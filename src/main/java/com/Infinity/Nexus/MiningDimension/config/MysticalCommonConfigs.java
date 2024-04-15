package com.Infinity.Nexus.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MysticalCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> MYSTICAL;

    public static final ForgeConfigSpec.ConfigValue<Integer> PROSPERITY_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> PROSPERITY_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> INFERIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> INFERIUM_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_PROSPERITY_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_PROSPERITY_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_INFERIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEEPSLATE_INFERIUM_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_PROSPERITY_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_PROSPERITY_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_SOULIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_SOULIUM_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_SOULSTONE_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_SOULSTONE_SIZE;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_INFERIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHER_INFERIUM_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> END_PROSPERITY_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> END_PROSPERITY_SIZE;

    public static final ForgeConfigSpec.ConfigValue<Integer> END_INFERIUM_VEINS;
    public static final ForgeConfigSpec.ConfigValue<Integer> END_INFERIUM_SIZE;


    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        MYSTICAL = BUILDER.comment("Mystical Configurations")
                .define("mystical_gen_ores", true);

        PROSPERITY_VEINS = BUILDER.comment("Mystical").define("prosperity_veins_per_chunk", 8);
        PROSPERITY_SIZE = BUILDER.comment("Mystical").define("prosperity_vein_size", 8);
        INFERIUM_VEINS = BUILDER.comment("Mystical").define("inferium_veins_per_chunk", 8);
        INFERIUM_SIZE = BUILDER.comment("Mystical").define("inferium_vein_size", 8);

        DEEPSLATE_PROSPERITY_VEINS = BUILDER.comment("Mystical").define("deepslate_prosperity_veins_per_chunk", 8);
        DEEPSLATE_PROSPERITY_SIZE = BUILDER.comment("Mystical").define("deepslate_prosperity_vein_size", 8);
        DEEPSLATE_INFERIUM_VEINS = BUILDER.comment("Mystical").define("deepslate_inferium_veins_per_chunk", 8);
        DEEPSLATE_INFERIUM_SIZE = BUILDER.comment("Mystical").define("deepslate_inferium_vein_size", 8);

        NETHER_PROSPERITY_VEINS = BUILDER.comment("Mystical").define("nether_prosperity_veins_per_chunk", 12);
        NETHER_PROSPERITY_SIZE = BUILDER.comment("Mystical").define("nether_prosperity_vein_size", 8);
        NETHER_SOULSTONE_VEINS = BUILDER.comment("Mystical").define("nether_soulstone_veins_per_chunk", 12);
        NETHER_SOULSTONE_SIZE = BUILDER.comment("Mystical").define("nether_soulstone_vein_size", 8);
        NETHER_SOULIUM_VEINS = BUILDER.comment("Mystical").define("nether_soulium_veins_per_chunk", 56);
        NETHER_SOULIUM_SIZE = BUILDER.comment("Mystical").define("nether_soulium_vein_size", 8);
        NETHER_INFERIUM_VEINS = BUILDER.comment("Mystical").define("nether_inferium_veins_per_chunk", 12);
        NETHER_INFERIUM_SIZE = BUILDER.comment("Mystical").define("nether_inferium_vein_size", 8);

        END_PROSPERITY_VEINS = BUILDER.comment("Mystical").define("end_prosperity_veins_per_chunk", 12);
        END_PROSPERITY_SIZE = BUILDER.comment("Mystical").define("end_prosperity_vein_size", 8);
        END_INFERIUM_VEINS = BUILDER.comment("Mystical").define("end_inferium_veins_per_chunk", 12);
        END_INFERIUM_SIZE = BUILDER.comment("Mystical").define("end_inferium_vein_size", 8);


        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
