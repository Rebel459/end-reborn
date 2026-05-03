package net.rebel459.end_reborn;

import me.shedaniel.autoconfig.AutoConfigClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.rebel459.end_reborn.config.ERConfig;

@Mod(value = EndReborn.MOD_ID, dist = Dist.CLIENT)
public class EndRebornNeoForgeClient {

    public EndRebornNeoForgeClient(IEventBus modEventBus) {
        EndRebornClient.initRegistries();
        ModLoadingContext.get().registerExtensionPoint(
                IConfigScreenFactory.class,
                () -> (modContainer, parent) ->
                        AutoConfigClient.getConfigScreen(ERConfig.class, parent).get()
        );
        modEventBus.addListener(EndRebornNeoForgeClient::commonSetup);
    }

    private static void commonSetup(final FMLCommonSetupEvent event) {
        EndRebornClient.init();
    }
}