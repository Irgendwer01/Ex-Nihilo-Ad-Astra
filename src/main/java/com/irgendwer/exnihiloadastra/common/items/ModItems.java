package com.irgendwer.exnihiloadastra.common.items;

import com.irgendwer.exnihiloadastra.API.ExNihiloAPI;

public class ModItems {

    public static void registerTools() {
        ExNihiloAPI.registerHammer("wooden_hammer", 0x896727, 32);
        ExNihiloAPI.registerHammer("stone_hammer", 0x898989, 128);
        ExNihiloAPI.registerHammer("iron_hammer", 0xd8d8d8, 256);
        ExNihiloAPI.registerHammer("diamond_hammer", 0x33ebcb, 2048);
    }
}
