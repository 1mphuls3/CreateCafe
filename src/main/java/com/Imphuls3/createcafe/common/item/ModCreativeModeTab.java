package com.Imphuls3.createcafe.common.item;

import com.Imphuls3.createcafe.core.registry.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATE_CAFE = new CreativeModeTab("createCafeTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.STRAWBERRY_TEA.get());
        }
    };
}
