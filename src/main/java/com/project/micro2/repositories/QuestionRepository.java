package com.project.micro2.repositories;

import com.project.micro2.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long>{
    public Question findTopByOrderByIdDesc();
}
