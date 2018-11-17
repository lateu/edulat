/**
 * 
 */
package com.dlr.project.edu.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

import lombok.Data;

/**
 * 
 * @author richard@lateu
 *
 */
 

@Entity
@Data
public class AnneeScolaire implements Serializable{
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    @OneToMany(mappedBy = "annee")
	    private List<FraisDiver> frais = new ArrayList<FraisDiver>();
	 
	    @Temporal(javax.persistence.TemporalType.DATE)
	    private Date debut;
	    @Temporal(javax.persistence.TemporalType.DATE)
	    private Date fin;
	    private String code;

	    public AnneeScolaire() {
	    }

}
