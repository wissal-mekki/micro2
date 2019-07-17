package com.project.micro2.repositories;

import com.project.micro2.entities.Proposition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropositionRepository extends JpaRepository<Proposition,Long>{
public List<Proposition> findAllByQuestionId(Long id) ;
}

