package net.rebel459.end_reborn.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
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
import net.rebel459.end_reborn.registry.ERBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public final class ERBlockLootProvider extends FabricBlockLootSubProvider {

	public ERBlockLootProvider(@NotNull FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registries) {
		super(dataOutput, registries);
	}

	@Override
	public void generate() {
		// End Iron Ore
		this.dropSelf(ERBlocks.FORGOTTEN_REMAINS.get());
		this.dropSelf(ERBlocks.REMNANT_BLOCK.get());
		this.dropSelf(ERBlocks.TIMELOST_FRAGMENTS.get());
		this.dropSelf(ERBlocks.FEATHERZEAL_BLOCK.get());
		this.dropSelf(ERBlocks.AMETRUR.get());
		this.dropSelf(ERBlocks.CUT_AMETRUR_STAIRS.get());
		this.dropSelf(ERBlocks.CUT_AMETRUR_PILLAR.get());
		this.dropSelf(ERBlocks.PURPUR.get());
		// Raw Crystalline Block
		this.dropSelf(ERBlocks.CRYSTALLINE_BLOCK.get());
		this.dropSelf(ERBlocks.CRYSTALLINE_LANTERN.get());
		this.dropSelf(ERBlocks.CRYSTALLINE_LAMP.get());
		this.dropSelf(ERBlocks.CHORUS_BLOCK.get());
        this.dropSelf(ERBlocks.STRIPPED_CHORUS_BLOCK.get());
        this.dropSelf(ERBlocks.CHORUS_SHELF.get());
        this.add(ERBlocks.CHORUS_DOOR.get(), this::createDoorTable);
        this.dropSelf(ERBlocks.CHORUS_TRAPDOOR.get());
		this.dropSelf(ERBlocks.CHORUS_PLANKS.get());
		this.dropSelf(ERBlocks.CHORUS_SLAB.get());
		this.dropSelf(ERBlocks.CHORUS_STAIRS.get());
		this.dropSelf(ERBlocks.CHORUS_MOSAIC.get());
		this.dropSelf(ERBlocks.CHORUS_MOSAIC_SLAB.get());
		this.dropSelf(ERBlocks.CHORUS_MOSAIC_STAIRS.get());
		this.dropSelf(ERBlocks.CHORUS_FENCE.get());
		this.dropSelf(ERBlocks.CHORUS_FENCE_GATE.get());
		this.dropSelf(ERBlocks.CHORUS_SIGN.get());
		this.dropSelf(ERBlocks.CHORUS_HANGING_SIGN.get());
		this.dropSelf(ERBlocks.CHORUS_PRESSURE_PLATE.get());
		this.dropSelf(ERBlocks.CHORUS_BUTTON.get());
		this.add(ERBlocks.CHORUS_MOSAIC_SLAB.get(), this::createSlabItemTable);
		this.add(ERBlocks.CHORUS_SLAB.get(), this::createSlabItemTable);
		this.add(ERBlocks.CUT_AMETRUR_SLAB.get(), this::createSlabItemTable);
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
