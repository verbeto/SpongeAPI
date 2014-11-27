package org.spongepowered.api.event.inventory;

import org.spongepowered.api.event.GameEvent;
import org.spongepowered.api.item.inventory.Inventory;

/**
 * An InventoryEvent is a GameEvent that involves an {@link Inventory}.
 */
public interface InventoryEvent extends GameEvent {

    /**
     * Returns the Inventory involved in this event.
     *
     * @return The Inventory involved
     */
    Inventory getInventory();

}
