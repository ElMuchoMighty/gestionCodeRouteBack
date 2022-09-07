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

import com.inti.gestionCodeRouteBack.entities.AutoEcole;
import com.inti.gestionCodeRouteBack.service.impl.AutoEcoleService;

@RestController
@CrossOrigin
public class AutoEcoleController {
	
	@Autowired
	AutoEcoleService autoEcoleService;
	
	@GetMapping("/autoEcole")
	public List<AutoEcole> findAll() {
	return autoEcoleService.findAll();
	}
	
	@GetMapping("/autoEcole/{idAutoEcole}") 
	public AutoEcole findOne(@PathVariable("idAutoEcole") Long id) {
	return autoEcoleService.findOne(id);
	}
	
	@PostMapping("/autoEcole") public AutoEcole saveAutoEcole(@RequestBody AutoEcole autoEcole) { 
	AutoEcole currentUser=new AutoEcole(autoEcole.getAdresseAutoEcole(),autoEcole.getContactAutoEcole(),autoEcole.getEmailAutoEcole(),autoEcole.getTelephoneAutoEcole(), autoEcole.getEnseigneAutoEcole(),autoEcole.getUtilisateurAutoEcole(),autoEcole.getMoniteurAutoEcole(),autoEcole.getRendezVousAutoEcole()); 
	return autoEcoleService.save(currentUser); }
	 

	@DeleteMapping("/autoEcole/{idAutoEcole}") 
	public void deleteAutoEcole(@PathVariable("idAutoEcole") Long id) {
		autoEcoleService.delete(id);
	}

}