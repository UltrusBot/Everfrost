package me.ultrusmods.everfrost.tag;

import me.ultrusmods.everfrost.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.entity.BannerPattern;

public class EverfrostMiscTags {
    public static TagKey<BannerPattern> SNOWFLAKE_PATTERN = TagKey.create(Registries.BANNER_PATTERN, Constants.id("pattern_item/snowflake"));

}
