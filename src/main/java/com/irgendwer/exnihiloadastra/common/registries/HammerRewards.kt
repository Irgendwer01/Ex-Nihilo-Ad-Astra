package com.irgendwer.exnihiloadastra.common.registries

import net.minecraft.item.ItemStack

data class HammerRewards(
        val reward: ItemStack = ItemStack.EMPTY,
        val amount: Int = 0,
        val chance: Float = 0.0f
)
