package com.project.micro2.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Table(name = "proposition")
@Entity
public class Proposition implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @NotNull
    @Column(name = "contenu", nullable = false)
    private  String contenu;

    @ManyToOne
    //@JoinColumn(name = "id",referencedColumnName = "id")
    //@JoinColumn (name = "id", insertable = false, updatable =false)
    @JsonIgnoreProperties("propositions")
     private  Question question ;

    public Proposition() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Proposition(@NotNull String contenu) {
        this.contenu = contenu;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
