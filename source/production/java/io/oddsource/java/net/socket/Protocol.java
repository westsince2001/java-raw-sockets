/*
 * Copyright © 2010-2019 OddSource Code (license@oddsource.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.oddsource.java.net.socket;

import java.util.Arrays;
import java.util.List;

/**
 * This POJO represents protocol information as retrieved from the underlying operating system.
 *
 * @see SocketUtilities
 * @author Nick Williams
 * @version 1.0.0
 * @since 1.0.0
 */
public final class Protocol
{
    private final String name;

    private final List<String> aliases;

    private final int protocolNumber;

    /**
     * Constructor.
     *
     * @param name The protocol name
     * @param aliases Aliases for the protocol
     * @param protocolNumber The protocol number
     */
    public Protocol(final String name, final String[] aliases, final int protocolNumber)
    {
        this.name = name;
        this.aliases = Arrays.asList(aliases);
        this.protocolNumber = protocolNumber;
    }

    /**
     * Get the protocol name.
     *
     * @return The protocol name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Get the protocol aliases.
     *
     * @return The protocol aliases
     */
    public List<String> getAliases()
    {
        return this.aliases;
    }

    /**
     * Get the protocol number.
     *
     * @return The protocol number
     */
    public int getProtocolNumber()
    {
        return this.protocolNumber;
    }

    /**
     * Get a strict representation of the protocol.
     *
     * @return a string.
     */
    @Override
    @SuppressWarnings("StringBufferReplaceableByString")
    public String toString()
    {
        final StringBuilder string = new StringBuilder("{ name: \"");
        string.append(this.name).
            append("\", aliases: ").
            append(this.aliases).
            append(", protocolNumber: ").
            append(this.protocolNumber).append(" }");

        return string.toString();
    }
}
