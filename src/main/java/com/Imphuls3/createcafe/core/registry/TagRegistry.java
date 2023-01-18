package com.Imphuls3.createcafe.core.registry;

import com.Imphuls3.createcafe.CreateCafe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class TagRegistry {
    public static class Fluids {
        public static final TagKey<Fluid> TEA = createCafeTag("tea");
        private static final TagKey<Fluid> createCafeTag(String name) {
            return net.minecraft.tags.FluidTags.create(new ResourceLocation(CreateCafe.MOD_ID, name));
        }

        public static final TagKey<Fluid> forgeTag(String name) {
            return FluidTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        private static final TagKey<Block> createCafeTag(String name) {
            return net.minecraft.tags.BlockTags.create(new ResourceLocation(CreateCafe.MOD_ID, name));
        }

        public static final TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        private static TagKey<Item> createCafeTag(String name) {
            return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(CreateCafe.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
