package com.low.design.obj.modelling.codingGame.repository;

import com.low.design.obj.modelling.codingGame.entity.Level;
import com.low.design.obj.modelling.codingGame.entity.Question;

import java.util.List;
import java.util.Optional;

public class QuestionRepository implements IQuestionRepository {
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
