package com.low.design.obj.modelling.codingGame.repository;

import com.low.design.obj.modelling.codingGame.entity.Level;
import com.low.design.obj.modelling.codingGame.entity.Question;

import java.util.List;

public interface IQuestionRepository extends CRUDRepository<Question, String>{
    public List<Question> findAllQuestionLevelWise(Level level);
}
