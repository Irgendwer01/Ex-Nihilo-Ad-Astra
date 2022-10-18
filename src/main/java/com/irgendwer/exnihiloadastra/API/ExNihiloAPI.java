package com.irgendwer.exnihiloadastra.API;

import net.minecraft.item.Item;

import java.util.ArrayList;

public class ExNihiloAPI {
    public static ArrayList<Item> hammerList = new ArrayList<>();
    public static void registerHammer(String name, int color, int durability) {
        hammerList.add(new HammerBase(name, durability, color));
    }
}
