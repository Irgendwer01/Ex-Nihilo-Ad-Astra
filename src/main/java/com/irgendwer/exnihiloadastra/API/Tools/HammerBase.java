package com.irgendwer.exnihiloadastra.API.Tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemTool;

import java.util.Collections;

public class HammerBase extends ItemTool {

    String name;
    int durability;

    public HammerBase(String name, int durability) {
        super(ToolMaterial.WOOD, Collections.emptySet());
        this.name = name;
        this.durability = durability;
        this.setTranslationKey(name);
        this.setRegistryName(name);
        this.setMaxDamage(durability);
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setHarvestLevel("Stone", 1);
    }
}
