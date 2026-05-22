package net.rebel459.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.rebel459.end_reborn.EndReborn;
import net.rebel459.end_reborn.registry.ERItems;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public final class ERDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(@NotNull FabricDataGenerator dataGenerator) {

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
