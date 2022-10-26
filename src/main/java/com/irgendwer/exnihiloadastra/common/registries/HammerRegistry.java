package com.irgendwer.exnihiloadastra.common.registries;


import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenCustomHashMap;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.*;

import static com.irgendwer.exnihiloadastra.Exnihiloadastra.logger;

public class HammerRegistry {
    public static final Hash.Strategy<ItemStack> ITEM_META_HASH_STRATEGY = new Hash.Strategy<ItemStack>() {

        @Override
        public int hashCode(ItemStack o) {
            return Objects.hash(o.getItem(), o.getMetadata());
        }

        @Override
        public boolean equals(ItemStack a, ItemStack b) {
            if (a == b) return true;
            if (a == null || b == null) return false;
            return (a.isEmpty() && b.isEmpty()) ||
                    (a.getItem() == b.getItem() && a.getMetadata() == b.getMetadata());
        }
    };

    private static final Object2ObjectOpenCustomHashMap<ItemStack, List<HammerRewards>> hammerRegistry = new Object2ObjectOpenCustomHashMap<>(ITEM_META_HASH_STRATEGY);

    public static void registerRecipe(@Nonnull ItemStack block, @Nonnull ItemStack reward, int amount, float chance) {
        if (hammerRegistry.get(block) != null) {
            logger.error(String.format("Recipe for %s is already registered for Hammer!", block.getDisplayName()));
            return;
        }
        hammerRegistry.put(block, Collections.singletonList(new HammerRewards(reward, amount, chance)));
    }

    public static void removeRecipe(@Nonnull ItemStack block) {
        if (hammerRegistry.get(block) == null) {
            logger.error(String.format("no Recipe for %s registered for Hammer!", block.getDisplayName()));
            return;
        }
        hammerRegistry.remove(block);
    }

    public static void clearAll() {
        hammerRegistry.clear();
    }
    public static ArrayList<ItemStack> getRegistry(@Nonnull ItemStack block, @Nonnull Random random) {
        ArrayList<ItemStack> rewards = new ArrayList<>();
        for (HammerRewards reward : hammerRegistry.get(block)) {
            if (random.nextFloat() <= reward.getChance()) {
                rewards.add(reward.getReward());
            }
        }
        return rewards;
    }
}
