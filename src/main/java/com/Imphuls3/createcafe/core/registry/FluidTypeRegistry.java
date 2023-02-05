package com.Imphuls3.createcafe.core.registry;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.math.Vector3f;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.function.Consumer;

public class FluidTypeRegistry {
    //I know this is bad, but I'm too lazy to figure out anything else
    public static class MeltedSugar extends TintedFluidType {
        public MeltedSugar(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8fff7e0);
        }
    }public static class Filling extends TintedFluidType {
        public Filling(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8ededed);
        }
    }public static class Oreo extends TintedFluidType {
        public Oreo(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8dedad3);
        }
    }public static class Mango extends TintedFluidType {
        public Mango(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8fcc03d);
        }
    }public static class Lime extends TintedFluidType {
        public Lime(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8b3ff26);
        }
    }public static class Lychee extends TintedFluidType {
        public Lychee(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8ff9a96);
        }
    }public static class Kiwi extends TintedFluidType {
        public Kiwi(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc894fc90);
        }
    }public static class Mana extends TintedFluidType {
        public Mana(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc817e4ff);
        }
    }public static class Blood extends TintedFluidType {
        public Blood(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8fc3003);
        }
    }public static class Lemon extends TintedFluidType {
        public Lemon(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8ffe645);
        }
    }public static class Watermelon extends TintedFluidType {
        public Watermelon(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8b83b56);
        }
    }public static class Strawberry extends TintedFluidType {
        public Strawberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8ffa6b8);
        }
    }public static class Blueberry extends TintedFluidType {
        public Blueberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc89f8cff);
        }
    }public static class Vanilla extends TintedFluidType {
        public Vanilla(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8ede6d8);
        }
    }public static class Orange extends TintedFluidType {
        public Orange(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8de9c33);
        }
    }public static class Peach extends TintedFluidType {
        public Peach(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8edc29f);
        }
    }public static class Pineapple extends TintedFluidType {
        public Pineapple(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8ffd752);
        }
    }public static class Banana extends TintedFluidType {
        public Banana(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8ffe79e);
        }
    }public static class Yucca extends TintedFluidType {
        public Yucca(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8c8f25e);
        }
    }public static class Cherry extends TintedFluidType {
        public Cherry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8c7445e);
        }
    }public static class Plum extends TintedFluidType {
        public Plum(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8ffb8f5);
        }
    }public static class Aloe extends TintedFluidType {
        public Aloe(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc898de52);
        }
    }public static class Apple extends TintedFluidType {
        public Apple(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8fceb77);
        }
    }public static class Blackberry extends TintedFluidType {
        public Blackberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8875284);
        }
    }public static class Pumpkin extends TintedFluidType {
        public Pumpkin(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8f7e0ad);
        }
    }public static class Jackfruit extends TintedFluidType {
        public Jackfruit(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8f5cc71);
        }
    }public static class Coconut extends TintedFluidType {
        public Coconut(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8fcf9e3);
        }
    }public static class Dragonfruit extends TintedFluidType {
        public Dragonfruit(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8ff1f8f);
        }
    }public static class Apricot extends TintedFluidType {
        public Apricot(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8ffcb94);
        }
    }public static class Avocado extends TintedFluidType {
        public Avocado(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc896b366);
        }
    }public static class Sweetberry extends TintedFluidType {
        public Sweetberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8db2e48);
        }
    }public static class Durian extends TintedFluidType {
        public Durian(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8F4C672);
        }
    }public static class Fig extends TintedFluidType {
        public Fig(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8773C65);
        }
    }public static class Tamarind extends TintedFluidType {
        public Tamarind(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FFBD7F);
        }
    }public static class Gooseberry extends TintedFluidType {
        public Gooseberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FCD946);
        }
    }public static class Grape extends TintedFluidType {
        public Grape(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8EA77C8);
        }
    }public static class Grapefruit extends TintedFluidType {
        public Grapefruit(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FF8060);
        }
    }public static class Papaya extends TintedFluidType {
        public Papaya(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FFB163);
        }
    }public static class Guava extends TintedFluidType {
        public Guava(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FF835B);
        }
    }public static class Passionfruit extends TintedFluidType {
        public Passionfruit(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FECC35);
        }
    }public static class Pomegranate extends TintedFluidType {
        public Pomegranate(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8BA485B);
        }
    }public static class Persimmon extends TintedFluidType {
        public Persimmon(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8E89166);
        }
    }public static class Raspberry extends TintedFluidType {
        public Raspberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FF7D7D);
        }
    }public static class Starfruit extends TintedFluidType {
        public Starfruit(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FFDA65);
        }
    }public static class Lavender extends TintedFluidType {
        public Lavender(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8deaef2);
        }
    }public static class Pomelo extends TintedFluidType {
        public Pomelo(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FF6F4C);
        }
    }public static class Mandarin extends TintedFluidType {
        public Mandarin(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FFC216);
        }
    }public static class Citron extends TintedFluidType {
        public Citron(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8FFC300);
        }
    }public static class Redlove extends TintedFluidType {
        public Redlove(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8E24F63);
        }
    }public static class Barberry extends TintedFluidType {
        public Barberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8a1153c);
        }
    }public static class Coffee extends TintedFluidType {
        public Coffee(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc8482713);
        }
    }public static class IcedCoffee extends TintedFluidType {
        public IcedCoffee(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, 0xc85c3721);
        }
    }public static class StrawberryS extends TintedFluidType {
        public StrawberryS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(196, 59, 98, 199).getRGB());
        }
    }public static class VanillaS extends TintedFluidType {
        public VanillaS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(255, 235, 220, 199).getRGB());
        }
    }public static class RaspberryS extends TintedFluidType {
        public RaspberryS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(255, 25, 200, 199).getRGB());
        }
    }public static class CoconutS extends TintedFluidType {
        public CoconutS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(255, 235, 192, 199).getRGB());
        }
    }public static class MintS extends TintedFluidType {
        public MintS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(129, 255, 192, 199).getRGB());
        }
    }public static class BananaS extends TintedFluidType {
        public BananaS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(255, 217, 0, 199).getRGB());
        }
    }public static class CaramelS extends TintedFluidType {
        public CaramelS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(217, 144, 0, 199).getRGB());
        }
    }


    public static class TintedFluidType extends FluidType {
        private final ResourceLocation stillTexture;
        private final ResourceLocation flowingTexture;
        private final int tintColor;

        public TintedFluidType(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture, int tintColor) {
            super(properties);
            this.stillTexture = stillTexture;
            this.flowingTexture = flowingTexture;
            this.tintColor = tintColor;
        }

        @Override
        public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
            consumer.accept(new IClientFluidTypeExtensions() {
                @Override
                public ResourceLocation getStillTexture() {
                    return stillTexture;
                }

                @Override
                public ResourceLocation getFlowingTexture() {
                    return flowingTexture;
                }

                @Override
                public int getTintColor() {
                    return tintColor;
                }

                @Override
                public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                    Color col = new Color(getTintColor());
                    return new Vector3f(col.getRed()/255F, col.getBlue()/255F, col.getGreen()/255F);
                }

                @Override
                public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                    RenderSystem.setShaderFogStart(2f);
                    RenderSystem.setShaderFogEnd(6F);
                }
            });
        }
    }
    public static void register(IEventBus eventBus) {
    }
}
