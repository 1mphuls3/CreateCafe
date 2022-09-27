package com.Imphuls3.createcafe.common.item.foods;

import com.Imphuls3.createcafe.config.CafeConfig;
import com.Imphuls3.createcafe.core.registry.ItemRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
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
        ItemStack itemstack = super.finishUsingItem(stack, level, livingEntity);
        return livingEntity instanceof Player && ((Player)livingEntity).getAbilities().instabuild || !CafeConfig.giveEmptyCups.get() ? itemstack
                : new ItemStack(ItemRegistry.EMPTY_BOBA_CUP.get());
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
