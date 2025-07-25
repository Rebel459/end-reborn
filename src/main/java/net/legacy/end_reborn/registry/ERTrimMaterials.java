package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.ERConstants;
import net.legacy.end_reborn.datagen.ERModelProvider;
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
    public static final List<String> TRIM_MATERIALS = List.of("remnant_ingot", "remnant_ingot_darker", "featherzeal_ingot", "featherzeal_ingot_darker", "crystalline_shard");

    public static final ResourceKey<TrimMaterial> REMNANT = register("remnant_ingot");
    public static final ResourceKey<TrimMaterial> REMNANT_DARKER = register("remnant_ingot_darker");
    public static final ResourceKey<TrimMaterial> FEATHERZEAL = register("featherzeal_ingot");
    public static final ResourceKey<TrimMaterial> FEATHERZEAL_DARKER = register("featherzeal_ingot_darker");
    public static final ResourceKey<TrimMaterial> CRYSTALLINE = register("crystalline_shard");

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        TrimMaterials.register(context, REMNANT, Style.EMPTY.withColor(5592405), ERModelProvider.REMNANT_INGOT);
        TrimMaterials.register(context, REMNANT_DARKER, Style.EMPTY.withColor(5592405), ERModelProvider.REMNANT_INGOT_DARKER);
        TrimMaterials.register(context, FEATHERZEAL, Style.EMPTY.withColor(5090680), ERModelProvider.FEATHERZEAL_INGOT);
        TrimMaterials.register(context, FEATHERZEAL_DARKER, Style.EMPTY.withColor(5090680), ERModelProvider.FEATHERZEAL_INGOT_DARKER);
        TrimMaterials.register(context, CRYSTALLINE, Style.EMPTY.withColor(16777215), ERModelProvider.CRYSTALLINE_SHARD);
    }

    private static ResourceKey<TrimMaterial> register(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, ERConstants.id(name));

    }

}