package me.ultrusmods.everfrost.registry.worldgen;

import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class EverfrostTreeGrowers {

    public static final TreeGrower MYRTLE = new TreeGrower("everfrost:myrtle",
            Optional.empty(),
            Optional.of(EverfrostTreeFeatures.MYRTLE_TREE),
            Optional.empty());

}
