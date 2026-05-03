package net.rebel459.end_reborn.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.rebel459.end_reborn.registry.ERBlocks;
import net.rebel459.end_reborn.registry.ERItems;
import org.jetbrains.annotations.NotNull;

public final class ERModelProvider extends FabricModelProvider {

	public ERModelProvider(FabricPackOutput output) {
		super(output);
	}

	public static final BlockFamily FAMILY_AMETRUR = BlockFamilies.familyBuilder(ERBlocks.CUT_AMETRUR.get())
			.slab(ERBlocks.CUT_AMETRUR_SLAB.get())
			.stairs(ERBlocks.CUT_AMETRUR_STAIRS.get())
			.getFamily();

	public static final BlockFamily FAMILY_CHORUS = BlockFamilies.familyBuilder(ERBlocks.CHORUS_PLANKS.get())
			.button(ERBlocks.CHORUS_BUTTON.get())
			.slab(ERBlocks.CHORUS_SLAB.get())
			.stairs(ERBlocks.CHORUS_STAIRS.get())
			.fence(ERBlocks.CHORUS_FENCE.get())
			.fenceGate(ERBlocks.CHORUS_FENCE_GATE.get())
			.pressurePlate(ERBlocks.CHORUS_PRESSURE_PLATE.get())
			.sign(ERBlocks.CHORUS_SIGN.get(), ERBlocks.CHORUS_WALL_SIGN.get())
			.door(ERBlocks.CHORUS_DOOR.get())
			.trapdoor(ERBlocks.CHORUS_TRAPDOOR.get())
			.recipeGroupPrefix("wooden")
			.recipeUnlockedBy("has_planks")
			.getFamily();

	public static final BlockFamily FAMILY_CHORUS_MOSAIC = BlockFamilies.familyBuilder(ERBlocks.CHORUS_MOSAIC.get())
			.slab(ERBlocks.CHORUS_MOSAIC_SLAB.get())
			.stairs(ERBlocks.CHORUS_MOSAIC_STAIRS.get())
			.recipeGroupPrefix("wooden")
			.recipeUnlockedBy("has_planks")
			.getFamily();

	@Override
	public void generateBlockStateModels(@NotNull BlockModelGenerators generator) {
		generator.createTrivialCube(ERBlocks.REMNANT_BLOCK.get());
		generator.createTrivialCube(ERBlocks.FORGOTTEN_REMAINS.get());
		generator.createTrivialCube(ERBlocks.FEATHERZEAL_BLOCK.get());
		// Timelost Fragments
		generator.createTrivialCube(ERBlocks.CRYSTALLINE_LAMP.get());
		generator.createTrivialCube(ERBlocks.CRYSTALLINE_BLOCK.get());
		generator.createTrivialCube(ERBlocks.END_IRON_ORE.get());
		generator.createTrivialCube(ERBlocks.MIRESTONE_IRON_ORE.get());
		generator.createTrivialCube(ERBlocks.RAW_CRYSTALLINE_BLOCK.get());
		generator.createDoor(ERBlocks.CHORUS_DOOR.get());
		generator.createTrapdoor(ERBlocks.CHORUS_TRAPDOOR.get());
        generator.createShelf(ERBlocks.CHORUS_SHELF.get(), ERBlocks.STRIPPED_CHORUS_BLOCK.get());

		generator.createLantern(ERBlocks.CRYSTALLINE_LANTERN.get());

		generator.createTrivialCube(ERBlocks.PURPUR.get());
		generator.createTrivialCube(ERBlocks.AMETRUR.get());
		generator.createRotatedPillarWithHorizontalVariant(ERBlocks.CUT_AMETRUR_PILLAR.get(), TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT);
		BlockModelGenerators.BlockFamilyProvider ametrurFamily = generator.family(ERBlocks.CUT_AMETRUR.get());
		ametrurFamily.generateFor(FAMILY_AMETRUR);

		BlockModelGenerators.BlockFamilyProvider chorusFamily = generator.family(ERBlocks.CHORUS_PLANKS.get());
		chorusFamily.skipGeneratingModelsFor.add(ERBlocks.CHORUS_DOOR.get());
		chorusFamily.skipGeneratingModelsFor.add(ERBlocks.CHORUS_TRAPDOOR.get());
		chorusFamily.generateFor(FAMILY_CHORUS);
		generator.woodProvider(ERBlocks.CHORUS_BLOCK.get()).logWithHorizontal(ERBlocks.CHORUS_BLOCK.get());
		generator.woodProvider(ERBlocks.STRIPPED_CHORUS_BLOCK.get()).logWithHorizontal(ERBlocks.STRIPPED_CHORUS_BLOCK.get());
		generator.createHangingSign(ERBlocks.STRIPPED_CHORUS_BLOCK.get(), ERBlocks.CHORUS_HANGING_SIGN.get(), ERBlocks.CHORUS_WALL_HANGING_SIGN.get());

		BlockModelGenerators.BlockFamilyProvider chorusMosaicFamily = generator.family(ERBlocks.CHORUS_MOSAIC.get());
		chorusMosaicFamily.generateFor(FAMILY_CHORUS_MOSAIC);
	}

	@Override
	public void generateItemModels(@NotNull ItemModelGenerators generator) {
		generator.generateFlatItem(ERItems.REMNANT_HELMET.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_BOOTS.get(), ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.FEATHERZEAL_HELMET.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_CHESTPLATE.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_BOOTS.get(), ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.CHORUS_RAFT.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.CHORUS_CHEST_RAFT.get(), ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.CHORUS_SPINE.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.CRYSTALLINE_SHARD.get(), ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.REMNANT_INGOT.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_SCRAP.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.FEATHERZEAL_INGOT.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_SCRAP.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.REMNANT_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.REMNANT_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateSpear(ERItems.REMNANT_SPEAR.get());

		generator.generateFlatItem(ERItems.FEATHERZEAL_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        generator.generateSpear(ERItems.FEATHERZEAL_SPEAR.get());

        generator.generateFlatItem(ERItems.REMNANT_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(ERItems.REMNANT_NAUTILUS_ARMOR.get(), ModelTemplates.FLAT_ITEM);

        generator.generateFlatItem(ERItems.FEATHERZEAL_HORSE_ARMOR.get(), ModelTemplates.FLAT_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_NAUTILUS_ARMOR.get(), ModelTemplates.FLAT_ITEM);

		generator.generateFlatItem(ERItems.REMNANT_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(ERItems.FEATHERZEAL_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
	}
}
