package com.deha.springbootangularecommerce.exception;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 36757637589L;
    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(Throwable cause) {
        super(cause);
    }
}
