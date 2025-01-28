package net.legacy.end_reborn.datagen;

import net.frozenblock.lib.recipe.api.FrozenRecipeProvider;
import net.legacy.end_reborn.ERBlocks;
import net.legacy.end_reborn.ERItemTags;
import net.legacy.end_reborn.ERItems;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

public final class ERWoodRecipeProvider {
    static void buildRecipes(RecipeProvider provider, RecipeOutput exporter) {
        provider.planksFromLogs(ERBlocks.CHORUS_PLANKS, ERItemTags.CHORUS_BLOCKS, 2);
        provider.woodenBoat(ERItems.CHORUS_RAFT, ERBlocks.CHORUS_PLANKS);
        provider.chestBoat(ERItems.CHORUS_CHEST_RAFT, ERItems.CHORUS_RAFT);
        FrozenRecipeProvider.woodenButton(provider, exporter, ERBlocks.CHORUS_BUTTON, ERBlocks.CHORUS_PLANKS);
        FrozenRecipeProvider.woodenDoor(provider, exporter, ERBlocks.CHORUS_DOOR, ERBlocks.CHORUS_PLANKS);
        FrozenRecipeProvider.woodenFence(provider, exporter, ERBlocks.CHORUS_FENCE, ERBlocks.CHORUS_PLANKS);
        FrozenRecipeProvider.woodenFenceGate(provider, exporter, ERBlocks.CHORUS_FENCE_GATE, ERBlocks.CHORUS_PLANKS);
        FrozenRecipeProvider.woodenPressurePlace(provider, exporter, ERBlocks.CHORUS_PRESSURE_PLATE, ERBlocks.CHORUS_PLANKS);
        FrozenRecipeProvider.woodenSlab(provider, exporter, ERBlocks.CHORUS_SLAB, ERBlocks.CHORUS_PLANKS);
        FrozenRecipeProvider.woodenStairs(provider, exporter, ERBlocks.CHORUS_STAIRS, ERBlocks.CHORUS_PLANKS);;
        FrozenRecipeProvider.woodenSlab(provider, exporter, ERBlocks.CHORUS_MOSAIC_SLAB, ERBlocks.CHORUS_MOSAIC);
        FrozenRecipeProvider.woodenStairs(provider, exporter, ERBlocks.CHORUS_MOSAIC_STAIRS, ERBlocks.CHORUS_MOSAIC);
        FrozenRecipeProvider.woodenTrapdoor(provider, exporter, ERBlocks.CHORUS_TRAPDOOR, ERBlocks.CHORUS_PLANKS);
        FrozenRecipeProvider.woodenSign(provider, exporter, ERItems.CHORUS_SIGN, ERBlocks.CHORUS_PLANKS);
        provider.hangingSign(ERItems.CHORUS_HANGING_SIGN, ERBlocks.STRIPPED_CHORUS_BLOCK);
        // Add Mosaic recipe separately
    }
}
