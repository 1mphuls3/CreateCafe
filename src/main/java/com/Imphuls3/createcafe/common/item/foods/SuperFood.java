package com.Imphuls3.createcafe.common.item.foods;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class SuperFood extends Item {
    public static final FoodProperties SUPER_DRINK = (new FoodProperties.Builder())
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 260, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 260, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 260, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 260, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 260, 1), 1.0F)
            .nutrition(8).saturationMod(0.2F).build();
    public SuperFood(Properties properties) {
        super(properties);
    }
}
