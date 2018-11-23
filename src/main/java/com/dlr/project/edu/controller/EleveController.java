package com.dlr.project.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dlr.project.edu.dao.ElevesRepository;
import com.dlr.project.edu.entities.Eleve;

@Controller
//@RequestMapping(value="/eleveCtrl")
public class EleveController {
	@Autowired
	ElevesRepository elevesRepository;

	public EleveController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value="/Index")
	public String getEleves(Model model){
		List<Eleve> elvs=elevesRepository.findAll();
		model.addAttribute("elevesXX", elvs);
		return "elevesXX";
	}
	
	@RequestMapping("/all")
	public String eleves() {
	        return "/eleves";
	    }

}
