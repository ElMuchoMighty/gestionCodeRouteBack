package com.inti.gestionCodeRouteBack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PostMapping("/cours") 
	public Cours saveCours(@RequestBody Cours cours) { 
		return coursService.save(cours); 
		}
	 

	@DeleteMapping("/cours/{idCours}") 
	public void deleteCours(@PathVariable("idCours") Long id) {
		coursService.delete(id);
	}
	@PutMapping("/cours/{idCours}") // http://localhost:9090/courss/2
	public Cours updateCoursWithPut(@PathVariable("idCours") Long id /* id = 2 */,
			@RequestBody Cours cours) { //
		Cours currentUser = coursService.findOne(id); // nom = ayari, prenom = oussama, username=ouss,
																	// password=ouss
		System.out.println(currentUser.toString());
		currentUser.setComplexiteCours(cours.getComplexiteCours()); // currentUser.setNomCours("Jean")
		currentUser.setContenuCours(cours.getContenuCours()); // //
																				// currentUser.setPrenomCours("Jean")
		currentUser.setNbrHeuresCours(cours.getNbrHeuresCours());
		currentUser.setThematiqueCours(cours.getThematiqueCours());
		currentUser.setFormatCours(cours.getFormatCours());
		return coursService.save(currentUser);
	}
}
