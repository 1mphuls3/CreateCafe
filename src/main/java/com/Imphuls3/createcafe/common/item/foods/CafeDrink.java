package com.Imphuls3.createcafe.common.item.foods;

import com.Imphuls3.createcafe.config.CafeConfig;
import com.Imphuls3.createcafe.core.registry.ItemRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CafeDrink extends Item {
    String type;

    public CafeDrink(Properties properties, String type) {
        super(properties);
        this.type = type;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag advanced) {
        super.appendHoverText(stack, level, tooltip, advanced);
        tooltip.add(Component.translatable("tooltip.createcafe." + type).withStyle(ChatFormatting.BLUE));
    }

    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        super.finishUsingItem(stack, level, livingEntity);
        if (livingEntity instanceof ServerPlayer serverplayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, stack);
            serverplayer.awardStat(Stats.ITEM_USED.get(this));
        }

        if (!level.isClientSide) {
            livingEntity.removeEffect(MobEffects.POISON);
        }

        if (stack.isEmpty()) {
            return new ItemStack(ItemRegistry.EMPTY_BOBA_CUP.get());
        } else {
            if (livingEntity instanceof Player && !((Player)livingEntity).getAbilities().instabuild) {
                ItemStack itemstack = new ItemStack(ItemRegistry.EMPTY_BOBA_CUP.get());
                Player player = (Player)livingEntity;
                if (!player.getInventory().add(itemstack)) {
                    player.drop(itemstack, false);
                }
            }
            return stack;
        }
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }

    @Override
    public SoundEvent getDrinkingSound() {
        return SoundEvents.GENERIC_DRINK;
    }
}
