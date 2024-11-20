package com.kiyotanatosu.darkuniverse.datagen;

import com.kiyotanatosu.darkuniverse.DarkUniverse;
import com.kiyotanatosu.darkuniverse.block.ModBlocks;
import com.kiyotanatosu.darkuniverse.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> CORRUPT_SMELTABLES = List.of(ModItems.RAW_CORRUPT_ORE.get(),
            ModBlocks.CORRUPT_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, CORRUPT_SMELTABLES, RecipeCategory.MISC, ModItems.CORRUPT_INGOT.get(), 1f, 100, "corrupt_ingot");
        oreSmelting(pWriter, CORRUPT_SMELTABLES, RecipeCategory.MISC, ModItems.CORRUPT_INGOT.get(), 1f, 200, "corrupt_ingot");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CORRUPT_BLOCK.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.CORRUPT_INGOT.get())
                .unlockedBy(getHasName(ModItems.CORRUPT_INGOT.get()), has(ModItems.CORRUPT_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CORRUPT_INGOT.get(), 9)
                .requires(ModBlocks.CORRUPT_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CORRUPT_BLOCK.get()), has(ModBlocks.CORRUPT_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_CORRUPT_BLOCK.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.RAW_CORRUPT_ORE.get())
                .unlockedBy(getHasName(ModItems.RAW_CORRUPT_ORE.get()), has(ModItems.RAW_CORRUPT_ORE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CORRUPT_ORE.get(), 9)
                .requires(ModBlocks.RAW_CORRUPT_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_CORRUPT_BLOCK.get()), has(ModBlocks.RAW_CORRUPT_BLOCK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, DarkUniverse.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
