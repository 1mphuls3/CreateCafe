package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateCafe.ID);

    public static final RegistryObject<CreativeModeTab> CREATE_CAFE = TABS.register("create_cafe_items",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.create_cafe_items"))
                    .icon(ItemRegistry.STRAWBERRY_TEA.get()::getDefaultInstance)
                    .displayItems((pParameters, pOutput) -> {
                        for(RegistryObject<Item> item : ItemRegistry.ITEMS.getEntries()) {
                            pOutput.accept(item.get());
                        }
                    }).build()
    );
    public static final RegistryObject<CreativeModeTab> CREATE_CAFE_FLUIDS = TABS.register("create_cafe_fluids",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.create_cafe_fluids"))
                    .icon(FluidRegistry.STRAWBERRY_TEA.getBucket().get()::getDefaultInstance).build()
    );

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
