package com.Infinity.MiningDimension.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    //----------------------------------//----------------------------------//
    public static final ForgeConfigSpec.ConfigValue<Boolean> TP;
    public static final ForgeConfigSpec.ConfigValue<Integer> X;
    public static final ForgeConfigSpec.ConfigValue<Integer> Y;
    public static final ForgeConfigSpec.ConfigValue<Integer> Z;



    static {
        BUILDER.push("Infinity Mining Dimension Common Configs");

        //----------------------------------------------//----------------------------------------------//
        TP = BUILDER.comment("Can use /mining, /minerar")
                .define("mining_command", true);

        X = BUILDER.comment("X Location, Default 0")
                .define("x",0);
        Y = BUILDER.comment("Y Location, Default 75")
                .define("y",75);
        Z = BUILDER.comment("Z Location, Default 0")
                .define("z",0);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }

}
