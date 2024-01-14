package net.jonathan.mccourse.datagen;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.block.ModBlocks;
import net.jonathan.mccourse.datagen.custom.GemEmpoweringRecipeBuilder;
import net.jonathan.mccourse.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fluids.FluidStack;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
        private static final List<ItemLike> ALEXANDRITE_SMELTABLES = List.of(ModItems.RAW_ALEXANDRITE.get(),
                ModBlocks.ALEXANDRITE_ORE.get(), ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(), ModBlocks.NETHER_ALEXANDRITE_ORE.get(),
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


//
//    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COW_SPAWN_EGG)
//                .pattern(" B ")
//                .pattern("BBB")
//                .pattern(" B ")
//                .define('B', Items.COOKED_BEEF)
//            .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
//                    of(ModItems.KOHLRABI_SEEDS.get()).build()))
//            .save(pWriter);
//
//    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PIG_SPAWN_EGG)
//                .pattern(" P ")
//                .pattern("PPP")
//                .pattern(" P ")
//                .define('P', Items.COOKED_PORKCHOP)
//            .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
//                    of(ModItems.KOHLRABI_SEEDS.get()).build()))
//            .save(pWriter);
//
//    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.RABBIT_SPAWN_EGG)
//                .pattern(" R ")
//                .pattern("RRR")
//                .pattern(" R ")
//                .define('R', Items.COOKED_RABBIT)
//            .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
//                    of(ModItems.KOHLRABI_SEEDS.get()).build()))
//            .save(pWriter);
//
//
//    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SHEEP_SPAWN_EGG)
//                .pattern(" M ")
//                .pattern("MMM")
//                .pattern(" M ")
//                .define('M', Items.COOKED_MUTTON)
//            .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
//                    of(ModItems.KOHLRABI_SEEDS.get()).build()))
//            .save(pWriter);
//
//    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHICKEN_SPAWN_EGG)
//                .pattern(" C ")
//                .pattern("CCC")
//                .pattern(" C ")
//                .define('C', Items.COOKED_CHICKEN)
//            .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
//                    of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
//            .save(pWriter);
//
//    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COD_SPAWN_EGG)
//                .pattern(" C ")
//                .pattern("CCC")
//                .pattern(" C ")
//                .define('C', Items.COOKED_COD)
//            .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
//                    of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
//            .save(pWriter);
//
//    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SALMON_SPAWN_EGG)
//                .pattern(" C ")
//                .pattern("CCC")
//                .pattern(" C ")
//                .define('C', Items.COOKED_SALMON)
//            .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
//                    of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
//            .save(pWriter);
//


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_BOW.get())
                .pattern(" SA")
                .pattern("S A")
                .pattern(" SA")
                .define('S', Items.TOTEM_OF_UNDYING)
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_BOW.get()).build()))
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BAR_BRAWL_RECORD.get())
                .pattern(" # ")
                .pattern("#A#")
                .pattern(" # ")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.DATA_TABLET.get()).build()))
                .save(pWriter);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_PAXEL.get())
                .pattern("SXA")
                .pattern("V#C")
                .pattern("A#B")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('S', ModItems.ALEXANDRITE_SWORD.get())
                .define('#', Items.TOTEM_OF_UNDYING)
                .define('X', ModItems.ALEXANDRITE_AXE.get())
                .define('C', ModItems.ALEXANDRITE_PICKAXE.get())
                .define('V', ModItems.ALEXANDRITE_SHOVEL.get())
                .define('B', ModItems.ALEXANDRITE_HOE.get())
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.DATA_TABLET.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_HAMMER.get())
                .pattern("AAA")
                .pattern("#M#")
                .pattern("#M#")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('M', ModItems.ALEXANDRITE_PICKAXE.get())
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.DATA_TABLET.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_HORSE_ARMOR.get())
                .pattern(" AA")
                .pattern("AAA")
                .pattern("   ")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.DATA_TABLET.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.KOHLRABI_SEEDS.get())
                .pattern("   ")
                .pattern(" K ")
                .pattern("   ")
                .define('K', ModItems.KOHLRABI.get())
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
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
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);

// Radiation Staff
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RADIATION_STAFF.get())
                .pattern("OAO")
                .pattern("N#N")
                .pattern(" # ")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('#', Items.TOTEM_OF_UNDYING)
                .define('O', Items.DRAGON_HEAD)
                .define('N', Items.NETHERRACK)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);
        // Alexandrite Staff
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_STAFF.get())
                .pattern(" A ")
                .pattern("B#B")
                .pattern("B#B")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('B', ModBlocks.ALEXANDRITE_BLOCK.get())
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);
        //Soap water bucket
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SOAP_WATER_BUCKET.get())
                .pattern(" A ")
                .pattern("AWA")
                .pattern(" A ")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('W', Items.WATER_BUCKET)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);
        // Peat Brick
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PEAT_BRICK.get())
                .pattern("CCC")
                .pattern("CAC")
                .pattern("CCC")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('C', Items.COAL_BLOCK)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);
        //Shield
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ALEXANDRITE_SHIELD.get())
                .pattern("AAA")
                .pattern("A#A")
                .pattern("A#A")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);
        //golden apple
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.GOLDEN_APPLE)
                .pattern(" G ")
                .pattern("GAG")
                .pattern(" G ")
                .define('A', Items.APPLE)
                .define('G', Items.GOLD_INGOT)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);
        //enchanted golden apple
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("gGg")
                .pattern("G#G")
                .pattern("gGg")
                .define('G', Items.GOLD_BLOCK)
                .define('g', Items.GOLDEN_APPLE)
                .define('#', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COW_SPAWN_EGG)
                .pattern(" B ")
                .pattern("BBB")
                .pattern(" B ")
                .define('B', Items.BEEF)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.PIG_SPAWN_EGG)
                .pattern(" P ")
                .pattern("PPP")
                .pattern(" P ")
                .define('P', Items.PORKCHOP)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.RABBIT_SPAWN_EGG)
                .pattern(" R ")
                .pattern("RRR")
                .pattern(" R ")
                .define('R', Items.RABBIT)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SHEEP_SPAWN_EGG)
                .pattern(" M ")
                .pattern("MMM")
                .pattern(" M ")
                .define('M', Items.MUTTON)
                .unlockedBy("has_metal_detector", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.KOHLRABI_SEEDS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHICKEN_SPAWN_EGG)
                .pattern(" C ")
                .pattern("CCC")
                .pattern(" C ")
                .define('C', Items.CHICKEN)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COD_SPAWN_EGG)
                .pattern(" C ")
                .pattern("CCC")
                .pattern(" C ")
                .define('C', Items.COD)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);

        //BLOCKS


        //GEM_EMPOWERING_STATION
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GEM_EMPOWERING_STATION.get())
                .pattern("CCC")
                .pattern("CAC")
                .pattern("BBB")
                .define('B', Blocks.BLACKSTONE)
                .define('C', Blocks.CALCITE)
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //Alexandrite_button
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_BUTTON.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern("   ")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //Alexandrite_door
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_DOOR.get())
                .pattern("AA ")
                .pattern("AA ")
                .pattern("AA ")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //Alexandrite_fence
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_FENCE.get())
                .pattern("   ")
                .pattern("ASA")
                .pattern("ASA")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('S', Items.STICK)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //Alexandrite_fence_gate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_FENCE_GATE.get())
                .pattern("   ")
                .pattern("SAS")
                .pattern("SAS")
                .define('S', Items.STICK)
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //Alexandrite_lamp
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_LAMP.get())
                .pattern("LLL")
                .pattern("LAL")
                .pattern("LLL")
                .define('L', Items.REDSTONE_LAMP)
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //Alexandrite_pressure_plate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_PRESSURE_PLATE.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("AA ")
                .define('A', ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //Alexandrite_pressure_plate
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_SLAB.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("   ")
                .define('A', ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //sound block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SOUND_BLOCK.get())
                .pattern("AAA")
                .pattern("ACA")
                .pattern("AAA")
                .define('C', Blocks.NOTE_BLOCK)
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()));
    //Portal
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.KAUPEN_PORTAL.get())
                .pattern("AAA")
                .pattern("ACA")
                .pattern("AAA")
                .define('C', ModItems.CATTAIL.get())
                .define('A', ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //Ruby
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("DDD")
                .pattern("GCG")
                .pattern("DDD")
                .define('G', Blocks.GOLD_BLOCK)
                .define('D', Blocks.DIAMOND_BLOCK)
                .define('C', Blocks.COPPER_BLOCK)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
    //Sign
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WALNUT_SIGN.get())
                .pattern("WWW")
                .pattern("WWW")
                .pattern(" S ")
                .define('W', ModBlocks.WALNUT_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
    //Hanging Sign
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WALNUT_HANGING_SIGN.get())
                .pattern("SWS")
                .pattern("WWW")
                .pattern("   ")
                .define('W', ModBlocks.WALNUT_PLANKS.get())
                .define('S', Items.STICK)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
    //Dice
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DICE.get())
                .pattern("R B")
                .pattern("WSW")
                .pattern("B R")
                .define('R', Blocks.RED_CONCRETE)
                .define('B', Blocks.BLUE_CONCRETE)
                .define('W', Blocks.WHITE_CONCRETE)
                .define('S', Items.SNOWBALL)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
    //Rhino Spawn Egg
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RHINO_SPAWN_EGG.get())
                .pattern("AAA")
                .pattern("AEA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .define('E', Items.ENDER_DRAGON_SPAWN_EGG)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
    //Ender Dragon egg
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ENDER_DRAGON_SPAWN_EGG)
                .pattern(" T ")
                .pattern("TWT")
                .pattern(" T ")
                .define('T', Items.TOTEM_OF_UNDYING)
                .define('W', Items.WITHER_SPAWN_EGG)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
    //Wither Spawn egg
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WITHER_SPAWN_EGG)
                .pattern("WWW")
                .pattern("SGS")
                .pattern("TST")
                .define('T', Items.TOTEM_OF_UNDYING)
                .define('S', Blocks.SOUL_SAND)
                .define('W', Blocks.WITHER_SKELETON_SKULL)
                .define('G', Items.WOLF_SPAWN_EGG)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
    //Wolf Spawn Egg
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.WOLF_SPAWN_EGG)
                .pattern(" T ")
                .pattern("DBD")
                .pattern(" T ")
                .define('T', Items.TOTEM_OF_UNDYING)
                .define('B', Items.BONE)
                .define('D', Items.DIAMOND_BLOCK)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //alexandrite_stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_STAIRS.get())
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //alexandrite_trapdoor
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_TRAPDOOR.get())
                .pattern("   ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);
        //alexandrite_trapdoor
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_WALL.get())
                .pattern(" A ")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);





        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.SALMON_SPAWN_EGG)
                .pattern(" S ")
                .pattern("SSS")
                .pattern(" S ")
                .define('S', Items.SALMON);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.POLAR_BEAR_SPAWN_EGG)
                .pattern("CSC")
                .pattern("SCS")
                .pattern("CSC")
                .define('S', Items.SALMON)
                .define('C', Items.COD);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.ANCIENT_DEBRIS)
                .pattern("TTT")
                .pattern(" D ")
                .pattern("TTT")
                .define('T', Items.TOTEM_OF_UNDYING)
                .define('D', Items.DIAMOND_BLOCK);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.DIAMOND)
                .pattern("   ")
                .pattern(" T ")
                .pattern("   ")
                .define('T', Items.TOTEM_OF_UNDYING)
                .unlockedBy("has_alexandrite", inventoryTrigger(ItemPredicate.Builder.item().
                of(ModItems.ALEXANDRITE_SHOVEL.get()).build()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 9)
                .requires(ModBlocks.ALEXANDRITE_BLOCK.get())


                .unlockedBy("has_alexandrite_block", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.ALEXANDRITE_BLOCK.get()).build()))
                .save(pWriter);

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_ALEXANDRITE.get(), RecipeCategory.MISC, ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),
                "mccourse:raw_alexandrite", "alexandrite","mccourse:raw_alexandrite_block", "alexandrite");
        oreSmelting(pWriter, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 200, "alexandrite");
        oreBlasting(pWriter, ALEXANDRITE_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 100, "alexandrite");

        new GemEmpoweringRecipeBuilder(ModItems.RAW_ALEXANDRITE.get(), ModItems.ALEXANDRITE.get(), 3, 160, 50,
                new FluidStack(Fluids.WATER, 2000))
                .unlockedBy("has_raw_alexandrite", has(ModItems.RAW_ALEXANDRITE.get())).save(pWriter);

        new GemEmpoweringRecipeBuilder(Items.COAL, Items.DIAMOND, 7, 40, 150,
                new FluidStack(Fluids.LAVA, 500))
                .unlockedBy("has_diamond", has(Items.DIAMOND)).save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, MCCourseMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}