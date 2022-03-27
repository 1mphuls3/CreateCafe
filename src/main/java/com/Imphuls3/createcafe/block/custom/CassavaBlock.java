package com.Imphuls3.createcafe.block.custom;

import com.Imphuls3.createcafe.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

public class CassavaBlock extends CropBlock {

    public CassavaBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.CASSAVA_SEEDS.get();
    }
}
