package com.example.restservice.exception;

public class DatabaseErrorException extends RuntimeException {

    private String message;

    public DatabaseErrorException(String message) {
        super(message);
        this.message = message;
    }

    public DatabaseErrorException(String message, String databaseType) {
        super(message);
        this.message = message;
    }

    public DatabaseErrorException() {
    }
}
