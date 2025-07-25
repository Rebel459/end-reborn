package net.legacy.end_reborn.registry;

import net.legacy.end_reborn.ERConstants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.ChestRaft;
import net.minecraft.world.entity.vehicle.Raft;
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

	public static void init() {
	}

	private static <T extends Entity> @NotNull EntityType<T> register(String string, EntityType.@NotNull Builder<T> builder) {
		ResourceKey<EntityType<?>> resourceKey = ResourceKey.create(Registries.ENTITY_TYPE, ERConstants.id(string));
		return Registry.register(BuiltInRegistries.ENTITY_TYPE, resourceKey, builder.build(resourceKey));
	}
}
