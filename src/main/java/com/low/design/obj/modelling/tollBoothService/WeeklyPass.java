package com.low.design.obj.modelling.tollBoothService;

import java.time.LocalDateTime;
import java.util.Date;

public class WeeklyPass extends Pass {
    private Date validUpTo;

    public WeeklyPass(Toll toll, TollBooth tollBooth, Vehicle vehicle) {
        super(toll, tollBooth, vehicle);
        this.validUpTo = new Date();
        this.status = PassStatus.VALID;
        this.type = PassType.WEEKLY;
    }

    private Date setValidUpTo() {
        Date newDate = new Date();
        LocalDateTime.from(newDate.toInstant()).plusDays(7);
        return newDate;
    }

    @Override
    public boolean isValidPass(Toll toll) {
        return (this.status==PassStatus.VALID && this.getToll().equals(toll));
    }

    @Override
    public void updatePass() {
        Date currentDate = new Date();
        if (this.validUpTo.before(currentDate)) {
            this.setStatus(PassStatus.EXPIRED);
        }
    }

    // Builder ( Optional )
    //Copy Constructor
    //Getters
    //equals and hashcode
    //toString
}
