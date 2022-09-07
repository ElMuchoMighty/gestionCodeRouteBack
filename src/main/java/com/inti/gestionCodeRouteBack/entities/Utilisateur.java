package com.inti.gestionCodeRouteBack.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	@Column(unique = true)
	private String username;
	private String password;
	private String dateNaissanceUtilisateur;
	private String emailUtilisateur;
	private long telUtilisateur;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "PROFILS", joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "idUtilisateur"), inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "idRole"))
	private Set<Role> roles = new HashSet<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "REFERENCES_TESTS", joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "idUtilisateur"), inverseJoinColumns = @JoinColumn(name = "id_test", referencedColumnName = "idTest"))
	private Set<Test> tests = new HashSet<>();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "REFERENCES_COURS", joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "idUtilisateur"), inverseJoinColumns = @JoinColumn(name = "id_cours", referencedColumnName = "idCours"))
	private Set<Cours> cours = new HashSet<>();
	
	@OneToMany(mappedBy = "utilisateur")
	private List<Rapport> rapports = new ArrayList<>();
	@OneToMany(mappedBy = "utilisateurFavoris")
	private List<Favoris> favoris = new ArrayList<>();
	@OneToMany(mappedBy = "utilisateur")
	private List<PermisDeConduire> permisdeconduires = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name = "id_autoecole")
	private AutoEcole autoecole;

	public Utilisateur() {

	}



	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String username, String password,
			String dateNaissanceUtilisateur, String emailUtilisateur, long telUtilisateur, Set<Role> roles,
			Set<Test> tests, Set<Cours> cours, List<Rapport> rapports, List<Favoris> favoris,
			List<PermisDeConduire> permisdeconduires, AutoEcole autoecole) {
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.username = username;
		this.password = password;
		this.dateNaissanceUtilisateur = dateNaissanceUtilisateur;
		this.emailUtilisateur = emailUtilisateur;
		this.telUtilisateur = telUtilisateur;
		this.roles = roles;
		this.tests = tests;
		this.cours = cours;
		this.rapports = rapports;
		this.favoris = favoris;
		this.permisdeconduires = permisdeconduires;
		this.autoecole = autoecole;
	}



	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateNaissanceUtilisateur() {
		return dateNaissanceUtilisateur;
	}

	public void setDateNaissanceUtilisateur(String dateNaissanceUtilisateur) {
		this.dateNaissanceUtilisateur = dateNaissanceUtilisateur;
	}

	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}

	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}

	public long getTelUtilisateur() {
		return telUtilisateur;
	}

	public void setTelUtilisateur(long telUtilisateur) {
		this.telUtilisateur = telUtilisateur;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Test> getTests() {
		return tests;
	}

	public void setTests(Set<Test> tests) {
		this.tests = tests;
	}

	public Set<Cours> getCours() {
		return cours;
	}

	public void setCours(Set<Cours> cours) {
		this.cours = cours;
	}

	public List<Rapport> getRapports() {
		return rapports;
	}

	public void setRapports(List<Rapport> rapports) {
		this.rapports = rapports;
	}

	public List<Favoris> getFavoris() {
		return favoris;
	}

	public void setFavoris(List<Favoris> favoris) {
		this.favoris = favoris;
	}

	public List<PermisDeConduire> getPermisdeconduires() {
		return permisdeconduires;
	}

	public void setPermisdeconduires(List<PermisDeConduire> permisdeconduires) {
		this.permisdeconduires = permisdeconduires;
	}

	public AutoEcole getAutoecole() {
		return autoecole;
	}

	public void setAutoecole(AutoEcole autoecole) {
		this.autoecole = autoecole;
	}

}
