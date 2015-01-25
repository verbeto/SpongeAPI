/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.service.bans;

import java.util.UUID;

public interface BanInfo {

	/**
	 * Gets the UUID of the player.
	 *
	 * @return The UUID of the player.
	 */
	UUID getUniqueIdentifier();

	/**
	 * Gets the name of the player.
	 *
	 * @return The name of the player.
	 */
	String getName();

	/**
	 * Gets the date of the ban.
	 *
	 * @return Creation date of the ban
	 */
	String getDateBanned();

	/**
	 * Gets the player who banned the player; returns "Server" if done from console.
	 *
	 * @return Banning player.
	 */
	String getSource();

	/**
	 * Gets the expiration time, formatted in long; if forever returns 0
	 *
	 * @return Expiration time of the ban.
	 */
	long getExpiration();

	/**
	 * Get the reason for the ban.
	 *
	 * @return The reason specified for the ban.
	 */
	String getReason();

}
