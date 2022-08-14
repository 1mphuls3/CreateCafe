package com.Imphuls3.createcafe;

import com.Imphuls3.createcafe.core.registry.BlockRegistry;
import com.Imphuls3.createcafe.compat.Compat;
import com.Imphuls3.createcafe.config.ConfigRegistry;
import com.Imphuls3.createcafe.core.registry.CompostRegistry;
import com.Imphuls3.createcafe.core.registry.FluidRegistry;
import com.Imphuls3.createcafe.core.registry.ItemRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateCafe.MOD_ID)
public class CreateCafe
{
    public static final String MOD_ID = "createcafe";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public CreateCafe() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::setup);
        eventBus.addListener(this::doClientStuff);

        ItemRegistry.register(eventBus);
        FluidRegistry.register(eventBus);
        BlockRegistry.register(eventBus);
        ConfigRegistry.register();
        CompostRegistry.register();

        Compat.init();
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.CASSAVA.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(BlockRegistry.COFFEE.get(), RenderType.cutout());
        });
    }
}
