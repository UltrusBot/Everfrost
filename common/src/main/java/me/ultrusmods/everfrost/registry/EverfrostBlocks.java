package me.ultrusmods.everfrost.registry;

import me.ultrusmods.everfrost.platform.Services;
import me.ultrusmods.everfrost.registry.worldgen.EverfrostTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class EverfrostBlocks {

    @RegisterId("myrtle_log")
    public static final Block MYRTLE_LOG = log(MapColor.TERRACOTTA_RED, MapColor.COLOR_MAGENTA);

    @RegisterId("stripped_myrtle_log")
    public static final Block STRIPPED_MYRTLE_LOG = log(MapColor.COLOR_MAGENTA, MapColor.COLOR_MAGENTA);

    @RegisterId("myrtle_wood")
    public static final Block MYRTLE_WOOD = new RotatedPillarBlock(
            BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()
    );

    @RegisterId("stripped_myrtle_wood")
    public static final Block STRIPPED_MYRTLE_WOOD = new RotatedPillarBlock(
            BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()
    );

    @RegisterId("myrtle_planks")
    public static final Block MYRTLE_PLANKS = new Block(
            BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()
    );

    @RegisterId("myrtle_button")
    public static final Block MYRTLE_BUTTON = woodenButton(EverfrostBlockSetTypes.MYRTLE);

    @RegisterId("myrtle_fence")
    public static final Block MYRTLE_FENCE = new FenceBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MYRTLE_PLANKS.defaultMapColor())
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    );

    @RegisterId("myrtle_fence_gate")
    public static final Block MYRTLE_FENCE_GATE = new FenceGateBlock(
            EverfrostBlockSetTypes.MYRTLE_WOOD,
            BlockBehaviour.Properties.of()
                    .mapColor(MYRTLE_PLANKS.defaultMapColor())
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    );

    @RegisterId("myrtle_pressure_plate")
    public static final Block MYRTLE_PRESSURE_PLATE = new PressurePlateBlock(
            EverfrostBlockSetTypes.MYRTLE,
            BlockBehaviour.Properties.of()
                    .mapColor(MYRTLE_PLANKS.defaultMapColor())
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASS)
                    .noCollission()
                    .strength(0.5F)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
    );

    @RegisterId("myrtle_slab")
    public static final Block MYRTLE_SLAB = new SlabBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MYRTLE_PLANKS.defaultMapColor())
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    );
    @RegisterId("myrtle_stairs")
    public static final Block MYRTLE_STAIRS = new StairBlock(
            MYRTLE_PLANKS.defaultBlockState(),
            BlockBehaviour.Properties.of()
                    .mapColor(MYRTLE_PLANKS.defaultMapColor())
                    .strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    );
    @RegisterId("myrtle_trapdoor")
    public static final Block MYRTLE_TRAPDOOR = new TrapDoorBlock(
            EverfrostBlockSetTypes.MYRTLE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(3.0F)
                    .noOcclusion()
                    .isValidSpawn(Blocks::never).ignitedByLava()
    );
    @RegisterId("myrtle_door")
    public static final Block MYRTLE_DOOR = new DoorBlock(
            EverfrostBlockSetTypes.MYRTLE,
            BlockBehaviour.Properties.of()
                    .mapColor(MYRTLE_PLANKS.defaultMapColor())
                    .strength(3.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()
    );
    @RegisterId("myrtle_leaves")
    public static final Block MYRTLE_LEAVES = leaves(SoundType.GRASS);

    @RegisterId("myrtle_sapling")
    public static final Block MYRTLE_SAPLING = new SaplingBlock(
            EverfrostTreeGrowers.MYRTLE,
            BlockBehaviour.Properties.of()
                    .noCollission()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .pushReaction(PushReaction.DESTROY)
    );
    @RegisterId("potted_myrtle_sapling")
    public static final Block POTTED_MYRTLE_SAPLING = new FlowerPotBlock(MYRTLE_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY));

    @RegisterId("everfrost_dirt")
    public static final Block EVERFROST_DIRT = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.5F)
                    .sound(SoundType.GRAVEL)
    );

    @RegisterId("everforst_snowy_dirt")
    public static final Block EVERFROST_SNOWY_DIRT = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(0.5F)
                    .sound(SoundType.GRAVEL)
    );

    @RegisterId("snowy_tall_grass")
    public static final Block SNOWY_TALL_GRASS = new DoublePlantBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .replaceable()
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    .ignitedByLava()
                    .pushReaction(PushReaction.DESTROY)
    );

    @RegisterId("glacistone")
    public static final Block GLACISTONE = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
    );
    @RegisterId("glacistone_slab")
    public static final Block GLACISTONE_SLAB = new SlabBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
    );
    @RegisterId("glacistone_stairs")
    public static final Block GLACISTONE_STAIRS = new StairBlock(
            GLACISTONE.defaultBlockState(),
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)
    );
    @RegisterId("glacistone_button")
    public static final Block GLACISTONE_BUTTON = stoneButton();

    @RegisterId("glacistone_pressure_plate")
    public static final Block GLACISTONE_PRESSURE_PLATE = new PressurePlateBlock(
            EverfrostBlockSetTypes.GLACISTONE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .forceSolidOn()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .noCollission()
                    .strength(0.5F)
                    .ignitedByLava()
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.DESTROY)
    );

    @RegisterId("cobbled_glacistone")
    public static final Block COBBLED_GLACISTONE = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );

    @RegisterId("cobbled_glacistone_slab")
    public static final Block COBBLED_GLACISTONE_SLAB = new SlabBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );

    @RegisterId("cobbled_glacistone_stairs")
    public static final Block COBBLED_GLACISTONE_STAIRS = new StairBlock(
            COBBLED_GLACISTONE.defaultBlockState(),
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );

    @RegisterId("cobbled_glacistone_wall")
    public static final Block COBBLED_GLACISTONE_WALL = new WallBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 6.0F)
    );


    public static void init() {
        RegisterUtils.register(EverfrostBlocks.class, BuiltInRegistries.BLOCK);
    }

    public static void registerStrippableBlocks() {
        Services.PLATFORM.addStrippableBlock(MYRTLE_LOG, STRIPPED_MYRTLE_LOG);
        Services.PLATFORM.addStrippableBlock(MYRTLE_WOOD, STRIPPED_MYRTLE_WOOD);
    }


    public static Block log(MapColor mapColor, MapColor mapColor2) {
        return new RotatedPillarBlock(
                BlockBehaviour.Properties.of()
                        .mapColor(blockState -> blockState.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? mapColor : mapColor2)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0F)
                        .sound(SoundType.WOOD)
                        .ignitedByLava()
        );
    }

    public static Block woodenButton(BlockSetType blockSetType) {
        return new ButtonBlock(blockSetType, 30, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
    }
    public static Block stoneButton() {
        return new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
    }

    private static Block leaves(SoundType soundType) {
        return new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).strength(0.2F).randomTicks().sound(soundType).noOcclusion().isValidSpawn(Blocks::ocelotOrParrot).isSuffocating(EverfrostBlocks::never).isViewBlocking(EverfrostBlocks::never).ignitedByLava().pushReaction(PushReaction.DESTROY).isRedstoneConductor(EverfrostBlocks::never));
    }

    private static boolean never(BlockState state, BlockGetter blockGetter, BlockPos pos) {
        return false;
    }
}
