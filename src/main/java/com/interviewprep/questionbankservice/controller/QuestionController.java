package com.interviewprep.questionbankservice.controller;

import com.interviewprep.questionbankservice.model.Question;
import com.interviewprep.questionbankservice.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Optional<Question> getQuestionById(@PathVariable Long id) {
        return questionService.getQuestionById(id);
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
    }

    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @GetMapping("/difficulty/{difficulty}")
    public List<Question> getQuestionsByDifficulty(@PathVariable String difficulty) {
        return questionService.getQuestionsByDifficulty(difficulty);
    }
}
