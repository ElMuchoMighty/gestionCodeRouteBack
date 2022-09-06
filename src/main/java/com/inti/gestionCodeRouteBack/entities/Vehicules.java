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

@Entity
public class Vehicules {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVehicules;
	private String typeVehicules;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(joinColumns = @JoinColumn(name="idVehicules",
	referencedColumnName = "idVehicules" ),inverseJoinColumns = 
	@JoinColumn(name="idPermis",referencedColumnName = "idPermis"))
	private Set<PermisDeConduire> permisDeConduire=new HashSet<>();
	
	
	
	public Vehicules() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicules(Long idVehicules, String typeVehicules) {
		super();
		this.idVehicules = idVehicules;
		this.typeVehicules = typeVehicules;
	}
	public Long getIdVehicules() {
		return idVehicules;
	}
	public void setIdVehicules(Long idVehicules) {
		this.idVehicules = idVehicules;
	}
	public String getTypeVehicules() {
		return typeVehicules;
	}
	public void setTypeVehicules(String typeVehicules) {
		this.typeVehicules = typeVehicules;
	}
	
	public Set<PermisDeConduire> getPermisDeConduire() {
		return permisDeConduire;
	}
	public void setPermisDeConduire(Set<PermisDeConduire> permisDeConduire) {
		this.permisDeConduire = permisDeConduire;
	}
	@Override
	public String toString() {
		return "Vehicules [idVehicules=" + idVehicules + ", typeVehicules=" + typeVehicules + ", permisDeConduire="
				+ permisDeConduire + "]";
	}
	
	
	
}
