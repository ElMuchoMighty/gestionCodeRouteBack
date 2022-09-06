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
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(joinColumns = @JoinColumn(name = "idMoniteur", 
	referencedColumnName = "idMoniteur"), 
	inverseJoinColumns = @JoinColumn(name = "idPermis", referencedColumnName = "idPermis"))
	private Set<PermisDeConduire> permis_de_conduire = new HashSet<>();
	@ManyToOne
	@JoinColumn(name = "id_auto_ecole")
	private AutoEcole auto_ecole;
	
	
	public Moniteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Moniteur(Long idMoniteur, String nomMoniteur, String prenomMoniteur, long anneeMoniteur,
			String descriptionMoniteur, long telephoneMoniteur, String emailMoniteur,
			Set<PermisDeConduire> permis_de_conduire, AutoEcole auto_ecole) {
		super();
		this.idMoniteur = idMoniteur;
		this.nomMoniteur = nomMoniteur;
		this.prenomMoniteur = prenomMoniteur;
		this.anneeMoniteur = anneeMoniteur;
		this.descriptionMoniteur = descriptionMoniteur;
		this.telephoneMoniteur = telephoneMoniteur;
		this.emailMoniteur = emailMoniteur;
		this.permis_de_conduire = permis_de_conduire;
		this.auto_ecole = auto_ecole;
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
	
	public Set<PermisDeConduire> getPermis_de_conduire() {
		return permis_de_conduire;
	}



	public void setPermis_de_conduire(Set<PermisDeConduire> permis_de_conduire) {
		this.permis_de_conduire = permis_de_conduire;
	}



	public AutoEcole getAuto_ecole() {
		return auto_ecole;
	}



	public void setAuto_ecole(AutoEcole auto_ecole) {
		this.auto_ecole = auto_ecole;
	}



	@Override
	public String toString() {
		return "Moniteur [idMoniteur=" + idMoniteur + ", nomMoniteur=" + nomMoniteur + ", prenomMoniteur="
				+ prenomMoniteur + ", anneeMoniteur=" + anneeMoniteur + ", descriptionMoniteur=" + descriptionMoniteur
				+ ", telephoneMoniteur=" + telephoneMoniteur + ", emailMoniteur=" + emailMoniteur
				+ ", permis_de_conduire=" + permis_de_conduire + "]";
	}

	

	
	
	
}
