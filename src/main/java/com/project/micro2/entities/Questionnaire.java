package com.project.micro2.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Table(name ="questionnaire")
@Entity
public class Questionnaire implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "sujet", nullable = false, unique = true)
    private String sujet;


    @NotNull
    @Column(name = "nbques", nullable = false)
    private int nbques;

    public Questionnaire() {
    }


    @OneToMany(mappedBy = "questionnaire", targetEntity = Question.class)
    @JsonIgnoreProperties("questionnaire")
    private List<Question> questions = new ArrayList<>();

    public Questionnaire(@NotNull String sujet, @NotNull int nbques, List questions) {
        this.sujet = sujet;
        this.nbques = nbques;
        this.questions = questions;
        //   this.questions = questions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public int getNbques() {
        return nbques;
    }

    public void setNbques(int nbques) {
        this.nbques = nbques;
    }

    public List getQuestions() {
        return questions;
    }

    public void setQuestions(List questions) {
        this.questions = questions;

    }
}
