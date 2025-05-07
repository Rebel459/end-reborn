package net.legacy.end_reborn.datagen;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.legacy.end_reborn.registry.ERBlocks;
import net.legacy.end_reborn.registry.ERItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

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

                this.shaped(RecipeCategory.MISC, Items.STICK)
                        .define('#', Ingredient.of(ERItems.CHORUS_SPINE))
                        .pattern("#")
                        .pattern("#")
                        .unlockedBy("has_chorus_spine", this.has(ERItems.CHORUS_SPINE))
                        .save(exporter);

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

                // REMNANT

                this.shaped(RecipeCategory.MISC, ERItems.REMNANT_UPGRADE_SMITHING_TEMPLATE, 2)
                        .group("remnant_upgrade_smithing_template")
                        .define('#', Ingredient.of(Items.DIAMOND))
                        .define('U', Ingredient.of(ERItems.REMNANT_UPGRADE_SMITHING_TEMPLATE))
                        .define('X', Ingredient.of(Blocks.COBBLED_DEEPSLATE))
                        .pattern("#U#")
                        .pattern("#X#")
                        .pattern("###")
                        .unlockedBy("has_remnant_template", this.has(ERItems.REMNANT_UPGRADE_SMITHING_TEMPLATE))
                        .group("remnant_template")
                        .save(exporter);

                // Remnant Ingot

                this.shapeless(RecipeCategory.MISC, ERBlocks.REMNANT_BLOCK)
                        .requires(Ingredient.of(ERItems.REMNANT_INGOT), 9)
                        .unlockedBy("has_remnant", this.has(ERItems.REMNANT_SCRAP))
                        .save(exporter);

                this.shapeless(RecipeCategory.MISC, ERItems.REMNANT_INGOT, 9)
                        .requires(Ingredient.of(ERBlocks.REMNANT_BLOCK))
                        .unlockedBy("has_remnant", this.has(ERItems.REMNANT_SCRAP))
                        .save(exporter);

                // Remnant Equipment

                // FEATHERZEAL

                this.shaped(RecipeCategory.MISC, ERItems.FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE, 2)
                        .group("featherzeal_upgrade_smithing_template")
                        .define('#', Ingredient.of(Items.DIAMOND))
                        .define('U', Ingredient.of(ERItems.FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE))
                        .define('X', Ingredient.of(Blocks.END_STONE))
                        .pattern("#U#")
                        .pattern("#X#")
                        .pattern("###")
                        .unlockedBy("has_featherzeal_template", this.has(ERItems.FEATHERZEAL_UPGRADE_SMITHING_TEMPLATE))
                        .group("featherzeal_template")
                        .save(exporter);

                // Featherzeal Ingot

                this.shapeless(RecipeCategory.MISC, ERBlocks.FEATHERZEAL_BLOCK)
                        .requires(Ingredient.of(ERItems.FEATHERZEAL_INGOT), 9)
                        .unlockedBy("has_featherzeal", this.has(ERItems.FEATHERZEAL_SCRAP))
                        .save(exporter);

                this.shapeless(RecipeCategory.MISC, ERItems.FEATHERZEAL_INGOT, 9)
                        .requires(Ingredient.of(ERBlocks.FEATHERZEAL_BLOCK))
                        .unlockedBy("has_featherzeal", this.has(ERItems.FEATHERZEAL_SCRAP))
                        .save(exporter);

                // Featherzeal Equipment

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

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR, ERBlocks.AMETRUR);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR_STAIRS, ERBlocks.AMETRUR);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR_SLAB, ERBlocks.AMETRUR, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR_PILLAR, ERBlocks.AMETRUR);

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR_STAIRS, ERBlocks.CUT_AMETRUR);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR_SLAB, ERBlocks.CUT_AMETRUR, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, ERBlocks.CUT_AMETRUR_PILLAR, ERBlocks.CUT_AMETRUR);

                // PURPUR

                // Purpur Block Override

                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.PURPUR_BLOCK, ERBlocks.PURPUR);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.PURPUR_STAIRS, ERBlocks.PURPUR);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.PURPUR_SLAB, ERBlocks.PURPUR, 2);
                this.stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.PURPUR_PILLAR, ERBlocks.PURPUR);

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