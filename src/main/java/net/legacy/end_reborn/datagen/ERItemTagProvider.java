package net.legacy.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.legacy.end_reborn.registry.ERBlocks;
import net.legacy.end_reborn.registry.EREquipmentItems;
import net.legacy.end_reborn.registry.ERItems;
import net.legacy.end_reborn.tag.ERItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class ERItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public ERItemTagProvider(@NotNull FabricDataOutput output, @NotNull CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	@Override
	protected void addTags(@NotNull HolderLookup.Provider arg) {
		this.getOrCreateTagBuilder(ERItemTags.VOID_IMMUNE)
				.add(ERItems.FEATHERZEAL_INGOT)
				.add(ERItems.FEATHERZEAL_SCRAP)
				.add(EREquipmentItems.FEATHERZEAL_SWORD)
				.add(EREquipmentItems.FEATHERZEAL_AXE)
				.add(EREquipmentItems.FEATHERZEAL_PICKAXE)
				.add(EREquipmentItems.FEATHERZEAL_SHOVEL)
				.add(EREquipmentItems.FEATHERZEAL_HOE)
				.add(ERItems.FEATHERZEAL_HELMET)
				.add(ERItems.FEATHERZEAL_CHESTPLATE)
				.add(ERItems.FEATHERZEAL_LEGGINGS)
				.add(ERItems.FEATHERZEAL_BOOTS)
				.add(ERItems.FEATHERZEAL_HORSE_ARMOR)
				.add(ERBlocks.TIMELOST_FRAGMENTS.asItem())
				.add(ERBlocks.FEATHERZEAL_BLOCK.asItem());

		this.getOrCreateTagBuilder(ERItemTags.REMNANT_TOOL_MATERIALS)
				.add(ERItems.REMNANT_INGOT);
		this.getOrCreateTagBuilder(ERItemTags.REPAIRS_REMNANT_ARMOR)
				.add(ERItems.REMNANT_INGOT);

		this.getOrCreateTagBuilder(ERItemTags.FEATHERZEAL_TOOL_MATERIALS)
				.add(ERItems.FEATHERZEAL_INGOT);
		this.getOrCreateTagBuilder(ERItemTags.REPAIRS_FEATHERZEAL_ARMOR)
				.add(ERItems.FEATHERZEAL_INGOT);

		this.getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
				.add(ERItems.REMNANT_INGOT)
				.add(ERItems.FEATHERZEAL_INGOT);

		this.getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
				.add(ERItems.REMNANT_HELMET)
				.add(ERItems.REMNANT_CHESTPLATE)
				.add(ERItems.REMNANT_LEGGINGS)
				.add(ERItems.REMNANT_BOOTS)
				.add(ERItems.FEATHERZEAL_HELMET)
				.add(ERItems.FEATHERZEAL_CHESTPLATE)
				.add(ERItems.FEATHERZEAL_LEGGINGS)
				.add(ERItems.FEATHERZEAL_BOOTS);

		this.getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
				.add(ERItems.REMNANT_INGOT)
				.add(ERItems.FEATHERZEAL_INGOT)
				.add(ERItems.CRYSTALLINE_SHARD);
		this.getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
				.add(ERItems.REMNANT_HELMET)
				.add(ERItems.FEATHERZEAL_HELMET);
		this.getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
				.add(ERItems.REMNANT_CHESTPLATE)
				.add(ERItems.FEATHERZEAL_CHESTPLATE);
		this.getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
				.add(ERItems.REMNANT_LEGGINGS)
				.add(ERItems.FEATHERZEAL_LEGGINGS);
		this.getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
				.add(ERItems.REMNANT_BOOTS)
				.add(ERItems.FEATHERZEAL_BOOTS);

		this.getOrCreateTagBuilder(ItemTags.SWORDS)
				.add(EREquipmentItems.REMNANT_SWORD)
				.add(EREquipmentItems.FEATHERZEAL_SWORD);
		this.getOrCreateTagBuilder(ItemTags.AXES)
				.add(EREquipmentItems.REMNANT_AXE)
				.add(EREquipmentItems.FEATHERZEAL_AXE);
		this.getOrCreateTagBuilder(ItemTags.PICKAXES)
				.add(EREquipmentItems.REMNANT_PICKAXE)
				.add(EREquipmentItems.FEATHERZEAL_PICKAXE);
		this.getOrCreateTagBuilder(ItemTags.SHOVELS)
				.add(EREquipmentItems.REMNANT_SHOVEL)
				.add(EREquipmentItems.FEATHERZEAL_SHOVEL);
		this.getOrCreateTagBuilder(ItemTags.HOES)
				.add(EREquipmentItems.REMNANT_HOE)
				.add(EREquipmentItems.FEATHERZEAL_HOE);

		this.getOrCreateTagBuilder(ERItemTags.CHORUS_BLOCKS)
				.add(ERBlocks.CHORUS_BLOCK.asItem())
				.add(ERBlocks.STRIPPED_CHORUS_BLOCK.asItem());

		this.getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
				.add(Blocks.END_STONE.asItem());
		this.getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
				.add(Blocks.END_STONE.asItem());

		this.getOrCreateTagBuilder(ItemTags.PLANKS)
				.add(ERBlocks.CHORUS_PLANKS.asItem());

		this.getOrCreateTagBuilder(ItemTags.STAIRS)
				.add(ERBlocks.CUT_AMETRUR_STAIRS.asItem())
				.add(ERBlocks.CHORUS_STAIRS.asItem())
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS.asItem());

		this.getOrCreateTagBuilder(ItemTags.SLABS)
				.add(ERBlocks.CUT_AMETRUR_SLAB.asItem())
				.add(ERBlocks.CHORUS_STAIRS.asItem())
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS.asItem());

		this.getOrCreateTagBuilder(ItemTags.DOORS)
				.add(ERBlocks.CHORUS_DOOR.asItem());

		this.getOrCreateTagBuilder(ItemTags.TRAPDOORS)
				.add(ERBlocks.CHORUS_TRAPDOOR.asItem());

		this.getOrCreateTagBuilder(ItemTags.FENCES)
				.add(ERBlocks.CHORUS_FENCE.asItem());

		this.getOrCreateTagBuilder(ItemTags.FENCE_GATES)
				.add(ERBlocks.CHORUS_FENCE_GATE.asItem());
	}

}
