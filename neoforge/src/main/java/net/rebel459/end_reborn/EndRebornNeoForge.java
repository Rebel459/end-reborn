package net.rebel459.end_reborn;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.rebel459.unified.platform.NeoForgeUnifiedRegistries;

@Mod(EndReborn.MOD_ID)
public class EndRebornNeoForge {

    public EndRebornNeoForge(IEventBus modEventBus) {
        NeoForgeUnifiedRegistries.registerBus(EndReborn.MOD_ID, modEventBus);
        EndReborn.initRegistries();
        modEventBus.addListener(EndRebornNeoForge::commonSetup);
    }

    private static void commonSetup(final FMLCommonSetupEvent event) {
        EndReborn.init();
    }
}