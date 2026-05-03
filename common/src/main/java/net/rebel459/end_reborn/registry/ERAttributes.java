package net.rebel459.end_reborn.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.rebel459.end_reborn.EndReborn;
import net.rebel459.unified.platform.UnifiedRegistries;

public class ERAttributes {

    public static UnifiedRegistries.DeferredRegistry ATTRIBUTES = UnifiedRegistries.DeferredRegistry.create(EndReborn.MOD_ID, BuiltInRegistries.ATTRIBUTE);

    public static final Holder<Attribute> MAGIC_RESISTANCE = ATTRIBUTES.registerForHolder("magic_resistance", () -> new Attribute("attribute." + EndReborn.MOD_ID + ".magic_resistance", 0F).setSyncable(true));
    public static final Holder<Attribute> BURNING_RESISTANCE = ATTRIBUTES.registerForHolder("burning_resistance", () -> new Attribute("attribute." + EndReborn.MOD_ID + ".burning_resistance", 0F).setSyncable(true));
    public static final Holder<Attribute> FALL_RESISTANCE = ATTRIBUTES.registerForHolder("fall_resistance", () -> new Attribute("attribute." + EndReborn.MOD_ID + ".fall_resistance", 0F).setSyncable(true));

    public enum Type {
        MAGIC_RESISTANCE,
        BURNING_RESISTANCE,
        FALL_RESISTANCE
    }

    public static void init() {}
}