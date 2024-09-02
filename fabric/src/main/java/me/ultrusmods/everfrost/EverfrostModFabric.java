package me.ultrusmods.everfrost;

import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import me.ultrusmods.everfrost.registry.EverfrostItems;
import net.fabricmc.api.ModInitializer;

public class EverfrostModFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        EverfrostMod.init();

        EverfrostBlocks.init();
        EverfrostItems.init();
        EverfrostBlocks.registerStrippableBlocks();
    }
}
