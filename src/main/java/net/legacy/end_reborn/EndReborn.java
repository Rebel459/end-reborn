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
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.io.IOException;
import java.util.Optional;

import static net.legacy.end_reborn.ERConstants.MOD_ID;
import static net.minecraft.core.registries.Registries.PLACED_FEATURE;

/**
 * by Rebel459
 */
public class EndReborn implements ModInitializer {

	//public static final ResourceKey<PlacedFeature> NETHER_ROSE_ORE = ResourceKey.create(PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MOD_ID,"ore_rose_nether"));

	@Override
	public void onInitialize() {
		Optional<ModContainer> modContainer = FabricLoader.getInstance().getModContainer("end_reborn");

		ERItems.init();
		ERGearItems.init();
		ERBlocks.init();
		ERBlocks.registerBlockProperties();
		ERCreativeInventorySorting.init();
		ERTrimItemModels.init();

		//BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, NETHER_ROSE_ORE);

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