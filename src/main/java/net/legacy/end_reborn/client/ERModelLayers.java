package net.legacy.end_reborn.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.legacy.end_reborn.ERConstants;
import net.legacy.end_reborn.registry.EREntityTypes;
import net.minecraft.client.model.ChestRaftModel;
import net.minecraft.client.model.RaftModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;

@Environment(EnvType.CLIENT)
public final class ERModelLayers {
    // RAFTS
    public static final ModelLayerLocation CHORUS_RAFT = new ModelLayerLocation(ERConstants.id("boat/chorus"), "main");
    public static final ModelLayerLocation CHORUS_CHEST_RAFT = new ModelLayerLocation(ERConstants.id("chest_boat/chorus"), "main");

    public static final ResourceLocation CHORUS_RAFT_TEXTURE = ERConstants.id("textures/entity/boat/chorus.png");
    public static final ResourceLocation CHORUS_CHEST_RAFT_TEXTURE = ERConstants.id("textures/entity/chest_boat/chorus.png");

    public static void init() {
        // RAFTS
        EntityRendererRegistry.register(EREntityTypes.CHORUS_RAFT, context -> new ChorusRaftRenderer(context, new RaftModel(context.bakeLayer(CHORUS_RAFT)), CHORUS_RAFT_TEXTURE));
        EntityRendererRegistry.register(EREntityTypes.CHORUS_CHEST_RAFT, context -> new ChorusRaftRenderer(context, new ChestRaftModel(context.bakeLayer(CHORUS_CHEST_RAFT)), CHORUS_CHEST_RAFT_TEXTURE));

        LayerDefinition raft = RaftModel.createBodyModel();
        LayerDefinition chestRaft = ChestRaftModel.createBodyModel();
        EntityModelLayerRegistry.registerModelLayer(CHORUS_RAFT, () -> raft);
        EntityModelLayerRegistry.registerModelLayer(CHORUS_CHEST_RAFT, () -> chestRaft);
    }
}
