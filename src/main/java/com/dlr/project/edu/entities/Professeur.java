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

@Entity
@Data
public class Professeur implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToMany(mappedBy = "professeur")
	private List<MaClaCoef> maClaCoefs = new ArrayList<MaClaCoef>();
	/*   
	@OneToMany(mappedBy = "professeur")
	private List<UserRole> userRoles = new ArrayList<UserRole>(); */

	@Temporal(javax.persistence.TemporalType.DATE)
	private Date datePriseService;
	private String specialite;
	private String diplome;
	private String username;
	private String password;
	private String contact;
	private String etatCompte;
}
