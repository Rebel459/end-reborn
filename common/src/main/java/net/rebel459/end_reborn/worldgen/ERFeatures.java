package net.rebel459.end_reborn.worldgen;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.rebel459.end_reborn.EndReborn;
import net.rebel459.end_reborn.tag.ERBiomeTags;
import net.rebel459.unified.platform.UnifiedHelpers;
import net.rebel459.unified.platform.UnifiedPlatform;

import static net.minecraft.core.registries.Registries.PLACED_FEATURE;

public class ERFeatures {

    public static final ResourceKey<PlacedFeature> FORGOTTEN_REMAINS = ResourceKey.create(PLACED_FEATURE, EndReborn.id("forgotten_remains"));

    public static final ResourceKey<PlacedFeature> TIMELOST_FRAGMENTS = ResourceKey.create(PLACED_FEATURE, EndReborn.id("timelost_fragments"));
    public static final ResourceKey<PlacedFeature> TIMELOST_FRAGMENTS_SPREAD = ResourceKey.create(PLACED_FEATURE, EndReborn.id("timelost_fragments_spread"));
    public static final ResourceKey<PlacedFeature> END_IRON_ORE = ResourceKey.create(PLACED_FEATURE, EndReborn.id("end_iron_ore"));
    public static final ResourceKey<PlacedFeature> PURPUR = ResourceKey.create(PLACED_FEATURE, EndReborn.id("purpur_cluster"));
    public static final ResourceKey<PlacedFeature> AMETRUR = ResourceKey.create(PLACED_FEATURE, EndReborn.id("ametrur_cluster"));
    public static final ResourceKey<PlacedFeature> RAW_CRYSTALLINE_BLOCK = ResourceKey.create(PLACED_FEATURE, EndReborn.id("crystalline_clump"));

    public static void init() {

        UnifiedHelpers.BIOME_MODIFICATIONS.register(ERBiomeTags.HAS_FORGOTTEN_REMAINS, context -> {
            context.getFeatures().addFeature(FORGOTTEN_REMAINS, GenerationStep.Decoration.UNDERGROUND_ORES);
        });

        UnifiedHelpers.BIOME_MODIFICATIONS.register(ERBiomeTags.HAS_END_ORES, context -> {
            var features = context.getFeatures();
            features.addFeature(TIMELOST_FRAGMENTS, GenerationStep.Decoration.UNDERGROUND_ORES);
            features.addFeature(TIMELOST_FRAGMENTS_SPREAD, GenerationStep.Decoration.UNDERGROUND_ORES);
            if (UnifiedPlatform.isModLoaded("enderscape")) features.addFeature(ResourceKey.create(PLACED_FEATURE, EndReborn.id("timelost_fragments_void")), GenerationStep.Decoration.UNDERGROUND_ORES);
            features.addFeature(END_IRON_ORE, GenerationStep.Decoration.UNDERGROUND_DECORATION);
        });

        UnifiedHelpers.BIOME_MODIFICATIONS.register(ERBiomeTags.HAS_PURPUR_CLUSTERS, context -> {
            var features = context.getFeatures();
            features.addFeature(PURPUR, GenerationStep.Decoration.UNDERGROUND_ORES);
            features.addFeature(AMETRUR, GenerationStep.Decoration.UNDERGROUND_DECORATION);
            features.addFeature(RAW_CRYSTALLINE_BLOCK, GenerationStep.Decoration.VEGETAL_DECORATION);
        });
    }

}
