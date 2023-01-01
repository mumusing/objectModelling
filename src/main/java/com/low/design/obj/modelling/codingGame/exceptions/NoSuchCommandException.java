package com.low.design.obj.modelling.codingGame.exceptions;

public class NoSuchCommandException extends RuntimeException {

    public NoSuchCommandException()
    {
        super();
    }
    public NoSuchCommandException(String msg)
    {
        super(msg);
    }

}
