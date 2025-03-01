package net.legacy.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.legacy.end_reborn.ERConstants;
import net.legacy.end_reborn.registry.ERTrimMaterials;
import net.minecraft.core.*;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ERRegistryProvider extends FabricDynamicRegistryProvider {
    protected ERRegistryProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void buildRegistry(RegistrySetBuilder registrySetBuilder) {
        registrySetBuilder.add(Registries.TRIM_MATERIAL, ERTrimMaterials::bootstrap);
    }

    @Override
    public void configure(HolderLookup.Provider registries, Entries entries) {
        addAll(entries, registries.lookupOrThrow(Registries.TRIM_MATERIAL), ERConstants.MOD_ID);
    }

    @Override
    public String getName() {
        return "End Reborn";
    }

    @SuppressWarnings("UnusedReturnValue")
    public <T> List<Holder<T>> addAll(Entries entries, HolderLookup.RegistryLookup<T> registry, String modId) {
        return registry.listElementIds()
                .filter(registryKey -> registryKey.location().getNamespace().equals(ERConstants.MOD_ID))
                .map(key -> entries.add(registry, key))
                .toList();
    }

}
