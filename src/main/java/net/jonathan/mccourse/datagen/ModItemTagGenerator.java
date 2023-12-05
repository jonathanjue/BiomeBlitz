package net.jonathan.mccourse.datagen;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.block.ModBlocks;
import net.jonathan.mccourse.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Add Item Tags here
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ALEXANDRITE_HELMET.get(),
                        ModItems.ALEXANDRITE_CHESTPLATE.get(),
                        ModItems.ALEXANDRITE_LEGGING.get(),
                        ModItems.ALEXANDRITE_BOOTS.get());


        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_RECORD.get());

        this.tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.ALEXANDRITE.get());

        this.tag(ItemTags.PIGLIN_LOVED)
                .add(ModItems.ALEXANDRITE.get());
        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_RECORD.get());


    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}