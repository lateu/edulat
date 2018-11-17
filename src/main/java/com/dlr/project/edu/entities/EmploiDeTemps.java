package com.dlr.project.edu.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

import lombok.Data;
@Data
@Entity
public class EmploiDeTemps implements Serializable{
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String jour;
	    @Temporal(javax.persistence.TemporalType.TIME)
	    private Date heureDebut;
	    @Temporal(javax.persistence.TemporalType.TIME)
	    private Date heureFin;
	    //@Column(nullable = false)
	    @ManyToOne(fetch = FetchType.EAGER)
	    private Matiere matiere;
	    /**
	     *
	     */
	    //@Column(nullable = false)
	    @ManyToOne(fetch = FetchType.EAGER)
	    private Classe classe;
}
