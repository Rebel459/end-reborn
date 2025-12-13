package net.legacy.end_reborn.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.legacy.end_reborn.EndReborn;
import net.legacy.end_reborn.registry.EREntityTypes;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.object.boat.RaftModel;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.RaftRenderer;

@Environment(EnvType.CLIENT)
public final class ERModelLayers {
    // RAFTS
    public static final ModelLayerLocation CHORUS_RAFT = new ModelLayerLocation(EndReborn.id("boat/chorus"), "main");
    public static final ModelLayerLocation CHORUS_CHEST_RAFT = new ModelLayerLocation(EndReborn.id("chest_boat/chorus"), "main");

    public static void init() {
        // RAFTS
        EntityRenderers.register(EREntityTypes.CHORUS_RAFT, context -> new RaftRenderer(context, CHORUS_RAFT));
        EntityRenderers.register(EREntityTypes.CHORUS_CHEST_RAFT, context -> new RaftRenderer(context, CHORUS_CHEST_RAFT));

        LayerDefinition raft = RaftModel.createRaftModel();
        LayerDefinition chestRaft = RaftModel.createChestRaftModel();
        EntityModelLayerRegistry.registerModelLayer(CHORUS_RAFT, () -> raft);
        EntityModelLayerRegistry.registerModelLayer(CHORUS_CHEST_RAFT, () -> chestRaft);
    }
}