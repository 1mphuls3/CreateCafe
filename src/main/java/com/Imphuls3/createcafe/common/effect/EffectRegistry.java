package com.Imphuls3.createcafe.common.effect;

import com.Imphuls3.createcafe.CreateCafe;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class EffectRegistry {
    public static DeferredRegister<MobEffect> MOD_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CreateCafe.ID);
    public static RegistryObject<MobEffect> CAFFINATED = MOD_EFFECTS.register("caffeinated",
            () -> new CaffinatedEffect(MobEffectCategory.BENEFICIAL, new Color(255, 200, 0).getRGB())
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2F, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static RegistryObject<MobEffect> CAFFEINE_CRASH = MOD_EFFECTS.register("caffeine_crash",
            () -> new CrashEffect(MobEffectCategory.HARMFUL, new Color(20, 50, 110).getRGB())
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15F, AttributeModifier.Operation.MULTIPLY_TOTAL));
    public static void register(IEventBus eventBus) {
        MOD_EFFECTS.register(eventBus);
    }
}
