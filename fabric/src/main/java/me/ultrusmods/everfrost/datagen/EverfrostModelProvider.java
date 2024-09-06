package me.ultrusmods.everfrost.datagen;

import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import me.ultrusmods.everfrost.registry.EverfrostItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.resources.ResourceLocation;

import static net.minecraft.data.models.BlockModelGenerators.createSimpleBlock;

public class EverfrostModelProvider extends FabricModelProvider {
    public EverfrostModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {

        blockStateModelGenerator.woodProvider(EverfrostBlocks.MYRTLE_LOG).logWithHorizontal(EverfrostBlocks.MYRTLE_LOG).wood(EverfrostBlocks.MYRTLE_WOOD);
        blockStateModelGenerator.woodProvider(EverfrostBlocks.STRIPPED_MYRTLE_LOG).logWithHorizontal(EverfrostBlocks.STRIPPED_MYRTLE_LOG).wood(EverfrostBlocks.STRIPPED_MYRTLE_WOOD);

        blockStateModelGenerator.family(EverfrostBlocks.MYRTLE_PLANKS).generateFor(EverfrostBlockFamilies.MYRTLE_PLANKS);
        blockStateModelGenerator.createTrivialBlock(EverfrostBlocks.MYRTLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.createPlant(EverfrostBlocks.MYRTLE_SAPLING, EverfrostBlocks.POTTED_MYRTLE_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);

        blockStateModelGenerator.createRotatedVariantBlock(EverfrostBlocks.EVERFROST_DIRT);

        ResourceLocation resourceLocation = TextureMapping.getBlockTexture(EverfrostBlocks.EVERFROST_DIRT);
        TextureMapping textureMapping = new TextureMapping()
                .put(TextureSlot.BOTTOM, resourceLocation)
                .copyForced(TextureSlot.BOTTOM, TextureSlot.PARTICLE)
                .put(TextureSlot.TOP, TextureMapping.getBlockTexture(EverfrostBlocks.EVERFROST_DIRT, "_top"))
                .put(TextureSlot.SIDE, TextureMapping.getBlockTexture(EverfrostBlocks.EVERFROST_DIRT, "_snow"));
        var res = ModelTemplates.CUBE_BOTTOM_TOP.create(
                EverfrostBlocks.EVERFROST_SNOWY_DIRT,
                textureMapping,
                blockStateModelGenerator.modelOutput
        );
        blockStateModelGenerator.blockStateOutput.accept(createSimpleBlock(EverfrostBlocks.EVERFROST_SNOWY_DIRT, res));

        blockStateModelGenerator.createDoublePlant(EverfrostBlocks.SNOWY_TALL_GRASS, BlockModelGenerators.TintState.NOT_TINTED);

        blockStateModelGenerator.family(EverfrostBlocks.GLACISTONE).generateFor(EverfrostBlockFamilies.GLACISTONE);
        blockStateModelGenerator.family(EverfrostBlocks.COBBLED_GLACISTONE).generateFor(EverfrostBlockFamilies.COBBLED_GLACISTONE);



    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(EverfrostItems.SNOWFLAKE_BANNER_PATTERN, ModelTemplates.FLAT_ITEM);

    }
}
