package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.ERConstants;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ERTrimMaterials {
    public static final List<ResourceKey<TrimMaterial>> TRIM_MATERIALS = new ArrayList<>();

    public static final ResourceKey<TrimMaterial> REMNANT = register("remnant_ingot");
    public static final ResourceKey<TrimMaterial> REMNANT_DARKER = register("remnant_ingot_darker");
    public static final ResourceKey<TrimMaterial> FEATHERZEAL = register("featherzeal_ingot");
    public static final ResourceKey<TrimMaterial> FEATHERZEAL_DARKER = register("featherzeal_ingot_darker");
    public static final ResourceKey<TrimMaterial> CRYSTALLINE = register("crystalline_shard");

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, REMNANT, ERItems.REMNANT_INGOT, Style.EMPTY.withColor(5592405));
        register(context, REMNANT_DARKER, ERItems.REMNANT_INGOT, Style.EMPTY.withColor(5592405));
        register(context, FEATHERZEAL, ERItems.FEATHERZEAL_INGOT, Style.EMPTY.withColor(5090680));
        register(context, FEATHERZEAL_DARKER, ERItems.FEATHERZEAL_INGOT, Style.EMPTY.withColor(5090680));
        register(context, CRYSTALLINE, ERItems.CRYSTALLINE_SHARD, Style.EMPTY.withColor(16777215));
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> key, Item item, Style style) {
        ResourceLocation location = key.location();
        TrimMaterial material = TrimMaterial.create(location.getPath(), item, Component.translatable(Util.makeDescriptionId("trim_material", location)).withStyle(style), Map.of());
        context.register(key, material);
    }

    private static ResourceKey<TrimMaterial> register(String name) {
        ResourceKey<TrimMaterial> key = ResourceKey.create(Registries.TRIM_MATERIAL, ERConstants.id(name));
        TRIM_MATERIALS.add(key);
        return key;
    }
}