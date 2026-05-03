package net.rebel459.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Blocks;
import net.rebel459.end_reborn.registry.ERBlocks;
import net.rebel459.end_reborn.registry.ERItems;
import net.rebel459.end_reborn.tag.ERItemTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class ERItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
	public ERItemTagProvider(@NotNull FabricPackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	@Override
	protected void addTags(@NotNull HolderLookup.Provider provider) {

		this.valueLookupBuilder(ERItemTags.VOID_IMMUNE)
				.add(ERItems.FEATHERZEAL_INGOT.get())
				.add(ERItems.FEATHERZEAL_SCRAP.get())
				.add(ERItems.FEATHERZEAL_SWORD.get())
				.add(ERItems.FEATHERZEAL_AXE.get())
				.add(ERItems.FEATHERZEAL_PICKAXE.get())
				.add(ERItems.FEATHERZEAL_SHOVEL.get())
                .add(ERItems.FEATHERZEAL_HOE.get())
                .add(ERItems.FEATHERZEAL_SPEAR.get())
				.add(ERItems.FEATHERZEAL_HELMET.get())
				.add(ERItems.FEATHERZEAL_CHESTPLATE.get())
				.add(ERItems.FEATHERZEAL_LEGGINGS.get())
				.add(ERItems.FEATHERZEAL_BOOTS.get())
				.add(ERItems.FEATHERZEAL_HORSE_ARMOR.get())
				.add(ERBlocks.TIMELOST_FRAGMENTS.asItem())
				.add(ERBlocks.FEATHERZEAL_BLOCK.asItem())
				.addOptional(ERItems.FEATHERZEAL_KNIFE.get());

		this.valueLookupBuilder(ERItemTags.REMNANT_TOOL_MATERIALS)
				.add(ERItems.REMNANT_INGOT.get());
		this.valueLookupBuilder(ERItemTags.REPAIRS_REMNANT_ARMOR)
				.add(ERItems.REMNANT_INGOT.get());

		this.valueLookupBuilder(ERItemTags.FEATHERZEAL_TOOL_MATERIALS)
				.add(ERItems.FEATHERZEAL_INGOT.get());
		this.valueLookupBuilder(ERItemTags.REPAIRS_FEATHERZEAL_ARMOR)
				.add(ERItems.FEATHERZEAL_INGOT.get());

		this.valueLookupBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
				.add(ERItems.REMNANT_INGOT.get())
				.add(ERItems.FEATHERZEAL_INGOT.get());

		this.valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
				.add(ERItems.REMNANT_HELMET.get())
				.add(ERItems.REMNANT_CHESTPLATE.get())
				.add(ERItems.REMNANT_LEGGINGS.get())
				.add(ERItems.REMNANT_BOOTS.get())
				.add(ERItems.FEATHERZEAL_HELMET.get())
				.add(ERItems.FEATHERZEAL_CHESTPLATE.get())
				.add(ERItems.FEATHERZEAL_LEGGINGS.get())
				.add(ERItems.FEATHERZEAL_BOOTS.get());

		this.valueLookupBuilder(ItemTags.TRIM_MATERIALS)
				.add(ERItems.REMNANT_INGOT.get())
				.add(ERItems.FEATHERZEAL_INGOT.get())
				.add(ERItems.CRYSTALLINE_SHARD.get());
		this.valueLookupBuilder(ItemTags.HEAD_ARMOR)
				.add(ERItems.REMNANT_HELMET.get())
				.add(ERItems.FEATHERZEAL_HELMET.get());
		this.valueLookupBuilder(ItemTags.CHEST_ARMOR)
				.add(ERItems.REMNANT_CHESTPLATE.get())
				.add(ERItems.FEATHERZEAL_CHESTPLATE.get());
		this.valueLookupBuilder(ItemTags.LEG_ARMOR)
				.add(ERItems.REMNANT_LEGGINGS.get())
				.add(ERItems.FEATHERZEAL_LEGGINGS.get());
		this.valueLookupBuilder(ItemTags.FOOT_ARMOR)
				.add(ERItems.REMNANT_BOOTS.get())
				.add(ERItems.FEATHERZEAL_BOOTS.get());

		this.valueLookupBuilder(ItemTags.SWORDS)
				.add(ERItems.REMNANT_SWORD.get())
				.add(ERItems.FEATHERZEAL_SWORD.get());
		this.valueLookupBuilder(ItemTags.AXES)
				.add(ERItems.REMNANT_AXE.get())
				.add(ERItems.FEATHERZEAL_AXE.get());
		this.valueLookupBuilder(ItemTags.PICKAXES)
				.add(ERItems.REMNANT_PICKAXE.get())
				.add(ERItems.FEATHERZEAL_PICKAXE.get());
		this.valueLookupBuilder(ItemTags.SHOVELS)
				.add(ERItems.REMNANT_SHOVEL.get())
				.add(ERItems.FEATHERZEAL_SHOVEL.get());
        this.valueLookupBuilder(ItemTags.HOES)
                .add(ERItems.REMNANT_HOE.get())
                .add(ERItems.FEATHERZEAL_HOE.get());
        this.valueLookupBuilder(ItemTags.SPEARS)
                .add(ERItems.REMNANT_SPEAR.get())
                .add(ERItems.FEATHERZEAL_SPEAR.get());

        this.valueLookupBuilder(ERItemTags.CHORUS_BLOCKS)
                .add(ERBlocks.CHORUS_BLOCK.asItem())
                .add(ERBlocks.STRIPPED_CHORUS_BLOCK.asItem());

        this.valueLookupBuilder(ERItemTags.REMNANT_UPGRADE_STONES)
                .add(Blocks.COBBLED_DEEPSLATE.asItem())
                .add(Blocks.TUFF.asItem());

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

		this.valueLookupBuilder(TagKey.create(this.registryKey, Identifier.fromNamespaceAndPath("c", "tools/knife")))
				.addOptional(ERItems.REMNANT_KNIFE.get())
				.addOptional(ERItems.FEATHERZEAL_KNIFE.get());

		this.valueLookupBuilder(TagKey.create(this.registryKey, Identifier.fromNamespaceAndPath("farmersdelight", "tools/knives")))
				.addOptional(ERItems.REMNANT_KNIFE.get())
				.addOptional(ERItems.FEATHERZEAL_KNIFE.get());
	}
}
