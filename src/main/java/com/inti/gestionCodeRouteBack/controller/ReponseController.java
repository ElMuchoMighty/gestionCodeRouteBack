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

import com.inti.gestionCodeRouteBack.entities.Reponse;
import com.inti.gestionCodeRouteBack.service.interfaces.IReponseService;

@RestController
@CrossOrigin
public class ReponseController {
	@Autowired
	IReponseService reponseService;
	
	@GetMapping("/reponses") 
	public List<Reponse> findAll() {
		return reponseService.findAll();
	}

	@GetMapping("/reponses/{idReponse}") 											
	public Reponse findOne(@PathVariable("idReponse") Long id) {
		return reponseService.findOne(id);
	}

	@PostMapping("/reponses") 
	public Reponse saveReponse(@RequestBody Reponse reponse) {
		return reponseService.save(reponse);
	}

	@DeleteMapping("/reponses/{idReponse}") 
	public void deleteReponse(@PathVariable("idReponse") Long id) {
		reponseService.delete(id);
	}


}
