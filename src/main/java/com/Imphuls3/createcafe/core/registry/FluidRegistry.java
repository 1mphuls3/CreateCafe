package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.core.registry.FluidTypeRegistry.*;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class FluidRegistry {
    public static final Registrate REGISTRATE = CreateCafe.fluidRegistrate();
    public static final ResourceLocation STILL_TEXTURE = new ResourceLocation("createcafe:fluid/milk_tea_still");
    public static final ResourceLocation FLOWING_TEXTURE = new ResourceLocation("createcafe:fluid/milk_tea_flow");

    public static final FluidEntry<ForgeFlowingFluid.Flowing> MELTED_SUGAR = REGISTRATE.fluid("melted_sugar",
                    STILL_TEXTURE, FLOWING_TEXTURE, MeltedSugar::new)
            .lang(f -> "fluid.createcafe.melted_sugar", "Melted Sugar")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> FILLING = REGISTRATE.fluid("filling",
                    STILL_TEXTURE, FLOWING_TEXTURE, Filling::new)
            .lang(f -> "fluid.createcafe.filling", "Filling")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> OREO_TEA = REGISTRATE.fluid("oreo_tea",
                    STILL_TEXTURE, FLOWING_TEXTURE, Oreo::new)
            .lang(f -> "fluid.createcafe." + "oreo" + "_tea", "Oreo Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();
    
    public static FluidEntry<ForgeFlowingFluid.Flowing> MANGO_TEA = REGISTRATE.fluid("mango_tea",
                    STILL_TEXTURE, FLOWING_TEXTURE, Mango::new)
            .lang(f -> "fluid.createcafe." + "mango" + "_tea", "Mango Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> LIME_TEA = REGISTRATE.fluid("lime_tea",
                    STILL_TEXTURE, FLOWING_TEXTURE, Lime::new)
            .lang(f -> "fluid.createcafe." + "lime" + "_tea", "Lime Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> LYCHEE_TEA = REGISTRATE.fluid("lychee_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Lychee::new)
            .lang(f -> "fluid.createcafe." + "lychee" + "_tea", "Lychee Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> KIWI_TEA = REGISTRATE.fluid("kiwi_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Kiwi::new)
            .lang(f -> "fluid.createcafe." + "kiwi" + "_tea", "Kiwi Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> MANA_TEA = REGISTRATE.fluid("mana_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Mana::new)
            .lang(f -> "fluid.createcafe." + "mana" + "_tea", "Mana Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> BLOOD_TEA = REGISTRATE.fluid("blood_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Blood::new)
            .lang(f -> "fluid.createcafe." + "blood" + "_tea", "Blood Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> LEMON_TEA = REGISTRATE.fluid("lemon_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Lemon::new)
            .lang(f -> "fluid.createcafe." + "lemon" + "_tea", "Lemon Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> WATERMELON_TEA = REGISTRATE.fluid("watermelon_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Watermelon::new)
            .lang(f -> "fluid.createcafe." + "watermelon" + "_tea", "Watermelon Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> STRAWBERRY_TEA = REGISTRATE.fluid("strawberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Strawberry::new)
            .lang(f -> "fluid.createcafe." + "strawberry" + "_tea", "Strawberry Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> BLUEBERRY_TEA = REGISTRATE.fluid("blueberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Blueberry::new)
            .lang(f -> "fluid.createcafe." + "blueberry" + "_tea", "Blueberry Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> VANILLA_TEA = REGISTRATE.fluid("vanilla_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Vanilla::new)
            .lang(f -> "fluid.createcafe." + "vanilla" + "_tea", "Vanilla Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> ORANGE_TEA = REGISTRATE.fluid("orange_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Orange::new)
            .lang(f -> "fluid.createcafe." + "orange" + "_tea", "Orange Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PEACH_TEA = REGISTRATE.fluid("peach_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Peach::new)
            .lang(f -> "fluid.createcafe." + "peach" + "_tea", "Peach Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PINEAPPLE_TEA = REGISTRATE.fluid("pineapple_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Pineapple::new)
            .lang(f -> "fluid.createcafe." + "pineapple" + "_tea", "Pineapple Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> BANANA_TEA = REGISTRATE.fluid("banana_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Banana::new)
            .lang(f -> "fluid.createcafe." + "banana" + "_tea", "Banana Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> YUCCA_TEA = REGISTRATE.fluid("yucca_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Yucca::new)
            .lang(f -> "fluid.createcafe." + "yucca" + "_tea", "Yucca Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> CHERRY_TEA = REGISTRATE.fluid("cherry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Cherry::new)
            .lang(f -> "fluid.createcafe." + "cherry" + "_tea", "Cherry Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PLUM_TEA = REGISTRATE.fluid("plum_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Plum::new)
            .lang(f -> "fluid.createcafe." + "plum" + "_tea", "Plum Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> ALOE_TEA = REGISTRATE.fluid("aloe_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Aloe::new)
            .lang(f -> "fluid.createcafe." + "aloe" + "_tea", "Aloe Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> APPLE_TEA = REGISTRATE.fluid("apple_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Apple::new)
            .lang(f -> "fluid.createcafe." + "apple" + "_tea", "Apple Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> BLACKBERRY_TEA = REGISTRATE.fluid("blackberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Blackberry::new)
            .lang(f -> "fluid.createcafe." + "blackberry" + "_tea", "Blackberry Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PUMPKIN_TEA = REGISTRATE.fluid("pumpkin_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Pumpkin::new)
            .lang(f -> "fluid.createcafe." + "pumpkin" + "_tea", "Pumpkin Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> JACKFRUIT_TEA = REGISTRATE.fluid("jackfruit_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Jackfruit::new)
            .lang(f -> "fluid.createcafe." + "jackfruit" + "_tea", "Jackfruit Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> COCONUT_TEA = REGISTRATE.fluid("coconut_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Coconut::new)
            .lang(f -> "fluid.createcafe." + "coconut" + "_tea", "Coconut Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> DRAGONFRUIT_TEA = REGISTRATE.fluid("dragonfruit_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Dragonfruit::new)
            .lang(f -> "fluid.createcafe." + "dragonfruit" + "_tea", "Dragonfruit Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> APRICOT_TEA = REGISTRATE.fluid("apricot_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Apricot::new)
            .lang(f -> "fluid.createcafe." + "apricot" + "_tea", "Apricot Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> AVOCADO_TEA = REGISTRATE.fluid("avocado_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Avocado::new)
            .lang(f -> "fluid.createcafe." + "avocado" + "_tea", "Avocado Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> SWEETBERRY_TEA = REGISTRATE.fluid("sweetberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Sweetberry::new)
            .lang(f -> "fluid.createcafe." + "sweetberry" + "_tea", "Sweetberry Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> DURIAN_TEA = REGISTRATE.fluid("durian_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Durian::new)
            .lang(f -> "fluid.createcafe." + "durian" + "_tea", "Durian Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> FIG_TEA = REGISTRATE.fluid("fig_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Fig::new)
            .lang(f -> "fluid.createcafe." + "fig" + "_tea", "Fig Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> TAMARIND_TEA = REGISTRATE.fluid("tamarind_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Tamarind::new)
            .lang(f -> "fluid.createcafe." + "tamarind" + "_tea", "Tamarind Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> GOOSEBERRY_TEA = REGISTRATE.fluid("gooseberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Gooseberry::new)
            .lang(f -> "fluid.createcafe." + "gooseberry" + "_tea", "Gooseberry Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> GRAPE_TEA = REGISTRATE.fluid("grape_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Grape::new)
            .lang(f -> "fluid.createcafe." + "grape" + "_tea", "Grape Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> GRAPEFRUIT_TEA = REGISTRATE.fluid("grapefruit_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Grapefruit::new)
            .lang(f -> "fluid.createcafe." + "grapefruit" + "_tea", "Grapefruit Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PAPAYA_TEA = REGISTRATE.fluid("papaya_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Papaya::new)
            .lang(f -> "fluid.createcafe." + "papaya" + "_tea", "Papaya Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> GUAVA_TEA = REGISTRATE.fluid("guava_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Guava::new)
            .lang(f -> "fluid.createcafe." + "guava" + "_tea", "Guava Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PASSIONFRUIT_TEA = REGISTRATE.fluid("passionfruit_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Passionfruit::new)
            .lang(f -> "fluid.createcafe." + "passionfruit" + "_tea", "Passionfruit Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> POMEGRANATE_TEA = REGISTRATE.fluid("pomegranate_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Pomegranate::new)
            .lang(f -> "fluid.createcafe." + "pomegranate" + "_tea", "Pomegranate Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> PERSIMMON_TEA = REGISTRATE.fluid("persimmon_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Persimmon::new)
            .lang(f -> "fluid.createcafe." + "persimmon" + "_tea", "Persimmon Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> RASPBERRY_TEA = REGISTRATE.fluid("raspberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Raspberry::new)
            .lang(f -> "fluid.createcafe." + "raspberry" + "_tea", "Raspberry Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> STARFRUIT_TEA = REGISTRATE.fluid("starfruit_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Starfruit::new)
            .lang(f -> "fluid.createcafe." + "starfruit" + "_tea", "Starfruit Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> LAVENDER_TEA = REGISTRATE.fluid("lavender_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Lavender::new)
            .lang(f -> "fluid.createcafe." + "lavender" + "_tea", "Lavender Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> POMELO_TEA = REGISTRATE.fluid("pomelo_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Pomelo::new)
            .lang(f -> "fluid.createcafe." + "pomelo" + "_tea", "Pomelo Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> MANDARIN_TEA = REGISTRATE.fluid("mandarin_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Mandarin::new)
            .lang(f -> "fluid.createcafe." + "mandarin" + "_tea", "Mandarin Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> CITRON_TEA = REGISTRATE.fluid("citron_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Citron::new)
            .lang(f -> "fluid.createcafe." + "citron" + "_tea", "Citron Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> REDLOVE_TEA = REGISTRATE.fluid("redlove_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Redlove::new)
            .lang(f -> "fluid.createcafe." + "redlove" + "_tea", "Redlove Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static FluidEntry<ForgeFlowingFluid.Flowing> BARBERRY_TEA = REGISTRATE.fluid("barberry_tea",
STILL_TEXTURE, FLOWING_TEXTURE, Barberry::new)
            .lang(f -> "fluid.createcafe." + "barberry" + "_tea", "Barberry Tea")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final FluidEntry<ForgeFlowingFluid.Flowing> COFFEE = REGISTRATE.fluid("coffee",
                    STILL_TEXTURE, FLOWING_TEXTURE, Coffee::new)
            .lang(f -> "fluid.createcafe.coffee", "Coffee")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();

    public static final FluidEntry<ForgeFlowingFluid.Flowing> STRAWBERRY_SYRUP = REGISTRATE.fluid("strawberry_syrup",
                    STILL_TEXTURE, FLOWING_TEXTURE, StrawberryS::new)
            .lang(f -> "fluid.createcafe.strawberry_syrup", "Strawberry Syrup")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();
    public static final FluidEntry<ForgeFlowingFluid.Flowing> VANILLA_SYRUP = REGISTRATE.fluid("vanilla_syrup",
                    STILL_TEXTURE, FLOWING_TEXTURE, VanillaS::new)
            .lang(f -> "fluid.createcafe.vanilla_syrup", "Vanilla Syrup")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();
    public static final FluidEntry<ForgeFlowingFluid.Flowing> RASPBERRY_SYRUP = REGISTRATE.fluid("raspberry_syrup",
                    STILL_TEXTURE, FLOWING_TEXTURE, RaspberryS::new)
            .lang(f -> "fluid.createcafe.raspberry_syrup", "Raspberry Syrup")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();
    public static final FluidEntry<ForgeFlowingFluid.Flowing> MINT_SYRUP = REGISTRATE.fluid("mint_syrup",
                    STILL_TEXTURE, FLOWING_TEXTURE, MintS::new)
            .lang(f -> "fluid.createcafe.mint_syrup", "Mint Syrup")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();
    public static final FluidEntry<ForgeFlowingFluid.Flowing> CARAMEL_SYRUP = REGISTRATE.fluid("caramel_syrup",
                    STILL_TEXTURE, FLOWING_TEXTURE, CaramelS::new)
            .lang(f -> "fluid.createcafe.caramel_syrup", "Caramel Syrup")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();
    public static final FluidEntry<ForgeFlowingFluid.Flowing> COCONUT_SYRUP = REGISTRATE.fluid("coconut_syrup",
                    STILL_TEXTURE, FLOWING_TEXTURE, CoconutS::new)
            .lang(f -> "fluid.createcafe.coconut_syrup", "Coconut Syrup")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();
    public static final FluidEntry<ForgeFlowingFluid.Flowing> BANANA_SYRUP = REGISTRATE.fluid("banana_syrup",
                    STILL_TEXTURE, FLOWING_TEXTURE, BananaS::new)
            .lang(f -> "fluid.createcafe.banana_syrup", "Banana Syrup")
            .properties(p -> p.viscosity(1000)
                    .density(140).canSwim(true))
            .fluidProperties(p -> p
                    .levelDecreasePerBlock(2)
                    .tickRate(15)
                    .slopeFindDistance(6)
                    .explosionResistance(100F))
            .source(ForgeFlowingFluid.Source::new)
            .bucket()
            .build()
            .register();
    public static void register(IEventBus eventBus) {
    }
}
