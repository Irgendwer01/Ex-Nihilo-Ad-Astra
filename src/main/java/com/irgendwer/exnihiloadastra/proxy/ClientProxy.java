package com.irgendwer.exnihiloadastra.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.irgendwer.exnihiloadastra.API.ExNihiloAPI.color;
import static com.irgendwer.exnihiloadastra.API.ExNihiloAPI.hammer;


public class ClientProxy extends CommonProxy {
    @Override
    public void init() {
        final IItemColor ITEM_COLOR = (stack, tintIndex) ->
                tintIndex == 1 ? color : 0xFFFFFF;
        Minecraft.getMinecraft().getItemColors().registerItemColorHandler(ITEM_COLOR, hammer);
    }

    @Override
    public void preInit() {

    }

    @Override
    public void postInit() {

    }
}
