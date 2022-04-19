package com.Imphuls3.createcafe.common.item.foods;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class RegenFood extends Item {
    public static final FoodProperties REGEN_DRINK = (new FoodProperties.Builder())
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 260, 1), 1.0F)
            .nutrition(8).saturationMod(0.2F).build();
    public RegenFood(Properties properties) {
        super(properties);
    }
}
