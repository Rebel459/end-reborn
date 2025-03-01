package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.ERConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;

import java.util.List;
import java.util.Map;

public class ERTrimMaterials {
    public static final List<String> TRIM_MATERIALS = List.of("remnium_ingot", "remnium_ingot_darker", "crystalline_shard");

    public static final ResourceKey<TrimMaterial> REMNIUM = createResourceKey("remnium_ingot");
    public static final ResourceKey<TrimMaterial> REMNIUM_DARKER = createResourceKey("remnium_ingot_darker");
    public static final ResourceKey<TrimMaterial> CRYSTALLINE = createResourceKey("crystalline_shard");

    public static void bootstrap(BootstrapContext<TrimMaterial> bootstrapContext) {
        TrimMaterials.register(bootstrapContext, REMNIUM, ERItems.REMNIUM_INGOT, Style.EMPTY.withColor(5592405), Map.of(EREquipmentAssets.REMNIUM, "remnium_ingot_darker"));
        TrimMaterials.register(bootstrapContext, REMNIUM_DARKER, ERItems.REMNIUM_INGOT, Style.EMPTY.withColor(5592405));
        TrimMaterials.register(bootstrapContext, CRYSTALLINE, ERItems.CRYSTALLINE_SHARD, Style.EMPTY.withColor(16777215));
    }

    private static ResourceKey<TrimMaterial> createResourceKey(String string) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, string));
    }
}