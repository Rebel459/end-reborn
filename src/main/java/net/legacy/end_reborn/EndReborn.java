package net.legacy.end_reborn;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.legacy.end_reborn.client.ERBlockRenderLayers;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.io.IOException;
import java.util.Optional;

import static net.legacy.end_reborn.ERConstants.MOD_ID;
import static net.minecraft.core.registries.Registries.PLACED_FEATURE;

/**
 * by Rebel459
 */
public class EndReborn implements ModInitializer {

	public static final ResourceKey<PlacedFeature> END_IRON_ORE = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"end_iron_ore"));
	public static final ResourceKey<PlacedFeature> FORGOTTEN_REMAINS = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"forgotten_remains"));
	public static final ResourceKey<PlacedFeature> PURPUR = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"purpur_cluster"));
	public static final ResourceKey<PlacedFeature> AMETRUR = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"ametrur_cluster"));
	public static final ResourceKey<PlacedFeature> RAW_CRYSTALLINE_BLOCK = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"crystalline_clump"));

	@Override
	public void onInitialize() {
		Optional<ModContainer> modContainer = FabricLoader.getInstance().getModContainer("end_reborn");
		try {
			ERConfig.main();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		ERItems.init();
		ERGearItems.init();
		ERBlocks.init();
		ERBlocks.registerBlockProperties();
		ERCreativeInventorySorting.init();
		ERTrimItemModels.init();

		BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.UNDERGROUND_DECORATION, END_IRON_ORE);
		BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.UNDERGROUND_ORES, FORGOTTEN_REMAINS);
		BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.UNDERGROUND_ORES, PURPUR);
		BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.UNDERGROUND_DECORATION, AMETRUR);
		BiomeModifications.addFeature(BiomeSelectors.tag(ERBiomeTags.HAS_END_ORES), GenerationStep.Decoration.VEGETAL_DECORATION, RAW_CRYSTALLINE_BLOCK);

		ResourceManagerHelper.registerBuiltinResourcePack(
				ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "end_reborn_asset_overrides"), modContainer.get(),
				Component.translatable("pack.end_reborn.end_reborn_asset_overrides"),
				ResourcePackActivationType.ALWAYS_ENABLED
		);

		if (FabricLoader.getInstance().isModLoaded("legacies_and_legends") && ERConfig.mod_integration_datapacks) {
			ResourceManagerHelper.registerBuiltinResourcePack(
					ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "end_reborn_legacies_and_legends_integration"), modContainer.get(),
					Component.translatable("pack.end_reborn.legacies_and_legends_integration"),
					ResourcePackActivationType.ALWAYS_ENABLED
			);
		}
	}

}