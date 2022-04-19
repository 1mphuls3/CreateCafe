package com.Imphuls3.createcafe.common.block.custom;

import com.Imphuls3.createcafe.common.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class CoffeeBlock extends CropBlock {
    public CoffeeBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.COFFEE_BEANS.get();
    }
}
