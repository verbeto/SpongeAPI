package org.spongepowered.api.util.bans;

/**
 * Utility class for working with and creating {@link Ban}s.
 */
public final class Bans {

    private final BanFactory factory = null;

    private Bans() {
    }

    /**
     * Creates a new BanBuilder.
     *
     * @return A new ban builder
     */
    BanBuilder builder() {
        return factory.builder();
    }

}
