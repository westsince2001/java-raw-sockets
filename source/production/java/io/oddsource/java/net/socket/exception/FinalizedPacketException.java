/*
 * FinalizedPacketException.java from RawSockets modified Tuesday, June 28, 2011 13:20:53 CDT (-0500).
 *
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.oddsource.java.net.socket.exception;

/**
 * This exception is thrown whenever a change is attempted on a packet that has been finalized (and has become a
 * "mutable" object).
 *
 * @author Nick Williams
 * @version 1.0.0
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public class FinalizedPacketException extends RawSocketRuntimeException
{
    public FinalizedPacketException()
    {
        this("This packet has been finalized and cannot be altered. It is now a \"mutable\" object.");
    }

    public FinalizedPacketException(String message)
    {
        super(message);
    }

    public FinalizedPacketException(Throwable cause)
    {
        this("This packet has been finalized and cannot be altered. It is now a \"mutable\" object.", cause);
    }

    public FinalizedPacketException(String message, Throwable cause)
    {
        super(message, cause);
    }
}