package net.legacy.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.legacy.end_reborn.registry.ERBlocks;
import net.legacy.end_reborn.registry.ERItems;
import net.legacy.end_reborn.tag.ERItemTags;
import net.minecraft.core.HolderLookup;
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
		this.valueLookupBuilder(ERItemTags.VOID_IMMUNE)
				.add(ERItems.FEATHERZEAL_INGOT)
				.add(ERItems.FEATHERZEAL_SCRAP)
				.add(ERItems.FEATHERZEAL_SWORD)
				.add(ERItems.FEATHERZEAL_AXE)
				.add(ERItems.FEATHERZEAL_PICKAXE)
				.add(ERItems.FEATHERZEAL_SHOVEL)
                .add(ERItems.FEATHERZEAL_HOE)
                .add(ERItems.FEATHERZEAL_SPEAR)
				.add(ERItems.FEATHERZEAL_HELMET)
				.add(ERItems.FEATHERZEAL_CHESTPLATE)
				.add(ERItems.FEATHERZEAL_LEGGINGS)
				.add(ERItems.FEATHERZEAL_BOOTS)
				.add(ERItems.FEATHERZEAL_HORSE_ARMOR)
				.add(ERBlocks.TIMELOST_FRAGMENTS.asItem())
				.add(ERBlocks.FEATHERZEAL_BLOCK.asItem());

		this.valueLookupBuilder(ERItemTags.REMNANT_TOOL_MATERIALS)
				.add(ERItems.REMNANT_INGOT);
		this.valueLookupBuilder(ERItemTags.REPAIRS_REMNANT_ARMOR)
				.add(ERItems.REMNANT_INGOT);

		this.valueLookupBuilder(ERItemTags.FEATHERZEAL_TOOL_MATERIALS)
				.add(ERItems.FEATHERZEAL_INGOT);
		this.valueLookupBuilder(ERItemTags.REPAIRS_FEATHERZEAL_ARMOR)
				.add(ERItems.FEATHERZEAL_INGOT);

		this.valueLookupBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
				.add(ERItems.REMNANT_INGOT)
				.add(ERItems.FEATHERZEAL_INGOT);

		this.valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
				.add(ERItems.REMNANT_HELMET)
				.add(ERItems.REMNANT_CHESTPLATE)
				.add(ERItems.REMNANT_LEGGINGS)
				.add(ERItems.REMNANT_BOOTS)
				.add(ERItems.FEATHERZEAL_HELMET)
				.add(ERItems.FEATHERZEAL_CHESTPLATE)
				.add(ERItems.FEATHERZEAL_LEGGINGS)
				.add(ERItems.FEATHERZEAL_BOOTS);

		this.valueLookupBuilder(ItemTags.TRIM_MATERIALS)
				.add(ERItems.REMNANT_INGOT)
				.add(ERItems.FEATHERZEAL_INGOT)
				.add(ERItems.CRYSTALLINE_SHARD);
		this.valueLookupBuilder(ItemTags.HEAD_ARMOR)
				.add(ERItems.REMNANT_HELMET)
				.add(ERItems.FEATHERZEAL_HELMET);
		this.valueLookupBuilder(ItemTags.CHEST_ARMOR)
				.add(ERItems.REMNANT_CHESTPLATE)
				.add(ERItems.FEATHERZEAL_CHESTPLATE);
		this.valueLookupBuilder(ItemTags.LEG_ARMOR)
				.add(ERItems.REMNANT_LEGGINGS)
				.add(ERItems.FEATHERZEAL_LEGGINGS);
		this.valueLookupBuilder(ItemTags.FOOT_ARMOR)
				.add(ERItems.REMNANT_BOOTS)
				.add(ERItems.FEATHERZEAL_BOOTS);

		this.valueLookupBuilder(ItemTags.SWORDS)
				.add(ERItems.REMNANT_SWORD)
				.add(ERItems.FEATHERZEAL_SWORD);
		this.valueLookupBuilder(ItemTags.AXES)
				.add(ERItems.REMNANT_AXE)
				.add(ERItems.FEATHERZEAL_AXE);
		this.valueLookupBuilder(ItemTags.PICKAXES)
				.add(ERItems.REMNANT_PICKAXE)
				.add(ERItems.FEATHERZEAL_PICKAXE);
		this.valueLookupBuilder(ItemTags.SHOVELS)
				.add(ERItems.REMNANT_SHOVEL)
				.add(ERItems.FEATHERZEAL_SHOVEL);
        this.valueLookupBuilder(ItemTags.HOES)
                .add(ERItems.REMNANT_HOE)
                .add(ERItems.FEATHERZEAL_HOE);
        this.valueLookupBuilder(ItemTags.SPEARS)
                .add(ERItems.REMNANT_SPEAR)
                .add(ERItems.FEATHERZEAL_SPEAR);

		this.valueLookupBuilder(ERItemTags.CHORUS_BLOCKS)
				.add(ERBlocks.CHORUS_BLOCK.asItem())
				.add(ERBlocks.STRIPPED_CHORUS_BLOCK.asItem());

		this.valueLookupBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
				.add(Blocks.END_STONE.asItem());
		this.valueLookupBuilder(ItemTags.STONE_TOOL_MATERIALS)
				.add(Blocks.END_STONE.asItem());

		this.valueLookupBuilder(ItemTags.PLANKS)
				.add(ERBlocks.CHORUS_PLANKS.asItem());

		this.valueLookupBuilder(ItemTags.STAIRS)
				.add(ERBlocks.CUT_AMETRUR_STAIRS.asItem())
				.add(ERBlocks.CHORUS_STAIRS.asItem())
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS.asItem());

		this.valueLookupBuilder(ItemTags.SLABS)
				.add(ERBlocks.CUT_AMETRUR_SLAB.asItem())
				.add(ERBlocks.CHORUS_STAIRS.asItem())
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS.asItem());

		this.valueLookupBuilder(ItemTags.DOORS)
				.add(ERBlocks.CHORUS_DOOR.asItem());

		this.valueLookupBuilder(ItemTags.TRAPDOORS)
				.add(ERBlocks.CHORUS_TRAPDOOR.asItem());

		this.valueLookupBuilder(ItemTags.FENCES)
				.add(ERBlocks.CHORUS_FENCE.asItem());

		this.valueLookupBuilder(ItemTags.FENCE_GATES)
				.add(ERBlocks.CHORUS_FENCE_GATE.asItem());
	}

}
