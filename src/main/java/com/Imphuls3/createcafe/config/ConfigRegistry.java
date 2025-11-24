package com.Imphuls3.createcafe.config;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.common.ModConfigSpec;

public class ConfigRegistry {
    public static void register(ModContainer container) {
        registerServerConfigs(container);
        registerCommonConfigs(container);
        registerClientConfigs(container);
    }

    private static void registerClientConfigs(ModContainer container) {
    }

    private static void registerCommonConfigs(ModContainer container) {
        ModConfigSpec.Builder COMMON_BUILDER = new ModConfigSpec.Builder();
        CafeConfig.registerCommonConfig(COMMON_BUILDER);
        container.registerConfig(ModConfig.Type.COMMON, COMMON_BUILDER.build());
    }

    private static void registerServerConfigs(ModContainer container) {
        ModConfigSpec.Builder SERVER_BUILDER = new ModConfigSpec.Builder();
        CafeConfig.registerServerConfig(SERVER_BUILDER);
        container.registerConfig(ModConfig.Type.SERVER, SERVER_BUILDER.build());
    }
}
