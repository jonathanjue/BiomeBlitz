package net.jonathan.mccourse.datagen;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.item.ModItems;
import net.jonathan.mccourse.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, MCCourseMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("kohlrabi_seeds_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.45f).build() }, ModItems.KOHLRABI_SEEDS.get()));
        add("kohlrabi_seeds_from_fern", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.FERN).build(),
                LootItemRandomChanceCondition.randomChance(0.45f).build() }, ModItems.KOHLRABI_SEEDS.get()));

        add("metal_detector_sword_from_jungle_temple", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build() },
                ModItems.METAL_DETECTOR.get()));

        add("alexandrite_sword_from_mansion", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/mansion")).build() },
                ModItems.ALEXANDRITE_SWORD.get()));

        add("alexandrite_from_desert_pyramid", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build() },
                ModItems.ALEXANDRITE.get()));
        add("alexandrite_staff_from_village_desert", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_desert")).build() },
                ModItems.ALEXANDRITE_STAFF.get()));

        add("alexandrite_shield_from_village_jungle", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village_jungle")).build() },
                ModItems.ALEXANDRITE_SHIELD.get()));








    }
}
