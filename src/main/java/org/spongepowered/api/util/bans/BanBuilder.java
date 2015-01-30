package org.spongepowered.api.util.bans;

import org.spongepowered.api.entity.player.User;
import org.spongepowered.api.util.command.CommandSource;

import javax.annotation.Nullable;
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

    void setSource(@Nullable CommandSource source);

}
