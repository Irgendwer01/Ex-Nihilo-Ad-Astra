package com.irgendwer.exnihiloadastra.API;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemTool;

import java.util.Collections;

public class HammerBase extends ItemTool {

    public HammerBase(String name, int durability) {
        super(ToolMaterial.WOOD, Collections.emptySet());
        this.setTranslationKey(name);
        this.setRegistryName(name);
        this.setMaxDamage(durability);
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setHarvestLevel("Stone", 1);
    }

}
