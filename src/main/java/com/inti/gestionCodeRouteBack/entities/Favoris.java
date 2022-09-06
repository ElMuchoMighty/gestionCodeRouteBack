package com.inti.gestionCodeRouteBack.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Favoris {
	
	private Long idFavoris;
	private Date dateExamenFavoris;
	private String examenConduiteFavoris;
	@ManyToOne
	@JoinColumn (name = "id_utilisateur")
	private Utilisateur utilisateurFavoris;
	
	public Favoris() {
	}

	public Favoris(Date dateExamenFavoris, String examenConduiteFavoris, Utilisateur utilisateurFavoris) {
		this.dateExamenFavoris = dateExamenFavoris;
		this.examenConduiteFavoris = examenConduiteFavoris;
		this.utilisateurFavoris = utilisateurFavoris;
	}

	public Long getIdFavoris() {
		return idFavoris;
	}

	public void setIdFavoris(Long idFavoris) {
		this.idFavoris = idFavoris;
	}

	public Date getDateExamenFavoris() {
		return dateExamenFavoris;
	}

	public void setDateExamenFavoris(Date dateExamenFavoris) {
		this.dateExamenFavoris = dateExamenFavoris;
	}

	public String getExamenConduiteFavoris() {
		return examenConduiteFavoris;
	}

	public void setExamenConduiteFavoris(String examenConduiteFavoris) {
		this.examenConduiteFavoris = examenConduiteFavoris;
	}

	public Utilisateur getUtilisateurFavoris() {
		return utilisateurFavoris;
	}

	public void setUtilisateurFavoris(Utilisateur utilisateurFavoris) {
		this.utilisateurFavoris = utilisateurFavoris;
	}

}
