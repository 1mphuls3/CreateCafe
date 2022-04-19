package com.Imphuls3.createcafe.common.block;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.common.block.custom.CassavaBlock;
import com.Imphuls3.createcafe.common.block.custom.CoffeeBlock;
import com.Imphuls3.createcafe.common.item.ModCreativeModeTab;
import com.Imphuls3.createcafe.common.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks extends Blocks{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCafe.MOD_ID);

    //Crops:
    public static final RegistryObject<Block> COFFEE = registerBlockWithoutBlockItem("coffee_crop",
            () -> new CoffeeBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> CASSAVA = registerBlockWithoutBlockItem("cassava_crop",
            () -> new CassavaBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
            RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn);
            return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.CREATE_CAFE)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
}
