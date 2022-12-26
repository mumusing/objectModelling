package com.low.design.obj.modelling.tollBoothService;

public abstract class Pass extends BaseEntity {

    private Toll toll;
    private TollBooth tollBooth;
    private Vehicle vehicle;

    protected PassType type;
    protected PassStatus status;


    public Pass(Toll toll, TollBooth tollBooth, Vehicle vehicle) {
        this.toll = toll;
        this.tollBooth = tollBooth;
        this.vehicle = vehicle;
    }

    public abstract boolean isValidPass(Toll toll);

    public abstract void updatePass();

    public void setStatus(PassStatus status) {
        this.status = status;
    }

    public Toll getToll() {
        return toll;
    }

}
