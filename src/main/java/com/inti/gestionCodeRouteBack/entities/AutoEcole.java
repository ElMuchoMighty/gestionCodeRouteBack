package com.inti.gestionCodeRouteBack.entities;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class AutoEcole {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idAutoEcole;
	private String contactAutoEcole;
	private String emailAutoEcole;
	private long telephoneAutoEcole;
	private String enseigneAutoEcole;
	private String region;
	private String ville;
	
	@OneToMany(mappedBy = "autoecole")
	private List<Moniteur> moniteurAutoEcole;
	@OneToMany(mappedBy = "autoEcoleRendezVous")
	private List<RendezVous> rendezVousAutoEcole;
	
	public AutoEcole() {
	}

	
	
	
	public AutoEcole(Long idAutoEcole, String contactAutoEcole, String emailAutoEcole, long telephoneAutoEcole,
			String enseigneAutoEcole, String region, String ville, List<Moniteur> moniteurAutoEcole,
			List<RendezVous> rendezVousAutoEcole) {
		super();
		this.idAutoEcole = idAutoEcole;
		this.contactAutoEcole = contactAutoEcole;
		this.emailAutoEcole = emailAutoEcole;
		this.telephoneAutoEcole = telephoneAutoEcole;
		this.enseigneAutoEcole = enseigneAutoEcole;
		this.region = region;
		this.ville = ville;
		this.moniteurAutoEcole = moniteurAutoEcole;
		this.rendezVousAutoEcole = rendezVousAutoEcole;
	}




	public Long getIdAutoEcole() {
		return idAutoEcole;
	}

	public void setIdAutoEcole(Long idAutoEcole) {
		this.idAutoEcole = idAutoEcole;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Moniteur> getMoniteurAutoEcole() {
		return moniteurAutoEcole;
	}

	public void setMoniteurAutoEcole(List<Moniteur> moniteurAutoEcole) {
		this.moniteurAutoEcole = moniteurAutoEcole;
	}

	public List<RendezVous> getRendezVousAutoEcole() {
		return rendezVousAutoEcole;
	}

	public void setRendezVousAutoEcole(List<RendezVous> rendezVousAutoEcole) {
		this.rendezVousAutoEcole = rendezVousAutoEcole;
	}
	
	
	


	
	
	
}
