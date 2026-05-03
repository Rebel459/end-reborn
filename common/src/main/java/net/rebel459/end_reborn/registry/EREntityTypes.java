package net.rebel459.end_reborn.registry;

import net.rebel459.end_reborn.EndReborn;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.ChestRaft;
import net.minecraft.world.entity.vehicle.boat.Raft;
import net.rebel459.unified.platform.UnifiedRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public final class EREntityTypes {

	static UnifiedRegistries.EntityTypes ENTITIES = UnifiedRegistries.EntityTypes.create(EndReborn.MOD_ID);

	// BOATS

	public static final Supplier<EntityType<Raft>> CHORUS_RAFT = ENTITIES.register(
		"chorus_raft",
		EntityType.Builder.of(EntityType.raftFactory(ERItems.CHORUS_RAFT), MobCategory.MISC)
			.noLootTable()
			.sized(1.375F, 0.5625F)
			.eyeHeight(0.5625F)
			.clientTrackingRange(10)
	);

	public static final Supplier<EntityType<ChestRaft>> CHORUS_CHEST_RAFT = ENTITIES.register(
		"chorus_chest_raft",
		EntityType.Builder.of(EntityType.chestRaftFactory(ERItems.CHORUS_CHEST_RAFT), MobCategory.MISC)
			.noLootTable()
			.sized(1.375F, 0.5625F)
			.eyeHeight(0.5625F)
			.clientTrackingRange(10)
	);

	public static void init() {}
}
