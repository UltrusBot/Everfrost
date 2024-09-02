package me.ultrusmods.everfrost.registry;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
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


    public static void init() {
        RegisterUtils.register(EverfrostBlocks.class, BuiltInRegistries.BLOCK);
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
}
