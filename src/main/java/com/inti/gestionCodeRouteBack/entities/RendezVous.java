package com.inti.gestionCodeRouteBack.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class RendezVous {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idRendezVous;
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dateRendezVous;
	private int heureRendezVous;
	@ManyToOne
	@JoinColumn (name = "id_autoecole")
	private AutoEcole autoEcoleRendezVous;
	
	public RendezVous() {
	}

	public RendezVous(Date dateRendezVous, int heureRendezVous, AutoEcole autoEcoleRendezVous) {
		this.dateRendezVous = dateRendezVous;
		this.heureRendezVous = heureRendezVous;
		this.autoEcoleRendezVous = autoEcoleRendezVous;
	}

	public Long getIdRendezVous() {
		return idRendezVous;
	}

	public void setIdRendezVous(Long idRendezVous) {
		this.idRendezVous = idRendezVous;
	}

	public Date getDateRendezVous() {
		return dateRendezVous;
	}

	public void setDateRendezVous(Date dateRendezVous) {
		this.dateRendezVous = dateRendezVous;
	}

	public int getHeureRendezVous() {
		return heureRendezVous;
	}

	public void setHeureRendezVous(int heureRendezVous) {
		this.heureRendezVous = heureRendezVous;
	}

	public AutoEcole getAutoEcoleRendezVous() {
		return autoEcoleRendezVous;
	}

	public void setAutoEcoleRendezVous(AutoEcole autoEcoleRendezVous) {
		this.autoEcoleRendezVous = autoEcoleRendezVous;
	}
	
}
