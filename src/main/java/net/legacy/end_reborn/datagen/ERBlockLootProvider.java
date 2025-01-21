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
/*		this.dropSelf(ERBlocks.COPPER_BLOCK);
		this.add(ERBlocks.POLISHED_CUT_ROSE_SLAB, this::createSlabItemTable);*/
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
