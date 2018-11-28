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
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data

public class ClasseLevel implements Serializable{
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    @Column (unique = true,nullable = false)
	    private String niveau;
	    @OneToMany(mappedBy = "classeLevel")
	    private List<Classe> classes = new ArrayList<Classe>();
	    @NotNull
	    private Cycle cycle_etude=Cycle.Cycle_I;
		/**
		 * @param niveau
		 * @param cycleEtude
		 */
		public ClasseLevel(String niveau, @NotNull Cycle cycleEtude) {
			super();
			this.niveau = niveau;
			this.cycle_etude = cycleEtude;
		}
		/**
		 * 
		 */
		public ClasseLevel() {
			super();
			// TODO Auto-generated constructor stub
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
