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
		//this.getOrCreateTagBuilder(ERItemTags.VOID_IMMUNE)
				//.add(ERItems.REMNIUM_INGOT);

		this.getOrCreateTagBuilder(ERItemTags.REMNIUM_TOOL_MATERIALS)
				.add(ERItems.REMNIUM_INGOT);
		this.getOrCreateTagBuilder(ERItemTags.REPAIRS_REMNIUM_ARMOR)
				.add(ERItems.REMNIUM_INGOT);

		this.getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
				.add(ERItems.REMNIUM_INGOT);

		this.getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
				.add(ERGearItems.REMNIUM_HELMET)
				.add(ERGearItems.REMNIUM_CHESTPLATE)
				.add(ERGearItems.REMNIUM_LEGGINGS)
				.add(ERGearItems.REMNIUM_BOOTS);

		this.getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
				.add(ERItems.REMNIUM_INGOT)
				.add(ERItems.CRYSTALLINE_SHARD);
		this.getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
				.add(ERGearItems.REMNIUM_HELMET);
		this.getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
				.add(ERGearItems.REMNIUM_CHESTPLATE);
		this.getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
				.add(ERGearItems.REMNIUM_LEGGINGS);
		this.getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
				.add(ERGearItems.REMNIUM_BOOTS);

		this.getOrCreateTagBuilder(ItemTags.SWORDS)
				.add(ERGearItems.REMNIUM_SWORD);
		this.getOrCreateTagBuilder(ItemTags.AXES)
				.add(ERGearItems.REMNIUM_AXE);
		this.getOrCreateTagBuilder(ItemTags.PICKAXES)
				.add(ERGearItems.REMNIUM_PICKAXE);
		this.getOrCreateTagBuilder(ItemTags.SHOVELS)
				.add(ERGearItems.REMNIUM_SHOVEL);
		this.getOrCreateTagBuilder(ItemTags.HOES)
				.add(ERGearItems.REMNIUM_HOE);

		this.getOrCreateTagBuilder(ERItemTags.CHORUS_BLOCKS)
				.add(ERBlocks.CHORUS_BLOCK.asItem())
				.add(ERBlocks.STRIPPED_CHORUS_BLOCK.asItem());
	}

}
