package com.low.design.obj.modelling.codingGame.services;

import com.low.design.obj.modelling.codingGame.entity.Level;
import com.low.design.obj.modelling.codingGame.entity.Question;
import com.low.design.obj.modelling.codingGame.repository.IQuestionRepository;

import java.util.List;

public class QuestionService implements IQuestionService {

    private final IQuestionRepository questionRepository;

    public QuestionService(IQuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question create(String title, Level level, Integer difficultyScore) {
        Question question = new Question(title, level, difficultyScore);
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAllQuestionLevelWise(Level level) {

        if (level == null) {
            return questionRepository.findAll();
        }

        return questionRepository.findAllQuestionLevelWise(level);
    }
}
