package com.low.design.obj.modelling.codingGame.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException()
    {
        super();
    }
    public UserNotFoundException(String msg)
    {
        super(msg);
    }

}
