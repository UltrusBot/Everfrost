package me.ultrusmods.everfrost;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class EverfrostModNeoForge {

    public EverfrostModNeoForge(IEventBus eventBus) {
        EverfrostMod.init();
    }
}