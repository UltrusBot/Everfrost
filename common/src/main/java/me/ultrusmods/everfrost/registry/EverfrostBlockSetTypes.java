package me.ultrusmods.everfrost.registry;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class EverfrostBlockSetTypes {

    public static final BlockSetType MYRTLE = new BlockSetType("everfrost:myrtle");
    public static final WoodType MYRTLE_WOOD = new WoodType("everfrost:myrtle", MYRTLE);
    public static final BlockSetType GLACISTONE = new BlockSetType("everfrost:glacistone", true, true, false, BlockSetType.PressurePlateSensitivity.MOBS, SoundType.STONE, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON);

    public static void init() {
        BlockSetType.register(MYRTLE);
        WoodType.register(MYRTLE_WOOD);
        BlockSetType.register(GLACISTONE);
    }
}
