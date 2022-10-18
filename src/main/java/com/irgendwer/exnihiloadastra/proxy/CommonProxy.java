package com.irgendwer.exnihiloadastra.proxy;

import com.irgendwer.exnihiloadastra.API.HammerBase;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = "exnihiloadastra")
public class CommonProxy {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        HammerBase.registerHammers(event);
    }
    public void preInit() {
    }

    public void init() {
    }

    public void postInit() {
    }
}
