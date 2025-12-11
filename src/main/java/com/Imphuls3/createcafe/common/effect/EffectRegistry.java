package com.Imphuls3.createcafe.common.effect;

import com.Imphuls3.createcafe.CreateCafe;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.*;

import static com.Imphuls3.createcafe.CreateCafe.modPath;

public class EffectRegistry {
    public static DeferredRegister<MobEffect> MOD_EFFECTS = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, CreateCafe.ID);

    public static Holder<MobEffect> CAFFINATED = MOD_EFFECTS.register("caffeinated",
            () -> new CaffinatedEffect(MobEffectCategory.BENEFICIAL, new Color(255, 200, 0).getRGB())
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED, modPath("effect/caffeinated"), 0.2F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static Holder<MobEffect> CAFFEINE_CRASH = MOD_EFFECTS.register("caffeine_crash",
            () -> new CrashEffect(MobEffectCategory.HARMFUL, new Color(20, 50, 110).getRGB())
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED, modPath("effect/caffeine_crash"), -0.15F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static void register(IEventBus eventBus) {
        MOD_EFFECTS.register(eventBus);
    }
}
