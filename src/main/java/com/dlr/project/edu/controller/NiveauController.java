package com.dlr.project.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dlr.project.edu.dao.ClasseRepository;
import com.dlr.project.edu.dao.NiveauRepository;
import com.dlr.project.edu.entities.Classe;
import com.dlr.project.edu.entities.ClasseLevel;
import com.dlr.project.edu.entities.Cycle;

@Controller
@Transactional
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
		System.out.println("//////new///"+classeLevel.toString());
		 return "redirect:/niveauCtrl/IndexNiveau";
		
	}
	
	
	@RequestMapping(value="/deleteNiveau",method=RequestMethod.GET)
	String deleteNiveau(@RequestParam Long id){
		niveauRepository.deleteById(id);
		System.out.println("/////////del-id"+id);
		return "redirect:/niveauCtrl/IndexNiveau";
		
	}
	

	@RequestMapping(value="/editNiveau")
	//@ResponseBody
	String  editNiveau(Long id,Model model){
		//ClasseLevel  editNiveau(Long id,Model model){
		model.addAttribute("niveauobj", niveauRepository.getOne(id));	
		model.addAttribute("cycleList", Cycle.values());
		System.out.println("/////////findOne"+id);
		//return niveauRepository.getOne(id);
		return "editNiveau";
		
	}
	
	@RequestMapping(value="/getOneNiveau")
	@ResponseBody
	ClasseLevel  getOneNiveau(@RequestParam Long id,Model model){
		ClasseLevel niveau=niveauRepository.getOne(id);
		model.addAttribute("niveauobj", niveau);	
		//System.out.println("/////////findOne"+id);
		return niveauRepository.getOne(id);
		//return "redirect:/niveauCtrl/IndexNiveau";
		
	}
	
	
	

}
