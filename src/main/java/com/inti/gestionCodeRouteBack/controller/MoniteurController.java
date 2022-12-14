package com.inti.gestionCodeRouteBack.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inti.gestionCodeRouteBack.entities.Moniteur;
import com.inti.gestionCodeRouteBack.entities.Utilisateur;
import com.inti.gestionCodeRouteBack.service.interfaces.IMoniteurService;

@RestController // RestFul WS
@CrossOrigin
public class MoniteurController {
	@Autowired
	IMoniteurService moniteurService;

	@GetMapping("/moniteurs") // @RequestMapping(value="moniteur", method=RequestMethod.GET)
	public List<Moniteur> findAll() {
		return moniteurService.findAll();
	}

	@GetMapping("/moniteurs/{idMoniteur}") // @RequestMapping(value="/moniteur/{idMoniteur}", method=RequestMethod.GET)
	public Moniteur findOne(@PathVariable("idMoniteur") Long id) {
		return moniteurService.findOne(id);
	}
	
	@PostMapping("/moniteurs") // @RequestMapping(value="/moniteur", method=RequestMethod.POST)
	public Moniteur saveMoniteur(@RequestBody Moniteur moniteur) {

		Moniteur currentMoniteur= new Moniteur(moniteur.getNomMoniteur(),
				moniteur.getPrenomMoniteur(),moniteur.getAnneeMoniteur(),
				moniteur.getDescriptionMoniteur(),
				moniteur.getTelephoneMoniteur(),
				moniteur.getEmailMoniteur(),
				moniteur.getPermisDeConduire()
				,moniteur.getAutoecole());
		
		return moniteurService.save(currentMoniteur);
	}

	@DeleteMapping("/moniteurs/{idMoniteur}") // @RequestMapping(value="/moniteur/{idMoniteur}", method=RequestMethod.DELETE)
	public void deleteMoniteur(@PathVariable("idMoniteur") Long id) {
		moniteurService.delete(id);
	}
	
	@PutMapping("/moniteurs/{idMoniteur}") 
	public Moniteur updateMoniteurWithPut(@PathVariable("idMoniteur") Long id,@RequestBody Moniteur moniteur) { //
		Moniteur currentUser = moniteurService.findOne(id); 
		System.out.println(currentUser.toString());
		currentUser.setNomMoniteur(moniteur.getNomMoniteur()); 
		currentUser.setPrenomMoniteur(moniteur.getPrenomMoniteur());
		currentUser.setAnneeMoniteur(moniteur.getAnneeMoniteur());
		currentUser.setDescriptionMoniteur(moniteur.getDescriptionMoniteur());
		currentUser.setTelephoneMoniteur(moniteur.getTelephoneMoniteur());
		currentUser.setEmailMoniteur(moniteur.getEmailMoniteur());
		currentUser.setPermisDeConduire(moniteur.getPermisDeConduire());
		currentUser.setAutoecole(moniteur.getAutoecole());
		return moniteurService.save(currentUser);
	}

}
