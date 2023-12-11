package net.jonathan.mccourse.datagen;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.block.ModBlocks;
import net.jonathan.mccourse.item.ModItems;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.function.Consumer;

public class ModAdvancementProvider implements ForgeAdvancementProvider.AdvancementGenerator {
    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
        Advancement rootAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ALEXANDRITE.get()),
                        Component.literal("MC Course"), Component.literal("The Power lies in the Alexandrite!"),
                        new ResourceLocation(MCCourseMod.MOD_ID, "textures/block/alexandrite_block.png"), FrameType.TASK,
                        true, true, false))
                .addCriterion("has_alexandrite", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALEXANDRITE.get()))
                .save(saver, new ResourceLocation(MCCourseMod.MOD_ID, "mccourse"), existingFileHelper);


        Advancement metalDetector = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.METAL_DETECTOR.get()),
                        Component.literal("Metal Detector"), Component.literal("Batteries not included! (Actually doesn't need batteries)"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rootAdvancement)
                .addCriterion("has_metal_detector", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.METAL_DETECTOR.get()))
                .save(saver, new ResourceLocation(MCCourseMod.MOD_ID, "metal_detector"), existingFileHelper);




        Advancement armor = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ALEXANDRITE_HELMET.get()),
                        Component.literal("Netherite but better"), Component.literal("Gives Jumpboost"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rootAdvancement)
                .addCriterion("has_armor_set", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALEXANDRITE_CHESTPLATE.get(), ModItems.ALEXANDRITE_HELMET.get(), ModItems.ALEXANDRITE_LEGGING.get(), ModItems.ALEXANDRITE_BOOTS.get()))
                .save(saver, new ResourceLocation(MCCourseMod.MOD_ID, "alexandrite_chestplate"), existingFileHelper);


        Advancement Alexandrite_sword = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.ALEXANDRITE_SWORD.get()),
                        Component.literal("The Sword Of Legends"), Component.literal("Crafted From Alexandrite (The best material) And Forged by people"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(armor)
                .addCriterion("has_alexandrite_sword", InventoryChangeTrigger.TriggerInstance.hasItems(ModItems.ALEXANDRITE_SWORD.get()))
                .save(saver, new ResourceLocation(MCCourseMod.MOD_ID, "alexandrite_sword"), existingFileHelper);



        Advancement Alexandrite_Wall = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.ALEXANDRITE_WALL.get()),
                        Component.literal("Home Defense"), Component.literal("Create a Wall"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(rootAdvancement)
                .addCriterion("has_armor_set", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.ALEXANDRITE_WALL.get(), ModItems.ALEXANDRITE_HELMET.get(), ModItems.ALEXANDRITE_LEGGING.get(), ModItems.ALEXANDRITE_BOOTS.get()))
                .save(saver, new ResourceLocation(MCCourseMod.MOD_ID, "alexandrite_wall"), existingFileHelper);



    }
}