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

import com.inti.gestionCodeRouteBack.entities.ExamenBlanc;
import com.inti.gestionCodeRouteBack.entities.Role;
import com.inti.gestionCodeRouteBack.service.interfaces.IExamenBlancService;

@RestController
@CrossOrigin
public class ExamenBlancController {
	@Autowired 
	IExamenBlancService examenBlancService;
	
	
	@GetMapping("/examenBlancs") 
	public List<ExamenBlanc> findAll() {
		return examenBlancService.findAll();
	}
	
	@GetMapping("/examenBlancs/{idExamenBlancs}") 											
	public ExamenBlanc findOne(@PathVariable("idExamenBlanc") Long id) {
		return examenBlancService.findOne(id);
	}


	@PostMapping("/examenBlancs") 
	public ExamenBlanc saveExamenBlanc(@RequestBody ExamenBlanc examenBlanc) {
		return examenBlancService.save(examenBlanc);
	}

	@DeleteMapping("/examenBlancs/{idExamenBlanc}") 
	public void deleteExamenBlanc(@PathVariable("idExamenBlanc") Long id) {
		examenBlancService.delete(id);
	}

}
