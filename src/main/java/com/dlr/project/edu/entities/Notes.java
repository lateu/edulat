package com.dlr.project.edu.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.Data;

@Data
@Entity
public class Notes implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Max(20)
    @Min(0)
    private double note;
    //@Column(nullable = false)
    //private Appreciation appreciation;
    /**
     *
     */

    @ManyToOne(fetch = FetchType.EAGER)
    private Eleve eleve;
    /**
     *
     */
 
    @ManyToOne(fetch = FetchType.EAGER)
    private AnneeScolaire annee;
    /**
     *
     */

    @ManyToOne(fetch = FetchType.EAGER)
    private Sequence sequence;
    /**
     *
     */

    @ManyToOne(fetch = FetchType.EAGER)
    private Matiere matiere;


}
