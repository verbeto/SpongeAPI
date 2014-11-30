package org.spongepowered.api.item.list;

import org.spongepowered.api.item.ItemStack;

/**
 * An ItemSingle is a single-item slot; therefore it has methods to modify
 * the single item in its slot.
 */
public interface ItemSingle extends ItemList {

    /**
     * Gets the item in this ItemSingle.
     *
     * @return The item in this slot
     */
    ItemStack getItem();

    /**
     * Sets the item in this ItemSingle.
     *
     * @param stack The new stack to set in this slot
     */
    void setItem(ItemStack stack);

    /**
     * Takes {@code count} items away from the ItemStack in this ItemSingle
     * and returns them as a new ItemStack.
     *
     * @param count The number of items to remove from the ItemStack
     * @return The items that have been taken out as a new ItemStack
     */
    ItemStack splitItem( int count);

}
