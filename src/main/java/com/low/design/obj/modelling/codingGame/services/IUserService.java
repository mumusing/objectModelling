package com.low.design.obj.modelling.codingGame.services;

import com.low.design.obj.modelling.codingGame.dto.UserRegistrationDto;
import com.low.design.obj.modelling.codingGame.entity.ScoreOrder;
import com.low.design.obj.modelling.codingGame.entity.User;
import com.low.design.obj.modelling.codingGame.exceptions.ContestNotFoundException;
import com.low.design.obj.modelling.codingGame.exceptions.InvalidOperationException;
import com.low.design.obj.modelling.codingGame.exceptions.UserNotFoundException;

import java.util.List;

public interface IUserService {
    public User create(String name);
    public List<User> getAllUserScoreOrderWise(ScoreOrder scoreOrder);
    public UserRegistrationDto attendContest(String contestId, String userName) throws ContestNotFoundException, UserNotFoundException, InvalidOperationException;
    public UserRegistrationDto withdrawContest(String contestId, String userName) throws ContestNotFoundException, UserNotFoundException, InvalidOperationException;
}
