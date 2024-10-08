package me.ultrusmods.everfrost.datagen;

import me.ultrusmods.everfrost.registry.EverfrostBannerPatterns;
import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import me.ultrusmods.everfrost.registry.EverfrostItems;
import me.ultrusmods.everfrost.tag.EverFrostBlockTags;
import me.ultrusmods.everfrost.tag.EverFrostItemTags;
import me.ultrusmods.everfrost.tag.EverfrostMiscTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BannerPattern;

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
                            EverfrostBlocks.MYRTLE_STAIRS,
                            EverfrostBlocks.MYRTLE_DOOR,
                            EverfrostBlocks.MYRTLE_TRAPDOOR
                    )
                    .addTag(EverFrostBlockTags.MYRTLE_LOGS);
            getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                    .add(EverfrostBlocks.MYRTLE_TRAPDOOR);
            getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                    .add(EverfrostBlocks.MYRTLE_DOOR);

            getOrCreateTagBuilder(BlockTags.SAPLINGS)
                    .add(EverfrostBlocks.MYRTLE_SAPLING);
            getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                    .add(EverfrostBlocks.POTTED_MYRTLE_SAPLING);

            getOrCreateTagBuilder(BlockTags.DIRT)
                    .add(EverfrostBlocks.EVERFROST_DIRT)
                    .add(EverfrostBlocks.EVERFROST_SNOWY_DIRT);

            getOrCreateTagBuilder(BlockTags.STONE_PRESSURE_PLATES)
                    .add(EverfrostBlocks.GLACISTONE_PRESSURE_PLATE);

            getOrCreateTagBuilder(BlockTags.STONE_BUTTONS)
                    .add(EverfrostBlocks.GLACISTONE_BUTTON);

            getOrCreateTagBuilder(BlockTags.SLABS)
                    .add(EverfrostBlocks.GLACISTONE_SLAB)
                    .add(EverfrostBlocks.COBBLED_GLACISTONE_SLAB);

            getOrCreateTagBuilder(BlockTags.STAIRS)
                    .add(EverfrostBlocks.GLACISTONE_STAIRS)
                    .add(EverfrostBlocks.COBBLED_GLACISTONE_STAIRS);

            getOrCreateTagBuilder(BlockTags.WALLS)
                    .add(EverfrostBlocks.COBBLED_GLACISTONE_WALL);

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
            getOrCreateTagBuilder(ItemTags.PLANKS)
                    .add(EverfrostItems.MYRTLE_PLANKS);
            getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                    .add(EverfrostItems.MYRTLE_BUTTON);
            getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                    .add(EverfrostItems.MYRTLE_DOOR);
            getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                    .add(EverfrostItems.MYRTLE_FENCE);
            getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                    .add(EverfrostItems.MYRTLE_PRESSURE_PLATE);
            getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                    .add(EverfrostItems.MYRTLE_SLAB);
            getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                    .add(EverfrostItems.MYRTLE_STAIRS);
            getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                    .add(EverfrostItems.MYRTLE_TRAPDOOR);
            getOrCreateTagBuilder(ItemTags.SAPLINGS)
                    .add(EverfrostItems.MYRTLE_SAPLING);
            getOrCreateTagBuilder(ItemTags.WALLS)
                    .add(EverfrostItems.COBBLED_GLACISTONE_WALL);
            getOrCreateTagBuilder(ItemTags.SLABS)
                    .add(EverfrostItems.GLACISTONE_SLAB, EverfrostItems.COBBLED_GLACISTONE_SLAB);
            getOrCreateTagBuilder(ItemTags.STAIRS)
                    .add(EverfrostItems.GLACISTONE_STAIRS, EverfrostItems.COBBLED_GLACISTONE_STAIRS);
            getOrCreateTagBuilder(ItemTags.BUTTONS)
                    .add(EverfrostItems.GLACISTONE_BUTTON);
        }

    }

    public static class EverfrostBannerTagsProvider extends FabricTagProvider<BannerPattern> {

        public EverfrostBannerTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, Registries.BANNER_PATTERN, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider wrapperLookup) {
            this.tag(EverfrostMiscTags.SNOWFLAKE_PATTERN).add(EverfrostBannerPatterns.SNOWFLAKE);
        }
    }
}
