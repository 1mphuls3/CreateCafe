package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.core.registry.FluidTypeRegistry.*;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class FluidRegistry {
    private static final Registrate REGISTRATE = CreateCafe.registrate();

    public static final ResourceLocation STILL_TEXTURE = new ResourceLocation("createcafe:fluid/milk_tea_still");
    public static final ResourceLocation FLOWING_TEXTURE = new ResourceLocation("createcafe:fluid/milk_tea_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> MELTED_SUGAR = REGISTRATE.fluid("melted_sugar",
                    STILL_TEXTURE, FLOWING_TEXTURE, MeltedSugar::new)
            .lang(f -> "block.createcafe.melted_sugar", "Melted Sugar")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> FILLING = REGISTRATE.fluid("filling",
                    STILL_TEXTURE, FLOWING_TEXTURE, Filling::new)
            .lang(f -> "block.createcafe.filling", "Filling")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> OREO_TEA = REGISTRATE.fluid("oreo_tea",
                    STILL_TEXTURE, FLOWING_TEXTURE, Oreo::new)
            .lang(f -> "block.createcafe.+ " + "oreo" + "_tea", "Oreo" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();
    
    public static FluidEntry<ForgeFlowingFluid.Flowing> MANGO_TEA = REGISTRATE.fluid("mango_tea",
                    STILL_TEXTURE, FLOWING_TEXTURE, Mango::new)
            .lang(f -> "block.createcafe.+ " + "mango" + "_tea", "Mango" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> LIME_TEA = REGISTRATE.fluid("lime_tea",
                    STILL_TEXTURE, FLOWING_TEXTURE, Lime::new)
            .lang(f -> "block.createcafe.+ " + "lime" + "_tea", "Lime" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> LYCHEE_TEA = REGISTRATE.fluid("lychee_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Lychee::new)
            .lang(f -> "block.createcafe.+ " + "lychee" + "_tea", "Lychee" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> KIWI_TEA = REGISTRATE.fluid("kiwi_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Kiwi::new)
            .lang(f -> "block.createcafe.+ " + "kiwi" + "_tea", "Kiwi" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> MANA_TEA = REGISTRATE.fluid("mana_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Mana::new)
            .lang(f -> "block.createcafe.+ " + "mana" + "_tea", "Mana" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> BLOOD_TEA = REGISTRATE.fluid("blood_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Blood::new)
            .lang(f -> "block.createcafe.+ " + "blood" + "_tea", "Blood" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> LEMON_TEA = REGISTRATE.fluid("lemon_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Lemon::new)
            .lang(f -> "block.createcafe.+ " + "lemon" + "_tea", "Lemon" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> WATERMELON_TEA = REGISTRATE.fluid("watermelon_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Watermelon::new)
            .lang(f -> "block.createcafe.+ " + "watermelon" + "_tea", "Watermelon" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> STRAWBERRY_TEA = REGISTRATE.fluid("strawberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Strawberry::new)
            .lang(f -> "block.createcafe.+ " + "strawberry" + "_tea", "Strawberry" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> BLUEBERRY_TEA = REGISTRATE.fluid("blueberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Blueberry::new)
            .lang(f -> "block.createcafe.+ " + "blueberry" + "_tea", "Blueberry" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> VANILLA_TEA = REGISTRATE.fluid("vanilla_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Vanilla::new)
            .lang(f -> "block.createcafe.+ " + "vanilla" + "_tea", "Vanilla" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> ORANGE_TEA = REGISTRATE.fluid("orange_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Orange::new)
            .lang(f -> "block.createcafe.+ " + "orange" + "_tea", "Orange" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PEACH_TEA = REGISTRATE.fluid("peach_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Peach::new)
            .lang(f -> "block.createcafe.+ " + "peach" + "_tea", "Peach" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PINEAPPLE_TEA = REGISTRATE.fluid("pineapple_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Pineapple::new)
            .lang(f -> "block.createcafe.+ " + "pineapple" + "_tea", "Pineapple" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> BANANA_TEA = REGISTRATE.fluid("banana_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Banana::new)
            .lang(f -> "block.createcafe.+ " + "banana" + "_tea", "Banana" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> YUCCA_TEA = REGISTRATE.fluid("yucca_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Yucca::new)
            .lang(f -> "block.createcafe.+ " + "yucca" + "_tea", "Yucca" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> CHERRY_TEA = REGISTRATE.fluid("cherry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Cherry::new)
            .lang(f -> "block.createcafe.+ " + "cherry" + "_tea", "Cherry" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PLUM_TEA = REGISTRATE.fluid("plum_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Plum::new)
            .lang(f -> "block.createcafe.+ " + "plum" + "_tea", "Plum" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> ALOE_TEA = REGISTRATE.fluid("aloe_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Aloe::new)
            .lang(f -> "block.createcafe.+ " + "aloe" + "_tea", "Aloe" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> APPLE_TEA = REGISTRATE.fluid("apple_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Apple::new)
            .lang(f -> "block.createcafe.+ " + "apple" + "_tea", "Apple" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> BLACKBERRY_TEA = REGISTRATE.fluid("blackberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Blackberry::new)
            .lang(f -> "block.createcafe.+ " + "blacberry" + "_tea", "Blackberry" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PUMPKIN_TEA = REGISTRATE.fluid("pumpkin_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Pumpkin::new)
            .lang(f -> "block.createcafe.+ " + "pumpkin" + "_tea", "Pumpkin" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> JACKFRUIT_TEA = REGISTRATE.fluid("jackfruit_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Jackfruit::new)
            .lang(f -> "block.createcafe.+ " + "jackfruit" + "_tea", "Jackfruit" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> COCONUT_TEA = REGISTRATE.fluid("coconut_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Coconut::new)
            .lang(f -> "block.createcafe.+ " + "coconut" + "_tea", "Coconut" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> DRAGONFRUIT_TEA = REGISTRATE.fluid("dragonfruit_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Dragonfruit::new)
            .lang(f -> "block.createcafe.+ " + "dragonfruit" + "_tea", "Dragonfruit" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> APRICOT_TEA = REGISTRATE.fluid("apricot_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Apricot::new)
            .lang(f -> "block.createcafe.+ " + "apricot" + "_tea", "Apricot" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> AVOCADO_TEA = REGISTRATE.fluid("avocado_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Avocado::new)
            .lang(f -> "block.createcafe.+ " + "avocado" + "_tea", "Avocado" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> SWEETBERRY_TEA = REGISTRATE.fluid("sweetberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Sweetberry::new)
            .lang(f -> "block.createcafe.+ " + "sweetberry" + "_tea", "Sweetberry" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> DURIAN_TEA = REGISTRATE.fluid("durian_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Durian::new)
            .lang(f -> "block.createcafe.+ " + "durian" + "_tea", "Durian" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> FIG_TEA = REGISTRATE.fluid("fig_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Fig::new)
            .lang(f -> "block.createcafe.+ " + "fig" + "_tea", "Fig" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> TAMARIND_TEA = REGISTRATE.fluid("tamarind_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Tamarind::new)
            .lang(f -> "block.createcafe.+ " + "tamarind" + "_tea", "Tamarind" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> GOOSEBERRY_TEA = REGISTRATE.fluid("gooseberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Gooseberry::new)
            .lang(f -> "block.createcafe.+ " + "gooseberry" + "_tea", "Gooseberry" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> GRAPE_TEA = REGISTRATE.fluid("grape_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Grape::new)
            .lang(f -> "block.createcafe.+ " + "grape" + "_tea", "Grape" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> GRAPEFRUIT_TEA = REGISTRATE.fluid("grapefruit_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Grapefruit::new)
            .lang(f -> "block.createcafe.+ " + "grapefruit" + "_tea", "Grapefruit" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PAPAYA_TEA = REGISTRATE.fluid("papaya_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Papaya::new)
            .lang(f -> "block.createcafe.+ " + "papaya" + "_tea", "Papaya" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> GUAVA_TEA = REGISTRATE.fluid("guava_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Guava::new)
            .lang(f -> "block.createcafe.+ " + "guava" + "_tea", "Guava" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PASSIONFRUIT_TEA = REGISTRATE.fluid("passionfruit_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Passionfruit::new)
            .lang(f -> "block.createcafe.+ " + "passionfruit" + "_tea", "Passionfruit" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> POMEGRANATE_TEA = REGISTRATE.fluid("pomegranate_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Pomegranate::new)
            .lang(f -> "block.createcafe.+ " + "pomegranate" + "_tea", "Pomegranate" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PERSIMMON_TEA = REGISTRATE.fluid("persimmon_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Persimmon::new)
            .lang(f -> "block.createcafe.+ " + "persimmon" + "_tea", "Persimmon" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> RASPBERRY_TEA = REGISTRATE.fluid("raspberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Raspberry::new)
            .lang(f -> "block.createcafe.+ " + "raspberry" + "_tea", "Raspberry" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> STARFRUIT_TEA = REGISTRATE.fluid("starfruit_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Starfruit::new)
            .lang(f -> "block.createcafe.+ " + "starfruit" + "_tea", "Starfruit" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> LAVENDER_TEA = REGISTRATE.fluid("lavender_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Lavender::new)
            .lang(f -> "block.createcafe.+ " + "lavender" + "_tea", "Lavender" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> POMELO_TEA = REGISTRATE.fluid("pomelo_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Pomelo::new)
            .lang(f -> "block.createcafe.+ " + "pomelo" + "_tea", "Pomelo" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> MANDARIN_TEA = REGISTRATE.fluid("mandarin_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Mandarin::new)
            .lang(f -> "block.createcafe.+ " + "mandarin" + "_tea", "Mandarin" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> CITRON_TEA = REGISTRATE.fluid("citron_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Citron::new)
            .lang(f -> "block.createcafe.+ " + "citron" + "_tea", "Citron" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> REDLOVE_TEA = REGISTRATE.fluid("redlove_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Redlove::new)
            .lang(f -> "block.createcafe.+ " + "redlove" + "_tea", "Redlove" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> BARBERRY_TEA = REGISTRATE.fluid("barberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Barberry::new)
            .lang(f -> "block.createcafe.+ " + "barberry" + "_tea", "Barberry" + "Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .tag(TagRegistry.Fluids.TEA)
            .bucket()
            .build()
            .register();

    public static void register(IEventBus eventBus) {
    }
}
