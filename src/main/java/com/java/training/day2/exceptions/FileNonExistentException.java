package com.java.training.day2.exceptions;

public class FileNonExistentException extends RuntimeException { //uncheccked

    public FileNonExistentException(Exception cause) {
        super(cause);
    }
    public FileNonExistentException(String message) {
        super(message);
    }
}
