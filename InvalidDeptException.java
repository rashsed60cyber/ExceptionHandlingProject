package com.validation;

// Department validation er jonno custom exception
public class InvalidDeptException extends Exception {
    public InvalidDeptException(String message) {
        super(message);
    }
}
