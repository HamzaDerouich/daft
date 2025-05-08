package com.datawrapper.exception;

public class ServiceUnavailableException extends RuntimeException {
 /**
     * Constructs a new ServiceUnavailableException with the specified detail message.
     *
     * @param message The detail message.
     */
    public ServiceUnavailableException(String message) {
        super(message);
    }

    /**
     * Constructs a new ServiceUnavailableException with the specified detail message and cause.
     *
     * @param message The detail message.
     * @param cause   The cause of the exception.
     */
    public ServiceUnavailableException(String message, Throwable cause) {
        super(message, cause);
    }
}
