package com.irgendwer.exnihiloadastra.common.recipes;

import com.irgendwer.exnihiloadastra.common.registries.HammerRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class Default {
    public static void addRecipes() {
        HammerRegistry.registerRecipe(new ItemStack(Blocks.GRAVEL), new ItemStack(Blocks.SAND), 1, 1f);
    }
}
