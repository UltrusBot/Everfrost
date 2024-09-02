package me.ultrusmods.everfrost;

import me.ultrusmods.everfrost.platform.EverfrostPlatformHelperNeoForge;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.event.level.BlockEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.GAME)
public class EverfrostModEventsNeoForge {

    @SubscribeEvent
    private static void onBlockToolModificationEvent(BlockEvent.BlockToolModificationEvent event) {
        if (event.getItemAbility() == ItemAbilities.AXE_STRIP) {
            BlockState state = event.getState();
            Block stripped = EverfrostPlatformHelperNeoForge.STRIPPABLE_BLOCKS.get(state.getBlock());
            if (stripped != null) {
                event.setFinalState(stripped.withPropertiesOf(state));
            }
        }
    }

}
