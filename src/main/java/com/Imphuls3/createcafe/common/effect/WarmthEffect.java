package com.Imphuls3.createcafe.common.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class WarmthEffect extends MobEffect {
    public WarmthEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        entity.setTicksFrozen(0);
        super.applyEffectTick(entity, amplifier);
    }
}
