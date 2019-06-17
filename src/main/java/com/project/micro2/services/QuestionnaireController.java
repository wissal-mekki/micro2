package com.project.micro2.services;

//import com.project.micro2.repositories.QuestionnaireRepository;
import com.project.micro2.entities.Questionnaire;
import com.project.micro2.repositories.QuestionRepository;
import com.project.micro2.repositories.QuestionnaireRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

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
public class QuestionnaireController {

    @Autowired
    private QuestionnaireRepository questionnaireRepository;

    public QuestionnaireController(QuestionnaireRepository questionnaireRepository){
        this.questionnaireRepository=questionnaireRepository;
    }


    @PostMapping("/questionnaire")

    public Questionnaire CreateEmployee(@Valid @RequestBody Questionnaire questionnaire) throws URISyntaxException {
       /* if (questionnaire.getId() != null) {

            System.out.println("ID is already exists"); // I must verify  the Execption
        }
*/
        Questionnaire result = this.questionnaireRepository.save(questionnaire) ;
        return result;
    }
    /*

     */
    @GetMapping("/bysujet")
    public  Questionnaire GetAllSubjects(String sujet) {

        return questionnaireRepository.findAllBySujet(sujet);
    }
    @GetMapping("/sujets")
    public  List<String> GetAllSubjects() {

        return questionnaireRepository.Getsubjects();
    }
    @GetMapping("/questionnaires")
    public List<Questionnaire> GetAllQuestionnaires() {
System.out.println("wassss");
        return questionnaireRepository.findAll();
    }



}
