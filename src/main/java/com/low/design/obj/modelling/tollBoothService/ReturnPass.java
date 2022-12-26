package com.low.design.obj.modelling.tollBoothService;

public class ReturnPass extends Pass {

    private Integer numberOfTrips;

    public ReturnPass(Toll toll, TollBooth tollBooth, Vehicle vehicle) {
        super(toll, tollBooth, vehicle);
        this.status = PassStatus.VALID;
        this.numberOfTrips = 1;
        this.type = PassType.RETURN;
    }

    @Override
    public boolean isValidPass(Toll toll) {
        return this.getToll().equals(toll) && this.status==PassStatus.VALID;
    }

    @Override
    public void updatePass() {
        this.numberOfTrips++;
        this.setStatus(PassStatus.EXPIRED);
    }

    // Builder ( Optional )
    //Copy Constructor
    //Getters
    //equals and hashcode
    //toString

}
