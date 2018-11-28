package com.dlr.project.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dlr.project.edu.dao.ClasseRepository;
import com.dlr.project.edu.dao.NiveauRepository;
import com.dlr.project.edu.entities.Classe;
import com.dlr.project.edu.entities.ClasseLevel;
import com.dlr.project.edu.entities.Cycle;

@Controller
@RequestMapping(value="niveauCtrl")

public class NiveauController {
	

	@Autowired
	private NiveauRepository niveauRepository;

	
	@RequestMapping(value="/IndexNiveau",method=RequestMethod.GET)
	public String getNiveaux(Model model) {
		model.addAttribute("niveauobj", new ClasseLevel());
		model.addAttribute("cycleList", Cycle.values());
		model.addAttribute("niveaux", niveauRepository.findAll());
	    return "/niveaux";
	    }
	
	@RequestMapping(value="/newNiveau",method=RequestMethod.POST)
	public String save(ClasseLevel classeLevel) {
		niveauRepository.save(classeLevel);
		 return "redirect:/niveauCtrl/IndexNiveau";
		
	}
	
	
	@RequestMapping(value="/deleteNiveau",method=RequestMethod.GET)
	String deleteNiveau(@RequestParam Long id){
		niveauRepository.deleteById(id);
		System.out.println("/////////delet-ig"+id);
		 return "redirect:/niveauCtrl/IndexNiveau";
		
	}
	
	@RequestMapping(value="/updateNiveau",method=RequestMethod.POST)
	String updateNiveau(@RequestParam Long id,Model model){
		ClasseLevel cl=niveauRepository.getOne(id);
		model.addAttribute("niveau", cl);		
		//niveauRepository.deleteById(id);
		 return "redirect:/niveauCtrl/IndexNiveau";
		
	}

	
	

}
