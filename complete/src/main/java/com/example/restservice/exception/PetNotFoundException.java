package com.example.restservice.exception;

public class PetNotFoundException extends RuntimeException {

    private String message;

    public PetNotFoundException(String message) {
        super(message);
        this.message = message;
    }
    public PetNotFoundException() {
    }
}
