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
        return String.format("item.%s_pebble", Pebbles.values[stack.getItemDamage()].name);
    }

        public static void registerRender() {
            for (Pebbles pebbles : Pebbles.values())
            ModelLoader.setCustomModelResourceLocation(ModItems.pebbles, pebbles.ordinal(), new ModelResourceLocation("exnihiloadastra:pebbles", "type=" + pebbles.getName()));
        }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        if (tab != null && isInCreativeTab(tab)) {
            for (Pebbles pebbles : Pebbles.values()) {
                items.add(new ItemStack(ModItems.pebbles, 1, pebbles.ordinal()));
            }
        }
    }


    public enum Pebbles implements IStringSerializable {
        STONE("stone"),
        GRANITE("granite"),
        ANDESITE("andesite"),
        DIORITE("diorite");

        private final String name;
        public static final Pebbles[] values = values();

        Pebbles(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return this.name;
        }
    }
}
