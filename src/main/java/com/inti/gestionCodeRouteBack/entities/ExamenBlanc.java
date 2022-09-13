package com.inti.gestionCodeRouteBack.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class ExamenBlanc implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExamenBlanc;
	
	private int resultatBlanc;
	private String commentaireBlanc;
	@OneToMany(mappedBy = "examenBlanc")
	@Transient
	private List<Test> tests = new ArrayList<>();
	
	public ExamenBlanc() {
	}



	public ExamenBlanc(Long idExamenBlanc, int resultatBlanc, String commentaireBlanc, List<Test> tests) {
		this.idExamenBlanc = idExamenBlanc;
		this.resultatBlanc = resultatBlanc;
		this.commentaireBlanc = commentaireBlanc;
		this.tests = tests;
	}



	public Long getIdExamenBlanc() {
		return idExamenBlanc;
	}



	public void setIdExamenBlanc(Long idExamenBlanc) {
		this.idExamenBlanc = idExamenBlanc;
	}



	public int getResultatBlanc() {
		return resultatBlanc;
	}

	public void setResultatBlanc(int resultatBlanc) {
		this.resultatBlanc = resultatBlanc;
	}

	public String getCommentaireBlanc() {
		return commentaireBlanc;
	}

	public void setCommentaireBlanc(String commentaireBlanc) {
		this.commentaireBlanc = commentaireBlanc;
	}

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
	
	
	
	











}
