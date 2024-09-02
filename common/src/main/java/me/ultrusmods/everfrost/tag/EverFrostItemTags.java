package me.ultrusmods.everfrost.tag;

import me.ultrusmods.everfrost.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EverFrostItemTags {
    public static TagKey<Item> MYRTLE_LOGS = TagKey.create(Registries.ITEM, Constants.id("myrtle_logs"));
}
