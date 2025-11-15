package net.legacy.end_reborn;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.legacy.end_reborn.config.ERConfig;
import net.legacy.end_reborn.registry.*;
import net.legacy.end_reborn.worldgen.ERFeatures;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

/**
 * by Rebel459
 */
public class EndReborn implements ModInitializer {

	public static boolean isProgressionRebornLoaded = false;

	@Override
	public void onInitialize() {
		Optional<ModContainer> modContainer = FabricLoader.getInstance().getModContainer("end_reborn");

		ERItems.init();
		ERDataComponents.init();
		ERBlocks.init();
		ERBlocks.registerBlockProperties();
		ERCreativeInventorySorting.init();
		ERTrimItemModels.init();
		ERFeatures.init();
		ERLootTables.init();
		ERConfig.initClient();

		ResourceManagerHelper.registerBuiltinResourcePack(
				ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "end_reborn_asset_overrides"), modContainer.get(),
				Component.translatable("pack.end_reborn.end_reborn_asset_overrides"),
				ResourcePackActivationType.ALWAYS_ENABLED
		);
		if (FabricLoader.getInstance().isModLoaded("progression_reborn")) {
			isProgressionRebornLoaded = true;
		}
			if (FabricLoader.getInstance().isModLoaded("trailiertales") && ERConfig.get.trailier_tales_integration) {
			ResourceManagerHelper.registerBuiltinResourcePack(
					ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "end_reborn_trailier_tales_integration"), modContainer.get(),
					Component.translatable("pack.end_reborn.end_reborn_trailier_tales_integration"),
					ResourcePackActivationType.ALWAYS_ENABLED
			);
		}
		if (FabricLoader.getInstance().isModLoaded("enderscape") && ERConfig.get.enderscape_integration) {
			ResourceManagerHelper.registerBuiltinResourcePack(
					ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "end_reborn_enderscape_integration"), modContainer.get(),
					Component.translatable("pack.end_reborn.end_reborn_enderscape_integration"),
					ResourcePackActivationType.ALWAYS_ENABLED
			);
		}

	}
}