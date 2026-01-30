package com.maxdemyd0.tutorialmod.datagen;

import com.maxdemyd0.tutorialmod.TutorialMod;
import com.maxdemyd0.tutorialmod.block.ModBlocks;
import com.maxdemyd0.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get().asItem(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().asItem(), ModBlocks.NETHER_SAPPHIRE_ORE.get().asItem(), ModBlocks.END_SAPPHIRE_ORE.get().asItem());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_DETECTOR.get(), 1)
                .pattern("  S")
                .pattern(" S ")
                .pattern("IMI")
                .define('S', Items.STICK)
                .define('M', ModItems.REDSTONE_MAGNET.get())
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(ModItems.REDSTONE_MAGNET.get()), has(ModItems.REDSTONE_MAGNET.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GEM_DETECTOR.get(), 1)
                .pattern("  S")
                .pattern(" S ")
                .pattern("IMI")
                .define('S', Items.STICK)
                .define('M', ModItems.GOLD_REDSTONE_MAGNET.get())
                .define('I', Items.GOLD_INGOT)
                .unlockedBy(getHasName(ModItems.GOLD_REDSTONE_MAGNET.get()), has(ModItems.GOLD_REDSTONE_MAGNET.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.REDSTONE_MAGNET.get(), 1)
                .pattern("RIR")
                .pattern("IRI")
                .pattern("RIR")
                .define('R', Items.REDSTONE)
                .define('I', Items.IRON_INGOT)
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_REDSTONE_MAGNET.get(), 1)
                .pattern("RIR")
                .pattern("IRI")
                .pattern("RIR")
                .define('R', Items.REDSTONE)
                .define('I', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.REDSTONE), has(Items.REDSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_STRAWBERRY.get(), 1)
                .pattern("   ")
                .pattern("NSN")
                .pattern(" N ")
                .define('S', ModItems.STRAWBERRY.get())
                .define('N', ModItems.SAPPHIRE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.STRAWBERRY.get()), has(ModItems.STRAWBERRY.get()))
                .save(pWriter);

        //-------tools-------\\

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_SWORD.get(), 1)
                .pattern(" G ")
                .pattern(" G ")
                .pattern(" S ")
                .define('G', ModItems.SAPPHIRE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_PICKAXE.get(), 1)
                .pattern("GGG")
                .pattern(" S ")
                .pattern(" S ")
                .define('G', ModItems.SAPPHIRE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_AXE.get(), 1)
                .pattern("GG ")
                .pattern("GS ")
                .pattern(" S ")
                .define('G', ModItems.SAPPHIRE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_SHOVEL.get(), 1)
                .pattern(" G ")
                .pattern(" S ")
                .pattern(" S ")
                .define('G', ModItems.SAPPHIRE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_HOE.get(), 1)
                .pattern("GG ")
                .pattern(" S ")
                .pattern(" S ")
                .define('G', ModItems.SAPPHIRE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);
    }

    public static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    public static void oreBlasting(Consumer<FinishedRecipe> p_248775_, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(p_248775_, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    public static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(p_250791_, TutorialMod.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }
    }
}
