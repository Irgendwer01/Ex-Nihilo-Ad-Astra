package com.irgendwer.exnihiloadastra.proxy;

import com.irgendwer.exnihiloadastra.common.items.ModItems;
import com.irgendwer.exnihiloadastra.common.items.tools.CrookBase;
import com.irgendwer.exnihiloadastra.common.items.tools.HammerBase;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "exnihiloadastra")
public class CommonProxy {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.hammerList.toArray(new Item[0]));
        event.getRegistry().registerAll(ModItems.crookList.toArray(new Item[0]));
        event.getRegistry().registerAll(ModItems.items, ModItems.pebbles);
    }
    public void preInit() {

    }

    public void init() {
    }

    public void postInit() {
    }
}
