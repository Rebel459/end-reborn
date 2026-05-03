package net.rebel459.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.rebel459.end_reborn.registry.ERBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class ERBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
	public ERBlockTagProvider(@NotNull FabricPackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	@Override
	protected void addTags(@NotNull HolderLookup.Provider arg) {
		this.valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
				.add(ERBlocks.CHORUS_BLOCK.get())
                .add(ERBlocks.STRIPPED_CHORUS_BLOCK.get())
                .add(ERBlocks.CHORUS_SHELF.get())
				.add(ERBlocks.CHORUS_DOOR.get())
				.add(ERBlocks.CHORUS_TRAPDOOR.get())
				.add(ERBlocks.CHORUS_PLANKS.get())
				.add(ERBlocks.CHORUS_SLAB.get())
				.add(ERBlocks.CHORUS_STAIRS.get())
				.add(ERBlocks.CHORUS_MOSAIC.get())
				.add(ERBlocks.CHORUS_MOSAIC_SLAB.get())
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS.get())
				.add(ERBlocks.CHORUS_FENCE.get())
				.add(ERBlocks.CHORUS_FENCE_GATE.get())
				.add(ERBlocks.CHORUS_SIGN.get())
				.add(ERBlocks.CHORUS_HANGING_SIGN.get())
				.add(ERBlocks.CHORUS_PRESSURE_PLATE.get())
				.add(ERBlocks.CHORUS_BUTTON.get())
				.add(ERBlocks.CHORUS_MOSAIC_SLAB.get())
				.add(ERBlocks.CHORUS_SLAB.get());
		
		this.valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
				.add(ERBlocks.PURPUR.get())
				.add(ERBlocks.AMETRUR.get())
				.add(ERBlocks.CUT_AMETRUR.get())
				.add(ERBlocks.CUT_AMETRUR_PILLAR.get())
				.add(ERBlocks.CUT_AMETRUR_SLAB.get())
				.add(ERBlocks.CUT_AMETRUR_STAIRS.get())
				.add(ERBlocks.RAW_CRYSTALLINE_BLOCK.get())
				.add(ERBlocks.CRYSTALLINE_BLOCK.get())
				.add(ERBlocks.CRYSTALLINE_LAMP.get())
				.add(ERBlocks.CRYSTALLINE_LANTERN.get())
				.add(ERBlocks.FORGOTTEN_REMAINS.get())
				.add(ERBlocks.REMNANT_BLOCK.get())
				.add(ERBlocks.TIMELOST_FRAGMENTS.get())
				.add(ERBlocks.FEATHERZEAL_BLOCK.get())
				.add(ERBlocks.END_IRON_ORE.get())
				.add(ERBlocks.MIRESTONE_IRON_ORE.get());

		this.valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
				.add(ERBlocks.RAW_CRYSTALLINE_BLOCK.get())
				.add(ERBlocks.CRYSTALLINE_BLOCK.get())
				.add(ERBlocks.CRYSTALLINE_LAMP.get())
				.add(ERBlocks.CRYSTALLINE_LANTERN.get())
				.add(ERBlocks.END_IRON_ORE.get())
				.add(ERBlocks.MIRESTONE_IRON_ORE.get());

		this.valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
				.add(ERBlocks.FORGOTTEN_REMAINS.get())
				.add(ERBlocks.REMNANT_BLOCK.get())
				.add(ERBlocks.TIMELOST_FRAGMENTS.get())
				.add(ERBlocks.FEATHERZEAL_BLOCK.get());

		this.valueLookupBuilder(BlockTags.PLANKS)
				.add(ERBlocks.CHORUS_PLANKS.get());

		this.valueLookupBuilder(BlockTags.STAIRS)
				.add(ERBlocks.CUT_AMETRUR_STAIRS.get())
				.add(ERBlocks.CHORUS_STAIRS.get())
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS.get());

		this.valueLookupBuilder(BlockTags.SLABS)
				.add(ERBlocks.CUT_AMETRUR_SLAB.get())
				.add(ERBlocks.CHORUS_STAIRS.get())
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS.get());

		this.valueLookupBuilder(BlockTags.DOORS)
				.add(ERBlocks.CHORUS_DOOR.get());

		this.valueLookupBuilder(BlockTags.TRAPDOORS)
				.add(ERBlocks.CHORUS_TRAPDOOR.get());

		this.valueLookupBuilder(BlockTags.FENCES)
				.add(ERBlocks.CHORUS_FENCE.get());

        this.valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(ERBlocks.CHORUS_FENCE_GATE.get());

        this.valueLookupBuilder(BlockTags.WOODEN_SHELVES)
                .add(ERBlocks.CHORUS_SHELF.get());

		this.valueLookupBuilder(BlockTags.BEACON_BASE_BLOCKS)
				.add(ERBlocks.REMNANT_BLOCK.get())
				.add(ERBlocks.FEATHERZEAL_BLOCK.get());

	}

}
