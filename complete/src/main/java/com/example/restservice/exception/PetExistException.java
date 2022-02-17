package com.example.restservice.exception;

public class PetExistException extends RuntimeException {

    private String message;

    public PetExistException(String message) {
        super(message);
        this.message = message;
    }
    public PetExistException() {
    }
}
