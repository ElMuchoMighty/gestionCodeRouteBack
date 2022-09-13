package com.inti.gestionCodeRouteBack.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.gestionCodeRouteBack.dao.UtilisateurDAO;
import com.inti.gestionCodeRouteBack.entities.Utilisateur;
import com.inti.gestionCodeRouteBack.service.interfaces.IUtilisateurService;



@Service
public class UtilisateurService implements IUtilisateurService{
	@Autowired
	UtilisateurDAO utilisateurDAO;

	@Override
	public List<Utilisateur> findAll() {
		return utilisateurDAO.findAll();
	}

	@Override
	public Utilisateur findOne(Long idUtilisateur) {
		return utilisateurDAO.findById(idUtilisateur).get();
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		return utilisateurDAO.save(utilisateur);
	}

	@Override
	public void delete(Long idUtilisateur) {
		utilisateurDAO.deleteById(idUtilisateur);
		
	}

	@Override
	public Utilisateur findByUsername(String username) {
		return utilisateurDAO.findByUsername(username);
	}

	@Override
	public List<Utilisateur> findByNomUtilisateur(String nom) {
		return utilisateurDAO.findByNomUtilisateur(nom);
	}

	@Override
	public int nbrUtilisateurs() {
		return utilisateurDAO.nbrUtilisateurs();
	}

	@Override
	public int nbrAdmin() {
		return utilisateurDAO.nbrAdmin();
	}

	@Override
	public int nbrCandidat() {
		return utilisateurDAO.nbrCandidat();
	}
}
