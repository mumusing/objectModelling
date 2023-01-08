package com.low.design.obj.modelling.codingGame.services;

import com.low.design.obj.modelling.codingGame.dto.ContestSummaryDto;
import com.low.design.obj.modelling.codingGame.entity.Contest;
import com.low.design.obj.modelling.codingGame.entity.Level;
import com.low.design.obj.modelling.codingGame.exceptions.ContestNotFoundException;
import com.low.design.obj.modelling.codingGame.exceptions.InvalidContestException;
import com.low.design.obj.modelling.codingGame.exceptions.QuestionNotFoundException;
import com.low.design.obj.modelling.codingGame.exceptions.UserNotFoundException;

import java.util.List;

public interface IContestService {
    public Contest create(String contestName, Level level, String contestCreator, Integer numQuestion) throws UserNotFoundException, QuestionNotFoundException;
    public List<Contest> getAllContestLevelWise(Level level);
    public ContestSummaryDto runContest(String contestId, String contestCreator) throws ContestNotFoundException, InvalidContestException;
}
