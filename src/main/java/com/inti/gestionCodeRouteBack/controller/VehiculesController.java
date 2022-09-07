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

import com.inti.gestionCodeRouteBack.entities.Vehicules;
import com.inti.gestionCodeRouteBack.service.interfaces.IVehiculesService;

@RestController // RestFul WS
@CrossOrigin
public class VehiculesController {
	@Autowired
	IVehiculesService vehiculesService;

	@GetMapping("/vehicules") // @RequestMapping(value="vehicules", method=RequestMethod.GET)
	public List<Vehicules> findAll() {
		return vehiculesService.findAll();
	}

	@GetMapping("/vehicules/{idVehicules}") // @RequestMapping(value="/vehicules/{idVehicules}", method=RequestMethod.GET)
	public Vehicules findOne(@PathVariable("idVehicules") Long id) {
		return vehiculesService.findOne(id);
	}
	
	@PostMapping("/vehicules") // @RequestMapping(value="/vehicules", method=RequestMethod.POST)
	public Vehicules saveVehicules(@RequestBody Vehicules vehicules) {
		return vehiculesService.save(vehicules);
	}

	@DeleteMapping("/vehicules/{idVehicules}") // @RequestMapping(value="/vehicules/{idVehicules}", method=RequestMethod.DELETE)
	public void deleteVehicules(@PathVariable("idVehicules") Long id) {
		vehiculesService.delete(id);
	}

}
