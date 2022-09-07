package com.inti.gestionCodeRouteBack.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.Utilisateur;

@Repository
public interface UtilisateurDAO extends JpaRepository<Utilisateur, Long>{
	Utilisateur findByUsername(String username);
	List<Utilisateur> findByNomUtilisateur(String nom);
	@Query(value = "SELECT count(*) FROM Utilisateur", nativeQuery = true)
	int nbrUtilisateurs();
}
