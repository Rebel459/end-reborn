package net.legacy.end_reborn.registry;

import net.frozenblock.lib.item.api.FrozenCreativeTabs;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

public class ERCreativeInventorySorting {

	public static void init() {
		addBeforeInIngredients(Items.AMETHYST_SHARD, ERItems.CRYSTALLINE_SHARD);

		addBeforeInIngredients(Items.NETHERITE_SCRAP, ERItems.REMNANT_SCRAP);
		addAfterInIngredients(ERItems.REMNANT_SCRAP, ERItems.REMNANT_INGOT);
		addAfterInIngredients(Items.NETHERITE_INGOT, ERItems.FEATHERZEAL_SCRAP);
		addAfterInIngredients(ERItems.FEATHERZEAL_SCRAP, ERItems.FEATHERZEAL_INGOT);

		addBeforeInIngredients(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ERItems.REMNANT_UPGRADE_SMITHING_TEMPLATE);
		addAfterInIngredients(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ERItems.FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE);

		addAfterInIngredients(Items.STICK, ERItems.CHORUS_SPINE);

		addAfterInBuildingBlocks(Blocks.WARPED_BUTTON, ERBlocks.CHORUS_BLOCK);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_BLOCK, ERBlocks.STRIPPED_CHORUS_BLOCK);
		addAfterInBuildingBlocks(ERBlocks.STRIPPED_CHORUS_BLOCK, ERBlocks.CHORUS_PLANKS);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_PLANKS, ERBlocks.CHORUS_MOSAIC);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_MOSAIC, ERBlocks.CHORUS_STAIRS);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_STAIRS, ERBlocks.CHORUS_MOSAIC_STAIRS);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_MOSAIC_STAIRS, ERBlocks.CHORUS_SLAB);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_SLAB, ERBlocks.CHORUS_MOSAIC_SLAB);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_MOSAIC_SLAB, ERBlocks.CHORUS_FENCE);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_FENCE, ERBlocks.CHORUS_FENCE_GATE);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_FENCE_GATE, ERBlocks.CHORUS_DOOR);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_DOOR, ERBlocks.CHORUS_TRAPDOOR);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_TRAPDOOR, ERBlocks.CHORUS_PRESSURE_PLATE);
		addAfterInBuildingBlocks(ERBlocks.CHORUS_PRESSURE_PLATE, ERBlocks.CHORUS_BUTTON);

		addBeforeInBuildingBlocks(Blocks.PURPUR_BLOCK, ERBlocks.PURPUR);

		addAfterInBuildingBlocks(Blocks.PURPUR_SLAB, ERBlocks.AMETRUR);
		addAfterInBuildingBlocks(ERBlocks.AMETRUR, ERBlocks.CUT_AMETRUR);
		addAfterInBuildingBlocks(ERBlocks.CUT_AMETRUR, ERBlocks.CUT_AMETRUR_PILLAR);
		addAfterInBuildingBlocks(ERBlocks.CUT_AMETRUR_PILLAR, ERBlocks.CUT_AMETRUR_STAIRS);
		addAfterInBuildingBlocks(ERBlocks.CUT_AMETRUR_STAIRS, ERBlocks.CUT_AMETRUR_SLAB);

		addAfterInBuildingBlocks(Blocks.AMETHYST_BLOCK, ERBlocks.RAW_CRYSTALLINE_BLOCK);
		addAfterInBuildingBlocks(ERBlocks.RAW_CRYSTALLINE_BLOCK, ERBlocks.CRYSTALLINE_BLOCK);
		addAfterInBuildingBlocks(ERBlocks.CRYSTALLINE_BLOCK, ERBlocks.CRYSTALLINE_LAMP);

		addBeforeInBuildingBlocks(Blocks.NETHERITE_BLOCK, ERBlocks.REMNANT_BLOCK);
		addAfterInBuildingBlocks(Blocks.NETHERITE_BLOCK, ERBlocks.FEATHERZEAL_BLOCK);

		addAfterInNaturalBlocks(Blocks.AMETHYST_CLUSTER, ERBlocks.RAW_CRYSTALLINE_BLOCK);

		addAfterInNaturalBlocks(Blocks.DEEPSLATE_DIAMOND_ORE, ERBlocks.FORGOTTEN_REMAINS);

		addAfterInNaturalBlocks(Blocks.END_STONE, ERBlocks.PURPUR);
		addAfterInNaturalBlocks(ERBlocks.PURPUR, ERBlocks.AMETRUR);

		addAfterInNaturalBlocks(Blocks.ANCIENT_DEBRIS, ERBlocks.END_IRON_ORE);
		addAfterInNaturalBlocks(ERBlocks.END_IRON_ORE, ERBlocks.TIMELOST_FRAGMENTS);

		addAfterInFunctionalBlocks(Blocks.SOUL_LANTERN, ERBlocks.CRYSTALLINE_LANTERN);

		addAfterInFunctionalBlocks(Blocks.PEARLESCENT_FROGLIGHT, ERBlocks.RAW_CRYSTALLINE_BLOCK);
		addAfterInFunctionalBlocks(ERBlocks.RAW_CRYSTALLINE_BLOCK, ERBlocks.CRYSTALLINE_BLOCK);
		addAfterInFunctionalBlocks(ERBlocks.CRYSTALLINE_BLOCK, ERBlocks.CRYSTALLINE_LAMP);

		addAfterInToolsAndUtilities(Items.BAMBOO_CHEST_RAFT, ERItems.CHORUS_RAFT);
		addAfterInToolsAndUtilities(ERItems.CHORUS_RAFT, ERItems.CHORUS_CHEST_RAFT);

		addBeforeInToolsAndUtilities(Items.NETHERITE_SHOVEL, EREquipmentItems.REMNANT_SHOVEL);
		addAfterInToolsAndUtilities(EREquipmentItems.REMNANT_SHOVEL, EREquipmentItems.REMNANT_PICKAXE);
		addAfterInToolsAndUtilities(EREquipmentItems.REMNANT_PICKAXE, EREquipmentItems.REMNANT_AXE);
		addAfterInToolsAndUtilities(EREquipmentItems.REMNANT_AXE, EREquipmentItems.REMNANT_HOE);

		addAfterInToolsAndUtilities(Items.NETHERITE_HOE, EREquipmentItems.FEATHERZEAL_SHOVEL);
		addAfterInToolsAndUtilities(EREquipmentItems.FEATHERZEAL_SHOVEL, EREquipmentItems.FEATHERZEAL_PICKAXE);
		addAfterInToolsAndUtilities(EREquipmentItems.FEATHERZEAL_PICKAXE, EREquipmentItems.FEATHERZEAL_AXE);
		addAfterInToolsAndUtilities(EREquipmentItems.FEATHERZEAL_AXE, EREquipmentItems.FEATHERZEAL_HOE);

		addAfterInFunctionalBlocks(Items.WARPED_HANGING_SIGN, ERItems.CHORUS_SIGN);
		addAfterInFunctionalBlocks(ERItems.CHORUS_SIGN, ERItems.CHORUS_HANGING_SIGN);

		addBeforeInCombat(Items.NETHERITE_SWORD, EREquipmentItems.REMNANT_SWORD);
		addBeforeInCombat(Items.NETHERITE_AXE, EREquipmentItems.REMNANT_AXE);

		addBeforeInCombat(Items.NETHERITE_HELMET, EREquipmentItems.REMNANT_HELMET);
		addAfterInCombat(EREquipmentItems.REMNANT_HELMET, EREquipmentItems.REMNANT_CHESTPLATE);
		addAfterInCombat(EREquipmentItems.REMNANT_CHESTPLATE, EREquipmentItems.REMNANT_LEGGINGS);
		addAfterInCombat(EREquipmentItems.REMNANT_LEGGINGS, EREquipmentItems.REMNANT_BOOTS);

		addAfterInCombat(Items.NETHERITE_SWORD, EREquipmentItems.FEATHERZEAL_SWORD);
		addAfterInCombat(Items.NETHERITE_AXE, EREquipmentItems.FEATHERZEAL_AXE);

		addAfterInCombat(Items.NETHERITE_BOOTS, EREquipmentItems.FEATHERZEAL_HELMET);
		addAfterInCombat(EREquipmentItems.FEATHERZEAL_HELMET, EREquipmentItems.FEATHERZEAL_CHESTPLATE);
		addAfterInCombat(EREquipmentItems.FEATHERZEAL_CHESTPLATE, EREquipmentItems.FEATHERZEAL_LEGGINGS);
		addAfterInCombat(EREquipmentItems.FEATHERZEAL_LEGGINGS, EREquipmentItems.FEATHERZEAL_BOOTS);
	}

	private static void addAfterInNaturalBlocks(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addAfter(comparedItem, item, CreativeModeTabs.NATURAL_BLOCKS);
	}

	private static void addBeforeInBuildingBlocks(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addBefore(comparedItem, item, CreativeModeTabs.BUILDING_BLOCKS);
	}

	private static void addAfterInBuildingBlocks(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addAfter(comparedItem, item, CreativeModeTabs.BUILDING_BLOCKS);
	}

	private static void addAfterInRedstone(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addAfter(comparedItem, item, CreativeModeTabs.REDSTONE_BLOCKS);
	}

	private static void addAfterInFunctionalBlocks(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addAfter(comparedItem, item, CreativeModeTabs.FUNCTIONAL_BLOCKS);
	}

	private static void addBeforeInRedstoneBlocks(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addBefore(comparedItem, item, CreativeModeTabs.REDSTONE_BLOCKS);
	}

	private static void addBeforeInToolsAndUtilities(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addBefore(comparedItem, item, CreativeModeTabs.TOOLS_AND_UTILITIES);
	}

	private static void addAfterInToolsAndUtilities(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addAfter(comparedItem, item, CreativeModeTabs.TOOLS_AND_UTILITIES);
	}

	private static void addBeforeInIngredients(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addBefore(comparedItem, item, CreativeModeTabs.INGREDIENTS);
	}

	private static void addAfterInIngredients(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addAfter(comparedItem, item, CreativeModeTabs.INGREDIENTS);
	}

	private static void addBeforeInFoodAndDrinks(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addBefore(comparedItem, item, CreativeModeTabs.FOOD_AND_DRINKS);
	}

	private static void addAfterInFoodAndDrinks(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addAfter(comparedItem, item, CreativeModeTabs.FOOD_AND_DRINKS);
	}

	private static void addAfterInCombat(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addAfter(comparedItem, item, CreativeModeTabs.COMBAT);
	}

	private static void addBeforeInCombat(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addBefore(comparedItem, item, CreativeModeTabs.COMBAT);
	}

	private static void addBeforeInSpawnEggs(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addBefore(comparedItem, item, CreativeModeTabs.SPAWN_EGGS);
	}

	private static void addAfterInSpawnEggs(ItemLike comparedItem, ItemLike item) {
		FrozenCreativeTabs.addAfter(comparedItem, item, CreativeModeTabs.SPAWN_EGGS);
	}
}
