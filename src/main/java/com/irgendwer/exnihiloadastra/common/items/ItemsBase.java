package com.irgendwer.exnihiloadastra.common.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.model.ModelLoader;

import javax.annotation.Nonnull;

public class ItemsBase extends Item {

    public ItemsBase() {
        this.setTranslationKey("resource");
        this.setRegistryName("resource");
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setHasSubtypes(true);
    }

    @Override
    @Nonnull
    public String getTranslationKey(@Nonnull ItemStack stack) {
        return String.format("item.%s", Items.values[stack.getItemDamage()].getName());
    }

    public static void registerRender() {
        for (Items items : Items.values())
            ModelLoader.setCustomModelResourceLocation(ModItems.items, items.getMetadata(), new ModelResourceLocation("exnihiloadastra:items", "type=" + items.getName()));
    }
    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
        if (tab != null && isInCreativeTab(tab)) {
            for (Items items : Items.values()) {
                list.add(new ItemStack(ModItems.items, 1, items.ordinal()));
            }
        }
    }


    public enum Items {
        SILKWORM("silkworm", 0);

        private final String name;
        private final int metadata;
        public static final Items[] values = values();

        Items(String name, int metadata) {
            this.name = name;
            this.metadata = metadata;
        }

        @Nonnull
        public String getName() {
            return this.name;
        }

        @Nonnull
        public Integer getMetadata() {
            return this.metadata;
        }
    }
}