package net.legacy.end_reborn.registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.legacy.end_reborn.ERConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.armortrim.TrimMaterial;

public class ERTrimMaterials {
    public static final List<ResourceKey<TrimMaterial>> TRIM_MATERIALS = new ArrayList<>();
    public static final Map<ResourceLocation, Float> ITEM_MODEL_INDICES = new HashMap<>();

    public static final ResourceKey<TrimMaterial> REMNANT = register("remnant_ingot", 0.05F);
    public static final ResourceKey<TrimMaterial> REMNANT_DARKER = register("remnant_ingot_darker", 0.15F);
    public static final ResourceKey<TrimMaterial> FEATHERZEAL = register("featherzeal_ingot", 0.25F);
    public static final ResourceKey<TrimMaterial> FEATHERZEAL_DARKER = register("featherzeal_ingot_darker", 0.35F);
    public static final ResourceKey<TrimMaterial> CRYSTALLINE = register("crystalline_shard", 0.45F);

    public static void init() {
    }

    private static ResourceKey<TrimMaterial> register(String name, float itemModelIndex) {
        ResourceKey<TrimMaterial> key = ResourceKey.create(Registries.TRIM_MATERIAL, ERConstants.id(name));
        TRIM_MATERIALS.add(key);
        ITEM_MODEL_INDICES.put(key.location(), itemModelIndex);
        return key;
    }
}
