package com.Imphuls3.createcafe.events;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.events.loot.ModLootModifier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = CreateCafe.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
        event.getRegistry().registerAll(
                new ModLootModifier.Serializer().setRegistryName
                        (new ResourceLocation(CreateCafe.MOD_ID,"cassava_seeds_from_grass")),
                new ModLootModifier.Serializer().setRegistryName
                        (new ResourceLocation(CreateCafe.MOD_ID,"coffee_seeds_from_grass"))
        );
    }
}
