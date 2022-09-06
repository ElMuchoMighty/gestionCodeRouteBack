package com.inti.gestionCodeRouteBack.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Test implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTest;
	@Lob
	private byte[] image;
	private String question;
	private String reponse;
	private int codeReponse;
	private int timerRep;

	public Test() {
	}

	
	
	public Test(Long idTest, byte[] image, String question, String reponse, int codeReponse, int timerRep) {
		this.idTest = idTest;
		this.image = image;
		this.question = question;
		this.reponse = reponse;
		this.codeReponse = codeReponse;
		this.timerRep = timerRep;
	}



	public Test(byte[] image, String question, String reponse, int codeReponse, int timerRep) {
		this.image = image;
		this.question = question;
		this.reponse = reponse;
		this.codeReponse = codeReponse;
		this.timerRep = timerRep;
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

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public int getCodeReponse() {
		return codeReponse;
	}

	public void setCodeReponse(int codeReponse) {
		this.codeReponse = codeReponse;
	}

	public int getTimerRep() {
		return timerRep;
	}

	public void setTimerRep(int timerRep) {
		this.timerRep = timerRep;
	}
	
	

}
