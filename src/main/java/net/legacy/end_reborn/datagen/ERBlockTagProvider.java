package net.legacy.end_reborn.datagen;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.legacy.end_reborn.ERBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import org.jetbrains.annotations.NotNull;

public final class ERBlockTagProvider extends FabricTagProvider.BlockTagProvider {
	public ERBlockTagProvider(@NotNull FabricDataOutput output, @NotNull CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	@Override
	protected void addTags(@NotNull HolderLookup.Provider arg) {
		this.getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
				.add(ERBlocks.CHORUS_BLOCK)
				.add(ERBlocks.STRIPPED_CHORUS_BLOCK)
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
		
		this.getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
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
				.add(ERBlocks.REMNIUM_BLOCK)
				.add(ERBlocks.CRACKED_END_STONE_BRICKS)
				.add(ERBlocks.END_IRON_ORE);

		this.getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
				.add(ERBlocks.END_IRON_ORE)
				.add(ERBlocks.RAW_CRYSTALLINE_BLOCK)
				.add(ERBlocks.CRYSTALLINE_BLOCK)
				.add(ERBlocks.CRYSTALLINE_LAMP)
				.add(ERBlocks.CRYSTALLINE_LANTERN)
				.add(ERBlocks.END_IRON_ORE);

		this.getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
				.add(ERBlocks.FORGOTTEN_REMAINS)
				.add(ERBlocks.REMNIUM_BLOCK);

		this.getOrCreateTagBuilder(BlockTags.STAIRS)
				.add(ERBlocks.CUT_AMETRUR_STAIRS)
				.add(ERBlocks.CHORUS_STAIRS)
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS);

		this.getOrCreateTagBuilder(BlockTags.SLABS)
				.add(ERBlocks.CUT_AMETRUR_SLAB)
				.add(ERBlocks.CHORUS_STAIRS)
				.add(ERBlocks.CHORUS_MOSAIC_STAIRS);

		this.getOrCreateTagBuilder(BlockTags.DOORS)
				.add(ERBlocks.CHORUS_DOOR);

		this.getOrCreateTagBuilder(BlockTags.TRAPDOORS)
				.add(ERBlocks.CHORUS_TRAPDOOR);

		this.getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
				.add(ERBlocks.REMNIUM_BLOCK);

	}

}
