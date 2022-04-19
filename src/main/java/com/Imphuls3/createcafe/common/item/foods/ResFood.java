package com.Imphuls3.createcafe.common.item.foods;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ResFood extends Item {
    public static final FoodProperties RES_DRINK = (new FoodProperties.Builder())
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 240, 0), 1.0F)
            .nutrition(8).saturationMod(0.2F).build();

    public ResFood(Properties properties) {
        super(properties);
    }
}
