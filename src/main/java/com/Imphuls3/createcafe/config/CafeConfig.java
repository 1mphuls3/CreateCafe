package com.Imphuls3.createcafe.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class CafeConfig {

    public static BooleanValue giveEmptyCups;

    public static void registerCommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER) {
        COMMON_BUILDER.push("config");
        giveEmptyCups = COMMON_BUILDER
                .comment("Should drinks give empty cups after drinking them [Default: true]")
                .define("giveEmptyCups", true);
        COMMON_BUILDER.pop();
    }
}
