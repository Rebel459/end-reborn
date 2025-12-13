package net.legacy.end_reborn.datagen;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.legacy.end_reborn.registry.ERBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import org.jetbrains.annotations.NotNull;

public final class ERBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public ERBlockTagProvider(@NotNull FabricDataOutput output, @NotNull CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	@Override
	protected void addTags(@NotNull HolderLookup.Provider arg) {
		this.valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
				.add(ERBlocks.CHORUS_BLOCK)
                .add(ERBlocks.STRIPPED_CHORUS_BLOCK)
                .add(ERBlocks.CHORUS_SHELF)
				.add(ERBlocks.CHORUS_DOOR)
				.add(ERBlocks.CHORUS_TRAPDOOR)
				.add(ERBlocks.CHORUS_PLANKS)
				.add(ERBlocks.CHORUS_SLAB)
				.add(ERBlocks.CHORUS_STAIRS)
				.add(ERBlocks.CHORUS_MOSAIC)
				.add(ERBlocks.CHORUS_MOSAIC_SLAB)
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS)
				.add(ERBlocks.CHORUS_FENCE)
				.add(ERBlocks.CHORUS_FENCE_GATE)
				.add(ERBlocks.CHORUS_SIGN)
				.add(ERBlocks.CHORUS_HANGING_SIGN)
				.add(ERBlocks.CHORUS_PRESSURE_PLATE)
				.add(ERBlocks.CHORUS_BUTTON)
				.add(ERBlocks.CHORUS_MOSAIC_SLAB)
				.add(ERBlocks.CHORUS_SLAB);
		
		this.valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
				.add(ERBlocks.PURPUR)
				.add(ERBlocks.AMETRUR)
				.add(ERBlocks.CUT_AMETRUR)
				.add(ERBlocks.CUT_AMETRUR_PILLAR)
				.add(ERBlocks.CUT_AMETRUR_SLAB)
				.add(ERBlocks.CUT_AMETRUR_STAIRS)
				.add(ERBlocks.RAW_CRYSTALLINE_BLOCK)
				.add(ERBlocks.CRYSTALLINE_BLOCK)
				.add(ERBlocks.CRYSTALLINE_LAMP)
				.add(ERBlocks.CRYSTALLINE_LANTERN)
				.add(ERBlocks.FORGOTTEN_REMAINS)
				.add(ERBlocks.REMNANT_BLOCK)
				.add(ERBlocks.TIMELOST_FRAGMENTS)
				.add(ERBlocks.FEATHERZEAL_BLOCK)
				.add(ERBlocks.END_IRON_ORE)
				.add(ERBlocks.MIRESTONE_IRON_ORE);

		this.valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
				.add(ERBlocks.RAW_CRYSTALLINE_BLOCK)
				.add(ERBlocks.CRYSTALLINE_BLOCK)
				.add(ERBlocks.CRYSTALLINE_LAMP)
				.add(ERBlocks.CRYSTALLINE_LANTERN)
				.add(ERBlocks.END_IRON_ORE)
				.add(ERBlocks.MIRESTONE_IRON_ORE);

		this.valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
				.add(ERBlocks.FORGOTTEN_REMAINS)
				.add(ERBlocks.REMNANT_BLOCK)
				.add(ERBlocks.TIMELOST_FRAGMENTS)
				.add(ERBlocks.FEATHERZEAL_BLOCK);

		this.valueLookupBuilder(BlockTags.PLANKS)
				.add(ERBlocks.CHORUS_PLANKS);

		this.valueLookupBuilder(BlockTags.STAIRS)
				.add(ERBlocks.CUT_AMETRUR_STAIRS)
				.add(ERBlocks.CHORUS_STAIRS)
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS);

		this.valueLookupBuilder(BlockTags.SLABS)
				.add(ERBlocks.CUT_AMETRUR_SLAB)
				.add(ERBlocks.CHORUS_STAIRS)
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS);

		this.valueLookupBuilder(BlockTags.DOORS)
				.add(ERBlocks.CHORUS_DOOR);

		this.valueLookupBuilder(BlockTags.TRAPDOORS)
				.add(ERBlocks.CHORUS_TRAPDOOR);

		this.valueLookupBuilder(BlockTags.FENCES)
				.add(ERBlocks.CHORUS_FENCE);

        this.valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(ERBlocks.CHORUS_FENCE_GATE);

        this.valueLookupBuilder(BlockTags.WOODEN_SHELVES)
                .add(ERBlocks.CHORUS_SHELF);

		this.valueLookupBuilder(BlockTags.BEACON_BASE_BLOCKS)
				.add(ERBlocks.REMNANT_BLOCK)
				.add(ERBlocks.FEATHERZEAL_BLOCK);

	}

}
