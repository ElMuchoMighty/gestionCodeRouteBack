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

@Entity
public class Test implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTest;
	@Lob
	private byte[] image;
	private String reponse;
	private int timerRep;
	@OneToMany(mappedBy = "test")
	private List<Reponse> questions = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name = "id_examenBlanc")
	private ExamenBlanc examenBlanc;
	@ManyToOne
	@JoinColumn
	private ExamenFinal examenFinal;

	public Test() {
	}

	public Test(Long idTest, byte[] image, String reponse, int timerRep, List<Reponse> questions,
			ExamenBlanc examenBlanc, ExamenFinal examenFinal) {
		this.idTest = idTest;
		this.image = image;
		this.reponse = reponse;
		this.timerRep = timerRep;
		this.questions = questions;
		this.examenBlanc = examenBlanc;
		this.examenFinal = examenFinal;
	}

	public Test(byte[] image, String reponse, int timerRep, List<Reponse> questions, ExamenBlanc examenBlanc,
			ExamenFinal examenFinal) {
		this.image = image;
		this.reponse = reponse;
		this.timerRep = timerRep;
		this.questions = questions;
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

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public int getTimerRep() {
		return timerRep;
	}

	public void setTimerRep(int timerRep) {
		this.timerRep = timerRep;
	}

	public List<Reponse> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Reponse> questions) {
		this.questions = questions;
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
