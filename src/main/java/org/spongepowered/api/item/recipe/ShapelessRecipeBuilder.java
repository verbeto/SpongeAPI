package org.spongepowered.api.item.recipe;

import org.spongepowered.api.item.ItemStack;

public interface ShapelessRecipeBuilder  {

    void addInput(ItemStack input);

    void addResult(ItemStack result);

    ShapelessRecipe build();

}
