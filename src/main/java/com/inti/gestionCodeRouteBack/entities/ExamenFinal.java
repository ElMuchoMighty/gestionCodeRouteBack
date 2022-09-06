package com.inti.gestionCodeRouteBack.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ExamenFinal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExamenFinal;
	
	private int resultatFinal;
	private String commentaireFinal;
	@OneToMany(mappedBy = "examenFinal")
	private List<Test> tests = new ArrayList<>();
	
	
	public ExamenFinal() {
	}


	public int getResultatFinal() {
		return resultatFinal;
	}


	public void setResultatFinal(int resultatFinal) {
		this.resultatFinal = resultatFinal;
	}


	public String getCommentaireFinal() {
		return commentaireFinal;
	}


	public void setCommentaireFinal(String commentaireFinal) {
		this.commentaireFinal = commentaireFinal;
	}


	public List<Test> getTests() {
		return tests;
	}


	public void setTests(List<Test> tests) {
		this.tests = tests;
	}

	

	public Long getIdExamenFinal() {
		return idExamenFinal;
	}


	public void setIdExamenFinal(Long idExamenFinal) {
		this.idExamenFinal = idExamenFinal;
	}


	public ExamenFinal(Long idExamenFinal, int resultatFinal, String commentaireFinal, List<Test> tests) {
		this.idExamenFinal = idExamenFinal;
		this.resultatFinal = resultatFinal;
		this.commentaireFinal = commentaireFinal;
		this.tests = tests;
	}
	
	
	
	
	
	
	

}
