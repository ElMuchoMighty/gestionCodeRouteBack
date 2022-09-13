package com.inti.gestionCodeRouteBack.service.interfaces;

import java.util.List;

import com.inti.gestionCodeRouteBack.entities.Utilisateur;

public interface IUtilisateurService {
	List<Utilisateur> findAll();

	Utilisateur findOne(Long idUtilisateur);

	Utilisateur save(Utilisateur utilisateur);

	void delete(Long idUtilisateur);

	Utilisateur findByUsername(String username);
	
	List<Utilisateur> findByNomUtilisateur(String nom);
	
	int nbrUtilisateurs();
	
	int nbrAdmin();
	
	int nbrCandidat();

}
