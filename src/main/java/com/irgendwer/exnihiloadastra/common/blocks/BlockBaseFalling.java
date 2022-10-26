package com.irgendwer.exnihiloadastra.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class BlockBaseFalling extends BlockFalling {

    public BlockBaseFalling(String name, SoundType sound) {
        super(Material.SAND);
        this.setTranslationKey(name);
        this.setSoundType(sound);
        this.setRegistryName(name);
        this.setCreativeTab(CreativeTabs.TOOLS);
    }

    public static void registerRender() {
        for (Block fallingBlocks : ModBlocks.fallingBlocks)
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(fallingBlocks), 0, new ModelResourceLocation(Item.getItemFromBlock(fallingBlocks).getRegistryName(), "inventory"));
    }
}
