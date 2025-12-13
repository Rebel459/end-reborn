package net.legacy.end_reborn.datagen;

import net.legacy.end_reborn.registry.ERBlocks;
import net.legacy.end_reborn.tag.ERItemTags;
import net.legacy.end_reborn.registry.ERItems;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public final class ERWoodRecipeProvider {
    static void buildRecipes(RecipeProvider provider, RecipeOutput exporter) {
        provider.planksFromLogs(ERBlocks.CHORUS_PLANKS, ERItemTags.CHORUS_BLOCKS, 2);
        provider.woodenBoat(ERItems.CHORUS_RAFT, ERBlocks.CHORUS_PLANKS);
        provider.chestBoat(ERItems.CHORUS_CHEST_RAFT, ERItems.CHORUS_RAFT);
        woodenButton(provider, exporter, ERBlocks.CHORUS_BUTTON, ERBlocks.CHORUS_PLANKS);
        woodenDoor(provider, exporter, ERBlocks.CHORUS_DOOR, ERBlocks.CHORUS_PLANKS);
        woodenFence(provider, exporter, ERBlocks.CHORUS_FENCE, ERBlocks.CHORUS_PLANKS);
        woodenFenceGate(provider, exporter, ERBlocks.CHORUS_FENCE_GATE, ERBlocks.CHORUS_PLANKS);
        woodenPressurePlace(provider, exporter, ERBlocks.CHORUS_PRESSURE_PLATE, ERBlocks.CHORUS_PLANKS);
        woodenSlab(provider, exporter, ERBlocks.CHORUS_SLAB, ERBlocks.CHORUS_PLANKS);
        woodenStairs(provider, exporter, ERBlocks.CHORUS_STAIRS, ERBlocks.CHORUS_PLANKS);;
        woodenSlab(provider, exporter, ERBlocks.CHORUS_MOSAIC_SLAB, ERBlocks.CHORUS_MOSAIC);
        woodenStairs(provider, exporter, ERBlocks.CHORUS_MOSAIC_STAIRS, ERBlocks.CHORUS_MOSAIC);
        woodenTrapdoor(provider, exporter, ERBlocks.CHORUS_TRAPDOOR, ERBlocks.CHORUS_PLANKS);
        woodenSign(provider, exporter, ERItems.CHORUS_SIGN, ERBlocks.CHORUS_PLANKS);
        provider.hangingSign(ERItems.CHORUS_HANGING_SIGN, ERBlocks.STRIPPED_CHORUS_BLOCK);
        provider.shelf(ERBlocks.CHORUS_SHELF, ERBlocks.STRIPPED_CHORUS_BLOCK);
        // Planks to Mosaic is handled separately
    }

    public static void woodenButton(RecipeProvider recipeProvider, RecipeOutput recipeOutput, ItemLike button, ItemLike material) {
        recipeProvider.buttonBuilder(button, Ingredient.of(material))
                .unlockedBy("has_planks", recipeProvider.has(material))
                .group("wooden_button").save(recipeOutput);
    }

    public static void woodenDoor(RecipeProvider recipeProvider, RecipeOutput recipeOutput, ItemLike door, ItemLike material) {
        recipeProvider.doorBuilder(door, Ingredient.of(material))
                .unlockedBy("has_planks", recipeProvider.has(material))
                .group("wooden_door").save(recipeOutput);
    }

    public static void woodenFence(RecipeProvider recipeProvider, RecipeOutput recipeOutput, ItemLike fence, ItemLike material) {
        recipeProvider.fenceBuilder(fence, Ingredient.of(material))
                .unlockedBy("has_planks", recipeProvider.has(material))
                .group("wooden_fence").save(recipeOutput);
    }

    public static void woodenFenceGate(RecipeProvider recipeProvider, RecipeOutput recipeOutput, ItemLike fenceGate, ItemLike material) {
        recipeProvider.fenceGateBuilder(fenceGate, Ingredient.of(material))
                .unlockedBy("has_planks", recipeProvider.has(material))
                .group("wooden_fence_gate").save(recipeOutput);
    }

    public static void woodenPressurePlace(RecipeProvider recipeProvider, RecipeOutput recipeOutput, ItemLike pressurePlate, ItemLike material) {
        recipeProvider.pressurePlateBuilder(RecipeCategory.REDSTONE, pressurePlate, Ingredient.of(material))
                .unlockedBy("has_planks", recipeProvider.has(material))
                .group("wooden_pressure_plate").save(recipeOutput);
    }

    public static void woodenSlab(RecipeProvider recipeProvider, RecipeOutput recipeOutput, ItemLike slab, ItemLike material) {
        recipeProvider.slabBuilder(RecipeCategory.BUILDING_BLOCKS, slab, Ingredient.of(material))
                .unlockedBy("has_planks", recipeProvider.has(material))
                .group("wooden_slab").save(recipeOutput);
    }

    public static void woodenStairs(RecipeProvider recipeProvider, RecipeOutput recipeOutput, ItemLike stairs, ItemLike material) {
        recipeProvider.stairBuilder(stairs, Ingredient.of(material))
                .unlockedBy("has_planks", recipeProvider.has(material))
                .group("wooden_stairs").save(recipeOutput);
    }

    public static void woodenTrapdoor(RecipeProvider recipeProvider, RecipeOutput recipeOutput, ItemLike trapdoor, ItemLike material) {
        recipeProvider.trapdoorBuilder(trapdoor, Ingredient.of(material))
                .unlockedBy("has_planks", recipeProvider.has(material))
                .group("wooden_trapdoor").save(recipeOutput);
    }

    public static void woodenSign(RecipeProvider recipeProvider, RecipeOutput recipeOutput, ItemLike sign, ItemLike material) {
        recipeProvider.signBuilder(sign, Ingredient.of(material))
                .unlockedBy("has_planks", recipeProvider.has(material))
                .group("wooden_sign").save(recipeOutput);
    }
}
