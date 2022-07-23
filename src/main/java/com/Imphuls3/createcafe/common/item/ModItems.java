package com.Imphuls3.createcafe.common.item;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.block.ModBlocks;
import com.Imphuls3.createcafe.common.item.foods.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateCafe.MOD_ID);
    //Food Items:
    public static final RegistryObject<Item> MANA_BERRIES = ITEMS.register("mana_berries",
            () -> new Item(new Item.Properties().food(ModFoods.MANA_BERRIES).tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> OREO = ITEMS.register("oreo",
            () -> new Item(new Item.Properties().food(ModFoods.OREO).tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> OREO_INCOMPLETE = ITEMS.register("oreo_incomplete",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> OREO_HALF_RAW = ITEMS.register("oreo_half_raw",
            () -> new Item(new Item.Properties().food(ModFoods.OREO_HALF_RAW).tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> OREO_HALF = ITEMS.register("oreo_half",
            () -> new Item(new Item.Properties().food(ModFoods.OREO_HALF)
                    .tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> OREO_DOUGH = ITEMS.register("oreo_dough",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> CRUSHED_OREO = ITEMS.register("oreo_crushed",
            () -> new Item(new Item.Properties().food(ModFoods.CRUSHED_OREO).tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> BLOOD_ORANGE = ITEMS.register("blood_orange",
            () -> new Item(new Item.Properties().food(ModFoods.BLOOD_ORANGE).tab(ModCreativeModeTab.CREATE_CAFE)));
    //Drink Items:
    public static final RegistryObject<Item> MANGO_TEA = ITEMS.register("mango_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> LIME_TEA = ITEMS.register("lime_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> STRAWBERRY_TEA = ITEMS.register("strawberry_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> PEACH_TEA = ITEMS.register("peach_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> PLUM_TEA = ITEMS.register("plum_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> JACKFRUIT_TEA = ITEMS.register("jackfruit_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> APRICOT_TEA = ITEMS.register("apricot_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> DURIAN_TEA = ITEMS.register("durian_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> FIG_TEA = ITEMS.register("fig_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> GRAPE_TEA = ITEMS.register("grape_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> GRAPEFRUIT_TEA = ITEMS.register("grapefruit_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> STARFRUIT_TEA = ITEMS.register("starfruit_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));
    public static final RegistryObject<Item> MANDARIN_TEA = ITEMS.register("mandarin_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SpeedFood.SPEED_DRINK)));

    public static final RegistryObject<Item> BLOOD_TEA = ITEMS.register("blood_orange_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));
    public static final RegistryObject<Item> LYCHEE_TEA = ITEMS.register("lychee_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));
    public static final RegistryObject<Item> BLUEBERRY_TEA = ITEMS.register("blueberry_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));
    public static final RegistryObject<Item> PINEAPPLE_TEA = ITEMS.register("pineapple_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));
    public static final RegistryObject<Item> APPLE_TEA = ITEMS.register("apple_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));
    public static final RegistryObject<Item> PUMPKIN_TEA = ITEMS.register("pumpkin_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));
    public static final RegistryObject<Item> AVOCADO_TEA = ITEMS.register("avocado_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));
    public static final RegistryObject<Item> SWEETBERRY_TEA = ITEMS.register("sweetberry_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));
    public static final RegistryObject<Item> TAMARIND_TEA = ITEMS.register("tamarind_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));
    public static final RegistryObject<Item> PAPAYA_TEA = ITEMS.register("papaya_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));
    public static final RegistryObject<Item> REDLOVE_TEA = ITEMS.register("redlove_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(RegenFood.REGEN_DRINK)));

    public static final RegistryObject<Item> MANA_TEA = ITEMS.register("mana_berry_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(StrengthFood.STRENGTH_DRINK)));
    public static final RegistryObject<Item> KIWI_TEA = ITEMS.register("kiwi_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(StrengthFood.STRENGTH_DRINK)));
    public static final RegistryObject<Item> ORANGE_TEA = ITEMS.register("orange_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(StrengthFood.STRENGTH_DRINK)));
    public static final RegistryObject<Item> YUCCA_TEA = ITEMS.register("yucca_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(StrengthFood.STRENGTH_DRINK)));
    public static final RegistryObject<Item> ALOE_TEA = ITEMS.register("aloe_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(StrengthFood.STRENGTH_DRINK)));
    public static final RegistryObject<Item> COCONUT_TEA = ITEMS.register("coconut_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(StrengthFood.STRENGTH_DRINK)));
    public static final RegistryObject<Item> PERSIMMON_TEA = ITEMS.register("persimmon_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(StrengthFood.STRENGTH_DRINK)));
    public static final RegistryObject<Item> POMEGRANATE_TEA = ITEMS.register("pomegranate_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(StrengthFood.STRENGTH_DRINK)));
    public static final RegistryObject<Item> RASPBERRY_TEA = ITEMS.register("raspberry_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(StrengthFood.STRENGTH_DRINK)));
    public static final RegistryObject<Item> POMELO_TEA = ITEMS.register("pomelo_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(StrengthFood.STRENGTH_DRINK)));

    public static final RegistryObject<Item> LEMON_TEA = ITEMS.register("lemon_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> WATERMELON_TEA = ITEMS.register("watermelon_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> VANILLA_TEA = ITEMS.register("vanilla_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> BANANA_TEA = ITEMS.register("banana_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> CHERRY_TEA = ITEMS.register("cherry_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> BLACKBERRY_TEA = ITEMS.register("blackberry_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> DRAGONFRUIT_TEA = ITEMS.register("dragonfruit_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> GOOSEBERRY_TEA = ITEMS.register("gooseberry_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> GUAVA_TEA = ITEMS.register("guava_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> PASSIONFRUIT_TEA = ITEMS.register("passionfruit_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> LAVENDER_TEA = ITEMS.register("lavender_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));
    public static final RegistryObject<Item> CITRON_TEA = ITEMS.register("citron_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ResFood.RES_DRINK)));

    public static final RegistryObject<Item> OREO_TEA = ITEMS.register("oreo_milk_tea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(SuperFood.SUPER_DRINK)));

    //Non Food Items:
    public static final RegistryObject<Item> BOBA_CUP = ITEMS.register("boba_cup",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> EMPTY_BOBA_CUP = ITEMS.register("empty_boba_cup",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE)));

    //Boba:
    public static final RegistryObject<Item> BOBA = ITEMS.register("boba",
            () -> new Item(new Item.Properties().food(ModFoods.BOBA).tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> RAW_BOBA = ITEMS.register("raw_boba",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_BOBA).tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> TAPIOCA_FLOUR = ITEMS.register("tapioca_flour",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE)));

    //Crop Items:
    public static final RegistryObject<Item> COFFEE_FRUIT = ITEMS.register("coffee_fruit",
            () -> new Item(new Item.Properties().food(ModFoods.COFFEE_FRUIT).tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> COFFEE_BEANS = ITEMS.register("coffee_beans",
            () -> new ItemNameBlockItem(ModBlocks.COFFEE.get(),
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE).food(ModFoods.COFFEE)));

    public static final RegistryObject<Item> ROASTED_COFFEE = ITEMS.register("roasted_coffee",
            () -> new Item(new Item.Properties().food(ModFoods.ROASTED_COFFEE).tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> CASSAVA_SEEDS = ITEMS.register("cassava_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CASSAVA.get(),
                    new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE)));

    public static final RegistryObject<Item> CASSAVA_ROOT = ITEMS.register("cassava_root",
            () -> new Item(new Item.Properties().food(ModFoods.CASSAVA_ROOT).tab(ModCreativeModeTab.CREATE_CAFE)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
