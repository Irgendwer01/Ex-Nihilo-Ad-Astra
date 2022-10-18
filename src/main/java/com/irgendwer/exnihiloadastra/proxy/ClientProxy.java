package com.irgendwer.exnihiloadastra.proxy;


import com.irgendwer.exnihiloadastra.API.ExNihiloAPI;
import com.irgendwer.exnihiloadastra.API.HammerBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        HammerBase.registerRender();
    }
    @Override
    public void preInit() {

    }
    @Override
    public void init() {
            HammerBase.registerColors();
    }

    @Override
    public void postInit() {

    }
}
