package me.ultrusmods.everfrost.datagen;

import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

public class EverfrostModelProvider extends FabricModelProvider {
    public EverfrostModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.woodProvider(EverfrostBlocks.MYRTLE_LOG).logWithHorizontal(EverfrostBlocks.MYRTLE_LOG).wood(EverfrostBlocks.MYRTLE_WOOD);
        blockStateModelGenerator.woodProvider(EverfrostBlocks.STRIPPED_MYRTLE_LOG).logWithHorizontal(EverfrostBlocks.STRIPPED_MYRTLE_LOG).wood(EverfrostBlocks.STRIPPED_MYRTLE_WOOD);

        blockStateModelGenerator.family(EverfrostBlocks.MYRTLE_PLANKS).generateFor(EverfrostBlockFamilies.MYRTLE_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

    }
}
