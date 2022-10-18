package com.irgendwer.exnihiloadastra.proxy;


import com.irgendwer.exnihiloadastra.API.ExNihiloAPI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    public static void registerColors() {
        for (int i = 0; i < ExNihiloAPI.colorHammer.size(); i++) {
            int finalI = i;
            final IItemColor ITEM_COLOR = (stack, tintIndex) -> tintIndex == 1 ? ExNihiloAPI.colorHammer.get(finalI) : 0xFFFFFF;
            Minecraft.getMinecraft().getItemColors().registerItemColorHandler(ITEM_COLOR, ExNihiloAPI.toolHammer.get(i));
        }
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        for (int i = 0; i < ExNihiloAPI.toolHammer.size(); i++)
            ModelLoader.setCustomModelResourceLocation(ExNihiloAPI.toolHammer.get(i), 0, new ModelResourceLocation("exnihiloadastra:tools/hammer", "inventory"));
    }
    @Override
    public void preInit() {

    }
    @Override
    public void init() {
        registerColors();
    }

    @Override
    public void postInit() {

    }
}
