package com.dlr.project.edu.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class MaClaCoef implements Serializable{
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    /**
	     *
	     */
	    
	    @ManyToOne(fetch = FetchType.EAGER)
	    private Matiere matiere;
	    /**
	     *
	     */
	    @ManyToOne(fetch = FetchType.EAGER)
	    private Professeur professeur;
	    @ManyToOne(fetch = FetchType.EAGER)
	    private Classe classe;
	    private int coeficient;
	    private int quotahoraire;
	    @Column(nullable = false)
	    private String levelMatiere;
}
