package net.legacy.end_reborn;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;

import java.util.List;
import java.util.Map;

public class ERTrimMaterials {
    public static final List<String> TRIM_MATERIALS = List.of("remnant_ingot", "remnant_ingot_darker");

    public static final ResourceKey<TrimMaterial> REMNANT = createResourceKey("remnant_ingot");
    public static final ResourceKey<TrimMaterial> REMNANT_DARKER = createResourceKey("remnant_ingot_darker");

    public static void bootstrap(BootstrapContext<TrimMaterial> bootstrapContext) {
        TrimMaterials.register(bootstrapContext, REMNANT, ERItems.REMNANT_INGOT, Style.EMPTY.withColor(5592405), Map.of(EREquipmentAssets.REMNANT, "remnant_ingot_darker"));
        TrimMaterials.register(bootstrapContext, REMNANT_DARKER, ERItems.REMNANT_INGOT, Style.EMPTY.withColor(5592405));
    }

    private static ResourceKey<TrimMaterial> createResourceKey(String string) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, string));
    }
}