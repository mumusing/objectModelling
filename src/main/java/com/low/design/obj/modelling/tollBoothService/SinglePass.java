package com.low.design.obj.modelling.tollBoothService;

public class SinglePass extends Pass {
    public SinglePass(Toll toll, TollBooth tollBooth, Vehicle vehicle) {
        super(toll, tollBooth, vehicle);
        this.status = PassStatus.VALID;
        this.type = PassType.SINGLE;
    }

    @Override
    public boolean isValidPass(Toll toll) {
        return this.status == PassStatus.VALID && this.getToll().equals(toll);
    }

    @Override
    public void updatePass() {
        this.setStatus(PassStatus.EXPIRED);
    }

    // Builder ( Optional )
    //Copy Constructor
    //Getters
    //equals and hashcode
    //toString

}
