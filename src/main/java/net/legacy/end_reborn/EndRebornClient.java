package net.legacy.end_reborn;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.legacy.end_reborn.client.ERBlockRenderLayers;
import net.legacy.end_reborn.client.ERModelLayers;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public final class EndRebornClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ERBlockRenderLayers.init();
        ERModelLayers.init();
    }
}