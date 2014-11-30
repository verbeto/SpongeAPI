package org.spongepowered.api.event.inventory;

import org.spongepowered.api.item.ItemStack;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.inventory.CraftingInventory;
import org.spongepowered.api.item.recipe.Recipe;
import org.spongepowered.api.util.event.Cancellable;

import java.util.List;

/**
 * A CraftItemEvent is fired when an item is crafted from a
 * player inventory or workbench inventory, or any other crafting inventory.
 */
public interface CraftItemEvent extends ViewerEvent, Cancellable {

    /**
     * Retrieves the CraftingInventory involved with this event.
     *
     * @return The crafting inventory
     */
    CraftingInventory getInventory();

    /**
     * Retrieves the recipe that has been crafted as a result of this event.
     *
     * @return The recipe
     */
    Recipe getRecipe();

    /**
     * Gets the ItemStacks that are a result of this crafting event.
     *
     * @return The results
     */
    List<ItemStack> getResults();

    /**
     * Gets the types of the results of this crafting event.
     *
     * @return The result types
     */
    List<ItemType> getResultTypes();

}
