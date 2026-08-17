package net.legacy.end_reborn.registry;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.legacy.end_reborn.ERConstants;
import net.minecraft.resources.ResourceLocation;
import net.ramixin.mixson.inline.Mixson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class ERTrimItemModels {
    private static final List<String> ARMOR_PIECE_TYPES = List.of("helmet", "chestplate", "leggings", "boots");

    private static final List<ResourceLocation> ARMOR_MATERIALS = List.of(
            ResourceLocation.withDefaultNamespace("leather"),
            ResourceLocation.withDefaultNamespace("chainmail"),
            ResourceLocation.withDefaultNamespace("iron"),
            ResourceLocation.withDefaultNamespace("golden"),
            ResourceLocation.withDefaultNamespace("diamond"),
            ResourceLocation.withDefaultNamespace("netherite")
    );


    public static void init() {}

    static {
        ARMOR_PIECE_TYPES.forEach(armorType -> ARMOR_MATERIALS.forEach(material -> registerItemModelModification(armorType, material)));
        registerItemModelModification("helmet", ResourceLocation.withDefaultNamespace("turtle"));

        registerAtlasModification("armor_trims");
        registerAtlasModification("blocks");
    }

    private static void registerItemModelModification(String armorPieceType, ResourceLocation armorMaterial) {
        Mixson.registerEvent(
                1,
                ResourceLocation.fromNamespaceAndPath(armorMaterial.getNamespace(), "models/item/" + armorMaterial.getPath() + "_" + armorPieceType).toString(),
                ERConstants.id("add_trims_to_" + armorMaterial.getPath() + "_" + armorPieceType).toString(),
                (context) -> {
                    JsonObject rootJson = context.getFile().getAsJsonObject();
                    JsonArray overridesArray = rootJson.getAsJsonArray("overrides");
                    if (overridesArray == null) {
                        overridesArray = new JsonArray();
                        rootJson.add("overrides", overridesArray);
                    }

                    List<JsonElement> entries = new ArrayList<>();
                    overridesArray.asList().forEach(entries::add);

                    ERTrimMaterials.TRIM_MATERIALS.forEach(trimMaterial -> {
                        String trimName = trimMaterial.location().getPath();
                        if (trimName.endsWith("_darker")) {
                            return;
                        }
                        entries.add(createTrimOverride(
                                ERTrimMaterials.ITEM_MODEL_INDICES.get(trimMaterial.location()),
                                ERConstants.id("item/" + armorMaterial.getPath() + "_" + armorPieceType + "_" + trimName + "_trim")
                        ));
                    });

                    entries.sort(Comparator.comparingDouble(entry -> entry.getAsJsonObject().getAsJsonObject("predicate").get("trim_type").getAsFloat()));

                    JsonArray sortedArray = new JsonArray();
                    entries.forEach(sortedArray::add);
                    rootJson.add("overrides", sortedArray);
                }
        );
    }

    private static JsonObject createTrimOverride(float trimTypeIndex, ResourceLocation model) {
        JsonObject override = new JsonObject();
        JsonObject predicate = new JsonObject();
        predicate.addProperty("trim_type", trimTypeIndex);
        override.add("predicate", predicate);
        override.addProperty("model", model.toString());
        return override;
    }

    private static void registerAtlasModification(String atlasName) {
        Mixson.registerEvent(
                1,
                ResourceLocation.withDefaultNamespace("atlases/" + atlasName).toString(),
                ERConstants.id("add_trims_to_" + atlasName + "_atlas").toString(),
                (context) -> {
                    JsonObject rootJson = context.getFile().getAsJsonObject();
                    JsonArray sourcesArray = rootJson.getAsJsonArray("sources");

                    for (JsonElement sourceElement : sourcesArray) {
                        JsonObject sourceObject = sourceElement.getAsJsonObject();

                        if ("paletted_permutations".equals(sourceObject.get("type").getAsString())) {
                            JsonObject permutationsJson = sourceObject.getAsJsonObject("permutations");

                            ERTrimMaterials.TRIM_MATERIALS.forEach(trimMaterial -> {
                                String trimName = trimMaterial.location().getPath();
                                permutationsJson.addProperty(trimName, ERConstants.id("trims/color_palettes/" + trimName).toString());
                            });

                            break;
                        }
                    }
                }
        );
    }
}
