package net.rebel459.end_reborn;

import net.fabricmc.api.ModInitializer;

public class EndRebornFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        EndReborn.initRegistries();
        EndReborn.init();
    }
}
