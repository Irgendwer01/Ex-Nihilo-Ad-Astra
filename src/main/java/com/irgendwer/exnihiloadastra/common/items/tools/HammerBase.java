package com.irgendwer.exnihiloadastra.common.items.tools;

import com.irgendwer.exnihiloadastra.common.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Collections;

public class HammerBase extends ItemTool {

    final int color;

    public HammerBase(String name, int durability, int color) {
        super(ToolMaterial.WOOD, Collections.emptySet());
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setMaxDamage(durability);
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setHarvestLevel("hammer", 1);
        this.color = color;
    }

    public static void registerRender() {
        for (Item hammer : ModItems.hammerList)
            ModelLoader.setCustomModelResourceLocation(hammer, 0, new ModelResourceLocation("exnihiloadastra:tools/hammer", "inventory"));
    }

    public static void registerColors() {
        final IItemColor ITEM_COLOR = (stack, tintIndex) -> tintIndex == 1 ? ((HammerBase) stack.getItem()).color : 0xFFFFFF;
        for (Item hammer : ModItems.hammerList)
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler(ITEM_COLOR, hammer);
    }


}
