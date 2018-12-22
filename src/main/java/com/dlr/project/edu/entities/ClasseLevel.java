package com.dlr.project.edu.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
// @Data
public class ClasseLevel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	private String niveau;
	@OneToMany(mappedBy = "classeLevel")
	private List<Classe> classes = new ArrayList<Classe>();
	@NotNull
	private Cycle cycle_etude = Cycle.Cycle_I;

	/**
	 * @param niveau
	 * @param cycleEtude
	 */
	public ClasseLevel(String niveau, @NotNull Cycle cycleEtude) {

		this.niveau = niveau;
		this.cycle_etude = cycleEtude;
	}

	/**
		 * 
		 */
	public ClasseLevel() {

		// TODO Auto-generated constructor stub
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClasseLevel [id=" + id + ", niveau=" + niveau + ", classes="
				+ classes + ", cycle_etude=" + cycle_etude + "]";
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the niveau
	 */
	public String getNiveau() {
		return niveau;
	}

	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	/**
	 * @return the classes
	 */
	public List<Classe> getClasses() {
		return classes;
	}

	/**
	 * @param classes the classes to set
	 */
	public void setClasses(List<Classe> classes) {
		this.classes = classes;
	}

	/**
	 * @return the cycle_etude
	 */
	public Cycle getCycle_etude() {
		return cycle_etude;
	}

	/**
	 * @param cycle_etude the cycle_etude to set
	 */
	public void setCycle_etude(Cycle cycle_etude) {
		this.cycle_etude = cycle_etude;
	}
	
	
	

}
