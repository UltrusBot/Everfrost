package me.ultrusmods.everfrost.datagen;

import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;

public class EverfrostBlockFamilies {
    public static final BlockFamily MYRTLE_PLANKS = BlockFamilies.familyBuilder(EverfrostBlocks.MYRTLE_PLANKS)
            .button(EverfrostBlocks.MYRTLE_BUTTON)
            .fence(EverfrostBlocks.MYRTLE_FENCE)
            .fenceGate(EverfrostBlocks.MYRTLE_FENCE_GATE)
            .pressurePlate(EverfrostBlocks.MYRTLE_PRESSURE_PLATE)
            .slab(EverfrostBlocks.MYRTLE_SLAB)
            .stairs(EverfrostBlocks.MYRTLE_STAIRS)
            .trapdoor(EverfrostBlocks.MYRTLE_TRAPDOOR)
            .door(EverfrostBlocks.MYRTLE_DOOR)
            .recipeGroupPrefix("wooden")
            .recipeUnlockedBy("has_planks")
            .getFamily();

    public static final BlockFamily GLACISTONE = BlockFamilies.familyBuilder(EverfrostBlocks.GLACISTONE)
            .slab(EverfrostBlocks.GLACISTONE_SLAB)
            .stairs(EverfrostBlocks.GLACISTONE_STAIRS)
            .button(EverfrostBlocks.GLACISTONE_BUTTON)
            .pressurePlate(EverfrostBlocks.GLACISTONE_PRESSURE_PLATE)
            .getFamily();

    public static final BlockFamily COBBLED_GLACISTONE = BlockFamilies.familyBuilder(EverfrostBlocks.COBBLED_GLACISTONE)
            .slab(EverfrostBlocks.COBBLED_GLACISTONE_SLAB)
            .stairs(EverfrostBlocks.COBBLED_GLACISTONE_STAIRS)
            .wall(EverfrostBlocks.COBBLED_GLACISTONE_WALL)
            .getFamily();
}
