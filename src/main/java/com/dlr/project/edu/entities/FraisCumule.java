/**
 * 
 */
package com.dlr.project.edu.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
 * @author Richard
 *
 */
@Data
@Entity
public class FraisCumule implements Serializable {
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private long total;
	    @ManyToOne(fetch = FetchType.LAZY)
	    private FraisDiver frais;

}
