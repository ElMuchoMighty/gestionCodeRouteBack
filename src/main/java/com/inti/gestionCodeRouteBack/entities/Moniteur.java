package com.inti.gestionCodeRouteBack.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

//import javax.persistence.Entity;

@Entity
public class Moniteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMoniteur;
	private String nomMoniteur;
	private String prenomMoniteur;
	private long anneeMoniteur;
	private String descriptionMoniteur;
	private long telephoneMoniteur;
	private String emailMoniteur;

	@ManyToOne
	@JoinColumn(name = "id_autoecole")
	private AutoEcole autoecole;

	public Moniteur() {
	}

	public Moniteur(Long idMoniteur, String nomMoniteur, String prenomMoniteur, long anneeMoniteur,
			String descriptionMoniteur, long telephoneMoniteur, String emailMoniteur, AutoEcole autoecole) {
		super();
		this.idMoniteur = idMoniteur;
		this.nomMoniteur = nomMoniteur;
		this.prenomMoniteur = prenomMoniteur;
		this.anneeMoniteur = anneeMoniteur;
		this.descriptionMoniteur = descriptionMoniteur;
		this.telephoneMoniteur = telephoneMoniteur;
		this.emailMoniteur = emailMoniteur;
		this.autoecole = autoecole;
	}


	public AutoEcole getAutoecole() {
		return autoecole;
	}

	public void setAutoecole(AutoEcole autoecole) {
		this.autoecole = autoecole;
	}

	public Long getIdMoniteur() {
		return idMoniteur;
	}

	public void setIdMoniteur(Long idMoniteur) {
		this.idMoniteur = idMoniteur;
	}

	public String getNomMoniteur() {
		return nomMoniteur;
	}

	public void setNomMoniteur(String nomMoniteur) {
		this.nomMoniteur = nomMoniteur;
	}

	public String getPrenomMoniteur() {
		return prenomMoniteur;
	}

	public void setPrenomMoniteur(String prenomMoniteur) {
		this.prenomMoniteur = prenomMoniteur;
	}

	public long getAnneeMoniteur() {
		return anneeMoniteur;
	}

	public void setAnneeMoniteur(long anneeMoniteur) {
		this.anneeMoniteur = anneeMoniteur;
	}

	public String getDescriptionMoniteur() {
		return descriptionMoniteur;
	}

	public void setDescriptionMoniteur(String descriptionMoniteur) {
		this.descriptionMoniteur = descriptionMoniteur;
	}

	public long getTelephoneMoniteur() {
		return telephoneMoniteur;
	}

	public void setTelephoneMoniteur(long telephoneMoniteur) {
		this.telephoneMoniteur = telephoneMoniteur;
	}

	public String getEmailMoniteur() {
		return emailMoniteur;
	}

	public void setEmailMoniteur(String emailMoniteur) {
		this.emailMoniteur = emailMoniteur;
	}



}
