package org.spongepowered.api.event.user;

import org.spongepowered.api.util.bans.Ban;

/**
 * Represents an event that involves a ban.
 */
public interface BanEvent {

    /**
     * Gets the ban involved in this event.
     *
     * @return The ban
     */
    Ban getBan();

}
