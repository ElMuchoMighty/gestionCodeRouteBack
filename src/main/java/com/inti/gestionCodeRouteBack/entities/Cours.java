package com.inti.gestionCodeRouteBack.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Cours {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCours;
	private int nbrHeuresCours;
	private String contenuCours;
	private int complexiteCours;
	private String thematiqueCours;
	private String formatCoursCours;
	
	public Cours() {
	}
	
	public Cours(int nbrHeuresCours, String contenuCours, int complexiteCours, String thematiqueCours,
			String formatCoursCours) {
		this.nbrHeuresCours = nbrHeuresCours;
		this.contenuCours = contenuCours;
		this.complexiteCours = complexiteCours;
		this.thematiqueCours = thematiqueCours;
		this.formatCoursCours = formatCoursCours;
	}

	public Long getIdCours() {
		return idCours;
	}

	public void setIdCours(Long idCours) {
		this.idCours = idCours;
	}

	public int getNbrHeuresCours() {
		return nbrHeuresCours;
	}

	public void setNbrHeuresCours(int nbrHeuresCours) {
		this.nbrHeuresCours = nbrHeuresCours;
	}

	public String getContenuCours() {
		return contenuCours;
	}

	public void setContenuCours(String contenuCours) {
		this.contenuCours = contenuCours;
	}

	public int getComplexiteCours() {
		return complexiteCours;
	}

	public void setComplexiteCours(int complexiteCours) {
		this.complexiteCours = complexiteCours;
	}

	public String getThematiqueCours() {
		return thematiqueCours;
	}

	public void setThematiqueCours(String thematiqueCours) {
		this.thematiqueCours = thematiqueCours;
	}

	public String getFormatCoursCours() {
		return formatCoursCours;
	}

	public void setFormatCoursCours(String formatCoursCours) {
		this.formatCoursCours = formatCoursCours;
	}

}
