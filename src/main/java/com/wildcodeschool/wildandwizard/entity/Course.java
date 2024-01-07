package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;



import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    //Modifier l'entité Course afin d'y ajouter le code nécessaire à la création de sa relation avec une liste de sorciers : List<Wizard> wizards

    @ManyToMany(mappedBy = "courses")
     private List<Wizard> wizards = new  ArrayList<>(); 


    public List<Wizard> getWizards() {
        return wizards;
    }

    public void setWizards(List<Wizard> wizards) {
        this.wizards = wizards;
    }

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
