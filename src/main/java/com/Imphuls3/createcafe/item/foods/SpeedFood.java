package com.Imphuls3.createcafe.item.foods;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SpeedFood extends Item {
    public static final FoodProperties SPEED_DRINK = (new FoodProperties.Builder())
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 260, 1), 1.0F)
            .nutrition(8).saturationMod(0.2F).build();
    public SpeedFood(Properties properties) {
        super(properties);
    }
}
