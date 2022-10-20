package com.irgendwer.exnihiloadastra.common.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraftforge.client.model.ModelLoader;

import javax.annotation.Nonnull;

public class PebbleBase extends Item {

    public PebbleBase() {
        this.setTranslationKey("pebble");
        this.setRegistryName("pebble");
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setHasSubtypes(true);
    }

    @Override
    @Nonnull
    public String getTranslationKey(@Nonnull ItemStack stack) {
        return String.format("item.%s_pebble", Pebbles.values[stack.getItemDamage()].getName());
    }

        public static void registerRender() {
            for (Pebbles pebbles : Pebbles.values())
            ModelLoader.setCustomModelResourceLocation(ModItems.pebbles, pebbles.getMetadata(), new ModelResourceLocation("exnihiloadastra:pebbles", "type=" + pebbles.getName()));
        }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        if (tab != null && isInCreativeTab(tab)) {
            for (Pebbles pebbles : Pebbles.values()) {
                items.add(new ItemStack(ModItems.pebbles, 1, pebbles.ordinal()));
            }
        }
    }


    public enum Pebbles {
        STONE("stone", 0),
        GRANITE("granite", 1),
        ANDESITE("andesite", 2),
        DIORITE("diorite", 3);

        private final String name;
        private final int metadata;
        public static final Pebbles[] values = values();

        Pebbles(String name, int metadata) {
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
