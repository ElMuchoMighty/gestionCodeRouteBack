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
import com.inti.gestionCodeRouteBack.service.interfaces.IMoniteurService;

@RestController // RestFul WS
@CrossOrigin
public class MoniteurController {
	@Autowired
	IMoniteurService moniteurService;

	@GetMapping("/moniteur") // @RequestMapping(value="moniteur", method=RequestMethod.GET)
	public List<Moniteur> findAll() {
		return moniteurService.findAll();
	}

	@GetMapping("/moniteur/{idMoniteur}") // @RequestMapping(value="/moniteur/{idMoniteur}", method=RequestMethod.GET)
	public Moniteur findOne(@PathVariable("idMoniteur") Long id) {
		return moniteurService.findOne(id);
	}
	
	@PostMapping("/moniteur") // @RequestMapping(value="/moniteur", method=RequestMethod.POST)
	public Moniteur saveMoniteur(@RequestBody Moniteur moniteur) {
		return moniteurService.save(moniteur);
	}

	@DeleteMapping("/moniteur/{idMoniteur}") // @RequestMapping(value="/moniteur/{idMoniteur}", method=RequestMethod.DELETE)
	public void deleteMoniteur(@PathVariable("idMoniteur") Long id) {
		moniteurService.delete(id);
	}

}
