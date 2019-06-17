package com.project.micro2.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Table(name = "question")
@Entity
public class Question implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @NotNull
    @Column(name = "type", nullable = false)
    private  String type;

    @NotNull
    @Column(name = "contenu", nullable = false)
    private  String contenu ;

    @NotNull
    @Column(name = "reponse", nullable = false)
    private  String reponse;


    @NotNull
    @Column(name = "nbprop", nullable = false)
    private  int nbprop;


    @OneToMany( mappedBy = "question",targetEntity=Proposition.class)
    //@JoinColumn(name = "id", referencedColumnName = "id")
    @JsonIgnoreProperties("question")
    private List<Proposition> propositions = new ArrayList<>() ;

    //@ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn (name = "id", insertable = false, updatable =false)
    //@JoinColumn(name = "qid", referencedColumnName = "qid")
    //

    @ManyToOne
    @JoinColumn(name="quest_id",referencedColumnName = "id")
    @JsonIgnoreProperties("questions")
    private Questionnaire questionnaire ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }



    public Question() {
        this.type = type;
        this.reponse = reponse;
        this.nbprop = nbprop;
        this.propositions = propositions;
        this.contenu=contenu ;
    }

    public int getNbprop() {
        return nbprop;
    }

    public void setPropositions(List< Proposition > propositions) {
        this.propositions = propositions;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public void setNbprop(int nbprop) {
        this.nbprop = nbprop;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public List getPropositions() {
        return propositions;
    }


}

