package me.ultrusmods.everfrost.registry;

import me.ultrusmods.everfrost.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.entity.BannerPattern;

public class EverfrostBannerPatterns {
    public static final ResourceKey<BannerPattern> SNOWFLAKE = create("snowflake");


    private static ResourceKey<BannerPattern> create(String name) {
        return ResourceKey.create(Registries.BANNER_PATTERN, Constants.id(name));
    }

    public static void bootstrap(BootstrapContext<BannerPattern> bannerPatternBootstrapContext) {
        register(bannerPatternBootstrapContext, SNOWFLAKE);
    }

    public static void register(BootstrapContext<BannerPattern> context, ResourceKey<BannerPattern> resourceKey) {
        context.register(resourceKey, new BannerPattern(resourceKey.location(), "block.everfrost.banner." + resourceKey.location().toShortLanguageKey()));
    }
}
