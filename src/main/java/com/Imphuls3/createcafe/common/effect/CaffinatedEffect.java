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
    public void removeAttributeModifiers(AttributeMap attributeMap) {
        /*if(entity.canBeAffected(new MobEffectInstance(EffectRegistry.CAFFEINE_CRASH, 5*20))) {
            entity.addEffect(new MobEffectInstance(EffectRegistry.CAFFEINE_CRASH, 10*20, amplifier));
        }*/
        super.removeAttributeModifiers(attributeMap);
    }
}
