package com.inti.gestionCodeRouteBack.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reponse implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReponse;
	private String contenuReponse;
	private int codeReponse;
	@ManyToOne
	@JoinColumn(name = "id_test")
	private Test test;

	public Reponse() {
	}

	public Reponse(String contenuReponse, int codeReponse, Test test) {
		this.contenuReponse = contenuReponse;
		this.codeReponse = codeReponse;
		this.test = test;
	}

	public Long getIdReponse() {
		return idReponse;
	}

	public void setIdReponse(Long idReponse) {
		this.idReponse = idReponse;
	}

	public String getContenuReponse() {
		return contenuReponse;
	}

	public void setContenuReponse(String contenuReponse) {
		this.contenuReponse = contenuReponse;
	}

	public int getCodeReponse() {
		return codeReponse;
	}

	public void setCodeReponse(int codeReponse) {
		this.codeReponse = codeReponse;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

}
