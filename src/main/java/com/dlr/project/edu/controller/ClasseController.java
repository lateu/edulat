package com.dlr.project.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dlr.project.edu.dao.ClasseRepository;
import com.dlr.project.edu.entities.Classe;
import com.dlr.project.edu.entities.Cycle;

@Controller
@RequestMapping(value="/classeCtrl")
public class ClasseController {

	@Autowired
	private ClasseRepository classeRepository;
	
	@RequestMapping(value="/formClasse",method=RequestMethod.GET)
	public String classespage(Model model) {
		model.addAttribute("classeobj", new Classe());
	    return "/classes";
	    }
	
	@RequestMapping(value="/newClasse",method=RequestMethod.POST)
	public void save(Classe classe) {
		
		classeRepository.save(classe);
		
	}
	
	/*@RequestMapping(value="/classesX")
	List<Classe> getClasses(Model model){
		model.addAttribute("classes", classeRepository.findAll());
		
		return "classes";
		
	}*/
	
	@RequestMapping(value="/classesX")
	String getClasses(Model model){
		model.addAttribute("classes", classeRepository.findAll());
		
		return "classes";
		
	}
	
	
}
