package me.ultrusmods.everfrost.datagen;

import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import me.ultrusmods.everfrost.registry.EverfrostItems;
import me.ultrusmods.everfrost.tag.EverFrostBlockTags;
import me.ultrusmods.everfrost.tag.EverFrostItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class EverfrostTagProviders {

    public static class EverfrostBlockTagsProvider extends FabricTagProvider<Block> {

        public EverfrostBlockTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, Registries.BLOCK, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider wrapperLookup) {

            getOrCreateTagBuilder(EverFrostBlockTags.MYRTLE_LOGS)
                    .add(EverfrostBlocks.MYRTLE_LOG, EverfrostBlocks.STRIPPED_MYRTLE_LOG, EverfrostBlocks.MYRTLE_WOOD, EverfrostBlocks.STRIPPED_MYRTLE_WOOD);
            getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                    .add(EverfrostBlocks.MYRTLE_FENCE);
            getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                    .add(EverfrostBlocks.MYRTLE_BUTTON);
            getOrCreateTagBuilder(BlockTags.PLANKS)
                    .add(EverfrostBlocks.MYRTLE_PLANKS);
            getOrCreateTagBuilder(BlockTags.LOGS)
                    .addTag(EverFrostBlockTags.MYRTLE_LOGS);
            getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                    .addTag(EverFrostBlockTags.MYRTLE_LOGS);
            getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                    .add(EverfrostBlocks.MYRTLE_FENCE_GATE);
            getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                    .add(EverfrostBlocks.MYRTLE_PRESSURE_PLATE);
            getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                    .add(EverfrostBlocks.MYRTLE_SLAB);
            getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                    .add(EverfrostBlocks.MYRTLE_STAIRS);

            getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                    .add(EverfrostBlocks.MYRTLE_PLANKS,
                            EverfrostBlocks.MYRTLE_BUTTON,
                            EverfrostBlocks.MYRTLE_FENCE,
                            EverfrostBlocks.MYRTLE_FENCE_GATE,
                            EverfrostBlocks.MYRTLE_PRESSURE_PLATE,
                            EverfrostBlocks.MYRTLE_SLAB,
                            EverfrostBlocks.MYRTLE_STAIRS)
                    .addTag(EverFrostBlockTags.MYRTLE_LOGS);
            getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                    .add(EverfrostBlocks.MYRTLE_TRAPDOOR);

        }
    }

    public static class EverfrostItemTagsProvider extends FabricTagProvider<Item> {

        public EverfrostItemTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, Registries.ITEM, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider wrapperLookup) {
            getOrCreateTagBuilder(EverFrostItemTags.MYRTLE_LOGS)
                    .add(EverfrostItems.MYRTLE_LOG, EverfrostItems.STRIPPED_MYRTLE_LOG, EverfrostItems.MYRTLE_WOOD, EverfrostItems.STRIPPED_MYRTLE_WOOD);
        }
    }
}
