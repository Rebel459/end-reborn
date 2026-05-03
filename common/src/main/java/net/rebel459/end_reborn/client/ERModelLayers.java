package net.rebel459.end_reborn.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.object.boat.RaftModel;
import net.minecraft.client.renderer.entity.RaftRenderer;
import net.rebel459.end_reborn.EndReborn;
import net.rebel459.end_reborn.registry.EREntityTypes;
import net.rebel459.unified.platform.client.UnifiedClientHelpers;

public final class ERModelLayers {

    public static final ModelLayerLocation CHORUS_RAFT = new ModelLayerLocation(EndReborn.id("boat/chorus"), "main");
    public static final ModelLayerLocation CHORUS_CHEST_RAFT = new ModelLayerLocation(EndReborn.id("chest_boat/chorus"), "main");

    public static void init() {
        UnifiedClientHelpers.ENTITY_RENDERERS.addEntityRenderer(EREntityTypes.CHORUS_RAFT::get, context -> new RaftRenderer(context, CHORUS_RAFT));
        UnifiedClientHelpers.ENTITY_RENDERERS.addEntityRenderer(EREntityTypes.CHORUS_CHEST_RAFT::get, context -> new RaftRenderer(context, CHORUS_CHEST_RAFT));

        UnifiedClientHelpers.ENTITY_RENDERERS.addLayerDefinition(CHORUS_RAFT, RaftModel::createRaftModel);
        UnifiedClientHelpers.ENTITY_RENDERERS.addLayerDefinition(CHORUS_CHEST_RAFT, RaftModel::createChestRaftModel);
    }
}
