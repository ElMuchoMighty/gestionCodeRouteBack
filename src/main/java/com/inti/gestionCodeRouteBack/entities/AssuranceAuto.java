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
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(joinColumns = @JoinColumn(name="idAssurance",
	referencedColumnName = "idAssurance" ),inverseJoinColumns = 
	@JoinColumn(name="idPermis",referencedColumnName = "idPermis"))
	private Set<PermisDeConduire> permisDeConduire=new HashSet<>();
	
	
	public AssuranceAuto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssuranceAuto(Long idAssurance, int typeAssurance) {
		super();
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
	
	public Set<PermisDeConduire> getPermisDeConduire() {
		return permisDeConduire;
	}
	public void setPermisDeConduire(Set<PermisDeConduire> permisDeConduire) {
		this.permisDeConduire = permisDeConduire;
	}
	@Override
	public String toString() {
		return "AssuranceAuto [idAssurance=" + idAssurance + ", typeAssurance=" + typeAssurance + ", permisDeConduire="
				+ permisDeConduire + "]";
	}

	
}
