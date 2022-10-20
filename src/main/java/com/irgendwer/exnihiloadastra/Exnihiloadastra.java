package com.irgendwer.exnihiloadastra;

import com.irgendwer.exnihiloadastra.common.handlers.CrookHandler;
import com.irgendwer.exnihiloadastra.common.items.ModItems;
import com.irgendwer.exnihiloadastra.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "exnihiloadastra", name = "Ex Nihilo Ad Astra", version = "0.1")
public class Exnihiloadastra {



    @SidedProxy(clientSide = "com.irgendwer.exnihiloadastra.proxy.ClientProxy", serverSide = "com.irgendwer.exnihiloadastra.proxy.CommonProxy")
    static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.registerTools();
        ModItems.registerItems();
        proxy.preInit();
        MinecraftForge.EVENT_BUS.register(new CrookHandler());
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
