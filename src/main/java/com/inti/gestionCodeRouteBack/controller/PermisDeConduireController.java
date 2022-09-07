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

import com.inti.gestionCodeRouteBack.entities.PermisDeConduire;
import com.inti.gestionCodeRouteBack.service.interfaces.IPermisDeConduireService;

@RestController // RestFul WS
@CrossOrigin
public class PermisDeConduireController {
	@Autowired
	IPermisDeConduireService permisDeConduireService;

	@GetMapping("/permisDeConduire") // @RequestMapping(value="permisDeConduire", method=RequestMethod.GET)
	public List<PermisDeConduire> findAll() {
		return permisDeConduireService.findAll();
	}

	@GetMapping("/permisDeConduire/{idPermisDeConduire}") // @RequestMapping(value="/permisDeConduire/{idPermisDeConduire}", method=RequestMethod.GET)
	public PermisDeConduire findOne(@PathVariable("idPermisDeConduire") Long id) {
		return permisDeConduireService.findOne(id);
	}
	
	@PostMapping("/permisDeConduire") // @RequestMapping(value="/permisDeConduire", method=RequestMethod.POST)
	public PermisDeConduire savePermisDeConduire(@RequestBody PermisDeConduire permisDeConduire) {
		return permisDeConduireService.save(permisDeConduire);
	}

	@DeleteMapping("/permisDeConduire/{idPermisDeConduire}") // @RequestMapping(value="/permisDeConduire/{idPermisDeConduire}", method=RequestMethod.DELETE)
	public void deletePermisDeConduire(@PathVariable("idPermisDeConduire") Long id) {
		permisDeConduireService.delete(id);
	}

}
