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

import com.inti.gestionCodeRouteBack.entities.Rapport;
import com.inti.gestionCodeRouteBack.service.impl.RapportService;

@RestController
@CrossOrigin
public class RapportController {
	
	@Autowired
	RapportService rapportService;
	
	@GetMapping("/rapport")
	public List<Rapport> findAll() {
		return rapportService.findAll();
	}
	
	@GetMapping("/rapport/{idRapport}") 
	public Rapport findOne(@PathVariable("idRapport") Long id) {
		return rapportService.findOne(id);
	}
	
	@PostMapping("/rapport") 
	public Rapport saveRapport(@RequestBody Rapport rapport) { 
		return rapportService.save(rapport); 
		}
	 

	@DeleteMapping("/rapport/{idRapport}") 
	public void deleteRapport(@PathVariable("idRapport") Long id) {
		rapportService.delete(id);
	}

}
