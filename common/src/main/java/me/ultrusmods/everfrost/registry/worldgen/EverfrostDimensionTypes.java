package me.ultrusmods.everfrost.registry.worldgen;

import me.ultrusmods.everfrost.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;

import java.util.OptionalLong;

public class EverfrostDimensionTypes {
    public static ResourceKey<DimensionType> EVERFROST = ResourceKey.create(Registries.DIMENSION_TYPE, Constants.id("everfrost"));
    public static final ResourceLocation EVERFROST_EFFECTS = Constants.id("everfrost");

    public static void bootstrap(BootstrapContext<DimensionType> context) {
        context.register(EVERFROST,
                new DimensionType(
                        OptionalLong.empty(),
                        true,
                        false,
                        false,
                        true,
                        1.0,
                        true,
                        false,
                        -64,
                        384,
                        384,
                        BlockTags.INFINIBURN_OVERWORLD,
                        BuiltinDimensionTypes.OVERWORLD_EFFECTS,
                        0.0F,
                        new DimensionType.MonsterSettings(false, false, UniformInt.of(0, 7), 0))
                );

    }

}
