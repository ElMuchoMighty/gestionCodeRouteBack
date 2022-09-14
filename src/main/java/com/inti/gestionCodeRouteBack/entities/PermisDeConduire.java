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

@Entity
public class PermisDeConduire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPermis;
	private String libPermis;
	private String villePermis;
	private String paysPermis;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(joinColumns = @JoinColumn(name = "id_permis", referencedColumnName = "idPermis"), inverseJoinColumns = @JoinColumn(name = "id_assurance", referencedColumnName = "idAssurance"))
	private Set<AssuranceAuto> assurance_auto = new HashSet<>();
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(joinColumns = @JoinColumn(name = "id_permis", referencedColumnName = "idPermis"), inverseJoinColumns = @JoinColumn(name = "id_vehicules", referencedColumnName = "idVehicules"))
	private Set<Vehicules> vehicules = new HashSet<>();
	@ManyToOne
	@JoinColumn(name = "id_utilisateur")
	private Utilisateur utilisateur;

	public PermisDeConduire() {
	}
	
	
	

	public PermisDeConduire(Long idPermis, String libPermis, String villePermis, String paysPermis,
			Set<AssuranceAuto> assurance_auto, Set<Vehicules> vehicules, Utilisateur utilisateur) {
		this.idPermis = idPermis;
		this.libPermis = libPermis;
		this.villePermis = villePermis;
		this.paysPermis = paysPermis;
		this.assurance_auto = assurance_auto;
		this.vehicules = vehicules;
		this.utilisateur = utilisateur;
	}




	public Long getIdPermis() {
		return idPermis;
	}

	public void setIdPermis(Long idPermis) {
		this.idPermis = idPermis;
	}

	public String getLibPermis() {
		return libPermis;
	}

	public void setLibPermis(String libPermis) {
		this.libPermis = libPermis;
	}

	public String getVillePermis() {
		return villePermis;
	}

	public void setVillePermis(String villePermis) {
		this.villePermis = villePermis;
	}

	public String getPaysPermis() {
		return paysPermis;
	}

	public void setPaysPermis(String paysPermis) {
		this.paysPermis = paysPermis;
	}

	public Set<AssuranceAuto> getAssurance_auto() {
		return assurance_auto;
	}

	public void setAssurance_auto(Set<AssuranceAuto> assurance_auto) {
		this.assurance_auto = assurance_auto;
	}

	public Set<Vehicules> getVehicules() {
		return vehicules;
	}

	public void setVehicules(Set<Vehicules> vehicules) {
		this.vehicules = vehicules;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	


	
}
