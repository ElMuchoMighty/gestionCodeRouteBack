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

import com.inti.gestionCodeRouteBack.entities.ExamenFinal;
import com.inti.gestionCodeRouteBack.service.interfaces.IExamenFinalService;

@RestController
@CrossOrigin
public class ExamenFinalController {
	@Autowired
	IExamenFinalService examenFinalService;
	
	
	@GetMapping("/examenFinals") 
	public List<ExamenFinal> findAll() {
		return examenFinalService.findAll();
	}
	
	@GetMapping("/examenFinals/{idExamenFinal}") 											
	public ExamenFinal findOne(@PathVariable("idExamenFinal") Long id) {
		return examenFinalService.findOne(id);
	}


	@PostMapping("/examenFinals") 
	public ExamenFinal saveExamenFinal(@RequestBody ExamenFinal examenFinal) {
		return examenFinalService.save(examenFinal);
	}

	@DeleteMapping("/examenFinals/{idExamenFinal}") 
	public void deleteExamenFinal(@PathVariable("idExamenFinal") Long id) {
		examenFinalService.delete(id);
	}


}
