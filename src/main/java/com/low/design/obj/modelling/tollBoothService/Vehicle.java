package com.low.design.obj.modelling.tollBoothService;

public class Vehicle extends BaseEntity {

    private String regNo;

    public Vehicle(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    // Builder ( Optional )
    // AllArgsConstructor ( Some of them good to have as required)
    //Copy Constructor
    //Getters and Setters
    //equals and hashcode
    //toString

}
