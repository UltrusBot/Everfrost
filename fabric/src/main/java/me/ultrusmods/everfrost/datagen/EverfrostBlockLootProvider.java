package me.ultrusmods.everfrost.datagen;

import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

public class EverfrostBlockLootProvider extends FabricBlockLootTableProvider {
    protected EverfrostBlockLootProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(EverfrostBlocks.MYRTLE_LOG);
        dropSelf(EverfrostBlocks.STRIPPED_MYRTLE_LOG);
        dropSelf(EverfrostBlocks.MYRTLE_WOOD);
        dropSelf(EverfrostBlocks.STRIPPED_MYRTLE_WOOD);
        dropSelf(EverfrostBlocks.MYRTLE_PLANKS);
        dropSelf(EverfrostBlocks.MYRTLE_BUTTON);
        dropSelf(EverfrostBlocks.MYRTLE_FENCE);
        dropSelf(EverfrostBlocks.MYRTLE_FENCE_GATE);
        dropSelf(EverfrostBlocks.MYRTLE_PRESSURE_PLATE);
        createSlabItemTable(EverfrostBlocks.MYRTLE_SLAB);
        dropSelf(EverfrostBlocks.MYRTLE_STAIRS);
        dropSelf(EverfrostBlocks.MYRTLE_TRAPDOOR);
        add(EverfrostBlocks.MYRTLE_SLAB, this::createSlabItemTable);
        add(EverfrostBlocks.MYRTLE_DOOR, this::createDoorTable);
        dropSelf(EverfrostBlocks.MYRTLE_SAPLING);
        add(EverfrostBlocks.MYRTLE_LEAVES, block -> this.createLeavesDrops(block, EverfrostBlocks.MYRTLE_SAPLING, NORMAL_LEAVES_SAPLING_CHANCES));
        dropPottedContents(EverfrostBlocks.POTTED_MYRTLE_SAPLING);

        dropSelf(EverfrostBlocks.EVERFROST_DIRT);
        dropSelf(EverfrostBlocks.EVERFROST_SNOWY_DIRT);
        createDoublePlantShearsDrop(EverfrostBlocks.SNOWY_TALL_GRASS);

        dropSelf(EverfrostBlocks.COBBLED_GLACISTONE);
        this.add(EverfrostBlocks.GLACISTONE, block -> this.createSingleItemTableWithSilkTouch(block, EverfrostBlocks.COBBLED_GLACISTONE));

        dropSelf(EverfrostBlocks.GLACISTONE_SLAB);
        dropSelf(EverfrostBlocks.GLACISTONE_STAIRS);
        dropSelf(EverfrostBlocks.GLACISTONE_BUTTON);
        dropSelf(EverfrostBlocks.GLACISTONE_PRESSURE_PLATE);

        dropSelf(EverfrostBlocks.COBBLED_GLACISTONE_SLAB);
        dropSelf(EverfrostBlocks.COBBLED_GLACISTONE_STAIRS);
        dropSelf(EverfrostBlocks.COBBLED_GLACISTONE_WALL);

    }
}
