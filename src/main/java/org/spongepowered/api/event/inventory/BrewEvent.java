package org.spongepowered.api.event.inventory;

import org.spongepowered.api.item.inventory.block.BrewingStandInventory;
import org.spongepowered.api.util.event.Cancellable;

public interface BrewEvent extends InventoryEvent, Cancellable {

    BrewingStandInventory getInventory();

}
