package com.irgendwer.exnihiloadastra.common.handlers;

import com.irgendwer.exnihiloadastra.common.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CrookHandler {

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void crook(BlockEvent.HarvestDropsEvent event) {
        if (event.getWorld().isRemote)
            return;

        if (event.getHarvester() == null)
            return;

        if (event.isSilkTouching())
            return;

        ItemStack stack = event.getHarvester().getHeldItemMainhand();
        if (!stack.getItem().getToolClasses(stack).contains("crook"))
            return;

        if (event.getWorld().rand.nextFloat() <= 1f) {
            event.getDrops().add(ModItems.items.setMaxDamage(0).getDefaultInstance());
        }

        if (event.getState().getBlock() instanceof BlockLeaves) {
            Block block = event.getState().getBlock();
            int fortune = event.getFortuneLevel();
            java.util.List<ItemStack> items = block.getDrops(event.getWorld(), event.getPos(), event.getState(), fortune);
            for (ItemStack item : items) {
                if (event.getWorld().rand.nextFloat() <= 1f)
                    block.spawnAsEntity(event.getWorld(), event.getPos(), item);
            }
        }
    }
}
