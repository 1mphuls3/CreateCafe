package com.Imphuls3.createcafe.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ConfigRegistry {
    public static void register() {
        registerServerConfigs();
        registerCommonConfigs();
        registerClientConfigs();
    }

    private static void registerClientConfigs() {
    }

    private static void registerCommonConfigs() {
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        CafeConfig.registerCommonConfig(COMMON_BUILDER);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_BUILDER.build());
    }

    private static void registerServerConfigs() {

    }
}
