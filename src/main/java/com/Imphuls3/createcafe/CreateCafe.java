package com.Imphuls3.createcafe;

import com.Imphuls3.createcafe.common.effect.EffectRegistry;
import com.Imphuls3.createcafe.common.item.CreateCafeFluidTab;
import com.Imphuls3.createcafe.common.item.CreateCafeTab;
import com.Imphuls3.createcafe.core.registry.*;
import com.Imphuls3.createcafe.compat.Compat;
import com.Imphuls3.createcafe.config.ConfigRegistry;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CreateCafe.ID)
public class CreateCafe {
    public static final String ID = "createcafe";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final NonNullSupplier<Registrate> REGISTRATE = NonNullSupplier.lazy(() -> Registrate.create(ID)
            .creativeModeTab(() -> CreateCafeTab.CREATE_CAFE));
    public static final NonNullSupplier<Registrate> FLUIDREGISTRATE = NonNullSupplier.lazy(() -> Registrate.create(ID)
            .creativeModeTab(() -> CreateCafeFluidTab.CREATE_CAFE));

    public CreateCafe() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::setup);
        eventBus.addListener(this::commonSetup);

        ItemRegistry.register(eventBus);
        FluidTypeRegistry.register(eventBus);
        FluidRegistry.register(eventBus);
        BlockRegistry.register(eventBus);
        EffectRegistry.register(eventBus);
        ModLootModifiersRegistry.register(eventBus);

        ConfigRegistry.register();
        Compat.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        CreateCafe.LOGGER.debug("common setup");
        event.enqueueWork(CompostRegistry::register);
    }

    public static Registrate registrate() {
        return REGISTRATE.get();
    }
    public static Registrate fluidRegistrate() {
        return FLUIDREGISTRATE.get();
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    public static ResourceLocation modPath(String path) {
        return new ResourceLocation(ID, path);
    }
}
