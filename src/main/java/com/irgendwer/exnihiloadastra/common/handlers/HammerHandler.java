package com.irgendwer.exnihiloadastra.common.handlers;

import com.irgendwer.exnihiloadastra.common.registries.HammerRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.ArrayList;

public class HammerHandler {

    @SubscribeEvent(priority = EventPriority.LOW)
    public void hammer(BlockEvent.HarvestDropsEvent event) {
        if (event.getWorld().isRemote || event.getHarvester() == null || event.isSilkTouching()) {
            return;
        }
        
        ItemStack stack = event.getHarvester().getHeldItemMainhand();
        if (!stack.getItem().getToolClasses(stack).contains("hammer")) {
            return;
        }

        ArrayList<ItemStack> rewards = HammerRegistry.getRegistry(new ItemStack(event.getState().getBlock(), 1, event.getState().getBlock().getMetaFromState(event.getState())), event.getWorld().rand);
        if (rewards != null) {
            event.getDrops().clear();
            event.setDropChance(1.0F);
            event.getDrops().addAll(rewards);
        }
    }
}
