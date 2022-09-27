package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.item.ModCreativeModeTab;
import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.math.Vector3f;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

@SuppressWarnings("all")
public class FluidRegistry {
    public static final Registrate REGISTRATE = Registrate.create(CreateCafe.MOD_ID)
            .creativeModeTab(() -> ModCreativeModeTab.CREATE_CAFE);

    public static final ResourceLocation FLUID_STILL_RL = new ResourceLocation("createcafe:fluid/milk_tea_still");
    public static final ResourceLocation FLUID_FLOWING_RL = new ResourceLocation("createcafe:fluid/milk_tea_flow");

    public class BaseFluidType extends FluidType {
        private final ResourceLocation stillTexture;
        private final ResourceLocation flowingTexture;
        private final int tintColor;
        private final Vector3f fogColor;
        /**
         * Default constructor.
         *
         * @param properties the general properties of the fluid type
         * @param stillTexture
         * @param flowingTexture
         * @param overlayTextire
         * @param tintColor
         * @param fogColor
         */
        public BaseFluidType(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture, int tintColor, Vector3f fogColor) {
            super(properties);
            this.stillTexture = stillTexture;
            this.flowingTexture = flowingTexture;
            this.tintColor = tintColor;
            this.fogColor = fogColor;
        }

        public ResourceLocation getStillTexture() {
            return stillTexture;
        }

        public ResourceLocation getFlowingTexture() {
            return flowingTexture;
        }

        public int getTintColor() {
            return tintColor;
        }

        public Vector3f getFogColor() {
            return fogColor;
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
                    return fogColor;
                }

                @Override
                public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                    RenderSystem.setShaderFogStart(2f);
                    RenderSystem.setShaderFogEnd(6F);
                }
            });
        }
    }

    public FluidEntry<ForgeFlowingFluid.Flowing> MELTED_SUGAR =
            REGISTRATE.fluid("melted_sugar", () -> new BaseFluidType(FluidType.Properties.create()
                                    , FLUID_STILL_RL, FLUID_FLOWING_RL, 0xc8fff7e0, new Vector3f(255, 247, 224)))
                    .properties(p -> p.viscosity(1000)
                            .density(140))
                    .fluidProperties(p -> p
                            .levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();

    /*public static FluidEntry<ForgeFlowingFluid.Flowing> FILLING =
            REGISTRATE.fluid("filling", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.filling", "Filling")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8ededed))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> OREO_TEA =
            REGISTRATE.fluid("oreo_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.oreo_tea", "Oreo Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8dedad3))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> MANGO_TEA =
            REGISTRATE.fluid("mango_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.mango_tea", "Mango Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8fcc03d))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> LIME_TEA =
            REGISTRATE.fluid("lime_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.lime_tea", "Lime Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8b3ff26))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> LYCHEE_TEA =
            REGISTRATE.fluid("lychee_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.lychee_tea", "Lychee Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8ff9a96))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> KIWI_TEA =
            REGISTRATE.fluid("kiwi_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.kiwi_tea", "Kiwi Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc894fc90))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> MANA_TEA =
            REGISTRATE.fluid("mana_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.mana_tea", "Mana Berry Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc817e4ff))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> BLOOD_TEA =
            REGISTRATE.fluid("blood_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.blood_tea", "Blood Orange Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8fc3003))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> LEMON_TEA =
            REGISTRATE.fluid("lemon_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.lemon_tea", "Lemon Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8ffe645))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> WATERMELON_TEA =
            REGISTRATE.fluid("watermelon_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.watermelon_tea", "Watermelon Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8b83b56))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> STRAWBERRY_TEA =
            REGISTRATE.fluid("strawberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.strawberry_tea", "Strawberry Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8ffa6b8))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> BLUEBERRY_TEA =
            REGISTRATE.fluid("blueberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.blueberry_tea", "Blueberry Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc89f8cff))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> VANILLA_TEA =
            REGISTRATE.fluid("vanilla_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.vanilla_tea", "Vanilla Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8ede6d8))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> ORANGE_TEA =
            REGISTRATE.fluid("orange_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.orange_tea", "Orange Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8de9c33))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PEACH_TEA =
            REGISTRATE.fluid("peach_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.peach_tea", "Peach Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8edc29f))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PINEAPPLE_TEA =
            REGISTRATE.fluid("pineapple_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.pineapple_tea", "Pineapple Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8ffd752))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> BANANA_TEA =
            REGISTRATE.fluid("banana_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.banana_tea", "Banana Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8ffe79e))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> YUCCA_TEA =
            REGISTRATE.fluid("yucca_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.yucca_tea", "Yucca Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8c8f25e))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> CHERRY_TEA =
            REGISTRATE.fluid("cherry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.cherry_tea", "Cherry Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8c7445e))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PLUM_TEA =
            REGISTRATE.fluid("plum_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.plum_tea", "Plum Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8ffb8f5))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> ALOE_TEA =
            REGISTRATE.fluid("aloe_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.aloe_tea", "Aloe Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc898de52))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> APPLE_TEA =
            REGISTRATE.fluid("apple_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.apple_tea", "Apple Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8fceb77))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> BLACKBERRY_TEA =
            REGISTRATE.fluid("blackberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.blackberry_tea", "Blackberry Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8875284))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PUMPKIN_TEA =
            REGISTRATE.fluid("pumpkin_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.pumpkin_tea", "Pumpkin Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8f7e0ad))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> JACKFRUIT_TEA =
            REGISTRATE.fluid("jackfruit_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.jackfruit_tea", "Jackfruit Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8f5cc71))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> COCONUT_TEA =
            REGISTRATE.fluid("coconut_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.coconut_tea", "Coconut Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8fcf9e3))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> DRAGONFRUIT_TEA =
            REGISTRATE.fluid("dragonfruit_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.dragonfruit_tea", "Dragonfruit Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8ff1f8f))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> APRICOT_TEA =
            REGISTRATE.fluid("apricot_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.apricot_tea", "Apricot Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8ffcb94))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> AVOCADO_TEA =
            REGISTRATE.fluid("avocado_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.avocado_tea", "Avocado Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc896b366))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> SWEETBERRY_TEA =
            REGISTRATE.fluid("sweetberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.sweetberry_tea", "Sweetberry Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8db2e48))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> DURIAN_TEA =
            REGISTRATE.fluid("durian_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.durian_tea", "Durian Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8F4C672))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> FIG_TEA =
            REGISTRATE.fluid("fig_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.fig_tea", "Fig Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8773C65))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> TAMARIND_TEA =
            REGISTRATE.fluid("tamarind_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.tamarind_tea", "Tamarind Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FFBD7F))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> GOOSEBERRY_TEA =
            REGISTRATE.fluid("gooseberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.gooseberry_tea", "Gooseberry Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FCD946))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> GRAPE_TEA =
            REGISTRATE.fluid("grape_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.grape_tea", "Grape Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8EA77C8))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> GRAPEFRUIT_TEA =
            REGISTRATE.fluid("grapefruit_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.grapefruit_tea", "Grapefruit Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FF8060))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PAPAYA_TEA =
            REGISTRATE.fluid("papaya_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.papaya_tea", "Papaya Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FFB163))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> GUAVA_TEA =
            REGISTRATE.fluid("guava_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.guava_tea", "Guava Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FF835B))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PASSIONFRUIT_TEA =
            REGISTRATE.fluid("passionfruit_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.passionfruit_tea", "Passionfruit Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FECC35))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> POMEGRANATE_TEA =
            REGISTRATE.fluid("pomegranate_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.pomegranate_tea", "Pomegranate Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8BA485B))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> PERSIMMON_TEA =
            REGISTRATE.fluid("persimmon_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.persimmon_tea", "Persimmon Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8E89166))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> RASPBERRY_TEA =
            REGISTRATE.fluid("raspberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.raspberry_tea", "Raspberry Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FF7D7D))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> STARFRUIT_TEA =
            REGISTRATE.fluid("starfruit_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.starfruit_tea", "Starfruit Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FFDA65))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> LAVENDER_TEA =
            REGISTRATE.fluid("lavender_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.lavender_tea", "Lavender Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8deaef2))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> POMELO_TEA =
            REGISTRATE.fluid("pomelo_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.pomelo_tea", "Pomelo Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FF6F4C))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> MANDARIN_TEA =
            REGISTRATE.fluid("mandarin_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.mandarin_tea", "Mandarin Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FFC216))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> CITRON_TEA =
            REGISTRATE.fluid("citron_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.citron_tea", "Citron Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8FFC300))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> REDLOVE_TEA =
            REGISTRATE.fluid("redlove_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.redlove_tea", "Redlove Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8E24F63))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();
    public static FluidEntry<ForgeFlowingFluid.Flowing> BARBERRY_TEA =
            REGISTRATE.fluid("barberry_tea", FLUID_STILL_RL, FLUID_FLOWING_RL)
                    .lang(f -> "block.createcafe.barberry_tea", "Barberry Milk Tea")
                    .properties(p -> p.viscosity(1000)
                            .density(140).canHydrate(false).canConvertToSource(false)
                            .color(0xc8a1153c))
                    .fluidProperties(p -> p.levelDecreasePerBlock(2)
                            .tickRate(15)
                            .slopeFindDistance(6)
                            .explosionResistance(100F))
                    .renderType(RenderType.translucent())
                    .source(ForgeFlowingFluid.Source::new)
                    .bucket()
                    .build()
                    .register();*/
    public static void register() {
    }
}
