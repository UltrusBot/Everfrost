package me.ultrusmods.everfrost.client;

import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.function.BiConsumer;

public class EverfrostClient {

    public static void registerBlockRenderLayers(BiConsumer<Block, RenderType> consumer) {
        consumer.accept(EverfrostBlocks.MYRTLE_TRAPDOOR, RenderType.cutout());
        consumer.accept(EverfrostBlocks.MYRTLE_DOOR, RenderType.cutout());
        consumer.accept(EverfrostBlocks.MYRTLE_LEAVES, RenderType.cutoutMipped());
        consumer.accept(EverfrostBlocks.MYRTLE_SAPLING, RenderType.cutout());
        consumer.accept(EverfrostBlocks.POTTED_MYRTLE_SAPLING, RenderType.cutout());
    }
}
