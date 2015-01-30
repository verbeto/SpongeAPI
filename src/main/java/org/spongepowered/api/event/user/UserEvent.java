package org.spongepowered.api.event.user;

import org.spongepowered.api.entity.player.User;

/**
 * Represents an event that involves a User.
 */
public interface UserEvent {

    /**
     * Gets the user involved in this event.
     *
     * @return The user
     */
    User getUser();

}
