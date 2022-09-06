package com.inti.gestionCodeRouteBack.entities;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.inti.gestionCodeRouteBack.model.Adresse;

@Entity
public class AutoEcole {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idAutoEcole;
	private Adresse adresseAutoEcole;
	private String contactAutoEcole;
	private String emailAutoEcole;
	private long telephoneAutoEcole;
	private String enseigneAutoEcole;
	@OneToMany(mappedBy = "autoecole")
	private List<Utilisateur> utilisateurAutoEcole;
	@OneToMany(mappedBy = "autoecole")
	private List<Moniteurs> moniteursAutoEcole;
	@OneToMany(mappedBy = "autoecole")
	private List<RendezVous> rendezVousAutoEcole;
	
	public AutoEcole() {
	}

	public AutoEcole(Adresse adresseAutoEcole, String contactAutoEcole, String emailAutoEcole, long telephoneAutoEcole,
			String enseigneAutoEcole, List<Utilisateur> utilisateurAutoEcole, List<Moniteurs> moniteursAutoEcole,
			List<RendezVous> rendezVousAutoEcole) {
		super();
		this.adresseAutoEcole = adresseAutoEcole;
		this.contactAutoEcole = contactAutoEcole;
		this.emailAutoEcole = emailAutoEcole;
		this.telephoneAutoEcole = telephoneAutoEcole;
		this.enseigneAutoEcole = enseigneAutoEcole;
		this.utilisateurAutoEcole = utilisateurAutoEcole;
		this.moniteursAutoEcole = moniteursAutoEcole;
		this.rendezVousAutoEcole = rendezVousAutoEcole;
	}

	public Long getIdAutoEcole() {
		return idAutoEcole;
	}

	public void setIdAutoEcole(Long idAutoEcole) {
		this.idAutoEcole = idAutoEcole;
	}

	public Adresse getAdresseAutoEcole() {
		return adresseAutoEcole;
	}

	public void setAdresseAutoEcole(Adresse adresseAutoEcole) {
		this.adresseAutoEcole = adresseAutoEcole;
	}

	public String getContactAutoEcole() {
		return contactAutoEcole;
	}

	public void setContactAutoEcole(String contactAutoEcole) {
		this.contactAutoEcole = contactAutoEcole;
	}

	public String getEmailAutoEcole() {
		return emailAutoEcole;
	}

	public void setEmailAutoEcole(String emailAutoEcole) {
		this.emailAutoEcole = emailAutoEcole;
	}

	public long getTelephoneAutoEcole() {
		return telephoneAutoEcole;
	}

	public void setTelephoneAutoEcole(long telephoneAutoEcole) {
		this.telephoneAutoEcole = telephoneAutoEcole;
	}

	public String getEnseigneAutoEcole() {
		return enseigneAutoEcole;
	}

	public void setEnseigneAutoEcole(String enseigneAutoEcole) {
		this.enseigneAutoEcole = enseigneAutoEcole;
	}

	public List<Utilisateur> getUtilisateurAutoEcole() {
		return utilisateurAutoEcole;
	}

	public void setUtilisateurAutoEcole(List<Utilisateur> utilisateurAutoEcole) {
		this.utilisateurAutoEcole = utilisateurAutoEcole;
	}

	public List<Moniteurs> getMoniteursAutoEcole() {
		return moniteursAutoEcole;
	}

	public void setMoniteursAutoEcole(List<Moniteurs> moniteursAutoEcole) {
		this.moniteursAutoEcole = moniteursAutoEcole;
	}

	public List<RendezVous> getRendezVousAutoEcole() {
		return rendezVousAutoEcole;
	}

	public void setRendezVousAutoEcole(List<RendezVous> rendezVousAutoEcole) {
		this.rendezVousAutoEcole = rendezVousAutoEcole;
	}

}
