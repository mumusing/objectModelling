package com.low.design.obj.modelling.eventCalender;

public abstract class Participant extends BaseEntity{

    protected String name;

    public  Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
