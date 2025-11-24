package com.Imphuls3.createcafe.common.events.loot;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;

public class AddItemModifier extends LootModifier {

    public static final MapCodec<AddItemModifier> CODEC = RecordCodecBuilder.mapCodec(inst ->
            LootModifier.codecStart(inst).and(inst.group(
                            BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(lm -> lm.addedItem),
                            Codec.intRange(0, Integer.MAX_VALUE).fieldOf("count").forGetter((lm) -> lm.count)
                    )).apply(inst, AddItemModifier::new)
    );

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
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}