package me.ultrusmods.everfrost;


import me.ultrusmods.everfrost.registry.EverfrostBlocks;
import me.ultrusmods.everfrost.registry.EverfrostItems;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
public class EverfrostModNeoForge {

    public EverfrostModNeoForge(IEventBus eventBus) {
        EverfrostMod.init();
        eventBus.addListener(this::onRegisterEvent);
        eventBus.addListener(this::onCommonSetupEvent);
    }

    private void onRegisterEvent(RegisterEvent event) {
        if (event.getRegistryKey() == Registries.BLOCK) {
            EverfrostBlocks.init();
        }
        if (event.getRegistryKey() == Registries.ITEM) {
            EverfrostItems.init();
        }
    }
    private void onCommonSetupEvent(FMLCommonSetupEvent event) {
        EverfrostBlocks.registerStrippableBlocks();
    }

}