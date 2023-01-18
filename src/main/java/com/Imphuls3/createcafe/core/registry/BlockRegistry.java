package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.block.CassavaBlock;
import com.Imphuls3.createcafe.common.block.CoffeeBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry extends Blocks{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCafe.MOD_ID);

    //Crops:
    public static final RegistryObject<Block> COFFEE = BLOCKS.register("coffee_crop",
            () -> new CoffeeBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> CASSAVA = BLOCKS.register("cassava_crop",
            () -> new CassavaBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
