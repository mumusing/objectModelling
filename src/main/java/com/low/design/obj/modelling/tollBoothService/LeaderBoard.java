package com.low.design.obj.modelling.tollBoothService;

import java.util.List;

public class LeaderBoard extends BaseEntity {

    private final List<TollBooth> booths;

    public LeaderBoard(List<TollBooth> booths) {
        this.booths = booths;
    }

    public List<TollBooth> getTollboothRankWise() {

        return null;
    }

    //Copy Constructor
    //equals and hashcode
    //toString

}
