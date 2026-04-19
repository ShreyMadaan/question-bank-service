package com.interviewprep.questionbankservice.service;

import com.interviewprep.questionbankservice.model.Question;
import com.interviewprep.questionbankservice.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
    public Optional<Question> getQuestionById(Long id) {
        return questionRepository.findById(id);
    }
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }
    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
    public List<Question> getQuestionsByCategory(String category){
        return questionRepository.findByCategory(category);
    }
    public List<Question> getQuestionsByDifficulty(String difficulty){
        return questionRepository.findByDifficulty(difficulty);
    }
}
