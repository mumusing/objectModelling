package com.low.design.obj.modelling.codingGame.exceptions;

public class QuestionNotFoundException extends RuntimeException {

    public QuestionNotFoundException()
    {
        super();
    }
    public QuestionNotFoundException(String msg)
    {
        super(msg);
    }

}
