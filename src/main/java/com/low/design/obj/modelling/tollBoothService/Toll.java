package com.low.design.obj.modelling.tollBoothService;

import java.util.List;

public class Toll extends BaseEntity {

    private final List<TollBooth> tollBooth;
    private final LeaderBoard leaderBoard;


    public Toll(List<TollBooth> tollBooth) {
        this.tollBooth = tollBooth;
        this.leaderBoard = new LeaderBoard(this.tollBooth);
    }
}
