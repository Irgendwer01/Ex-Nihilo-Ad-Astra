package com.irgendwer.exnihiloadastra.common.items.tools;

import com.irgendwer.exnihiloadastra.common.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

import java.util.Collections;

public class CrookBase extends ItemTool {
    final int color;
    public CrookBase(String name, int durability, int color) {
        super(ToolMaterial.WOOD, Collections.emptySet());
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setMaxDamage(durability);
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setHarvestLevel("crook", 1);
        this.color = color;
    }

    public static void registerRender() {
        for (Item crook : ModItems.crookList)
            ModelLoader.setCustomModelResourceLocation(crook, 0, new ModelResourceLocation("exnihiloadastra:tools/crook", "inventory"));
    }

    public static void registerColors() {
        final IItemColor ITEM_COLOR = (stack, tintIndex) -> ((CrookBase) stack.getItem()).color;
        for (Item crook : ModItems.crookList)
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler(ITEM_COLOR, crook);
    }
}
