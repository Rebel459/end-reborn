package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.ERConstants;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentAsset;

public interface EREquipmentAssets {
    ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(ResourceLocation.withDefaultNamespace("equipment_asset"));
    ResourceKey<EquipmentAsset> REMNANT = createId("remnant");
    ResourceKey<EquipmentAsset> FEATHERZEAL = createId("featherzeal");

    static ResourceKey<EquipmentAsset> createId(String path) {
        return ResourceKey.create(ROOT_ID, ERConstants.id(path));
    }
}
