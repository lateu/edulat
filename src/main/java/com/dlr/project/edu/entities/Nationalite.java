package com.dlr.project.edu.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Nationalite implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "nationalite")
    private List<Eleve> eleve = new ArrayList<Eleve>();
    // private Personne personne;
    @Column(unique = true, nullable = false)
    private String pays;
    @Column(unique = true, nullable = false)
    private String code;

}
