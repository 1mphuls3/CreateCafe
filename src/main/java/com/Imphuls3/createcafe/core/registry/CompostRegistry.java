package com.Imphuls3.createcafe.core.registry;

import net.minecraft.world.level.block.ComposterBlock;

public class CompostRegistry {
    public static void register() {
        ComposterBlock.COMPOSTABLES.put(ItemRegistry.CASSAVA_SEEDS.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ItemRegistry.CASSAVA_SEEDS.get(), 0.3F);

        ComposterBlock.COMPOSTABLES.put(ItemRegistry.COFFEE_FRUIT.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(ItemRegistry.COFFEE_BEANS.get(), 0.3F);
    }
}
