package net.rebel459.end_reborn;

import net.fabricmc.api.ClientModInitializer;

public class EndRebornFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EndRebornClient.initRegistries();
        EndRebornClient.init();
    }
}
