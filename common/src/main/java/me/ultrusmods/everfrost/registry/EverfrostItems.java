package me.ultrusmods.everfrost.registry;

import me.ultrusmods.everfrost.tag.EverfrostMiscTags;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BannerPatternItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;

public class EverfrostItems {

    @RegisterId("myrtle_log")
    public static final Item MYRTLE_LOG = new BlockItem(EverfrostBlocks.MYRTLE_LOG, new Item.Properties());

    @RegisterId("stripped_myrtle_log")
    public static final Item STRIPPED_MYRTLE_LOG = new BlockItem(EverfrostBlocks.STRIPPED_MYRTLE_LOG, new Item.Properties());

    @RegisterId("myrtle_wood")
    public static final Item MYRTLE_WOOD = new BlockItem(EverfrostBlocks.MYRTLE_WOOD, new Item.Properties());

    @RegisterId("stripped_myrtle_wood")
    public static final Item STRIPPED_MYRTLE_WOOD = new BlockItem(EverfrostBlocks.STRIPPED_MYRTLE_WOOD, new Item.Properties());

    @RegisterId("myrtle_planks")
    public static final Item MYRTLE_PLANKS = new BlockItem(EverfrostBlocks.MYRTLE_PLANKS, new Item.Properties());

    @RegisterId("myrtle_button")
    public static final Item MYRTLE_BUTTON = new BlockItem(EverfrostBlocks.MYRTLE_BUTTON, new Item.Properties());

    @RegisterId("myrtle_fence")
    public static final Item MYRTLE_FENCE = new BlockItem(EverfrostBlocks.MYRTLE_FENCE, new Item.Properties());

    @RegisterId("myrtle_fence_gate")
    public static final Item MYRTLE_FENCE_GATE = new BlockItem(EverfrostBlocks.MYRTLE_FENCE_GATE, new Item.Properties());

    @RegisterId("myrtle_pressure_plate")
    public static final Item MYRTLE_PRESSURE_PLATE = new BlockItem(EverfrostBlocks.MYRTLE_PRESSURE_PLATE, new Item.Properties());

    @RegisterId("myrtle_slab")
    public static final Item MYRTLE_SLAB = new BlockItem(EverfrostBlocks.MYRTLE_SLAB, new Item.Properties());

    @RegisterId("myrtle_stairs")
    public static final Item MYRTLE_STAIRS = new BlockItem(EverfrostBlocks.MYRTLE_STAIRS, new Item.Properties());

    @RegisterId("myrtle_trapdoor")
    public static final Item MYRTLE_TRAPDOOR = new BlockItem(EverfrostBlocks.MYRTLE_TRAPDOOR, new Item.Properties());

    @RegisterId("myrtle_door")
    public static final Item MYRTLE_DOOR = new BlockItem(EverfrostBlocks.MYRTLE_DOOR, new Item.Properties());

    @RegisterId("myrtle_leaves")
    public static final Item MYRTLE_LEAVES = new BlockItem(EverfrostBlocks.MYRTLE_LEAVES, new Item.Properties());

    @RegisterId("snowflake_banner_pattern")
    public static final Item SNOWFLAKE_BANNER_PATTERN = new BannerPatternItem(EverfrostMiscTags.SNOWFLAKE_PATTERN, new Item.Properties());

    @RegisterId("myrtle_sapling")
    public static final Item MYRTLE_SAPLING = new BlockItem(EverfrostBlocks.MYRTLE_SAPLING, new Item.Properties());

    @RegisterId("everfrost_dirt")
    public static final Item EVERFROST_DIRT = new BlockItem(EverfrostBlocks.EVERFROST_DIRT, new Item.Properties());

    @RegisterId("everfrost_snowy_dirt")
    public static final Item EVERFROST_SNOWY_DIRT = new BlockItem(EverfrostBlocks.EVERFROST_SNOWY_DIRT, new Item.Properties());

    @RegisterId("snowy_tall_grass")
    public static final Item SNOWY_TALL_GRASS = new DoubleHighBlockItem(EverfrostBlocks.SNOWY_TALL_GRASS, new Item.Properties());

    @RegisterId("glacistone")
    public static final Item GLACISTONE = new BlockItem(EverfrostBlocks.GLACISTONE, new Item.Properties());

    @RegisterId("glacistone_slab")
    public static final Item GLACISTONE_SLAB = new BlockItem(EverfrostBlocks.GLACISTONE_SLAB, new Item.Properties());

    @RegisterId("glacistone_stairs")
    public static final Item GLACISTONE_STAIRS = new BlockItem(EverfrostBlocks.GLACISTONE_STAIRS, new Item.Properties());

    @RegisterId("glacistone_button")
    public static final Item GLACISTONE_BUTTON = new BlockItem(EverfrostBlocks.GLACISTONE_BUTTON, new Item.Properties());

    @RegisterId("glacistone_pressure_plate")
    public static final Item GLACISTONE_PRESSURE_PLATE = new BlockItem(EverfrostBlocks.GLACISTONE_PRESSURE_PLATE, new Item.Properties());

    @RegisterId("cobbled_glacistone")
    public static final Item COBBLED_GLACISTONE = new BlockItem(EverfrostBlocks.COBBLED_GLACISTONE, new Item.Properties());

    @RegisterId("cobbled_glacistone_slab")
    public static final Item COBBLED_GLACISTONE_SLAB = new BlockItem(EverfrostBlocks.COBBLED_GLACISTONE_SLAB, new Item.Properties());

    @RegisterId("cobbled_glacistone_stairs")
    public static final Item COBBLED_GLACISTONE_STAIRS = new BlockItem(EverfrostBlocks.COBBLED_GLACISTONE_STAIRS, new Item.Properties());

    @RegisterId("cobbled_glacistone_wall")
    public static final Item COBBLED_GLACISTONE_WALL = new BlockItem(EverfrostBlocks.COBBLED_GLACISTONE_WALL, new Item.Properties());

    public static void init() {
        RegisterUtils.register(EverfrostItems.class, BuiltInRegistries.ITEM);
    }
}
