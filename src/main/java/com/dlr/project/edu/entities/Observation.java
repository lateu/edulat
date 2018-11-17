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

@Data
@Entity
public class Observation implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name="personnelID",nullable=false)
	private Eleve eleve;
	@Column(length = 400, nullable = false)
	private String motif;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date dateconv;
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date delais;
}
