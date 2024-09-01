package me.ultrusmods.everfrost.platform;

import me.ultrusmods.everfrost.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

public class EverfrostPlatformHelperFabric implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }
}
