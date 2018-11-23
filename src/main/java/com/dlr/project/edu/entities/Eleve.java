package com.dlr.project.edu.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.UniqueElements;

import lombok.Data;
@Data
@Entity
public class Eleve implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    /**
     * rel entre eleve et nationnalite
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private Nationalite nationalite;
    /**
     * rel entre eleve et frais
     */
    @OneToMany(mappedBy = "eleve")
    private List<FraisDiver> frais = new ArrayList<FraisDiver>();
    /**
     * rel eleve classe
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private Classe classe;
    /**
     *
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private AnneeScolaire annee;
    /**
     *
     */
    @OneToMany(mappedBy = "eleve")
    private List<Notes> note = new ArrayList<Notes>();
    /**
     *
     */
    @OneToMany(mappedBy = "eleve", cascade = {CascadeType.ALL})
    private List<Observation> convocation;
    
    @NotNull
    @UniqueElements
    private String matricule;
    private String contactPrarent;
    private String nomPere;
    private String quartier;
    private String redoublant;
    private String photolink;
    @Column(nullable = false)
    private boolean  active;
    @Column(nullable = true)
    private double moyenneT1;
    @Column(nullable = true)
    private double moyenneT2;
    @Column(nullable = true)
    private double moyenneT3;
    @Column(nullable = true)
    private double moyenneS1;
    @Column(nullable = true)
    private double moyenneS2;
    @Column(nullable = true)
    private double moyenneS3;
    @Column(nullable = true)
    private double moyenneS4;
    @Column(nullable = true)
    private double moyenneS5;
    @Column(nullable = true)
    private double moyenneS6;

}
