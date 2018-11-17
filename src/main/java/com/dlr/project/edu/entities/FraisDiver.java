package com.dlr.project.edu.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

import lombok.Data;
/**
 * 
 * @author Richard
 *
 */
@Data
@Entity
public class FraisDiver implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     *
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private Eleve eleve;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private AnneeScolaire annee;
    /**
     *
     */
    @ManyToOne(fetch = FetchType.EAGER)
    private Motif motif;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateVersement;
    @Column(unique = true, nullable = false)
    private String libele;
    @Column(unique = true, nullable = false)
    private Long montant;
}
