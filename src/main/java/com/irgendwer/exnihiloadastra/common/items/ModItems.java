package com.irgendwer.exnihiloadastra.common.items;

import com.irgendwer.exnihiloadastra.common.items.tools.CrookBase;
import com.irgendwer.exnihiloadastra.common.items.tools.HammerBase;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class ModItems {
    public static ArrayList<Item> hammerList = new ArrayList<>();
    public static ArrayList<Item> crookList = new ArrayList<>();
    public static PebbleBase pebbles;
    public static ItemsBase items;

    public static void registerHammer(String name, int color, int durability) {
        hammerList.add(new HammerBase(name, durability, color));
    }

    public static void registerCrook(String name, int color, int durability) {
        crookList.add(new CrookBase(name, durability, color));
    }

    public static void registerTools() {
        //Hammers
        registerHammer("wooden_hammer", 0x896727, 32);
        registerHammer("stone_hammer", 0x898989, 128);
        registerHammer("iron_hammer", 0xd8d8d8, 256);
        registerHammer("diamond_hammer", 0x33ebcb, 2048);

        //Crooks
        registerCrook("wooden_crook", 0x896727, 32);
    }

    public static void registerItems() {
        pebbles = new PebbleBase();
        items = new ItemsBase();
    }
}
