package me.ultrusmods.everfrost.client;

import me.ultrusmods.everfrost.Constants;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EverfrostClientNeoforge {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        EverfrostClient.registerBlockRenderLayers(ItemBlockRenderTypes::setRenderLayer);
    }

}
