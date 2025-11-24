package com.Imphuls3.createcafe.core.registry;

import com.simibubi.create.AllFluids.TintedFluidType;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.FluidType;

import java.awt.*;

public class FluidTypeRegistry {
    public static class MeltedSugar extends CafeFluidType {
        public MeltedSugar(FluidType.Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8fff7e0));
        }
    }public static class Filling extends CafeFluidType {
        public Filling(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8ededed));
        }
    }public static class Oreo extends CafeFluidType {
        public Oreo(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8dedad3));
        }
    }public static class Mango extends CafeFluidType {
        public Mango(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8fcc03d));
        }
    }public static class Lime extends CafeFluidType {
        public Lime(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8b3ff26));
        }
    }public static class Lychee extends CafeFluidType {
        public Lychee(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8ff9a96));
        }
    }public static class Kiwi extends CafeFluidType {
        public Kiwi(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc894fc90));
        }
    }public static class Mana extends CafeFluidType {
        public Mana(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc817e4ff));
        }
    }public static class Blood extends CafeFluidType {
        public Blood(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8fc3003));
        }
    }public static class Lemon extends CafeFluidType {
        public Lemon(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8ffe645));
        }
    }public static class Watermelon extends CafeFluidType {
        public Watermelon(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8b83b56));
        }
    }public static class Strawberry extends CafeFluidType {
        public Strawberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8ffa6b8));
        }
    }public static class Blueberry extends CafeFluidType {
        public Blueberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc89f8cff));
        }
    }public static class Vanilla extends CafeFluidType {
        public Vanilla(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8ede6d8));
        }
    }public static class Orange extends CafeFluidType {
        public Orange(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8de9c33));
        }
    }public static class Peach extends CafeFluidType {
        public Peach(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8edc29f));
        }
    }public static class Pineapple extends CafeFluidType {
        public Pineapple(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8ffd752));
        }
    }public static class Banana extends CafeFluidType {
        public Banana(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8ffe79e));
        }
    }public static class Yucca extends CafeFluidType {
        public Yucca(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8c8f25e));
        }
    }public static class Cherry extends CafeFluidType {
        public Cherry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8c7445e));
        }
    }public static class Plum extends CafeFluidType {
        public Plum(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8ffb8f5));
        }
    }public static class Aloe extends CafeFluidType {
        public Aloe(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc898de52));
        }
    }public static class Apple extends CafeFluidType {
        public Apple(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8fceb77));
        }
    }public static class Blackberry extends CafeFluidType {
        public Blackberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8875284));
        }
    }public static class Pumpkin extends CafeFluidType {
        public Pumpkin(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8f7e0ad));
        }
    }public static class Jackfruit extends CafeFluidType {
        public Jackfruit(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8f5cc71));
        }
    }public static class Coconut extends CafeFluidType {
        public Coconut(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8fcf9e3));
        }
    }public static class Dragonfruit extends CafeFluidType {
        public Dragonfruit(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8ff1f8f));
        }
    }public static class Apricot extends CafeFluidType {
        public Apricot(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8ffcb94));
        }
    }public static class Avocado extends CafeFluidType {
        public Avocado(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc896b366));
        }
    }public static class Sweetberry extends CafeFluidType {
        public Sweetberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8db2e48));
        }
    }public static class Durian extends CafeFluidType {
        public Durian(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8F4C672));
        }
    }public static class Fig extends CafeFluidType {
        public Fig(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8773C65));
        }
    }public static class Tamarind extends CafeFluidType {
        public Tamarind(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FFBD7F));
        }
    }public static class Gooseberry extends CafeFluidType {
        public Gooseberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FCD946));
        }
    }public static class Grape extends CafeFluidType {
        public Grape(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8EA77C8));
        }
    }public static class Grapefruit extends CafeFluidType {
        public Grapefruit(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FF8060));
        }
    }public static class Papaya extends CafeFluidType {
        public Papaya(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FFB163));
        }
    }public static class Guava extends CafeFluidType {
        public Guava(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FF835B));
        }
    }public static class Passionfruit extends CafeFluidType {
        public Passionfruit(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FECC35));
        }
    }public static class Pomegranate extends CafeFluidType {
        public Pomegranate(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8BA485B));
        }
    }public static class Persimmon extends CafeFluidType {
        public Persimmon(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8E89166));
        }
    }public static class Raspberry extends CafeFluidType {
        public Raspberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FF7D7D));
        }
    }public static class Starfruit extends CafeFluidType {
        public Starfruit(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FFDA65));
        }
    }public static class Lavender extends CafeFluidType {
        public Lavender(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8deaef2));
        }
    }public static class Pomelo extends CafeFluidType {
        public Pomelo(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FF6F4C));
        }
    }public static class Mandarin extends CafeFluidType {
        public Mandarin(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FFC216));
        }
    }public static class Citron extends CafeFluidType {
        public Citron(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8FFC300));
        }
    }public static class Redlove extends CafeFluidType {
        public Redlove(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8E24F63));
        }
    }public static class Barberry extends CafeFluidType {
        public Barberry(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8a1153c));
        }
    }public static class Coffee extends CafeFluidType {
        public Coffee(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(0xc8482713));
        }
    }public static class StrawberryS extends CafeFluidType {
        public StrawberryS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(196, 59, 98, 199));
        }
    }public static class VanillaS extends CafeFluidType {
        public VanillaS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(255, 235, 220, 199));
        }
    }public static class RaspberryS extends CafeFluidType {
        public RaspberryS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(255, 25, 200, 199));
        }
    }public static class CoconutS extends CafeFluidType {
        public CoconutS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(255, 235, 192, 199));
        }
    }public static class MintS extends CafeFluidType {
        public MintS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(129, 255, 192, 199));
        }
    }public static class BananaS extends CafeFluidType {
        public BananaS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(255, 217,0, 199));
        }
    }public static class CaramelS extends CafeFluidType {
        public CaramelS(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
            super(properties, stillTexture, flowingTexture, new Color(217, 144,0, 199));
        }
    }

    public static class CafeFluidType extends TintedFluidType
    {
        private final Color color;

        public CafeFluidType(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture, Color color) {
            super(properties, stillTexture, flowingTexture);
            this.color = color;
        }

        @Override
        protected int getTintColor(FluidStack stack) {
            return color.getRGB();
        }

        @Override
        protected int getTintColor(FluidState state, BlockAndTintGetter getter, BlockPos pos) {
            return color.getRGB();
        }
    }

    public static void register(IEventBus eventBus) {
    }
}
