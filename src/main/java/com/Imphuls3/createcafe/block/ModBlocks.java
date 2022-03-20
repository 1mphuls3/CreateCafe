package com.Imphuls3.createcafe.block;

import com.Imphuls3.createcafe.CreateCafe;
import com.Imphuls3.createcafe.block.custom.CassavaBlock;
import com.Imphuls3.createcafe.block.custom.CoffeeBlock;
import com.Imphuls3.createcafe.item.ModCreativeModeTab;
import com.Imphuls3.createcafe.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks extends Blocks{
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateCafe.MOD_ID);

    //Crops:
    public static final RegistryObject<Block> COFFEE = BLOCKS.register("coffee_crop",
            () -> new CoffeeBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));

    public static final RegistryObject<Block> CASSAVA = BLOCKS.register("cassava_crop",
            () -> new CassavaBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));

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
}
