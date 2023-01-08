package com.low.design.obj.modelling.codingGame.dto;

import com.low.design.obj.modelling.codingGame.entity.Contest;
import com.low.design.obj.modelling.codingGame.entity.User;

import java.util.List;

public class ContestSummaryDto {

    private final Contest contest;
    private final List<User> users;

    public ContestSummaryDto(Contest contest, List<User> users) {
        this.contest = contest;
        this.users = users;
    }
}
