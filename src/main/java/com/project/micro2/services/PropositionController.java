package com.project.micro2.services;

import com.project.micro2.entities.Proposition;
import com.project.micro2.entities.Question;
import com.project.micro2.entities.Questionnaire;
import com.project.micro2.repositories.PropositionRepository;
import com.project.micro2.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class PropositionController {

    @Autowired
private PropositionRepository propositionRepository ;
private QuestionRepository questionRepository;
    public PropositionController(QuestionRepository questionRepository,PropositionRepository propositionRepository) {
        this.propositionRepository=propositionRepository;
        this.questionRepository=questionRepository;
    }

    @GetMapping("/lastQuestion")
    public Question findQuestionId(){
        return this.questionRepository.findTopByOrderByIdDesc();

    }
    @PostMapping("/proposition")
    public ResponseEntity<Proposition> CreateEmployee(@Valid @RequestBody Proposition proposition) throws URISyntaxException {
        if (proposition.getId() != null) {

            System.out.println("ID is already exists"); // I must verify  the Execption
        }

        Proposition result = this.propositionRepository.save(proposition) ;
        return ResponseEntity.created(new URI("/api/proposition/" + result.getId())).header("Employee " + result.getId()).body(result);
    }
    /*

     */

    @GetMapping("/propositions")
    public List<Proposition> GetAllPropositions() {
        System.out.println("wassss");
        return propositionRepository.findAll();
    }


}
