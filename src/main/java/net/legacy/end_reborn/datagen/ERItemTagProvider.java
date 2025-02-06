package net.legacy.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.legacy.end_reborn.ERBlocks;
import net.legacy.end_reborn.ERGearItems;
import net.legacy.end_reborn.ERItems;
import net.legacy.end_reborn.ERItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class ERItemTagProvider extends FabricTagProvider.ItemTagProvider {
	public ERItemTagProvider(@NotNull FabricDataOutput output, @NotNull CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	@Override
	protected void addTags(@NotNull HolderLookup.Provider arg) {
		this.getOrCreateTagBuilder(ERItemTags.REMNANT_TOOL_MATERIALS)
				.add(ERItems.REMNANT_INGOT);
		this.getOrCreateTagBuilder(ERItemTags.REPAIRS_REMNANT_ARMOR)
				.add(ERItems.REMNANT_INGOT);

		this.getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
				.add(ERItems.REMNANT_INGOT);

		this.getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
				.add(ERGearItems.REMNANT_HELMET)
				.add(ERGearItems.REMNANT_CHESTPLATE)
				.add(ERGearItems.REMNANT_LEGGINGS)
				.add(ERGearItems.REMNANT_BOOTS);

		this.getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
				.add(ERItems.REMNANT_INGOT)
				.add(ERItems.CRYSTALLINE_SHARD);
		this.getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
				.add(ERGearItems.REMNANT_HELMET);
		this.getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
				.add(ERGearItems.REMNANT_CHESTPLATE);
		this.getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
				.add(ERGearItems.REMNANT_LEGGINGS);
		this.getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
				.add(ERGearItems.REMNANT_BOOTS);

		this.getOrCreateTagBuilder(ItemTags.SWORDS)
				.add(ERGearItems.REMNANT_SWORD);
		this.getOrCreateTagBuilder(ItemTags.AXES)
				.add(ERGearItems.REMNANT_AXE);
		this.getOrCreateTagBuilder(ItemTags.PICKAXES)
				.add(ERGearItems.REMNANT_PICKAXE);
		this.getOrCreateTagBuilder(ItemTags.SHOVELS)
				.add(ERGearItems.REMNANT_SHOVEL);
		this.getOrCreateTagBuilder(ItemTags.HOES)
				.add(ERGearItems.REMNANT_HOE);

		this.getOrCreateTagBuilder(ERItemTags.CHORUS_BLOCKS)
				.add(ERBlocks.CHORUS_BLOCK.asItem())
				.add(ERBlocks.STRIPPED_CHORUS_BLOCK.asItem());
	}

}
