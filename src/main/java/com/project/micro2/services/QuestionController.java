package com.project.micro2.services;

//import com.project.micro2.repositories.QuestionRepository;
import com.project.micro2.entities.Question;
import com.project.micro2.entities.Questionnaire;
import com.project.micro2.repositories.QuestionRepository;
import com.project.micro2.repositories.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import static javax.swing.text.html.HTML.Tag.SELECT;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository ;
private  QuestionnaireRepository questionnaireRepository;
    public QuestionController(QuestionRepository questionRepository, QuestionnaireRepository questionnaireRepository){

        this.questionRepository=questionRepository ;
        this.questionnaireRepository=questionnaireRepository;
    }

@GetMapping("/lastId")
    public Questionnaire findQuestionnaireId(){
     return this.questionnaireRepository.findTopByOrderByIdDesc();

    }
    @GetMapping("/questiontest")
    public List<Question> findQuestionTest(Long id){
        return this.questionRepository.findAllByQuestionnaireId(id) ;

    }

    @PostMapping("/question")
    public Question CreateEmployee(@Valid @RequestBody Question question) throws URISyntaxException {
       /* if (questionnaire.getId() != null) {

            System.out.println("ID is already exists"); // I must verify  the Execption
        }
*/
        Question result = this.questionRepository.save(question) ;
        return result;
    }
    /*

     */

    @GetMapping("/questions")
    public List<Question> GetAllQuestionnaires() {
        System.out.println("wassss");
        return questionRepository.findAll();
    }


}
