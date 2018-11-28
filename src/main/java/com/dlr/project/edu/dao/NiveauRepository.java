package com.dlr.project.edu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dlr.project.edu.entities.ClasseLevel;
import com.dlr.project.edu.entities.Eleve;

public interface NiveauRepository extends JpaRepository<ClasseLevel, Long>{
	//List<ClasseLevel> 

}
