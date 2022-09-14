package com.inti.gestionCodeRouteBack.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.gestionCodeRouteBack.entities.Utilisateur;
import com.inti.gestionCodeRouteBack.service.interfaces.IUtilisateurService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	IUtilisateurService utilisateurService;
	
	@CrossOrigin
	@RequestMapping(value="/users")
	public Utilisateur login(Principal principal) {
		return utilisateurService.findByUsername(principal.getName());
	}

}
