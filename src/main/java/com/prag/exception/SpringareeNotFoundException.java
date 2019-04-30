package com.prag.exception;

public class SpringareeNotFoundException extends RuntimeException {
    public SpringareeNotFoundException(String id) {
        super("Could not find springaree " + id);
    }
}
