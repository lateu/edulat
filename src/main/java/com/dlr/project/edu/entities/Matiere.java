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
public class Matiere implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "matiere")
    private List<Notes> note = new ArrayList<Notes>();
    /**
     *
     */
    @OneToMany(mappedBy = "matiere")
    private List<MaClaCoef> maclacoef = new ArrayList<MaClaCoef>();
    @Column(unique = true, nullable = false)
    private String intitule;
    @OneToMany(mappedBy = "matiere")
    private List<EmploiDeTemps> emploiDeTempses = new ArrayList<EmploiDeTemps>();
}
