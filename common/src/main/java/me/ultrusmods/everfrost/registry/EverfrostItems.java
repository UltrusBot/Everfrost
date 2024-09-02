package me.ultrusmods.everfrost.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
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

    public static void init() {
        RegisterUtils.register(EverfrostItems.class, BuiltInRegistries.ITEM);
    }
}
