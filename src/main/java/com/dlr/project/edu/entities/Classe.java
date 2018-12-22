/**
 * 
 */
package com.dlr.project.edu.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * @author Richard
 *
 */
@Entity
//@Data
public class Classe implements Serializable{
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    @OneToMany(mappedBy ="classe")
	    private List<MaClaCoef> maclacoef=new ArrayList<MaClaCoef>();
	    
	    @OneToMany(mappedBy ="classe")
	    private List<EmploiDeTemps> emploiDeTempses=new ArrayList<EmploiDeTemps>();
	    
	   @ManyToOne(fetch = FetchType.EAGER)
	    private ClasseLevel classeLevel;
	   
	   @Column(unique = true,nullable = false)
	    private String libele;
	    @Column(unique = true,nullable = false)
	    private String code;
	    
	    @Column(nullable = false)
	    private boolean  active;
	    
	    

		/**
		 * @param classeLevel
		 * @param libele
		 * @param code
		 * @param active
		 */
		public Classe(ClasseLevel classeLevel, String libele, String code,
				boolean active) {
			super();
			this.classeLevel = classeLevel;
			this.libele = libele;
			this.code = code;
			this.active = active;
		}

		/**
		 * 
		 */
		public Classe() {
			super();
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
		 * @return the maclacoef
		 */
		public List<MaClaCoef> getMaclacoef() {
			return maclacoef;
		}

		/**
		 * @param maclacoef the maclacoef to set
		 */
		public void setMaclacoef(List<MaClaCoef> maclacoef) {
			this.maclacoef = maclacoef;
		}

		/**
		 * @return the emploiDeTempses
		 */
		public List<EmploiDeTemps> getEmploiDeTempses() {
			return emploiDeTempses;
		}

		/**
		 * @param emploiDeTempses the emploiDeTempses to set
		 */
		public void setEmploiDeTempses(List<EmploiDeTemps> emploiDeTempses) {
			this.emploiDeTempses = emploiDeTempses;
		}

		/**
		 * @return the classeLevel
		 */
		public ClasseLevel getClasseLevel() {
			return classeLevel;
		}

		/**
		 * @param classeLevel the classeLevel to set
		 */
		public void setClasseLevel(ClasseLevel classeLevel) {
			this.classeLevel = classeLevel;
		}

		/**
		 * @return the libele
		 */
		public String getLibele() {
			return libele;
		}

		/**
		 * @param libele the libele to set
		 */
		public void setLibele(String libele) {
			this.libele = libele;
		}

		/**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}

		/**
		 * @param code the code to set
		 */
		public void setCode(String code) {
			this.code = code;
		}

		/**
		 * @return the active
		 */
		public boolean isActive() {
			return active;
		}

		/**
		 * @param active the active to set
		 */
		public void setActive(boolean active) {
			this.active = active;
		}
	    
	    
	    
	    
	    
	    
	    

}
