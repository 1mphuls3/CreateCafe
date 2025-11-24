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
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import java.util.List;

public class IcedCoffeeDrinkMilk extends Item {
    String type;

    public IcedCoffeeDrinkMilk(Properties properties, String type) {
        super(properties);
        this.type = type;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("tooltip.createcafe.caffeinated").withStyle(ChatFormatting.BLUE));
        if(type != "none") tooltip.add(Component.translatable("tooltip.createcafe." + type).withStyle(ChatFormatting.BLUE));
        super.appendHoverText(stack, context, tooltip, tooltipFlag);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        super.finishUsingItem(stack, level, livingEntity);
        if (!level.isClientSide) livingEntity.removeAllEffects();
        if(CafeConfig.giveEmptyCups.get()) {
            if (livingEntity instanceof ServerPlayer serverplayer) {
                CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, stack);
                serverplayer.awardStat(Stats.ITEM_USED.get(this));
            }

            if (stack.isEmpty()) {
                return new ItemStack(ItemRegistry.ICED_COFFEE_CUP.get());
            } else {
                if (livingEntity instanceof Player && !((Player)livingEntity).getAbilities().instabuild) {
                    ItemStack itemstack = new ItemStack(ItemRegistry.ICED_COFFEE_CUP.get());
                    Player player = (Player)livingEntity;
                    if (!player.getInventory().add(itemstack)) {
                        player.drop(itemstack, false);
                    }
                }
            }
        }
        return stack;
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
