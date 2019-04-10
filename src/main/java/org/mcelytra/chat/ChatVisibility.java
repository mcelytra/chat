/*
 * Copyright © 2019 LambdAurora <aurora42lambda@gmail.com>
 *
 * This file is part of mcelytra.
 *
 * Licensed under the MIT license. For more information,
 * see the LICENSE file.
 */

package org.mcelytra.chat;

import org.aperlambda.lambdacommon.utils.Nameable;
import org.jetbrains.annotations.NotNull;

/**
 * Lists all the chat visibility flags available.
 *
 * @author lambdaurora
 * @version 1.0.0
 * @since 1.0.0
 */
public enum ChatVisibility implements Nameable
{
    /**
     * {@code FULL} lets the full chat be visible by the player.
     */
    FULL(0, "Full"),
    /**
     * {@code SYSTEM} lets the commands output visible by the player.
     */
    SYSTEM(1, "System"),
    /**
     * {@code HIDDEN} doesn't let the chat be visible by the player, only the {@code ACTION_BAR} is visible.
     */
    HIDDEN(2, "Hidden");

    private int    id;
    private String name;

    ChatVisibility(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the id of the chat visibility flag.
     *
     * @return The id of the flag.
     */
    public int get_id()
    {
        return this.id;
    }

    @Override
    public @NotNull String get_name()
    {
        return this.name;
    }
}
