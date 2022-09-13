package com.inti.gestionCodeRouteBack.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.gestionCodeRouteBack.service.interfaces.IRoleService;
import com.inti.gestionCodeRouteBack.service.interfaces.IUtilisateurService;
@RestController
@CrossOrigin
public class StatsController {
		
		@Autowired
		IUtilisateurService utilisateurService;
		
		@Autowired
		IRoleService roleService;
		
		@GetMapping("/statistique") 
		public int Nombre() {
			return utilisateurService.nbrUtilisateurs();
		}
		
		@GetMapping("/statistiqueAdminU") 
		public int NombreAdmin() {
			return utilisateurService.nbrAdmin();
		}
		
		@GetMapping("/statistiqueCandidatU") 
		public int NombreCandidat() {
			return utilisateurService.nbrCandidat();
		}
		
		@GetMapping("/statistique/AdminR") 
		public int NombreAdmin1() {
			return roleService.nbrAdmin();
		}
		
		@GetMapping("/statistique/CandidatR") 
		public int NombreCandidat1() {
			return roleService.nbrCandidat();
		}
}
