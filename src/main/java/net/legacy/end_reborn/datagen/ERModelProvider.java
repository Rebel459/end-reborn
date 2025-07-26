package net.legacy.end_reborn.datagen;

import com.mojang.datafixers.util.Pair;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.legacy.end_reborn.*;
import net.legacy.end_reborn.registry.*;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class ERModelProvider extends FabricModelProvider {
	public static final MaterialAssetGroup REMNANT_INGOT = MaterialAssetGroup.create("remnant_ingot", Map.of(EREquipmentAssets.REMNANT, "remnant_ingot_darker"));
	public static final MaterialAssetGroup REMNANT_INGOT_DARKER = MaterialAssetGroup.create("remnant_ingot_darker");
	public static final MaterialAssetGroup FEATHERZEAL_INGOT = MaterialAssetGroup.create("featherzeal_ingot", Map.of(EREquipmentAssets.FEATHERZEAL, "featherzeal_ingot_darker"));
	public static final MaterialAssetGroup FEATHERZEAL_INGOT_DARKER = MaterialAssetGroup.create("featherzeal_ingot_darker");
	public static final MaterialAssetGroup CRYSTALLINE_SHARD = MaterialAssetGroup.create("crystalline_shard");

	private static final List<ItemModelGenerators.TrimMaterialData> TRIM_MATERIALS = List.of(
			new ItemModelGenerators.TrimMaterialData(REMNANT_INGOT, ERTrimMaterials.REMNANT),
			new ItemModelGenerators.TrimMaterialData(REMNANT_INGOT_DARKER, ERTrimMaterials.REMNANT_DARKER),
			new ItemModelGenerators.TrimMaterialData(FEATHERZEAL_INGOT, ERTrimMaterials.FEATHERZEAL),
			new ItemModelGenerators.TrimMaterialData(FEATHERZEAL_INGOT_DARKER, ERTrimMaterials.FEATHERZEAL_DARKER),
			new ItemModelGenerators.TrimMaterialData(CRYSTALLINE_SHARD, ERTrimMaterials.CRYSTALLINE)
	);

	public ERModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(@NotNull BlockModelGenerators generator) {
		generator.createTrivialCube(ERBlocks.REMNANT_BLOCK);
		generator.createTrivialCube(ERBlocks.FORGOTTEN_REMAINS);
		generator.createTrivialCube(ERBlocks.FEATHERZEAL_BLOCK);
		// Timelost Fragments
		generator.createTrivialCube(ERBlocks.CRYSTALLINE_LAMP);
		generator.createTrivialCube(ERBlocks.CRYSTALLINE_BLOCK);
		generator.createTrivialCube(ERBlocks.END_IRON_ORE);
		generator.createTrivialCube(ERBlocks.MIRESTONE_IRON_ORE);
		generator.createTrivialCube(ERBlocks.RAW_CRYSTALLINE_BLOCK);
		generator.createDoor(ERBlocks.CHORUS_DOOR);
		generator.createTrapdoor(ERBlocks.CHORUS_TRAPDOOR);

		generator.createLantern(ERBlocks.CRYSTALLINE_LANTERN);

		generator.createTrivialCube(ERBlocks.PURPUR);
		generator.createTrivialCube(ERBlocks.AMETRUR);
		generator.createRotatedPillarWithHorizontalVariant(ERBlocks.CUT_AMETRUR_PILLAR, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);
		BlockModelGenerators.BlockFamilyProvider ametrurFamily = generator.family(ERBlocks.CUT_AMETRUR);
		ametrurFamily.generateFor(ERBlocks.FAMILY_AMETRUR);

		BlockModelGenerators.BlockFamilyProvider chorusFamily = generator.family(ERBlocks.CHORUS_PLANKS);
		chorusFamily.skipGeneratingModelsFor.add(ERBlocks.CHORUS_DOOR);
		chorusFamily.skipGeneratingModelsFor.add(ERBlocks.CHORUS_TRAPDOOR);
		chorusFamily.generateFor(ERBlocks.FAMILY_CHORUS);
		generator.woodProvider(ERBlocks.CHORUS_BLOCK).logWithHorizontal(ERBlocks.CHORUS_BLOCK);
		generator.woodProvider(ERBlocks.STRIPPED_CHORUS_BLOCK).logWithHorizontal(ERBlocks.STRIPPED_CHORUS_BLOCK);
		generator.createHangingSign(ERBlocks.STRIPPED_CHORUS_BLOCK, ERBlocks.CHORUS_HANGING_SIGN, ERBlocks.CHORUS_WALL_HANGING_SIGN);

		BlockModelGenerators.BlockFamilyProvider chorusMosaicFamily = generator.family(ERBlocks.CHORUS_MOSAIC);
		chorusMosaicFamily.generateFor(ERBlocks.FAMILY_CHORUS_MOSAIC);
	}

	@Override
	public void generateItemModels(@NotNull ItemModelGenerators generator) {
		generator.generateTrimmableItem(ERItems.REMNANT_HELMET, EREquipmentAssets.REMNANT, ResourceLocation.withDefaultNamespace("trims/items/helmet_trim"), false);
		generator.generateTrimmableItem(ERItems.REMNANT_CHESTPLATE, EREquipmentAssets.REMNANT, ResourceLocation.withDefaultNamespace("trims/items/chestplate_trim"), false);
		generator.generateTrimmableItem(ERItems.REMNANT_LEGGINGS, EREquipmentAssets.REMNANT, ResourceLocation.withDefaultNamespace("trims/items/leggings_trim"), false);
		generator.generateTrimmableItem(ERItems.REMNANT_BOOTS, EREquipmentAssets.REMNANT, ResourceLocation.withDefaultNamespace("trims/items/boots_trim"), false);

		generator.generateTrimmableItem(ERItems.FEATHERZEAL_HELMET, EREquipmentAssets.FEATHERZEAL, ResourceLocation.withDefaultNamespace("trims/items/helmet_trim"), false);
		generator.generateTrimmableItem(ERItems.FEATHERZEAL_CHESTPLATE, EREquipmentAssets.FEATHERZEAL, ResourceLocation.withDefaultNamespace("trims/items/chestplate_trim"), false);
		generator.generateTrimmableItem(ERItems.FEATHERZEAL_LEGGINGS, EREquipmentAssets.FEATHERZEAL, ResourceLocation.withDefaultNamespace("trims/items/leggings_trim"), false);
		generator.generateTrimmableItem(ERItems.FEATHERZEAL_BOOTS, EREquipmentAssets.FEATHERZEAL, ResourceLocation.withDefaultNamespace("trims/items/boots_trim"), false);

		generator.generateFlatItem(ERItems.CHORUS_RAFT, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.CHORUS_CHEST_RAFT, ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.CHORUS_SPINE, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.CRYSTALLINE_SHARD, ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.REMNANT_INGOT, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_SCRAP, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.FEATHERZEAL_INGOT, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_SCRAP, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.REMNANT_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

		generator.generateFlatItem(ERItems.FEATHERZEAL_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);

		generator.generateFlatItem(ERItems.REMNANT_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.FEATHERZEAL_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);

		this.registerArmorTrims(generator, Items.TURTLE_HELMET, EquipmentAssets.TURTLE_SCUTE, "helmet", false);
		this.registerArmorTrims(generator, Items.LEATHER_HELMET, EquipmentAssets.LEATHER, "helmet", true);
		this.registerArmorTrims(generator, Items.LEATHER_CHESTPLATE, EquipmentAssets.LEATHER, "chestplate", true);
		this.registerArmorTrims(generator, Items.LEATHER_LEGGINGS, EquipmentAssets.LEATHER, "leggings", true);
		this.registerArmorTrims(generator, Items.LEATHER_BOOTS, EquipmentAssets.LEATHER, "boots", true);
		this.registerArmorTrims(generator, Items.CHAINMAIL_HELMET, EquipmentAssets.CHAINMAIL, "helmet", false);
		this.registerArmorTrims(generator, Items.CHAINMAIL_CHESTPLATE, EquipmentAssets.CHAINMAIL, "chestplate", false);
		this.registerArmorTrims(generator, Items.CHAINMAIL_LEGGINGS, EquipmentAssets.CHAINMAIL, "leggings", false);
		this.registerArmorTrims(generator, Items.CHAINMAIL_BOOTS, EquipmentAssets.CHAINMAIL, "boots", false);
		this.registerArmorTrims(generator, Items.IRON_HELMET, EquipmentAssets.IRON, "helmet", false);
		this.registerArmorTrims(generator, Items.IRON_CHESTPLATE, EquipmentAssets.IRON, "chestplate", false);
		this.registerArmorTrims(generator, Items.IRON_LEGGINGS, EquipmentAssets.IRON, "leggings", false);
		this.registerArmorTrims(generator, Items.IRON_BOOTS, EquipmentAssets.IRON, "boots", false);
		this.registerArmorTrims(generator, Items.DIAMOND_HELMET, EquipmentAssets.DIAMOND, "helmet", false);
		this.registerArmorTrims(generator, Items.DIAMOND_CHESTPLATE, EquipmentAssets.DIAMOND, "chestplate", false);
		this.registerArmorTrims(generator, Items.DIAMOND_LEGGINGS, EquipmentAssets.DIAMOND, "leggings", false);
		this.registerArmorTrims(generator, Items.DIAMOND_BOOTS, EquipmentAssets.DIAMOND, "boots", false);
		this.registerArmorTrims(generator, Items.GOLDEN_HELMET, EquipmentAssets.GOLD, "helmet", false);
		this.registerArmorTrims(generator, Items.GOLDEN_CHESTPLATE, EquipmentAssets.GOLD, "chestplate", false);
		this.registerArmorTrims(generator, Items.GOLDEN_LEGGINGS, EquipmentAssets.GOLD, "leggings", false);
		this.registerArmorTrims(generator, Items.GOLDEN_BOOTS, EquipmentAssets.GOLD, "boots", false);
		this.registerArmorTrims(generator, Items.NETHERITE_HELMET, EquipmentAssets.NETHERITE, "helmet", false);
		this.registerArmorTrims(generator, Items.NETHERITE_CHESTPLATE, EquipmentAssets.NETHERITE, "chestplate", false);
		this.registerArmorTrims(generator, Items.NETHERITE_LEGGINGS, EquipmentAssets.NETHERITE, "leggings", false);
		this.registerArmorTrims(generator, Items.NETHERITE_BOOTS, EquipmentAssets.NETHERITE, "boots", false);

		this.registerArmorTrims(generator, ERItems.REMNANT_HELMET, EREquipmentAssets.REMNANT, "helmet", false);
		this.registerArmorTrims(generator, ERItems.REMNANT_CHESTPLATE, EREquipmentAssets.REMNANT, "chestplate", false);
		this.registerArmorTrims(generator, ERItems.REMNANT_LEGGINGS, EREquipmentAssets.REMNANT, "leggings", false);
		this.registerArmorTrims(generator, ERItems.REMNANT_BOOTS, EREquipmentAssets.REMNANT, "boots", false);

		this.registerArmorTrims(generator, ERItems.FEATHERZEAL_HELMET, EREquipmentAssets.FEATHERZEAL, "helmet", false);
		this.registerArmorTrims(generator, ERItems.FEATHERZEAL_CHESTPLATE, EREquipmentAssets.FEATHERZEAL, "chestplate", false);
		this.registerArmorTrims(generator, ERItems.FEATHERZEAL_LEGGINGS, EREquipmentAssets.FEATHERZEAL, "leggings", false);
		this.registerArmorTrims(generator, ERItems.FEATHERZEAL_BOOTS, EREquipmentAssets.FEATHERZEAL, "boots", false);

	}

	@Contract("_, _ -> new")
	private static @NotNull ModelTemplate createItem(String string, TextureSlot... textureSlots) {
		return new ModelTemplate(Optional.of(ERConstants.id("item/" + string)), Optional.empty(), textureSlots);
	}

	private void uploadArmor2(ItemModelGenerators generator, ResourceLocation id, ResourceLocation layer0, ResourceLocation layer1) {
		ModelTemplates.TWO_LAYERED_ITEM.create(id, TextureMapping.layered(layer0, layer1), generator.modelOutput);
	}

	private void uploadArmor3(ItemModelGenerators generator, ResourceLocation id, ResourceLocation layer0, ResourceLocation layer1, ResourceLocation layer2) {
		ModelTemplates.THREE_LAYERED_ITEM.create(id, TextureMapping.layered(layer0, layer1, layer2), generator.modelOutput);
	}

	private void registerArmorTrims(ItemModelGenerators generator, Item armor, ResourceKey<EquipmentAsset> equipmentKey, String armorType, boolean dyeable) {
		ResourceLocation armorModelId = TextureMapping.getItemTexture(armor);
		ResourceLocation armorTextures = TextureMapping.getItemTexture(armor);
		ResourceLocation armorOverlayTextures = TextureMapping.getItemTexture(armor, "_overlay");
		for (ItemModelGenerators.TrimMaterialData trimMaterial : TRIM_MATERIALS) {
			ResourceLocation trimmedModelId = ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID,
					armorModelId.getPath()).withSuffix("_" + trimMaterial.assets().base().suffix() + "_trim");
			ResourceLocation trimTextureId = ResourceLocation.withDefaultNamespace(
					"trims/items/" + armorType + "_trim_" + trimMaterial.assets().assetId(equipmentKey).suffix());
			if (dyeable) {
				this.uploadArmor3(generator, trimmedModelId, armorTextures, armorOverlayTextures, trimTextureId);
			} else {
				this.uploadArmor2(generator, trimmedModelId, armorTextures, trimTextureId);
			}
		}
	}
}
