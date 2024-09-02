package me.ultrusmods.everfrost.datagen;

import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

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

        this.add(EverfrostBlocks.MYRTLE_SLAB, this::createSlabItemTable);


    }
}
