package net.legacy.end_reborn.datagen;

import com.mojang.datafixers.util.Pair;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.legacy.end_reborn.*;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.Variant;
import net.minecraft.client.data.models.blockstates.VariantProperties;
import net.minecraft.client.model.BoatModel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class ERModelProvider extends FabricModelProvider {
	private static final List<ItemModelGenerators.TrimMaterialData> TRIM_MATERIALS = List.of(
			new ItemModelGenerators.TrimMaterialData("remnium_ingot", ERTrimMaterials.REMNIUM, Map.of()),
			new ItemModelGenerators.TrimMaterialData("crystalline_shard", ERTrimMaterials.CRYSTALLINE, Map.of())
	);
	private static final List<ItemModelGenerators.TrimMaterialData> TRIM_MATERIALS_REMNIUM_ONLY = List.of(
			new ItemModelGenerators.TrimMaterialData("remnium_ingot", ERTrimMaterials.REMNIUM, Map.of())
	);
	private static final List<ItemModelGenerators.TrimMaterialData> TRIM_MATERIALS_NOT_REMNIUM = List.of(
			new ItemModelGenerators.TrimMaterialData("crystalline_shard", ERTrimMaterials.CRYSTALLINE, Map.of())
	);

	public static final List<Pair<BooleanProperty, Function<ResourceLocation, Variant>>> MULTIFACE_GENERATOR_NO_UV_LOCK = List.of(
			Pair.of(BlockStateProperties.NORTH, model -> Variant.variant().with(VariantProperties.MODEL, model)),
			Pair.of(
					BlockStateProperties.EAST,
					model -> Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
			),
			Pair.of(
					BlockStateProperties.SOUTH,
					model -> Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)
			),
			Pair.of(
					BlockStateProperties.WEST,
					model -> Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)
			),
			Pair.of(
					BlockStateProperties.UP,
					model -> Variant.variant().with(VariantProperties.MODEL, model).with(VariantProperties.X_ROT, VariantProperties.Rotation.R270)
			),
			Pair.of(
					BlockStateProperties.DOWN,
					resourceLocation -> Variant.variant()
							.with(VariantProperties.MODEL, resourceLocation)
							.with(VariantProperties.X_ROT, VariantProperties.Rotation.R90)
			)
	);

	public ERModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(@NotNull BlockModelGenerators generator) {
		generator.createTrivialCube(ERBlocks.CRACKED_END_STONE_BRICKS);
		generator.createTrivialCube(ERBlocks.REMNIUM_BLOCK);
		generator.createTrivialCube(ERBlocks.FORGOTTEN_REMAINS);
		generator.createTrivialCube(ERBlocks.CRYSTALLINE_LAMP);
		generator.createTrivialCube(ERBlocks.CRYSTALLINE_BLOCK);
		generator.createTrivialCube(ERBlocks.END_IRON_ORE);
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
		generator.generateTrimmableItem(ERGearItems.REMNIUM_HELMET, EREquipmentAssets.REMNIUM, "helmet", false);
		generator.generateTrimmableItem(ERGearItems.REMNIUM_CHESTPLATE, EREquipmentAssets.REMNIUM, "chestplate", false);
		generator.generateTrimmableItem(ERGearItems.REMNIUM_LEGGINGS, EREquipmentAssets.REMNIUM, "leggings", false);
		generator.generateTrimmableItem(ERGearItems.REMNIUM_BOOTS, EREquipmentAssets.REMNIUM, "boots", false);

		generator.generateFlatItem(ERItems.CHORUS_RAFT, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.CHORUS_CHEST_RAFT, ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.REMNIUM_INGOT, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNIUM_SCRAP, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.CHORUS_SPINE, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.CRYSTALLINE_SHARD, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNIUM_UPGRADE_SMITHING_TEMPLATE, ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERGearItems.REMNIUM_SWORD, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERGearItems.REMNIUM_AXE, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERGearItems.REMNIUM_PICKAXE, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERGearItems.REMNIUM_SHOVEL, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERGearItems.REMNIUM_HOE, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERGearItems.REMNIUM_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);

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

		this.registerArmorTrimsRemnantDarker(generator, ERGearItems.REMNIUM_HELMET, EREquipmentAssets.REMNIUM, "helmet", false);
		this.registerArmorTrimsRemnantDarker(generator, ERGearItems.REMNIUM_CHESTPLATE, EREquipmentAssets.REMNIUM, "chestplate", false);
		this.registerArmorTrimsRemnantDarker(generator, ERGearItems.REMNIUM_LEGGINGS, EREquipmentAssets.REMNIUM, "leggings", false);
		this.registerArmorTrimsRemnantDarker(generator, ERGearItems.REMNIUM_BOOTS, EREquipmentAssets.REMNIUM, "boots", false);

		this.registerArmorTrimsNotRemnant(generator, ERGearItems.REMNIUM_HELMET, EREquipmentAssets.REMNIUM, "helmet", false);
		this.registerArmorTrimsNotRemnant(generator, ERGearItems.REMNIUM_CHESTPLATE, EREquipmentAssets.REMNIUM, "chestplate", false);
		this.registerArmorTrimsNotRemnant(generator, ERGearItems.REMNIUM_LEGGINGS, EREquipmentAssets.REMNIUM, "leggings", false);
		this.registerArmorTrimsNotRemnant(generator, ERGearItems.REMNIUM_BOOTS, EREquipmentAssets.REMNIUM, "boots", false);

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
					armorModelId.getPath()).withSuffix("_" + trimMaterial.name() + "_trim");
			ResourceLocation trimTextureId = ResourceLocation.withDefaultNamespace(
					"trims/items/" + armorType + "_trim_" + trimMaterial.textureName(equipmentKey));
			if (dyeable) {
				this.uploadArmor3(generator, trimmedModelId, armorTextures, armorOverlayTextures, trimTextureId);
			} else {
				this.uploadArmor2(generator, trimmedModelId, armorTextures, trimTextureId);
			}
		}
	}

	private void registerArmorTrimsRemnantDarker(ItemModelGenerators generator, Item armor, ResourceKey<EquipmentAsset> equipmentKey, String armorType, boolean dyeable) {
		ResourceLocation armorModelId = TextureMapping.getItemTexture(armor);
		ResourceLocation armorTextures = TextureMapping.getItemTexture(armor);
		ResourceLocation armorOverlayTextures = TextureMapping.getItemTexture(armor, "_overlay");
		for (ItemModelGenerators.TrimMaterialData trimMaterial : TRIM_MATERIALS_REMNIUM_ONLY) {
			ResourceLocation trimmedModelId = ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID,
					armorModelId.getPath()).withSuffix("_" + trimMaterial.name() + "_trim");
			ResourceLocation trimTextureId = ResourceLocation.withDefaultNamespace(
					"trims/items/" + armorType + "_trim_" + trimMaterial.textureName(equipmentKey) + "_darker");
			if (dyeable) {
				this.uploadArmor3(generator, trimmedModelId, armorTextures, armorOverlayTextures, trimTextureId);
			} else {
				this.uploadArmor2(generator, trimmedModelId, armorTextures, trimTextureId);
			}
		}
	}

	private void registerArmorTrimsNotRemnant(ItemModelGenerators generator, Item armor, ResourceKey<EquipmentAsset> equipmentKey, String armorType, boolean dyeable) {
		ResourceLocation armorModelId = TextureMapping.getItemTexture(armor);
		ResourceLocation armorTextures = TextureMapping.getItemTexture(armor);
		ResourceLocation armorOverlayTextures = TextureMapping.getItemTexture(armor, "_overlay");
		for (ItemModelGenerators.TrimMaterialData trimMaterial : TRIM_MATERIALS_NOT_REMNIUM) {
			ResourceLocation trimmedModelId = ResourceLocation.fromNamespaceAndPath(ERConstants.MOD_ID,
					armorModelId.getPath()).withSuffix("_" + trimMaterial.name() + "_trim");
			ResourceLocation trimTextureId = ResourceLocation.withDefaultNamespace(
					"trims/items/" + armorType + "_trim_" + trimMaterial.textureName(equipmentKey));
			if (dyeable) {
				this.uploadArmor3(generator, trimmedModelId, armorTextures, armorOverlayTextures, trimTextureId);
			} else {
				this.uploadArmor2(generator, trimmedModelId, armorTextures, trimTextureId);
			}
		}
	}

}
