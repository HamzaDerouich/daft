package com.datawrapper.exception;

public class DaftApiException extends Exception {
/**
     * Constructs a new DaftApiException with the specified detail message.
     *
     * @param message The detail message.
     */
    public DaftApiException(String message) {
        super(message);
    }

    /**
     * Constructs a new DaftApiException with the specified detail message and cause.
     *
     * @param message The detail message.
     * @param cause   The cause of the exception.
     */
    public DaftApiException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new DaftApiException with the specified cause.
     *
     * @param cause The cause of the exception.
     */
    public DaftApiException(Throwable cause) {
        super(cause);
    }
}
