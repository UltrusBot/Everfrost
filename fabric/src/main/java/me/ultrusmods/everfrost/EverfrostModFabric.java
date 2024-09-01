package me.ultrusmods.everfrost;

import net.fabricmc.api.ModInitializer;

public class EverfrostModFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        EverfrostMod.init();
    }
}
