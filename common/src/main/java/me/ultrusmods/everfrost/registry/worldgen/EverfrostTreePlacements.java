package me.ultrusmods.everfrost.registry.worldgen;

import me.ultrusmods.everfrost.Constants;
import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class EverfrostTreePlacements {
    public static final ResourceKey<PlacedFeature> MYRTLE_CHECKED = createKey("myrtle_checked");



    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        Holder<ConfiguredFeature<?, ?>> myrtleTree = holderGetter.getOrThrow(EverfrostTreeFeatures.MYRTLE_TREE);
        PlacementUtils.register(context, MYRTLE_CHECKED, myrtleTree, treePlacement(PlacementUtils.countExtra(5, 0.1F, 1), EverfrostBlocks.MYRTLE_SAPLING));
    }

    public static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Constants.id(name));
    }
}
