package me.ultrusmods.everfrost.client;

import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class EverfrostFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                EverfrostBlocks.MYRTLE_TRAPDOOR
        );
    }
}
