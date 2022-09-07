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

import com.inti.gestionCodeRouteBack.entities.AssuranceAuto;
import com.inti.gestionCodeRouteBack.service.interfaces.IAssuranceAutoService;

@RestController // RestFul WS
@CrossOrigin
public class AssuranceAutoController {
	@Autowired
	IAssuranceAutoService assuranceAutoService;

	@GetMapping("/assuranceAuto") // @RequestMapping(value="assuranceAuto", method=RequestMethod.GET)
	public List<AssuranceAuto> findAll() {
		return assuranceAutoService.findAll();
	}

	@GetMapping("/assuranceAuto/{idAssuranceAuto}") // @RequestMapping(value="/assuranceAuto/{idAssuranceAuto}", method=RequestMethod.GET)
	public AssuranceAuto findOne(@PathVariable("idAssuranceAuto") Long id) {
		return assuranceAutoService.findOne(id);
	}
	
	@PostMapping("/assuranceAuto") // @RequestMapping(value="/assuranceAuto", method=RequestMethod.POST)
	public AssuranceAuto saveAssuranceAuto(@RequestBody AssuranceAuto assuranceAuto) {
		return assuranceAutoService.save(assuranceAuto);
	}

	@DeleteMapping("/assuranceAuto/{idAssuranceAuto}") // @RequestMapping(value="/assuranceAuto/{idAssuranceAuto}", method=RequestMethod.DELETE)
	public void deleteAssuranceAuto(@PathVariable("idAssuranceAuto") Long id) {
		assuranceAutoService.delete(id);
	}

}
