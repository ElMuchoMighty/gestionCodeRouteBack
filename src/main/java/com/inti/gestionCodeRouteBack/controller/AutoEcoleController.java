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
	
	@GetMapping("/autoEcoles")
	public List<AutoEcole> findAll() {
	return autoEcoleService.findAll();
	}
	
	@GetMapping("/autoEcoles/{idAutoEcole}") 
	public AutoEcole findOne(@PathVariable("idAutoEcole") Long id) {
	return autoEcoleService.findOne(id);
	}
	
	@PostMapping("/autoEcoles") 
	public AutoEcole saveAutoEcole(@RequestBody AutoEcole autoEcole) { 
	return autoEcoleService.save(autoEcole); 
	}
	 

	@DeleteMapping("/autoEcoles/{idAutoEcole}") 
	public void deleteAutoEcole(@PathVariable("idAutoEcole") Long id) {
		autoEcoleService.delete(id);
	}

}
