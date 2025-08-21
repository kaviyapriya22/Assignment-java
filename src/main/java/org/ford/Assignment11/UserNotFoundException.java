package org.ford.Layered_Application;

public class UserNotFoundException extends Exception {
    public UserNotFoundException (String message) {
        super(message);
    }
}
