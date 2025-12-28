package net.legacy.end_reborn.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.legacy.end_reborn.registry.ERBlocks;
import net.legacy.end_reborn.registry.ERItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import org.jetbrains.annotations.NotNull;

public final class ERModelProvider extends FabricModelProvider {

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
        generator.createShelf(ERBlocks.CHORUS_SHELF, ERBlocks.STRIPPED_CHORUS_BLOCK);

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
		generator.generateFlatItem(ERItems.REMNANT_HELMET, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_CHESTPLATE, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_LEGGINGS, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_BOOTS, ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.FEATHERZEAL_HELMET, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_CHESTPLATE, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_LEGGINGS, ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_BOOTS, ModelTemplates.FLAT_ITEM);

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
        generator.generateSpear(ERItems.REMNANT_SPEAR);

		generator.generateFlatItem(ERItems.FEATHERZEAL_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateSpear(ERItems.FEATHERZEAL_SPEAR);

        generator.generateFlatItem(ERItems.REMNANT_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ERItems.REMNANT_NAUTILUS_ARMOR, ModelTemplates.FLAT_ITEM);

        generator.generateFlatItem(ERItems.FEATHERZEAL_HORSE_ARMOR, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ERItems.FEATHERZEAL_NAUTILUS_ARMOR, ModelTemplates.FLAT_ITEM);

	}
}
