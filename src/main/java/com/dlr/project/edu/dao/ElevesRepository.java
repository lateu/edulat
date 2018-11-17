package com.dlr.project.edu.dao;

import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import org.springframework.data.repository.query.Param;

import com.dlr.project.edu.entities.Eleve;

 
public interface ElevesRepository extends JpaRepository<Eleve, Long>{
	
	@Query("SELECT e FROM Eleve e,Personne p WHERE e.id=p.id")
	List<Eleve> FindByNom(String nom);
	@Query("SELECT e FROM Eleve e,Personne p WHERE e.id=p.id AND p.sexe=:s")
	List<Eleve> FindBySexe(@Param("s")String sexe);
	@Query("SELECT e FROM Eleve e,Personne p WHERE e.id=p.id AND p.dateNais BETWEEN d1 AND d2")
	List<Eleve> ChercherEleves(Date d1,Date d2);
	/*@Query("SELECT e FROM eleve e WHERE e.nom like :x")
	Page<Eleve> FindByNom(@Param("x")String nom,Pageable pageable);*/
	
}
