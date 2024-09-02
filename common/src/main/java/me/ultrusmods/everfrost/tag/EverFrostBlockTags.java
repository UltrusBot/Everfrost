package me.ultrusmods.everfrost.tag;

import me.ultrusmods.everfrost.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class EverFrostBlockTags {
    public static TagKey<Block> MYRTLE_LOGS = TagKey.create(Registries.BLOCK, Constants.id("myrtle_logs"));
}
