package com.irgendwer.exnihiloadastra.API;

import net.minecraft.item.Item;

import java.util.ArrayList;

public class ExNihiloAPI {

    public static ArrayList<Item> toolHammer = new ArrayList<>();
    public static ArrayList<Integer> colorHammer = new ArrayList<>();
    public static void registerHammer(String name, int color, int durability) {
        toolHammer.add(new HammerBase(name, durability));
        colorHammer.add(color);
    }
}
