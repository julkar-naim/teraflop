package com.teraflop.util.Exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String s) {
        super(s);
    }
    public UserNotFoundException() {
        super("User not found! User id seems invalid");
    }
}
