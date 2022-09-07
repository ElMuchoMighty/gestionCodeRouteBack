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

import com.inti.gestionCodeRouteBack.entities.Role;
import com.inti.gestionCodeRouteBack.service.interfaces.IRoleService;

@RestController
@CrossOrigin
public class RoleController {
	
	
	@Autowired
	IRoleService roleService;
	
	@GetMapping("/roles") 
	public List<Role> findAll() {
		return roleService.findAll();
	}

	@GetMapping("/roles/{idRole}") 											
	public Role findOne(@PathVariable("idRole") Long id) {
		return roleService.findOne(id);
	}
	@PostMapping("/roles") 
	public Role saveRole(@RequestBody Role role) {
		return roleService.save(role);
	}

	@DeleteMapping("/roles/{idRole}") 
	public void deleteRole(@PathVariable("idRole") Long id) {
		roleService.delete(id);
	}

	
	

}
