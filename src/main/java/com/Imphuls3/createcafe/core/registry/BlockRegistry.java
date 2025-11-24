package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.block.CassavaBlock;
import com.Imphuls3.createcafe.common.block.CoffeeBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry extends Blocks{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CreateCafe.ID);

    //Crops:
    public static final DeferredBlock<Block> COFFEE = BLOCKS.register("coffee_crop",
            () -> new CoffeeBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion()));

    public static final DeferredBlock<Block> CASSAVA = BLOCKS.register("cassava_crop",
            () -> new CassavaBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).noOcclusion()));

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
