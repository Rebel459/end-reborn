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
		/*this.getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
				.add(ERBlocks.COPPER_BLOCK)
				.add(ERBlocks.NETHER_ROSE_ORE)
				.add(ERBlocks.POLISHED_ROSE)
				.add(ERBlocks.POLISHED_CUT_ROSE)
				.add(ERBlocks.POLISHED_CUT_ROSE_SLAB)
				.add(ERBlocks.POLISHED_CUT_ROSE_STAIRS)
				.add(ERBlocks.ROSE_LAMP)
				.add(ERBlocks.ROSE_TRAPDOOR)
				.add(ERBlocks.ROSE_DOOR)
				.add(ERBlocks.ROSE_BLOCK);

		this.getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
				.add(ERBlocks.COPPER_BLOCK)
				.add(ERBlocks.NETHER_ROSE_ORE)
				.add(ERBlocks.POLISHED_ROSE)
				.add(ERBlocks.POLISHED_CUT_ROSE)
				.add(ERBlocks.POLISHED_CUT_ROSE_SLAB)
				.add(ERBlocks.POLISHED_CUT_ROSE_STAIRS)
				.add(ERBlocks.ROSE_LAMP)
				.add(ERBlocks.ROSE_TRAPDOOR)
				.add(ERBlocks.ROSE_DOOR)
				.add(ERBlocks.ROSE_BLOCK);

		this.getOrCreateTagBuilder(BlockTags.STAIRS)
			.add(ERBlocks.POLISHED_CUT_ROSE_STAIRS);

		this.getOrCreateTagBuilder(BlockTags.SLABS)
				.add(ERBlocks.POLISHED_CUT_ROSE_SLAB);

		this.getOrCreateTagBuilder(BlockTags.DOORS)
				.add(ERBlocks.ROSE_DOOR);

		this.getOrCreateTagBuilder(BlockTags.TRAPDOORS)
				.add(ERBlocks.ROSE_TRAPDOOR);

		this.getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
				.add(ERBlocks.COPPER_BLOCK)
				.add(ERBlocks.ROSE_BLOCK);

		this.getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS)
				.add(ERBlocks.ROSE_LAMP);*/
	}

}
