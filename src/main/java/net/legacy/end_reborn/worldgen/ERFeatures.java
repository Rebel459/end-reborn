package net.legacy.end_reborn.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.legacy.end_reborn.tag.ERBiomeTags;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.legacy.end_reborn.ERConstants.MOD_ID;
import static net.minecraft.core.registries.Registries.PLACED_FEATURE;

public class ERFeatures {

    public static final ResourceKey<PlacedFeature> FORGOTTEN_REMAINS = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"forgotten_remains"));

    public static final ResourceKey<PlacedFeature> ANCIENT_DEBRIS_BONUS = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"ancient_debris_bonus"));

    public static final ResourceKey<PlacedFeature> TIMELOST_FRAGMENTS = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"timelost_fragments"));
    public static final ResourceKey<PlacedFeature> TIMELOST_FRAGMENTS_SPREAD = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"timelost_fragments_spread"));
    public static final ResourceKey<PlacedFeature> END_IRON_ORE = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"end_iron_ore"));
    public static final ResourceKey<PlacedFeature> PURPUR = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"purpur_cluster"));
    public static final ResourceKey<PlacedFeature> AMETRUR = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"ametrur_cluster"));
    public static final ResourceKey<PlacedFeature> RAW_CRYSTALLINE_BLOCK = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"crystalline_clump"));

    public static void init() {

        BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_FORGOTTEN_REMAINS), GenerationStep.Decoration.UNDERGROUND_ORES, FORGOTTEN_REMAINS);

        BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_BONUS_DEBRIS), GenerationStep.Decoration.UNDERGROUND_ORES, ANCIENT_DEBRIS_BONUS);

        BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.UNDERGROUND_ORES, TIMELOST_FRAGMENTS);
        BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.UNDERGROUND_ORES, TIMELOST_FRAGMENTS_SPREAD);
        BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.UNDERGROUND_DECORATION, END_IRON_ORE);
        BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.UNDERGROUND_ORES, PURPUR);
        BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.UNDERGROUND_DECORATION, AMETRUR);
        BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.VEGETAL_DECORATION, RAW_CRYSTALLINE_BLOCK);

    }

}
