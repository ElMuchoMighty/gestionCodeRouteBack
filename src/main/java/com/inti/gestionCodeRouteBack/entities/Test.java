package com.inti.gestionCodeRouteBack.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Test implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTest;
	@Lob
	private byte[] image;
	private String question;
	private int codeBonneReponse;
	private int timerRep;
	@OneToMany(mappedBy = "test")
	@Transient
	private List<Reponse> reponses = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name = "id_examenBlanc")
	private ExamenBlanc examenBlanc;
	@ManyToOne
	@JoinColumn
	private ExamenFinal examenFinal;

	public Test() {
	}

	public Test(byte[] image, String question, int codeBonneReponse, int timerRep, List<Reponse> reponses,
			ExamenBlanc examenBlanc, ExamenFinal examenFinal) {
		super();
		this.image = image;
		this.question = question;
		this.codeBonneReponse = codeBonneReponse;
		this.timerRep = timerRep;
		this.reponses = reponses;
		this.examenBlanc = examenBlanc;
		this.examenFinal = examenFinal;
	}

	public Long getIdTest() {
		return idTest;
	}

	public void setIdTest(Long idTest) {
		this.idTest = idTest;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getCodeBonneReponse() {
		return codeBonneReponse;
	}

	public void setCodeBonneReponse(int codeBonneReponse) {
		this.codeBonneReponse = codeBonneReponse;
	}

	public int getTimerRep() {
		return timerRep;
	}

	public void setTimerRep(int timerRep) {
		this.timerRep = timerRep;
	}

	public List<Reponse> getReponses() {
		return reponses;
	}

	public void setReponses(List<Reponse> reponses) {
		this.reponses = reponses;
	}

	public ExamenBlanc getExamenBlanc() {
		return examenBlanc;
	}

	public void setExamenBlanc(ExamenBlanc examenBlanc) {
		this.examenBlanc = examenBlanc;
	}

	public ExamenFinal getExamenFinal() {
		return examenFinal;
	}

	public void setExamenFinal(ExamenFinal examenFinal) {
		this.examenFinal = examenFinal;
	}

}
