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
@Data
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

}
