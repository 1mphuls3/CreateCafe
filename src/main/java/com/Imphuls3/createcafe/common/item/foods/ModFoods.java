package com.Imphuls3.createcafe.common.item.foods;

import com.Imphuls3.createcafe.common.effect.EffectRegistry;
import com.Imphuls3.createcafe.config.CafeConfig;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.function.Function;

public class ModFoods {
    public static final FoodProperties BOBA = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2F).fast().build();
    public static final FoodProperties RAW_BOBA = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1F).fast().build();
    public static final FoodProperties COFFEE_FRUIT = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2F).fast().build();
    public static final FoodProperties COFFEE = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1F).fast().build();
    public static final FoodProperties ROASTED_COFFEE = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1F).fast().build();
    public static final FoodProperties CASSAVA_ROOT = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2F).fast().build();

    public static final FoodProperties MANA_BERRIES = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.2F).fast().build();
    public static final FoodProperties BLOOD_ORANGE = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.2F).fast().build();

    public static final FoodProperties OREO = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.2F).build();
    public static final FoodProperties OREO_HALF_RAW = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1F).fast().build();
    public static final FoodProperties OREO_HALF = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2F).fast().build();
    public static final FoodProperties CRUSHED_OREO = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.1F).fast().build();

    public static final FoodProperties REGEN_DRINK = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .nutrition(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodProperties FIRE_RES = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .nutrition(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodProperties RES_DRINK = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, CafeConfig.effectDuration.get() * 20, 0), 1.0F)
            .nutrition(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodProperties SPEED_DRINK = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .nutrition(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodProperties STRENGTH_DRINK = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .nutrition(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodProperties SUPER_DRINK = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .nutrition(8).saturationModifier(0.2F).alwaysEdible().build();

    public static final FoodProperties ICED_COFFEE_DRINK = new FoodProperties.Builder()
            .effect(() -> new MobEffectInstance(EffectRegistry.CAFFINATED, CafeConfig.effectDuration.get() * 20, 3), 1.0F).alwaysEdible().build();
    public static final Function<Holder<MobEffect>, FoodProperties> ICED_COFFEE_DRINK_FLAVOR = (effect -> (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(EffectRegistry.CAFFINATED, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .effect(() -> new MobEffectInstance(effect, CafeConfig.effectDuration.get() * 20, 1), 1.0F)
            .nutrition(8).saturationModifier(0.2F).alwaysEdible().build());
}
