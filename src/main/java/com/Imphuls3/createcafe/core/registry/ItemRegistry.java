package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.item.foods.*;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, CreateCafe.ID);

    public static Item.Properties HIDDEN_PROPERTIES() {
        return new Item.Properties().stacksTo(1);
    }

    //Food Items

    public static final DeferredHolder<Item, Item> OREO = ITEMS.register("oreo",
            () -> new Item(makeItem().food(ModFoods.OREO)));

    public static final DeferredHolder<Item, Item> OREO_INCOMPLETE = ITEMS.register("oreo_incomplete",
            () -> new SequencedAssemblyItem(new Item.Properties()));

    public static final DeferredHolder<Item, Item> OREO_HALF_RAW = ITEMS.register("oreo_half_raw",
            () -> new Item(makeItem().food(ModFoods.OREO_HALF_RAW)));

    public static final DeferredHolder<Item, Item> OREO_HALF = ITEMS.register("oreo_half",
            () -> new Item(makeItem().food(ModFoods.OREO_HALF)));

    public static final DeferredHolder<Item, Item> OREO_DOUGH = ITEMS.register("oreo_dough",
            () -> new Item(makeItem()));

    public static final DeferredHolder<Item, Item> CRUSHED_OREO = ITEMS.register("oreo_crushed",
            () -> new Item(makeItem().food(ModFoods.CRUSHED_OREO)));

    public static final DeferredHolder<Item, Item> MANA_BERRIES = ITEMS.register("mana_berries",
            () -> new Item(new Item.Properties().food(ModFoods.MANA_BERRIES)));
    public static final DeferredHolder<Item, Item> BLOOD_ORANGE = ITEMS.register("blood_orange",
            () -> new Item(new Item.Properties().food(ModFoods.BLOOD_ORANGE)));

    //Drink Items
    public static final DeferredHolder<Item, CafeDrink> MANGO_TEA = ITEMS.register("mango_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> LIME_TEA = ITEMS.register("lime_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> STRAWBERRY_TEA = ITEMS.register("strawberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> PEACH_TEA = ITEMS.register("peach_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> PLUM_TEA = ITEMS.register("plum_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> JACKFRUIT_TEA = ITEMS.register("jackfruit_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> APRICOT_TEA = ITEMS.register("apricot_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> DURIAN_TEA = ITEMS.register("durian_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> FIG_TEA = ITEMS.register("fig_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> GRAPE_TEA = ITEMS.register("grape_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> GRAPEFRUIT_TEA = ITEMS.register("grapefruit_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> STARFRUIT_TEA = ITEMS.register("starfruit_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));
    public static final DeferredHolder<Item, CafeDrink> MANDARIN_TEA = ITEMS.register("mandarin_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.SPEED_DRINK)), "speed"));

    public static final DeferredHolder<Item, CafeDrink> BLOOD_TEA = ITEMS.register("blood_orange_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final DeferredHolder<Item, CafeDrink> LYCHEE_TEA = ITEMS.register("lychee_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final DeferredHolder<Item, CafeDrink> BLUEBERRY_TEA = ITEMS.register("blueberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final DeferredHolder<Item, CafeDrink> PINEAPPLE_TEA = ITEMS.register("pineapple_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final DeferredHolder<Item, CafeDrink> APPLE_TEA = ITEMS.register("apple_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen"));
    public static final DeferredHolder<Item, CafeDrink> PUMPKIN_TEA = ITEMS.register("pumpkin_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen"));
    public static final DeferredHolder<Item, CafeDrink> AVOCADO_TEA = ITEMS.register("avocado_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final DeferredHolder<Item, CafeDrink> SWEETBERRY_TEA = ITEMS.register("sweetberry_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.REGEN_DRINK), "regen"));
    public static final DeferredHolder<Item, CafeDrink> TAMARIND_TEA = ITEMS.register("tamarind_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final DeferredHolder<Item, CafeDrink> PAPAYA_TEA = ITEMS.register("papaya_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));
    public static final DeferredHolder<Item, CafeDrink> REDLOVE_TEA = ITEMS.register("redlove_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.REGEN_DRINK)), "regen"));

    public static final DeferredHolder<Item, CafeDrink> MANA_TEA = ITEMS.register("mana_berry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final DeferredHolder<Item, CafeDrink> KIWI_TEA = ITEMS.register("kiwi_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final DeferredHolder<Item, CafeDrink> ORANGE_TEA = ITEMS.register("orange_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final DeferredHolder<Item, CafeDrink> YUCCA_TEA = ITEMS.register("yucca_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.STRENGTH_DRINK), "strength"));
    public static final DeferredHolder<Item, CafeDrink> ALOE_TEA = ITEMS.register("aloe_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final DeferredHolder<Item, CafeDrink> COCONUT_TEA = ITEMS.register("coconut_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final DeferredHolder<Item, CafeDrink> PERSIMMON_TEA = ITEMS.register("persimmon_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final DeferredHolder<Item, CafeDrink> POMEGRANATE_TEA = ITEMS.register("pomegranate_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final DeferredHolder<Item, CafeDrink> RASPBERRY_TEA = ITEMS.register("raspberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));
    public static final DeferredHolder<Item, CafeDrink> POMELO_TEA = ITEMS.register("pomelo_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.STRENGTH_DRINK)), "strength"));

    public static final DeferredHolder<Item, CafeDrink> LEMON_TEA = ITEMS.register("lemon_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final DeferredHolder<Item, CafeDrink> WATERMELON_TEA = ITEMS.register("watermelon_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.RES_DRINK), "res"));
    public static final DeferredHolder<Item, CafeDrink> VANILLA_TEA = ITEMS.register("vanilla_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final DeferredHolder<Item, CafeDrink> BANANA_TEA = ITEMS.register("banana_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final DeferredHolder<Item, CafeDrink> CHERRY_TEA = ITEMS.register("cherry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final DeferredHolder<Item, CafeDrink> BLACKBERRY_TEA = ITEMS.register("blackberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final DeferredHolder<Item, CafeDrink> DRAGONFRUIT_TEA = ITEMS.register("dragonfruit_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final DeferredHolder<Item, CafeDrink> GOOSEBERRY_TEA = ITEMS.register("gooseberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final DeferredHolder<Item, CafeDrink> GUAVA_TEA = ITEMS.register("guava_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final DeferredHolder<Item, CafeDrink> PASSIONFRUIT_TEA = ITEMS.register("passionfruit_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final DeferredHolder<Item, CafeDrink> LAVENDER_TEA = ITEMS.register("lavender_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));
    public static final DeferredHolder<Item, CafeDrink> CITRON_TEA = ITEMS.register("citron_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.RES_DRINK)), "res"));

    public static final DeferredHolder<Item, CafeDrink> BARBERRY_TEA = ITEMS.register("barberry_milk_tea",
            () -> new CafeDrink((makeItem().food(ModFoods.FIRE_RES)), "fire_res"));

    public static final DeferredHolder<Item, CafeDrink> OREO_TEA = ITEMS.register("oreo_milk_tea",
            () -> new CafeDrink(makeItem().food(ModFoods.SUPER_DRINK), "super"));

    public static final DeferredHolder<Item, IcedCoffeeDrink> ICED_COFFEE = ITEMS.register("iced_coffee",
            () -> new IcedCoffeeDrink(makeItem().food(ModFoods.ICED_COFFEE_DRINK), "none"));
    public static final DeferredHolder<Item, IcedCoffeeDrinkMilk> ICED_COFFEE_MILK = ITEMS.register("iced_coffee_milk",
            () -> new IcedCoffeeDrinkMilk(makeItem().food(ModFoods.ICED_COFFEE_DRINK), "none"));
    public static final DeferredHolder<Item, IcedCoffeeDrinkFlavor> STRAWBERRY_ICED_COFFEE = ITEMS.register("strawberry_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.REGENERATION)), "regen"));
    public static final DeferredHolder<Item, IcedCoffeeDrinkFlavor> VANILLA_ICED_COFFEE = ITEMS.register("vanilla_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.ABSORPTION)), "absorption"));
    public static final DeferredHolder<Item, IcedCoffeeDrinkFlavor> RASPBERRY_ICED_COFFEE = ITEMS.register("raspberry_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.DAMAGE_BOOST)), "strength"));
    public static final DeferredHolder<Item, IcedCoffeeDrinkFlavor> MINT_ICED_COFFEE = ITEMS.register("mint_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.FIRE_RESISTANCE)), "fire_res"));
    public static final DeferredHolder<Item, IcedCoffeeDrinkFlavor> CARAMEL_ICED_COFFEE = ITEMS.register("caramel_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.SATURATION)), "saturation"));
    public static final DeferredHolder<Item, IcedCoffeeDrinkFlavor> COCONUT_ICED_COFFEE = ITEMS.register("coconut_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.WATER_BREATHING)), "water_breathing"));
    public static final DeferredHolder<Item, IcedCoffeeDrinkFlavor> BANANA_ICED_COFFEE = ITEMS.register("banana_iced_coffee",
            () -> new IcedCoffeeDrinkFlavor(makeItem().food(ModFoods.ICED_COFFEE_DRINK_FLAVOR.apply(MobEffects.SATURATION)), "saturation"));

    //Non Food Items
    public static final DeferredHolder<Item, Item> BOBA_CUP = ITEMS.register("boba_cup",
            () -> new Item(makeItem()));

    public static final DeferredHolder<Item, Item> EMPTY_BOBA_CUP = ITEMS.register("empty_boba_cup",
            () -> new Item(makeItem()));

    public static final DeferredHolder<Item, Item> ICED_COFFEE_CUP = ITEMS.register("iced_coffee_cup",
            () -> new Item(makeItem()));

    public static final DeferredHolder<Item, Item> ICED_COFFEE_CUP_ICE = ITEMS.register("iced_coffee_cup_ice",
            () -> new Item(makeItem()));

    //Boba
    public static final DeferredHolder<Item, Item> BOBA = ITEMS.register("boba",
            () -> new Item(makeItem().food(ModFoods.BOBA)));

    public static final DeferredHolder<Item, Item> RAW_BOBA = ITEMS.register("raw_boba",
            () -> new Item(makeItem().food(ModFoods.RAW_BOBA)));

    public static final DeferredHolder<Item, Item> TAPIOCA_FLOUR = ITEMS.register("tapioca_flour",
            () -> new Item(makeItem()));

    //Crop Items
    public static final DeferredHolder<Item, Item> COFFEE_FRUIT = ITEMS.register("coffee_fruit",
            () -> new Item(makeItem().food(ModFoods.COFFEE_FRUIT)));

    public static final DeferredHolder<Item, Item> COFFEE_BEANS = ITEMS.register("coffee_beans",
            () -> new ItemNameBlockItem(BlockRegistry.COFFEE.get(),
                    makeItem().food(ModFoods.COFFEE)));

    public static final DeferredHolder<Item, Item> ROASTED_COFFEE = ITEMS.register("roasted_coffee_beans",
            () -> new Item(makeItem().food(ModFoods.ROASTED_COFFEE)));

    public static final DeferredHolder<Item, Item> COFFEE_GROUNDS = ITEMS.register("coffee_grounds",
            () -> new Item(makeItem().food(ModFoods.ROASTED_COFFEE)));

    public static final DeferredHolder<Item, Item> CASSAVA_SEEDS = ITEMS.register("cassava_seeds",
            () -> new ItemNameBlockItem(BlockRegistry.CASSAVA.get(), makeItem()));

    public static final DeferredHolder<Item, Item> CASSAVA_ROOT = ITEMS.register("cassava_root",
            () -> new Item(makeItem().food(ModFoods.CASSAVA_ROOT)));

    public static Item.Properties makeItem() {
        return new Item.Properties();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
