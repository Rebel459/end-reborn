package net.rebel459.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.rebel459.end_reborn.EndReborn;
import net.rebel459.end_reborn.registry.ERTrimMaterials;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ERRegistryProvider extends FabricDynamicRegistryProvider {
    protected ERRegistryProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void buildRegistry(RegistrySetBuilder registrySetBuilder) {
        registrySetBuilder.add(Registries.TRIM_MATERIAL, ERTrimMaterials::bootstrap);
    }

    @Override
    public void configure(HolderLookup.Provider registries, @NonNull Entries entries) {
        addAll(entries, registries.lookupOrThrow(Registries.TRIM_MATERIAL), EndReborn.MOD_ID);
    }

    @Override
    public @NonNull String getName() {
        return "End Reborn";
    }

    @SuppressWarnings("UnusedReturnValue")
    public <T> List<Holder<T>> addAll(Entries entries, HolderLookup.RegistryLookup<T> registry, String modId) {
        return registry.listElementIds()
                .filter(registryKey -> registryKey.identifier().getNamespace().equals(EndReborn.MOD_ID))
                .map(key -> entries.add(registry, key))
                .toList();
    }

}
