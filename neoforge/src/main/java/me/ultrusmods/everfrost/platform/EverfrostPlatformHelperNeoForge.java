package me.ultrusmods.everfrost.platform;

import me.ultrusmods.everfrost.platform.services.IPlatformHelper;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

import java.util.HashMap;
import java.util.Map;

public class EverfrostPlatformHelperNeoForge implements IPlatformHelper {

    @Override
    public String getPlatformName() {
            return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }


    public static final Map<Block, Block> STRIPPABLE_BLOCKS = new HashMap<>();

    @Override
    public void addStrippableBlock(Block base, Block stripped) {
        STRIPPABLE_BLOCKS.put(base, stripped);

    }
}