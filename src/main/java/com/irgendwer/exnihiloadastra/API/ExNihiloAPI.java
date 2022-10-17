package com.irgendwer.exnihiloadastra.API;

import com.irgendwer.exnihiloadastra.API.Tools.HammerBase;
import net.minecraft.item.Item;

public class ExNihiloAPI {

    public static Item hammer;
    public static int color;

    public static void registerHammer(String name, int color, int durability) {
        hammer = new HammerBase(name, durability);
        ExNihiloAPI.color = color;
    }
}
