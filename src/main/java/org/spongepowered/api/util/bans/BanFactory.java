package org.spongepowered.api.util.bans;

import org.spongepowered.api.entity.player.User;

/**
 * Interface representing the contract of bans.
 */
public interface BanFactory {

    BanBuilder builder();

    Ban of(User user);

    Ban of(User user, String reason);

}
