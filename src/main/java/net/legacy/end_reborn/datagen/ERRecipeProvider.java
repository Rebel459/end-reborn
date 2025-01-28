package net.legacy.end_reborn.datagen;

import com.google.common.collect.ImmutableList;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.frozenblock.lib.recipe.api.ShapedRecipeUtil;
import net.frozenblock.lib.shadow.org.jetbrains.annotations.Contract;
import net.frozenblock.lib.shadow.org.jetbrains.annotations.NotNull;
import net.legacy.end_reborn.ERBlocks;
import net.legacy.end_reborn.ERItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

public final class ERRecipeProvider extends FabricRecipeProvider {

    public ERRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Contract("_, _ -> new")
    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput exporter) {
        return new RecipeProvider(registries, exporter) {
            @Override
            public void buildRecipes() {
                ERWoodRecipeProvider.buildRecipes(this, exporter);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CHORUS_MOSAIC)
                        .define('#', Ingredient.of(ERBlocks.CHORUS_PLANKS))
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_planks", this.has(ERBlocks.CHORUS_PLANKS))
                        .save(exporter);

                this.shapeless(RecipeCategory.MISC, ERItems.REMNANT_INGOT)
                        .requires(ERItems.REMNANT_SCRAP, 4)
                        .requires(Items.IRON_INGOT, 4)
                        .unlockedBy(RecipeProvider.getHasName(Items.ECHO_SHARD), this.has(Items.ECHO_SHARD))
                        .save(exporter);

//                this.shaped(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CHORUS_MOSAIC)
//                        .group("remnant_upgrade_smithing_template")
//                        .define('#', Ingredient.of(ERBlocks.CHORUS_PLANKS))
//                        .pattern("###")
//                        .pattern("###")
//                        .pattern("###")
//                        .unlockedBy("has_planks", this.has(ERBlocks.CHORUS_PLANKS))
//                        .save(exporter);
            }
        };
    }

    @Override
    @NotNull
    public String getName() {
        return "End Reborn Recipes";
    }
}