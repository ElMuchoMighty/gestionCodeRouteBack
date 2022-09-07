package com.inti.gestionCodeRouteBack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.gestionCodeRouteBack.entities.Cours;
import com.inti.gestionCodeRouteBack.service.impl.CoursService;

@RestController
@CrossOrigin
public class CoursController {
	
	@Autowired
	CoursService coursService;
	
	@GetMapping("/cours")
	public List<Cours> findAll() {
		return coursService.findAll();
	}
	
	@GetMapping("/cours/{idCours}") 
	public Cours findOne(@PathVariable("idCours") Long id) {
		return coursService.findOne(id);
	}
	
	@PostMapping("/cours") public Cours saveCours(@RequestBody Cours cours) { 
	Cours currentUser=new Cours(cours.getComplexiteCours(),cours.getContenuCours(),cours.getNbrHeuresCours(), cours.getFormatCours(),cours.getThematiqueCours()); 
		return coursService.save(currentUser); }
	 

	@DeleteMapping("/cours/{idCours}") 
	public void deleteCours(@PathVariable("idCours") Long id) {
		coursService.delete(id);
	}

}
