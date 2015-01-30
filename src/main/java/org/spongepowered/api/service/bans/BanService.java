package org.spongepowered.api.service.bans;

import org.spongepowered.api.entity.player.User;
import org.spongepowered.api.util.bans.Ban;

import java.util.Collection;

public interface BanService {

    Collection<Ban> getBans();

    Collection<Ban> getBansFor(User user);

    void pardon(User user);

    boolean isBanned(User user);

}
