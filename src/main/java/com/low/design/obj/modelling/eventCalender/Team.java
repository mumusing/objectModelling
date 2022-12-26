package com.low.design.obj.modelling.eventCalender;

import java.util.ArrayList;
import java.util.List;

public class Team extends Participant {

    private List<User> teamMembers;

    public Team(String name) {
        super(name);
        this.teamMembers = new ArrayList<>();
    }

    // Builder ( Optional )
    // AllArgsConstructor ( Some of them good to have as required)
    //Copy Constructor
    //Getters and Setters
    //equals and hashcode
    //toString

}
