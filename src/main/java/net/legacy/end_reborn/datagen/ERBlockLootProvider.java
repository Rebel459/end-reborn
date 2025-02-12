package net.legacy.end_reborn.datagen;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.legacy.end_reborn.ERBlocks;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import org.jetbrains.annotations.NotNull;

public final class ERBlockLootProvider extends FabricBlockLootTableProvider {

	public ERBlockLootProvider(@NotNull FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registries) {
		super(dataOutput, registries);
	}

	@Override
	public void generate() {
		this.dropSelf(ERBlocks.CRACKED_END_STONE_BRICKS);
		// End Iron Ore
		this.dropSelf(ERBlocks.FORGOTTEN_REMAINS);
		this.dropSelf(ERBlocks.REMNIUM_BLOCK);
		this.dropSelf(ERBlocks.AMETRUR);
		this.dropSelf(ERBlocks.CUT_AMETRUR_STAIRS);
		this.dropSelf(ERBlocks.CUT_AMETRUR_PILLAR);
		this.dropSelf(ERBlocks.PURPUR);
		// Raw Crystalline Block
		this.dropSelf(ERBlocks.CRYSTALLINE_BLOCK);
		this.dropSelf(ERBlocks.CRYSTALLINE_LANTERN);
		this.dropSelf(ERBlocks.CRYSTALLINE_LAMP);
		this.dropSelf(ERBlocks.CHORUS_BLOCK);
		this.dropSelf(ERBlocks.STRIPPED_CHORUS_BLOCK);
		this.dropSelf(ERBlocks.CHORUS_DOOR);
		this.dropSelf(ERBlocks.CHORUS_TRAPDOOR);
		this.dropSelf(ERBlocks.CHORUS_PLANKS);
		this.dropSelf(ERBlocks.CHORUS_SLAB);
		this.dropSelf(ERBlocks.CHORUS_STAIRS);
		this.dropSelf(ERBlocks.CHORUS_MOSAIC);
		this.dropSelf(ERBlocks.CHORUS_MOSAIC_SLAB);
		this.dropSelf(ERBlocks.CHORUS_MOSAIC_STAIRS);
		this.dropSelf(ERBlocks.CHORUS_FENCE);
		this.dropSelf(ERBlocks.CHORUS_FENCE_GATE);
		this.dropSelf(ERBlocks.CHORUS_SIGN);
		this.dropSelf(ERBlocks.CHORUS_HANGING_SIGN);
		this.dropSelf(ERBlocks.CHORUS_PRESSURE_PLATE);
		this.dropSelf(ERBlocks.CHORUS_BUTTON);
		this.add(ERBlocks.CHORUS_MOSAIC_SLAB, this::createSlabItemTable);
		this.add(ERBlocks.CHORUS_SLAB, this::createSlabItemTable);
		this.add(ERBlocks.CUT_AMETRUR_SLAB, this::createSlabItemTable);
	}

	public LootTable.@NotNull Builder createMultifaceBlockDrops(Block drop) {
		return LootTable.lootTable()
			.withPool(
				LootPool.lootPool()
					.add(
						this.applyExplosionDecay(
							drop,
							LootItem.lootTableItem(drop)
								.apply(
									Direction.values(),
									direction -> SetItemCountFunction.setCount(ConstantValue.exactly(1F), true)
										.when(
											LootItemBlockStatePropertyCondition.hasBlockStateProperties(drop)
												.setProperties(
													StatePropertiesPredicate.Builder.properties().hasProperty(MultifaceBlock.getFaceProperty(direction), true)
												)
										)
								)
								.apply(SetItemCountFunction.setCount(ConstantValue.exactly(-1F), true))
						)
					)
			);
	}
}
