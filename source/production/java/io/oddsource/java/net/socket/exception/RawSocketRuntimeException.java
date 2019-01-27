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
package io.oddsource.java.net.socket.exception;

/**
 * Generic exception thrown whenever an unexpected error occurs using the Raw Sockets library (usually due to
 * programmer error).
 *
 * @author Nick Williams
 * @version 1.0.0
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public class RawSocketRuntimeException extends RuntimeException
{
    /**
     * Constructor.
     */
    public RawSocketRuntimeException()
    {
        super();
    }

    /**
     * Constructor.
     *
     * @param message The message
     */
    public RawSocketRuntimeException(final String message)
    {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param cause The cause
     */
    public RawSocketRuntimeException(final Throwable cause)
    {
        super(cause);
    }

    /**
     * Constructor.
     *
     * @param message The message
     * @param cause The cause
     */
    public RawSocketRuntimeException(final String message, final Throwable cause)
    {
        super(message, cause);
    }
}
