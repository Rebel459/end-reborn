/*
 * Copyright 2023-2025 FrozenBlock
 * This file is part of Wilder Wild.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, see <https://www.gnu.org/licenses/>.
 */

package net.legacy.end_reborn;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.frozenblock.lib.entity.api.spawnplacement.FrozenSpawnPlacementTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.entity.vehicle.ChestRaft;
import net.minecraft.world.entity.vehicle.Raft;
import net.minecraft.world.level.levelgen.Heightmap;
import org.jetbrains.annotations.NotNull;

public final class EREntityTypes {

	// BOATS

	public static final EntityType<Raft> CHORUS_RAFT = register(
		"chorus_raft",
		EntityType.Builder.of(EntityType.raftFactory(() -> ERItems.CHORUS_RAFT), MobCategory.MISC)
			.noLootTable()
			.sized(1.375F, 0.5625F)
			.eyeHeight(0.5625F)
			.clientTrackingRange(10)
	);

	public static final EntityType<ChestRaft> CHORUS_CHEST_RAFT = register(
		"chorus_chest_raft",
		EntityType.Builder.of(EntityType.chestRaftFactory(() -> ERItems.CHORUS_CHEST_RAFT), MobCategory.MISC)
			.noLootTable()
			.sized(1.375F, 0.5625F)
			.eyeHeight(0.5625F)
			.clientTrackingRange(10)
	);

	private EREntityTypes() {
		throw new UnsupportedOperationException("WWEntityTypes contains only static declarations.");
	}

	public static void init() {
	}

	private static <T extends Entity> @NotNull EntityType<T> register(String string, EntityType.@NotNull Builder<T> builder) {
		ResourceKey<EntityType<?>> resourceKey = ResourceKey.create(Registries.ENTITY_TYPE, ERConstants.id(string));
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, resourceKey, builder.build(resourceKey));
	}
}
