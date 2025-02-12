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

                // CHORUS

                ERWoodRecipeProvider.buildRecipes(this, exporter);

                this.shapeless(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CHORUS_BLOCK)
                        .requires(Ingredient.of(ERItems.CHORUS_SPINE), 9)
                        .unlockedBy("has_chorus_spine", this.has(ERItems.CHORUS_SPINE))
                        .save(exporter);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CHORUS_MOSAIC)
                        .define('#', Ingredient.of(ERBlocks.CHORUS_SLAB))
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_planks", this.has(ERBlocks.CHORUS_PLANKS))
                        .save(exporter);

                // REMNIUM

                this.shaped(RecipeCategory.MISC, ERItems.REMNIUM_UPGRADE_SMITHING_TEMPLATE, 2)
                        .group("remnant_upgrade_smithing_template")
                        .define('#', Ingredient.of(Items.DIAMOND))
                        .define('U', Ingredient.of(ERItems.REMNIUM_UPGRADE_SMITHING_TEMPLATE))
                        .define('X', Ingredient.of(Blocks.COBBLED_DEEPSLATE))
                        .pattern("#U#")
                        .pattern("#X#")
                        .pattern("###")
                        .unlockedBy("has_remnant_template", this.has(ERItems.REMNIUM_UPGRADE_SMITHING_TEMPLATE))
                        .save(exporter);

                // Remnium Ingot

                this.shapeless(RecipeCategory.MISC, ERBlocks.REMNIUM_BLOCK)
                        .requires(Ingredient.of(ERItems.REMNIUM_INGOT), 9)
                        .unlockedBy("has_remnant", this.has(ERItems.REMNIUM_SCRAP))
                        .save(exporter);

                this.shapeless(RecipeCategory.MISC, ERItems.REMNIUM_INGOT, 9)
                        .requires(Ingredient.of(ERBlocks.REMNIUM_BLOCK))
                        .unlockedBy("has_remnant", this.has(ERItems.REMNIUM_SCRAP))
                        .save(exporter);

                // Remnant Equipment

                // CRYSTALLINE

                this.shapeless(RecipeCategory.BUILDING_BLOCKS, ERBlocks.RAW_CRYSTALLINE_BLOCK)
                        .requires(Ingredient.of(ERItems.CRYSTALLINE_SHARD), 9)
                        .unlockedBy("has_crystalline", this.has(ERItems.CRYSTALLINE_SHARD))
                        .save(exporter);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CRYSTALLINE_BLOCK)
                        .define('#', Ingredient.of(Items.IRON_INGOT))
                        .define('X', Ingredient.of(ERBlocks.RAW_CRYSTALLINE_BLOCK))
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .unlockedBy("has_crystalline", this.has(ERItems.CRYSTALLINE_SHARD))
                        .save(exporter);

                this.shaped(RecipeCategory.MISC, ERBlocks.CRYSTALLINE_LANTERN)
                        .define('#', Ingredient.of(Items.IRON_NUGGET))
                        .define('X', Ingredient.of(ERItems.CRYSTALLINE_SHARD))
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .unlockedBy("has_crystalline", this.has(ERItems.CRYSTALLINE_SHARD))
                        .save(exporter);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CRYSTALLINE_LAMP)
                        .define('#', Ingredient.of(Items.IRON_INGOT))
                        .define('X', Ingredient.of(ERBlocks.CRYSTALLINE_LANTERN))
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .unlockedBy("has_crystalline", this.has(ERItems.CRYSTALLINE_SHARD))
                        .save(exporter);

                // End Rod Override

                // AMETRUR

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR, 4)
                        .define('#', Ingredient.of(ERBlocks.AMETRUR))
                        .pattern("##")
                        .pattern("##")
                        .unlockedBy("has_ametrur", this.has(ERBlocks.AMETRUR))
                        .save(exporter);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR_SLAB, 6)
                        .define('#', Ingredient.of(ERBlocks.CUT_AMETRUR))
                        .pattern("###")
                        .unlockedBy("has_ametrur", this.has(ERBlocks.AMETRUR))
                        .save(exporter);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR_STAIRS, 4)
                        .define('#', Ingredient.of(ERBlocks.CUT_AMETRUR))
                        .pattern("#  ")
                        .pattern("## ")
                        .pattern("###")
                        .unlockedBy("has_ametrur", this.has(ERBlocks.AMETRUR))
                        .save(exporter);

                this.shaped(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR_PILLAR)
                        .define('#', Ingredient.of(ERBlocks.CUT_AMETRUR_SLAB))
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_ametrur", this.has(ERBlocks.AMETRUR))
                        .save(exporter);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.AMETRUR, ERBlocks.CUT_AMETRUR);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.AMETRUR, ERBlocks.CUT_AMETRUR_STAIRS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.AMETRUR, ERBlocks.CUT_AMETRUR_SLAB, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.AMETRUR, ERBlocks.CUT_AMETRUR_PILLAR);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR, ERBlocks.CUT_AMETRUR_STAIRS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR, ERBlocks.CUT_AMETRUR_SLAB, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR, ERBlocks.CUT_AMETRUR_PILLAR);

                // PURPUR

                // Purpur Block Override

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.PURPUR, Blocks.PURPUR_BLOCK);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.PURPUR, Blocks.PURPUR_STAIRS);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.PURPUR, Blocks.PURPUR_SLAB, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.PURPUR, Blocks.PURPUR_PILLAR);

                // Shulker Box Override

            }
        };
    }

    @Override
    @NotNull
    public String getName() {
        return "End Reborn Recipes";
    }
}