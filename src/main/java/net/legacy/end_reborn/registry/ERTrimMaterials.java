package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.EndReborn;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;

import java.util.Map;

public class ERTrimMaterials {
    public static final MaterialAssetGroup REMNANT_GROUP = MaterialAssetGroup.create("remnant", Map.of(EREquipmentAssets.REMNANT, "remnant_darker"));
    public static final MaterialAssetGroup FEATHERZEAL_GROUP = MaterialAssetGroup.create("featherzeal", Map.of(EREquipmentAssets.FEATHERZEAL, "featherzeal_darker"));
    public static final MaterialAssetGroup CRYSTALLINE_GROUP = MaterialAssetGroup.create("crystalline");

    public static final ResourceKey<TrimMaterial> REMNANT = register("remnant");
    public static final ResourceKey<TrimMaterial> FEATHERZEAL = register("featherzeal");
    public static final ResourceKey<TrimMaterial> CRYSTALLINE = register("crystalline");

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        TrimMaterials.register(context, REMNANT, Style.EMPTY.withColor(5592405), REMNANT_GROUP);
        TrimMaterials.register(context, FEATHERZEAL, Style.EMPTY.withColor(5090680), FEATHERZEAL_GROUP);
        TrimMaterials.register(context, CRYSTALLINE, Style.EMPTY.withColor(16777215), CRYSTALLINE_GROUP);
    }

    private static ResourceKey<TrimMaterial> register(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, EndReborn.id(name));

    }

}