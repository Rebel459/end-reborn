package net.legacy.end_reborn.registry;

import net.minecraft.world.food.FoodProperties;

public class ERFoods {
    public static final FoodProperties POPPED_CHORUS_FRUIT;

    public ERFoods() {
    }

    static {
        POPPED_CHORUS_FRUIT = (new FoodProperties.Builder()).nutrition(5).saturationModifier(0.6F).alwaysEdible().build();
    }

}