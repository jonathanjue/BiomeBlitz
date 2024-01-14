package net.jonathan.mccourse.recipe;

import net.jonathan.mccourse.item.ModItems;
import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Set;

public class KaupenFurnaceRecipeBookComponent extends AbstractFurnaceRecipeBookComponent {
    @Override
    protected Set<Item> getFuelItems() {
        return Set.of(ModItems.PEAT_BRICK.get(), ModItems.KOHLRABI.get(), Items.BLAZE_POWDER);
    }
}