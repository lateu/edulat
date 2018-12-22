package com.dlr.project.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dlr.project.edu.dao.ClasseRepository;
import com.dlr.project.edu.dao.NiveauRepository;
import com.dlr.project.edu.entities.Classe;
import com.dlr.project.edu.entities.ClasseLevel;



@Controller
@Transactional
@RequestMapping(value="/classeCtrl")
public class ClasseController {

	@Autowired
	private ClasseRepository classeRepository;
	
	@Autowired
	private NiveauRepository niveauRepository;
	

	@RequestMapping(value="/IndexClasse",method=RequestMethod.GET)
	public String getNiveaux(Model model) {
		model.addAttribute("classeobj", new Classe());
		model.addAttribute("niveaux", niveauRepository.findAll());
		model.addAttribute("classes", classeRepository.findAll());
	    return "/classes";
	    }
	
	@RequestMapping(value="/newClasse",method=RequestMethod.POST)
	public String save(Classe classe) {
		classeRepository.save(classe);
		System.out.println("//////new///"+classe.toString());
		 return "redirect:/classeCtrl/IndexClasse";
		
	}
	
	
	@RequestMapping(value="/deleteClasse",method=RequestMethod.GET)
	String deleteNiveau(@RequestParam Long id){
		classeRepository.deleteById(id);
		System.out.println("/////////del-id"+id);
		return "redirect:/classeCtrl/IndexClasse";
		
	}
	

	@RequestMapping(value="/editClasse")
	//@ResponseBody
	String  editClasse(Long id,Model model){
		//ClasseLevel  editNiveau(Long id,Model model){
		model.addAttribute("niveauobj", classeRepository.getOne(id));	
		//model.addAttribute("cycleList", Cycle.values());
		System.out.println("/////////findOne"+id);
		//return niveauRepository.getOne(id);
		return "editNiveau";
		
	}
	
	@RequestMapping(value="/getOneNiveau")
	@ResponseBody
	Classe  getOneClasse(@RequestParam Long id,Model model){
		Classe classe=classeRepository.getOne(id);
		model.addAttribute("niveauobj", classe);	
		//System.out.println("/////////findOne"+id);
		return classeRepository.getOne(id);
		//return "redirect:/niveauCtrl/IndexNiveau";
		
	}
	
	
	
}
