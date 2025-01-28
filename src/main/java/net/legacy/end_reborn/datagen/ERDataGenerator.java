package net.legacy.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.frozenblock.lib.feature_flag.api.FrozenFeatureFlags;
import net.minecraft.core.RegistrySetBuilder;
import org.jetbrains.annotations.NotNull;

public final class ERDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(@NotNull FabricDataGenerator dataGenerator) {

		FrozenFeatureFlags.rebuild();
		final FabricDataGenerator.Pack pack = dataGenerator.createPack();

		pack.addProvider(ERModelProvider::new);
		pack.addProvider(ERItemTagProvider::new);
		pack.addProvider(ERBlockTagProvider::new);
		pack.addProvider(ERBlockLootProvider::new);
		pack.addProvider(ERRegistryProvider::new);
		pack.addProvider(ERRecipeProvider::new);

	}

	public void buildRegistry(RegistrySetBuilder registrySetBuilder) {
		ERRegistryProvider.buildRegistry(registrySetBuilder);
	}


}
