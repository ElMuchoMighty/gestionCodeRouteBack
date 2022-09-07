package com.inti.gestionCodeRouteBack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.gestionCodeRouteBack.entities.Utilisateur;
import com.inti.gestionCodeRouteBack.service.interfaces.IUtilisateurService;



@RestController
@CrossOrigin
public class UtilisateurController {
	
	@Autowired
	IUtilisateurService utilisateurService;

	@Autowired
	PasswordEncoder passwordEncoder;
	
	@GetMapping("/utilisateurs") 
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@GetMapping("/utilisateurs/{idUtilisateur}") 											
	public Utilisateur findOne(@PathVariable("idUtilisateur") Long id) {
		return utilisateurService.findOne(id);
	}
	
	@PostMapping("/utilisateurs") 
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		Utilisateur currentUser=new Utilisateur(utilisateur.getNomUtilisateur(), utilisateur.getPrenomUtilisateur(), utilisateur.getUsername(),passwordEncoder.encode(utilisateur.getPassword()), 
				utilisateur.getDateNaissanceUtilisateur(), utilisateur.getEmailUtilisateur(), utilisateur.getTelUtilisateur(), utilisateur.getRoles(), utilisateur.getTests(),
				utilisateur.getCours(), utilisateur.getRapports(),utilisateur.getFavoris(),utilisateur.getPermisdeconduires(),utilisateur.getAutoecole());
		return utilisateurService.save(currentUser);
	}

	
	@DeleteMapping("/utilisateurs/{idUtilisateur}") 
	public void deleteRole(@PathVariable("idUtilisateur") Long id) {
		utilisateurService.delete(id);
	}
}
