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
import com.inti.gestionCodeRouteBack.entities.RendezVous;
import com.inti.gestionCodeRouteBack.service.impl.RendezVousService;

@RestController
@CrossOrigin
public class RendezVousController {
	
	@Autowired
	RendezVousService rendezVousService;
	
	@GetMapping("/rendezVous")
	public List<RendezVous> findAll() {
		return rendezVousService.findAll();
	}
	
	@GetMapping("/rendezVous/{idRendezVous}") 
	public RendezVous findOne(@PathVariable("idRendezVous") Long id) {
		return rendezVousService.findOne(id);
	}
	
	@PostMapping("/rendezVous") 
	public RendezVous saveRendezVous(@RequestBody RendezVous rendezVous) { 
		return rendezVousService.save(rendezVous); 
		}
	 
	@DeleteMapping("/rendezVous/{idRendezVous}") 
	public void deleteRendezVous(@PathVariable("idRendezVous") Long id) {
		rendezVousService.delete(id);
	}
	
	@PutMapping("/rendezVous/{idRendezVous}")
	public RendezVous updateCoursWithPut(@PathVariable("idRendezVous") Long id, @RequestBody RendezVous rendezVous) { //
		RendezVous currentUser = rendezVousService.findOne(id);
		currentUser.setDateRendezVous(rendezVous.getDateRendezVous());
		currentUser.setHeureRendezVous(rendezVous.getHeureRendezVous());
		currentUser.setAutoEcoleRendezVous(rendezVous.getAutoEcoleRendezVous());
		return rendezVousService.save(currentUser);
	}
	

}
