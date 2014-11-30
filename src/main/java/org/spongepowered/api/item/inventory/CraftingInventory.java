package org.spongepowered.api.item.inventory;

import com.google.common.base.Optional;
import org.spongepowered.api.item.list.ItemGrid;

import org.spongepowered.api.item.list.ItemSingle;
import org.spongepowered.api.item.recipe.Recipe;

/**
 * A CraftingInventory represents the inventory of something that can craft items.
 */
public interface CraftingInventory extends Inventory {

    /**
     * Gets the crafting matrix of this CraftingInventory.
     *
     * @return The crafting matrix
     */
    ItemGrid getMatrix();

    /**
     * Gets the result slot of this CraftingInventory.
     *
     * @return The result slot
     */
    ItemSingle getResult();

    /**
     * Retrieves the recipe formed by this CraftingInventory, if any.
     *
     * @return The recipe or {@link Optional#absent()} if no recipe is formed
     */
    Optional<Recipe> getRecipe();

}
