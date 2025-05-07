package net.legacy.end_reborn.registry;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.legacy.end_reborn.ERConstants;
import net.legacy.end_reborn.config.ERConfig;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;

public class ERLootTables {

	public static final ResourceKey<LootTable> END_REMAINS = register("chests/end_remains");

	public static final ResourceKey<LootTable> END_CITY_CHEST = registerEnderscape("end_city/chest");
	public static final ResourceKey<LootTable> END_CITY_VAULT = registerEnderscape("end_city/vault");
	public static final ResourceKey<LootTable> END_CITY_ELYTRA_VAULT = registerEnderscape("end_city/elytra_vault");

	public static void init() {
		LootTableEvents.MODIFY.register((id, tableBuilder, source, registries) -> {
			LootPool.Builder pool;

			if (ERConfig.get.loot_table_injects) {
				if (BuiltInLootTables.END_CITY_TREASURE.equals(id)) {
					pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
							.add(EmptyLootItem.emptyItem().setWeight(8))
							.add(LootItem.lootTableItem(ERItems.CRYSTALLINE_SHARD).setWeight(1).apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 5))));
					tableBuilder.withPool(pool);
				}
				if (BuiltInLootTables.END_CITY_TREASURE.equals(id)) {
					pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
							.add(EmptyLootItem.emptyItem().setWeight(23))
							.add(LootItem.lootTableItem(ERItems.FEATHERZEAL_SCRAP).setWeight(1));
					tableBuilder.withPool(pool);
				}
				if (BuiltInLootTables.END_CITY_TREASURE.equals(id)) {
					pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
							.add(EmptyLootItem.emptyItem().setWeight(2))
							.add(LootItem.lootTableItem(ERItems.FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE).setWeight(1));
					tableBuilder.withPool(pool);
				}

				if (ERConfig.get.enderscape_integration) {
					if (ERLootTables.END_CITY_CHEST.equals(id)) {
						pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
								.add(EmptyLootItem.emptyItem().setWeight(8))
								.add(LootItem.lootTableItem(ERItems.CRYSTALLINE_SHARD).setWeight(1).apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 5))));
						tableBuilder.withPool(pool);
					}

					if (ERLootTables.END_CITY_VAULT.equals(id)) {
						pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
								.add(EmptyLootItem.emptyItem().setWeight(23))
								.add(LootItem.lootTableItem(ERItems.FEATHERZEAL_SCRAP).setWeight(1));
						tableBuilder.withPool(pool);
					}
					if (ERLootTables.END_CITY_VAULT.equals(id)) {
						pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
								.add(EmptyLootItem.emptyItem().setWeight(2))
								.add(LootItem.lootTableItem(ERItems.FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE).setWeight(1));
						tableBuilder.withPool(pool);
					}

					if (ERLootTables.END_CITY_ELYTRA_VAULT.equals(id)) {
						pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
								.add(EmptyLootItem.emptyItem().setWeight(23))
								.add(LootItem.lootTableItem(ERItems.FEATHERZEAL_SCRAP).setWeight(1));
						tableBuilder.withPool(pool);
					}
					if (ERLootTables.END_CITY_ELYTRA_VAULT.equals(id)) {
						pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
								.add(EmptyLootItem.emptyItem().setWeight(2))
								.add(LootItem.lootTableItem(ERItems.FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE).setWeight(1));
						tableBuilder.withPool(pool);
					}
				}

				if (BuiltInLootTables.ANCIENT_CITY.equals(id)) {
					pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
							.add(EmptyLootItem.emptyItem().setWeight(5))
							.add(LootItem.lootTableItem(ERItems.REMNANT_UPGRADE_SMITHING_TEMPLATE).setWeight(1));
					tableBuilder.withPool(pool);
				}
			}

		});
	}

	private static @NotNull ResourceKey<LootTable> register(String path) {
		return ResourceKey.create(Registries.LOOT_TABLE, ERConstants.id(path));
	}

	private static @NotNull ResourceKey<LootTable> registerEnderscape(String path) {
		return ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath("enderscape", path));
	}

}