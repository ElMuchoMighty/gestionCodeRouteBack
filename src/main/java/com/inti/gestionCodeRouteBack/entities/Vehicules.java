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

	
	
	
	public Vehicules() {
	}


	public Vehicules(Long idVehicules, String typeVehicules) {
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
	
	
	
	

	
}
