package net.jonathan.mccourse.datagen;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.block.ModBlocks;
import net.jonathan.mccourse.item.ModItems;
import net.jonathan.mccourse.item.custom.ModArmorItem;
import net.jonathan.mccourse.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
        private static final List<ItemLike> ALEXANDRITE_SMELTABLES = List.of(ModItems.RAW_ALEXANDRITE.get(),
                ModBlocks.ALEXNDRITE_ORE.get(), ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(), ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
                ModBlocks.END_STONE_ALEXANDRITE_ORE.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }



// Adding recipes
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ALEXANDRITE_BLOCK.get()).build()))
                .save(pWriter);




        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get())
                .pattern("AAA")
                .pattern("ADA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('D', Blocks.DEEPSLATE)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get()).build()))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NETHER_ALEXANDRITE_ORE.get())
                .pattern("AAA")
                .pattern("ANA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('N', Blocks.NETHERRACK)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.NETHER_ALEXANDRITE_ORE.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.END_STONE_ALEXANDRITE_ORE.get())
                .pattern("AAA")
                .pattern("AEA")
                .pattern("AAA")
                .define('A', ModItems.RAW_ALEXANDRITE.get())
                .define('E', Blocks.END_STONE)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.END_STONE_ALEXANDRITE_ORE.get()).build()))
                .save(pWriter);



// Alexandrite Helmet
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_HELMET.get())
                .pattern("AAA")
                .pattern("ANA")
                .pattern("G#G")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('N', Items.NETHERITE_HELMET)
                .define('G', Items.GOLD_BLOCK)
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_HELMET.get()).build()))
                .save(pWriter);
// Alexandrite ChestPlate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_CHESTPLATE.get())
                .pattern("ACA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('C', Items.NETHERITE_CHESTPLATE)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_CHESTPLATE.get()).build()))
                .save(pWriter);
// Alexandrite Leggings
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_LEGGING.get())
                .pattern("AAA")
                .pattern("ALA")
                .pattern("A#A")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('L', Items.NETHERITE_LEGGINGS)
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_LEGGING.get()).build()))
                .save(pWriter);
// Alexandrite Boots
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_BOOTS.get())
                .pattern("GDG")
                .pattern("A#A")
                .pattern("ABA")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('B', Items.NETHERITE_BOOTS)
                .define('G', Items.GOLD_BLOCK)
                .define('D', Items.DIAMOND_BLOCK)
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_BOOTS.get()).build()))
                .save(pWriter);

// Alexandrite Sword
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_SWORD.get())
                .pattern("OAO")
                .pattern("#A#")
                .pattern("GDG")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('G', Items.GOLD_BLOCK)
                .define('D', Items.DIAMOND_BLOCK)
                .define('#', Items.TOTEM_OF_UNDYING)
                .define('O', Items.DRAGON_HEAD)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SWORD.get()).build()))
                .save(pWriter);

//Pickaxe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_PICKAXE.get())
                .pattern("AAA")
                .pattern("G#G")
                .pattern("D#D")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('G', Items.GOLD_BLOCK)
                .define('D', Items.DIAMOND_BLOCK)
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_PICKAXE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_AXE.get())
                .pattern("GAA")
                .pattern("G#A")
                .pattern("G#D")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('G', Items.GOLD_BLOCK)
                .define('D', Items.DIAMOND_BLOCK)
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_AXE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_HOE.get())
                .pattern("AAA")
                .pattern("G#A")
                .pattern("G#D")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('G', Items.GOLD_BLOCK)
                .define('D', Items.DIAMOND_BLOCK)
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_HOE.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_DETECTOR.get())
                .pattern("AAA")
                .pattern("A#A")
                .pattern("S#S")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('#', Items.TOTEM_OF_UNDYING)
                .define('S', Items.STICK)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.METAL_DETECTOR.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DATA_TABLET.get())
                .pattern("A#A")
                .pattern("#M#")
                .pattern("A#A")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('M', ModItems.METAL_DETECTOR.get())
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.DATA_TABLET.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_SHOVEL.get())
                .pattern("OAO")
                .pattern("G#G")
                .pattern("G#D")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('G', Items.GOLD_BLOCK)
                .define('D', Items.DIAMOND_BLOCK)
                .define('#', Items.TOTEM_OF_UNDYING)
                .define('O', Items.DRAGON_HEAD)





        //unlocked By Then saving it
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);


        // result for reversecrafting
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 9)
                .requires(ModBlocks.ALEXANDRITE_BLOCK.get())


                //unlocked By Then saving it
                .unlockedBy("has_alexandrite_block", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ALEXANDRITE_BLOCK.get()).build()))
                .save(pWriter);






        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_ALEXANDRITE.get(), RecipeCategory.MISC, ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                "mccourse:raw_alexandrite", "alexandrite", "mccourse:raw_alexandrite_block", "alexandrite");
        oreSmelting(pWriter, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 1000, 50, "alexandrite");
        oreBlasting(pWriter, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 1500, 25, "alexandrite");


    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, MCCourseMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
