package com.irgendwer.exnihiloadastra.proxy;

import com.irgendwer.exnihiloadastra.common.blocks.BlockBaseFalling;
import com.irgendwer.exnihiloadastra.common.items.ItemsBase;
import com.irgendwer.exnihiloadastra.common.items.PebbleBase;
import com.irgendwer.exnihiloadastra.common.items.tools.CrookBase;
import com.irgendwer.exnihiloadastra.common.items.tools.HammerBase;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        HammerBase.registerRender();
        CrookBase.registerRender();
        PebbleBase.registerRender();
        ItemsBase.registerRender();
        BlockBaseFalling.registerRender();
    }

    @Override
    public void preInit() {

    }

    @Override
    public void init() {
        HammerBase.registerColors();
        CrookBase.registerColors();
    }

    @Override
    public void postInit() {

    }
}
