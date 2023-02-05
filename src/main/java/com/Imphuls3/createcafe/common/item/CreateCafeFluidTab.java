package com.Imphuls3.createcafe.common.item;

import com.Imphuls3.createcafe.core.registry.FluidRegistry;
import com.Imphuls3.createcafe.core.registry.ItemRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreateCafeFluidTab {
    public static final CreativeModeTab CREATE_CAFE = new CreativeModeTab("createCafeFluidTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FluidRegistry.STRAWBERRY_TEA.getBucket().get());
        }
    };
}
