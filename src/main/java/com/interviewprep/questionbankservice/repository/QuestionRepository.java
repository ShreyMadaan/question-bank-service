package com.interviewprep.questionbankservice.repository;

import com.interviewprep.questionbankservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByCategory(String category);
    List<Question> findByDifficulty(String difficulty);
}
