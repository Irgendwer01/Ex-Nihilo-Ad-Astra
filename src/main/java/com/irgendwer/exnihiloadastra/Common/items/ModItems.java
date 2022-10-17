package com.irgendwer.exnihiloadastra.Common.items;

import com.irgendwer.exnihiloadastra.API.ExNihiloAPI;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.irgendwer.exnihiloadastra.API.ExNihiloAPI.hammer;

@Mod.EventBusSubscriber(modid="exnihiloadastra")
public class ModItems {

    public static void registerTools() {
        ExNihiloAPI.registerHammer("wooden_hammer", 0x896727, 32);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(hammer);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(hammer, 0, new ModelResourceLocation("exnihiloadastra:tools/hammer", "inventory"));
    }
}
