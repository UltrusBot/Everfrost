package me.ultrusmods.everfrost.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;

import java.util.concurrent.CompletableFuture;

public class EverfrostDynamicRegistriesProvider extends FabricDynamicRegistryProvider {
    public EverfrostDynamicRegistriesProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
         entries.addAll(registries.lookupOrThrow(Registries.BANNER_PATTERN));
    }

    @Override
    public String getName() {
        return "Everfrost";
    }
}
