package net.legacy.end_reborn.entity;

import net.legacy.end_reborn.registry.ERItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class ChorusChestRaft extends ChestBoat {
    public ChorusChestRaft(EntityType<? extends ChestBoat> type, Level level) {
        super(type, level);
    }

    public ChorusChestRaft(Level level, double x, double y, double z) {
        super(level, x, y, z);
    }

    @Override
    public Item getDropItem() {
        return ERItems.CHORUS_CHEST_RAFT;
    }
}
