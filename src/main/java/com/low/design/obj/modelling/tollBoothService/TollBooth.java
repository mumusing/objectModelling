package com.low.design.obj.modelling.tollBoothService;

public class TollBooth extends BaseEntity {

    private boolean active;
    private Integer totalVehicles;
    private double totalAmount;

    public void activateBooth() {
        this.active = true;
    }

    public void deactivateBooth() {
        this.active = false;
    }

    public void addVehicles(Integer numberOfVehicles) {
        this.totalVehicles = numberOfVehicles;
    }

    // Builder ( Optional )
    // AllArgsConstructor ( Some of them good to have as required)
    //Copy Constructor
    //Getters and Setters
    //equals and hashcode
    //toString

}
