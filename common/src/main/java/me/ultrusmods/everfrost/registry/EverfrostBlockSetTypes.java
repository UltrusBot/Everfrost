package me.ultrusmods.everfrost.registry;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class EverfrostBlockSetTypes {

    public static final BlockSetType MYRTLE = new BlockSetType("everfrost:myrtle");
    public static final WoodType MYRTLE_WOOD = new WoodType("everfrost:myrtle", MYRTLE);

    public static void init() {
        BlockSetType.register(MYRTLE);
        WoodType.register(MYRTLE_WOOD);
    }
}
