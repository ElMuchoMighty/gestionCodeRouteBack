package com.inti.gestionCodeRouteBack.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class AssuranceAuto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAssurance;
	private int typeAssurance;

	
	public AssuranceAuto() {
	}


	public AssuranceAuto(Long idAssurance, int typeAssurance) {
		this.idAssurance = idAssurance;
		this.typeAssurance = typeAssurance;
	}


	public Long getIdAssurance() {
		return idAssurance;
	}


	public void setIdAssurance(Long idAssurance) {
		this.idAssurance = idAssurance;
	}


	public int getTypeAssurance() {
		return typeAssurance;
	}


	public void setTypeAssurance(int typeAssurance) {
		this.typeAssurance = typeAssurance;
	}
	
	
	
	

	
}
