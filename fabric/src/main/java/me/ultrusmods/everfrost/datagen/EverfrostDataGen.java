package me.ultrusmods.everfrost.datagen;

import me.ultrusmods.everfrost.registry.EverfrostBannerPatterns;
import me.ultrusmods.everfrost.registry.worldgen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class EverfrostDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(EverfrostModelProvider::new);
        pack.addProvider(EverfrostTagProviders.EverfrostBlockTagsProvider::new);
        pack.addProvider(EverfrostTagProviders.EverfrostItemTagsProvider::new);
        pack.addProvider(EverfrostBlockLootProvider::new);
        pack.addProvider(EverfrostRecipeProvider::new);
        pack.addProvider(EverfrostTagProviders.EverfrostBannerTagsProvider::new);
        pack.addProvider(EverfrostDynamicRegistriesProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.BANNER_PATTERN, EverfrostBannerPatterns::bootstrap);
        registryBuilder.add(Registries.DIMENSION_TYPE, EverfrostDimensionTypes::bootstrap);
        registryBuilder.add(Registries.CONFIGURED_FEATURE, EverfrostConfiguredFeatures::bootstrap);
        registryBuilder.add(Registries.CONFIGURED_FEATURE, EverfrostTreeFeatures::bootstrap);
        registryBuilder.add(Registries.PLACED_FEATURE, EverfrostTreePlacements::bootstrap);
        registryBuilder.add(Registries.CONFIGURED_FEATURE, EverfrostVegetationFeatures::bootstrap);
        registryBuilder.add(Registries.BIOME, EverfrostBiomes::bootstrap);
    }
}
