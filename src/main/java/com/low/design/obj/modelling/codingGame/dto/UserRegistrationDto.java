package com.low.design.obj.modelling.codingGame.dto;

import com.low.design.obj.modelling.codingGame.entity.RegisterationStatus;

public class UserRegistrationDto {

    private final String contestName;
    private final String userName;
    private RegisterationStatus registerationStatus;


    public UserRegistrationDto(String contestName, String userName, RegisterationStatus registerationStatus) {
        this.contestName = contestName;
        this.userName = userName;
        this.registerationStatus = registerationStatus;
    }
}
