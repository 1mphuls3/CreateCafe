package com.Imphuls3.createcafe.common.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class CaffinatedEffect extends MobEffect {
    public CaffinatedEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap map, int amplifier) {
        if(entity.canBeAffected(new MobEffectInstance(EffectRegistry.CAFFEINE_CRASH.get(), 5*20))) {
            entity.addEffect(new MobEffectInstance(EffectRegistry.CAFFEINE_CRASH.get(), 10*20, amplifier));
        }
        super.removeAttributeModifiers(entity, map, amplifier);
    }
}
