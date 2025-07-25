package net.legacy.end_reborn.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.legacy.end_reborn.registry.ERBlocks;
import net.minecraft.client.renderer.RenderType;

@Environment(EnvType.CLIENT)
public final class ERBlockRenderLayers {

	public static void init() {
		BlockRenderLayerMap renderLayerRegistry = BlockRenderLayerMap.INSTANCE;

		renderLayerRegistry.putBlock(ERBlocks.CHORUS_DOOR, RenderType.cutout());

		renderLayerRegistry.putBlock(ERBlocks.CRYSTALLINE_LANTERN, RenderType.cutout());

	}
}
