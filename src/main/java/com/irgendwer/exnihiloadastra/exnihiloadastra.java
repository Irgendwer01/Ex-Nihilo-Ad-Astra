package com.irgendwer.exnihiloadastra;

import com.irgendwer.exnihiloadastra.Common.items.ModItems;
import com.irgendwer.exnihiloadastra.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "exnihiloadastra", name = "Ex Nihilo Ad Astra", version = "0.1")
public class exnihiloadastra {



    @SidedProxy(clientSide = "com.irgendwer.exnihiloadastra.proxy.ClientProxy", serverSide = "com.irgendwer.exnihiloadastra.proxy.CommonProxy")
    static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.registerTools();
        proxy.preInit();
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
