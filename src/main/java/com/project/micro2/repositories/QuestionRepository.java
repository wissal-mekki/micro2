package com.project.micro2.repositories;

import com.project.micro2.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Long>{
    public Question findTopByOrderByIdDesc();
    public List<Question> findAllByQuestionnaireId(Long id);
}
