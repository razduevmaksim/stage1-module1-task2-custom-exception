package com.epam.mjc;

public class MyCustomException extends IllegalArgumentException {
    public MyCustomException(String message) {
        super(message);
    }
}
