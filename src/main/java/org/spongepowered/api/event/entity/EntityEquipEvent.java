package org.spongepowered.api.event.entity;

import org.spongepowered.api.event.inventory.InventoryEvent;
import org.spongepowered.api.item.ItemStack;

/**
 * Raised when an entity equips an item.
 */
public interface EntityEquipEvent extends EntityEvent, InventoryEvent {

    /**
     * Retrieves the item that is being switched from.
     *
     * @return The item that is being switched from
     */
    ItemStack getOldItem();

    /**
     * Retrieves the item that is being switched to.
     *
     * @return The item that is being switched to
     */
    ItemStack getNewItem();

    /**
     * Gets the slot that is being equipped.
     *
     * @return The slot that is being equipped
     */
    int getSlot();

}
