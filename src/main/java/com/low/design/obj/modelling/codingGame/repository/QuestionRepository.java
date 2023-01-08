package com.low.design.obj.modelling.codingGame.repository;

import com.low.design.obj.modelling.codingGame.entity.Level;
import com.low.design.obj.modelling.codingGame.entity.Question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class QuestionRepository implements IQuestionRepository {

    private final Map<String,Question> questionMap;
    private Integer autoIncrement = 0;

    public QuestionRepository(){
        questionMap = new HashMap<String,Question>();
    }

    public QuestionRepository(Map<String, Question> questionMap) {
        this.questionMap = questionMap;
        this.autoIncrement = questionMap.size();
    }


    @Override
    public List<Question> findAllQuestionLevelWise(Level level) {
        return null;
    }

    @Override
    public Question save(Question entity) {
        return null;
    }

    @Override
    public List<Question> findAll() {
        return null;
    }

    @Override
    public Optional<Question> findByID(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsByID(String s) {
        return false;
    }

    @Override
    public void delete(Question entity) {

    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public long count() {
        return 0;
    }
}
