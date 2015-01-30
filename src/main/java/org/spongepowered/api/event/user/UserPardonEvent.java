package org.spongepowered.api.event.user;

import org.spongepowered.api.util.event.Cancellable;

/**
 * Occurs when a player is pardoned.
 */
public interface UserPardonEvent extends UserEvent, BanEvent, Cancellable {
}
