package com.project.micro2.repositories;

import com.project.micro2.entities.Question;
import com.project.micro2.entities.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire,Long> {
public Questionnaire findTopByOrderByIdDesc() ;
@Query("select sujet from Questionnaire")
    public List<String> Getsubjects();
public Questionnaire findAllBySujet(String sujet) ;
/*@Query("select questions from questionnaire where id='id' and sujet ='sujet'")
public List<Question> GetQuestions(Number id,String sujet) ;*/
}