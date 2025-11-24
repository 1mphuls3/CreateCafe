package com.Imphuls3.createcafe.config;


import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.List;

public class CafeConfig {
    public static ModConfigSpec.ConfigValue<List<String>> hidingOverrides;
    public static ModConfigSpec.BooleanValue giveEmptyCups;
    public static ModConfigSpec.IntValue effectDuration;

    public static void registerCommonConfig(ModConfigSpec.Builder COMMON_BUILDER) {
        COMMON_BUILDER.push("config");
        giveEmptyCups = COMMON_BUILDER
                .comment("Should drinks give empty cups after drinking them [Default: true]")
                .define("giveEmptyCups", true);
        COMMON_BUILDER.pop();
    }
    public static void registerServerConfig(ModConfigSpec.Builder SERVER_BUILDER) {
        SERVER_BUILDER.push("Server Config");
        effectDuration = SERVER_BUILDER.comment("The duration of the effect that drinks give [Default: 10]")
                .defineInRange("effectDuration", 10, 0, Integer.MAX_VALUE);
        SERVER_BUILDER.pop();
    }
}
