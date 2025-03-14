package net.legacy.end_reborn.registry;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.legacy.end_reborn.ERConstants;
import net.minecraft.resources.ResourceLocation;
import net.ramixin.mixson.Mixson;
import net.ramixin.mixson.events.ModificationEvent;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class ERTrimItemModels {
    private static final List<String> ARMORS = List.of("helmet", "chestplate", "leggings", "boots");
    private static final List<String> ARMOR_MATERIALS = List.of("leather", "chainmail", "iron", "golden", "diamond", "netherite");
    private static final List<String> ARMOR_MATERIALS_REMNANT = List.of("remnant");
    private static final List<String> ARMOR_MATERIALS_FEATHERZEAL = List.of("featherzeal");

    @SuppressWarnings("UnnecessaryReturnStatement")
    private ERTrimItemModels() {
        return;
    }

    public static void init() {
        /*
         * Add trim materials to each armor.
         */
        ARMORS.forEach(armor -> ARMOR_MATERIALS.forEach(armorMaterial -> registerAddTrimsToArmor(armor, armorMaterial)));
        ARMORS.forEach(armor -> ARMOR_MATERIALS_REMNANT.forEach(armorMaterial -> registerAddTrimsToArmorRemnant(armor, armorMaterial)));
        ARMORS.forEach(armor -> ARMOR_MATERIALS_FEATHERZEAL.forEach(armorMaterial -> registerAddTrimsToArmorFeatherzeal(armor, armorMaterial)));

        // (dare to be different)
        registerAddTrimsToArmor("helmet", "turtle");

        /*
         * Add trim materials to vanilla atlases.
         */
        registerAddTrimsToAtlas("armor_trims");
        registerAddTrimsToAtlas("blocks");
    }

    private static void registerAddTrimsToArmor(String armor, String armorMaterial) {
        Mixson.registerModificationEvent(
                ResourceLocation.withDefaultNamespace("items/" + armorMaterial + "_" + armor),
                ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "add_trims_to_" + armorMaterial + "_" + armor),
                new ModificationEvent() {
                    @Override
                    public @NotNull JsonElement run(JsonElement elem) {
                        JsonObject root = elem.getAsJsonObject();
                        JsonObject model = root.getAsJsonObject("model");
                        JsonArray cases = model.getAsJsonArray("cases");
                        JsonObject case0 = cases.get(0).getAsJsonObject();

                        ERTrimMaterials.TRIM_MATERIALS.forEach(trim -> {
                            JsonObject newCase = case0.deepCopy();

                            newCase.addProperty("when", trimMaterialId(trim).toString());
                            newCase.getAsJsonObject("model")
                                    .addProperty("model", itemModelId(armor, armorMaterial, trim).toString());

                            cases.add(newCase);
                        });

                        return elem;
                    }

                    @Override
                    public int ordinal() {
                        return 0;
                    }
                }
        );
    }

    private static void registerAddTrimsToArmorRemnant(String armor, String armorMaterial) {
        Mixson.registerModificationEvent(
                ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "items/" + armorMaterial + "_" + armor),
                ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "add_trims_to_" + armorMaterial + "_" + armor),
                new ModificationEvent() {
                    @Override
                    public @NotNull JsonElement run(JsonElement elem) {
                        JsonObject root = elem.getAsJsonObject();
                        JsonObject model = root.getAsJsonObject("model");
                        JsonArray cases = model.getAsJsonArray("cases");
                        JsonObject case0 = cases.get(0).getAsJsonObject();

                        ERTrimMaterials.TRIM_MATERIALS.forEach(trim -> {
                            JsonObject newCase = case0.deepCopy();

                            newCase.addProperty("when", trimMaterialId(trim).toString());
                            newCase.getAsJsonObject("model")
                                    .addProperty("model", itemModelId(armor, armorMaterial, trim).toString());

                            cases.add(newCase);
                        });

                        return elem;
                    }

                    @Override
                    public int ordinal() {
                        return 0;
                    }
                }
        );
    }

    private static void registerAddTrimsToArmorFeatherzeal(String armor, String armorMaterial) {
        Mixson.registerModificationEvent(
                ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "items/" + armorMaterial + "_" + armor),
                ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "add_trims_to_" + armorMaterial + "_" + armor),
                new ModificationEvent() {
                    @Override
                    public @NotNull JsonElement run(JsonElement elem) {
                        JsonObject root = elem.getAsJsonObject();
                        JsonObject model = root.getAsJsonObject("model");
                        JsonArray cases = model.getAsJsonArray("cases");
                        JsonObject case0 = cases.get(0).getAsJsonObject();

                        ERTrimMaterials.TRIM_MATERIALS.forEach(trim -> {
                            JsonObject newCase = case0.deepCopy();

                            newCase.addProperty("when", trimMaterialId(trim).toString());
                            newCase.getAsJsonObject("model")
                                    .addProperty("model", itemModelId(armor, armorMaterial, trim).toString());

                            cases.add(newCase);
                        });

                        return elem;
                    }

                    @Override
                    public int ordinal() {
                        return 0;
                    }
                }
        );
    }

    private static void registerAddTrimsToAtlas(String name) {
        Mixson.registerModificationEvent(
                ResourceLocation.withDefaultNamespace("atlases/" + name),
                ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "add_trims_to_" + name + "_atlas"),
                new ModificationEvent() {
                    @Override
                    public @NotNull JsonElement run(JsonElement elem) {
                        JsonObject root = elem.getAsJsonObject();
                        JsonArray sources = root.getAsJsonArray("sources");

                        for (int i = 0; i < sources.size(); ++i) {
                            JsonObject source = sources.get(i).getAsJsonObject();

                            if ("paletted_permutations".equals(source.getAsJsonPrimitive("type").getAsString())) {
                                JsonObject permutations = source.getAsJsonObject("permutations");

                                ERTrimMaterials.TRIM_MATERIALS.forEach(trim ->
                                        permutations.addProperty(trim, paletteId(trim).toString())
                                );

                                break;
                            }
                        }

                        return elem;
                    }

                    @Override
                    public int ordinal() {
                        return 0;
                    }
                }
        );
    }

    private static ResourceLocation trimMaterialId(String trim) {
        return ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, trim);
    }

    private static ResourceLocation itemModelId(String armor, String armorMaterial, String trim) {
        return ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "item/" + armorMaterial + "_" + armor + "_" + trim + "_trim");
    }

    private static ResourceLocation paletteId(String trim) {
        return ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID, "trims/color_palettes/" + trim);
    }
}
