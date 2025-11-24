package com.Imphuls3.createcafe;

import com.Imphuls3.createcafe.common.effect.EffectRegistry;
import com.Imphuls3.createcafe.config.ConfigRegistry;
import com.Imphuls3.createcafe.core.registry.*;
import com.mojang.logging.LogUtils;
import com.tterrag.registrate.Registrate;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

@Mod(CreateCafe.ID)
public class CreateCafe {
    public static final String ID = "createcafe";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final Registrate REGISTRATE = Registrate.create(ID).defaultCreativeTab(CreativeTabRegistry.CREATE_CAFE.getKey());
    public static final Registrate FLUIDREGISTRATE = Registrate.create(ID).defaultCreativeTab(CreativeTabRegistry.CREATE_CAFE_FLUIDS.getKey());

    public CreateCafe(IEventBus eventBus, ModContainer container) {
        eventBus.addListener(this::commonSetup);

        CreativeTabRegistry.register(eventBus);
        ItemRegistry.register(eventBus);
        FluidTypeRegistry.register(eventBus);
        FluidRegistry.register(eventBus);
        BlockRegistry.register(eventBus);
        EffectRegistry.register(eventBus);
        ModLootModifiersRegistry.register(eventBus);

        ConfigRegistry.register(container);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        CreateCafe.LOGGER.debug("Common Setup");
        event.enqueueWork(CompostRegistry::register);
    }

    public static Registrate registrate() {
        return REGISTRATE;
    }
    public static Registrate fluidRegistrate() {
        return FLUIDREGISTRATE;
    }

    public static ResourceLocation modPath(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }
}
