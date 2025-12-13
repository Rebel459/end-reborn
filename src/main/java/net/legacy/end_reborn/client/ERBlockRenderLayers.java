package net.legacy.end_reborn.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.legacy.end_reborn.registry.ERBlocks;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

@Environment(EnvType.CLIENT)
public final class ERBlockRenderLayers {

	public static void init() {
		BlockRenderLayerMap.putBlock(ERBlocks.CHORUS_DOOR, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ERBlocks.CRYSTALLINE_LANTERN, ChunkSectionLayer.CUTOUT);
	}
}
