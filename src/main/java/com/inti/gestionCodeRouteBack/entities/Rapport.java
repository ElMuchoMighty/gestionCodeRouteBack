package com.inti.gestionCodeRouteBack.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rapport {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idRapport;
	private String titreRapport;
	private String contenuRapport;
	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;
	
	public Rapport() {
	}

	public Rapport(String titreRapport, String contenuRapport, Utilisateur utilisateur) {
		this.titreRapport = titreRapport;
		this.contenuRapport = contenuRapport;
		this.utilisateur = utilisateur;
	}

	public Long getIdRapport() {
		return idRapport;
	}

	public void setIdRapport(Long idRapport) {
		this.idRapport = idRapport;
	}

	public String getTitreRapport() {
		return titreRapport;
	}

	public void setTitreRapport(String titreRapport) {
		this.titreRapport = titreRapport;
	}

	public String getContenuRapport() {
		return contenuRapport;
	}

	public void setContenuRapport(String contenuRapport) {
		this.contenuRapport = contenuRapport;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
}
