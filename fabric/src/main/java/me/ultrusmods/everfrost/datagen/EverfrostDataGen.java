package me.ultrusmods.everfrost.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class EverfrostDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(EverfrostModelProvider::new);
        pack.addProvider(EverfrostTagProviders.EverfrostBlockTagsProvider::new);
        pack.addProvider(EverfrostTagProviders.EverfrostItemTagsProvider::new);
        pack.addProvider(EverfrostBlockLootProvider::new);
        pack.addProvider(EverfrostRecipeProvider::new);

    }
}
