package com.irgendwer.exnihiloadastra;

import com.irgendwer.exnihiloadastra.common.blocks.ModBlocks;
import com.irgendwer.exnihiloadastra.common.handlers.CrookHandler;
import com.irgendwer.exnihiloadastra.common.handlers.HammerHandler;
import com.irgendwer.exnihiloadastra.common.items.ModItems;
import com.irgendwer.exnihiloadastra.common.recipes.Default;
import com.irgendwer.exnihiloadastra.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = "exnihiloadastra", name = "Ex Nihilo Ad Astra", version = "0.1")
public class Exnihiloadastra {

    public static Logger logger = LogManager.getLogger("ExNihilo");
    @SidedProxy(clientSide = "com.irgendwer.exnihiloadastra.proxy.ClientProxy", serverSide = "com.irgendwer.exnihiloadastra.proxy.CommonProxy")
    static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.registerTools();
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        proxy.preInit();
        MinecraftForge.EVENT_BUS.register(new CrookHandler());
        MinecraftForge.EVENT_BUS.register(new HammerHandler());
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
