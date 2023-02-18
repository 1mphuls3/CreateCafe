package com.Imphuls3.createcafe.common.item.foods;

import com.Imphuls3.createcafe.common.effect.EffectRegistry;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.function.Function;

public class ModFoods {
    public static final FoodProperties BOBA = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).fast().build();
    public static final FoodProperties RAW_BOBA = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties COFFEE_FRUIT = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).fast().build();
    public static final FoodProperties COFFEE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties ROASTED_COFFEE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties CASSAVA_ROOT = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).fast().build();

    public static final FoodProperties MANA_BERRIES = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).fast().build();
    public static final FoodProperties BLOOD_ORANGE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).fast().build();

    public static final FoodProperties OREO = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).build();
    public static final FoodProperties OREO_HALF_RAW = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.1F).fast().build();
    public static final FoodProperties OREO_HALF = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.2F).fast().build();
    public static final FoodProperties CRUSHED_OREO = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).fast().build();

    public static final FoodProperties REGEN_DRINK = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 10 * 20, 1), 1.0F)
            .nutrition(8).saturationMod(0.2F).alwaysEat().build();

    public static final FoodProperties FIRE_RES = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 10 * 20, 1), 1.0F)
            .nutrition(8).saturationMod(0.2F).alwaysEat().build();

    public static final FoodProperties RES_DRINK = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10 * 20, 0), 1.0F)
            .nutrition(8).saturationMod(0.2F).alwaysEat().build();

    public static final FoodProperties SPEED_DRINK = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10 * 20, 1), 1.0F)
            .nutrition(8).saturationMod(0.2F).alwaysEat().build();

    public static final FoodProperties STRENGTH_DRINK = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10 * 20, 1), 1.0F)
            .nutrition(8).saturationMod(0.2F).alwaysEat().build();

    public static final FoodProperties SUPER_DRINK = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10 * 20, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10 * 20, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 10 * 20, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 10 * 20, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 10 * 20, 1), 1.0F)
            .nutrition(8).saturationMod(0.2F).alwaysEat().build();

    public static final Function<MobEffect, FoodProperties> ICED_COFFEE_DRINK = (effect -> (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(EffectRegistry.CAFFINATED.get(), 10 * 20, 3), 1.0F)
            .effect(() -> effect != null ? new MobEffectInstance(effect, 10 * 20, 1) :
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 0, 0, true, false), 1.0F)
            .nutrition(8).saturationMod(0.2F).alwaysEat().build());
    public static final Function<MobEffect, FoodProperties> ICED_COFFEE_DRINK_FLAVOR = (effect -> (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(EffectRegistry.CAFFINATED.get(), 10 * 20, 1), 1.0F)
            .effect(() -> effect != null ? new MobEffectInstance(effect, 10 * 20, 1) :
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 0, 0, true, false), 1.0F)
            .nutrition(8).saturationMod(0.2F).alwaysEat().build());
}
