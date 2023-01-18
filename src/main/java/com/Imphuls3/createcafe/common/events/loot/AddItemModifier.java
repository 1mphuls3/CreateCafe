package com.Imphuls3.createcafe.common.events.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class AddItemModifier extends LootModifier {

    public static final Supplier<Codec<AddItemModifier>> CODEC = Suppliers.memoize(() ->
            RecordCodecBuilder.create( instance ->
                    instance.group(
                            LOOT_CONDITIONS_CODEC.fieldOf("conditions").forGetter(lm -> lm.conditions),
                            ForgeRegistries.ITEMS.getCodec().fieldOf("item").forGetter(lm -> lm.addedItem),
                            Codec.intRange(0, Integer.MAX_VALUE).fieldOf("count").forGetter((lm) -> lm.count)
                    ).apply(instance, AddItemModifier::new)));

    private final Item addedItem;
    private final int count;

    protected AddItemModifier(LootItemCondition[] conditionsIn, Item addedItemIn, int count) {
        super(conditionsIn);
        this.addedItem = addedItemIn;
        this.count = count;
    }

    @Override
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        generatedLoot.add(new ItemStack(this.addedItem, count));
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}