package com.irgendwer.exnihiloadastra.proxy;

import com.irgendwer.exnihiloadastra.common.blocks.ModBlocks;
import com.irgendwer.exnihiloadastra.common.items.ModItems;
import com.irgendwer.exnihiloadastra.common.recipes.Default;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "exnihiloadastra")
public class CommonProxy {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        Default.addRecipes();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.hammerList.toArray(new Item[0]));
        event.getRegistry().registerAll(ModItems.crookList.toArray(new Item[0]));
        event.getRegistry().registerAll(ModItems.items, ModItems.pebbles);

        for (Block fallingBlock : ModBlocks.fallingBlocks) {
            event.getRegistry().register(new ItemBlock(fallingBlock).setRegistryName(fallingBlock.getRegistryName()));
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        for (Block fallingBlock : ModBlocks.fallingBlocks) {
            event.getRegistry().register(fallingBlock);
        }
    }

    public void preInit() {
    }

    public void init() {
    }

    public void postInit() {
    }
}
