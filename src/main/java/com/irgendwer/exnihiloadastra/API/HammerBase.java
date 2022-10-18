package com.irgendwer.exnihiloadastra.API;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;

import java.util.Collections;

public class HammerBase extends ItemTool {

    final int color;

    public HammerBase(String name, int durability, int color) {
        super(ToolMaterial.WOOD, Collections.emptySet());
        this.setTranslationKey(name);
        this.setRegistryName(name);
        this.setMaxDamage(durability);
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setHarvestLevel("pickaxe", 1);
        this.color = color;
    }

    public static void registerRender() {
        for (Item hammer : ExNihiloAPI.hammerList)
            ModelLoader.setCustomModelResourceLocation(hammer, 0, new ModelResourceLocation("exnihiloadastra:tools/hammer", "inventory"));
    }

    public static void registerColors() {
        final IItemColor ITEM_COLOR = (stack, tintIndex) -> tintIndex == 1 ? ((HammerBase) stack.getItem()).color : 0xFFFFFF;
        for (Item hammer : ExNihiloAPI.hammerList)
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler(ITEM_COLOR, hammer);
    }

    public static void registerHammers(RegistryEvent.Register<Item> event) {
        for (Item hammer : ExNihiloAPI.hammerList) {
            event.getRegistry().registerAll(hammer);
        }
    }
}
