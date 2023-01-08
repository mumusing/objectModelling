package com.low.design.obj.modelling.codingGame.services;

import com.low.design.obj.modelling.codingGame.entity.Level;
import com.low.design.obj.modelling.codingGame.entity.Question;

import java.util.List;

public interface IQuestionService {
    public Question create(String title, Level level, Integer difficultyScore);
    public List<Question> getAllQuestionLevelWise(Level level);
}
