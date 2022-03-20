package com.Imphuls3.createcafe.item.foods;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BOBA = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).fast().build();
    public static final FoodProperties RAW_BOBA = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties COFFEE_FRUIT = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).fast().build();
    public static final FoodProperties COFFEE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties ROASTED_COFFEE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties CASSAVA_ROOT = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).fast().build();

    public static final FoodProperties MANA_BERRIES = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).fast().build();
    public static final FoodProperties BLOOD_ORANGE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).fast().build();

    public static final FoodProperties OREO = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).fast().build();
    public static final FoodProperties OREO_HALF_RAW = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties OREO_HALF = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).fast().build();
    public static final FoodProperties CRUSHED_OREO = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).fast().build();
}
