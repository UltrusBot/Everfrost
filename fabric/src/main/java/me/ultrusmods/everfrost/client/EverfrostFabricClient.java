package me.ultrusmods.everfrost.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;

public class EverfrostFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EverfrostClient.registerBlockRenderLayers(BlockRenderLayerMap.INSTANCE::putBlock);
    }
}
