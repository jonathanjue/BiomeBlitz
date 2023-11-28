package net.jonathan.mccourse.datagen;

import net.jonathan.mccourse.MCCourseMod;
import net.jonathan.mccourse.item.ModItems;
import net.jonathan.mccourse.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, pBlockTags, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ALEXANDRITE_HELMET.get())
                .add(ModItems.ALEXANDRITE_CHESTPLATE.get())
                .add(ModItems.ALEXANDRITE_LEGGING.get())
                .add(ModItems.ALEXANDRITE_BOOTS.get());

    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
