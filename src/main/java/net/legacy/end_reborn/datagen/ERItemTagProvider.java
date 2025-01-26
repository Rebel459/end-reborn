package net.legacy.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
//		this.getOrCreateTagBuilder(ERItemTags.COPPER_TOOL_MATERIALS)
//				.add(Items.COPPER_INGOT);
//		this.getOrCreateTagBuilder(ERItemTags.REPAIRS_COPPER_ARMOR)
//				.add(Items.COPPER_INGOT);
//
//		this.getOrCreateTagBuilder(ERItemTags.ROSE_TOOL_MATERIALS)
//				.add(ERItems.ROSE_INGOT)
//				.add(ERItems.ROSE_ALLOY);
//		this.getOrCreateTagBuilder(ERItemTags.REPAIRS_ROSE_ARMOR)
//				.add(ERItems.ROSE_INGOT)
//				.add(ERItems.ROSE_ALLOY);
//
//		this.getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
//				.add(ERItems.ROSE_INGOT);
//
//		this.getOrCreateTagBuilder(ItemTags.IRON_TOOL_MATERIALS)
//				.add(ERItems.IRON_ALLOY);
//		this.getOrCreateTagBuilder(ItemTags.REPAIRS_IRON_ARMOR)
//				.add(ERItems.IRON_ALLOY);
//
//		this.getOrCreateTagBuilder(ItemTags.NETHERITE_TOOL_MATERIALS)
//				.add(Items.NETHERITE_SCRAP);
//		this.getOrCreateTagBuilder(ItemTags.REPAIRS_NETHERITE_ARMOR)
//				.add(Items.NETHERITE_SCRAP);
//
//		this.getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
//				.add(ERItems.RAW_GOLD_NUGGET)
//				.add(ERItems.ENCHANTED_GOLDEN_CARROT)
//				.add(ERItems.ROSE_UPGRADE_SMITHING_TEMPLATE)
//				.add(ERGearItems.ROSE_SWORD)
//				.add(ERGearItems.ROSE_AXE)
//				.add(ERGearItems.ROSE_PICKAXE)
//				.add(ERGearItems.ROSE_SHOVEL)
//				.add(ERGearItems.ROSE_HOE)
//				.add(ERGearItems.ROSE_HELMET)
//				.add(ERGearItems.ROSE_CHESTPLATE)
//				.add(ERGearItems.ROSE_LEGGINGS)
//				.add(ERGearItems.ROSE_BOOTS)
//				.add(ERGearItems.ROSE_HORSE_ARMOR);
//
//		this.getOrCreateTagBuilder(ItemTags.PIGLIN_SAFE_ARMOR)
//				.add(ERGearItems.ROSE_HELMET)
//				.add(ERGearItems.ROSE_CHESTPLATE)
//				.add(ERGearItems.ROSE_LEGGINGS)
//				.add(ERGearItems.ROSE_BOOTS);

		this.getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
				.add(ERGearItems.REMNANT_HELMET)
				.add(ERGearItems.REMNANT_CHESTPLATE)
				.add(ERGearItems.REMNANT_LEGGINGS)
				.add(ERGearItems.REMNANT_BOOTS);

		this.getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
				.add(ERItems.REMNANT_INGOT)
				.add(ERItems.CRYSTALLINE_SHARD);

//		this.getOrCreateTagBuilder(ItemTags.HORSE_FOOD)
//				.add(ERItems.ENCHANTED_GOLDEN_CARROT);
//		this.getOrCreateTagBuilder(ItemTags.HORSE_TEMPT_ITEMS)
//				.add(ERItems.ENCHANTED_GOLDEN_CARROT);
	}

}
