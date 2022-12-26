package com.low.design.obj.modelling.eventCalender;

public class Participant extends BaseEntity{

    protected String name;

    public  Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
