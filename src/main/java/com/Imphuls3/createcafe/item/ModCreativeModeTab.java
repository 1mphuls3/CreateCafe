package com.Imphuls3.createcafe.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATE_CAFE = new CreativeModeTab("createCafeTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STRAWBERRY_TEA.get());
        }
    };
}
