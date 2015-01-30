package org.spongepowered.api.util.bans;

import org.spongepowered.api.entity.player.User;

import java.util.Date;

/**
 * Represents a builder that creates bans.
 */
public interface BanBuilder {

    /**
     * Sets the user to be banned.
     *
     * @param user The user
     */
    void setUser(User user);

    void setReason(String reason);

    Date setBanDate();

    Date setExpirationDate();

}
