package com.inti.gestionCodeRouteBack.entities;

import javax.persistence.Entity;

@Entity
public class ExamenFinal extends Test{
	
	
	private int resultatFinal;
	private String commentaireFinal;
	
	
	public ExamenFinal() {
		super();
	}


	public ExamenFinal(Long idTest, byte[] image, String question, String reponse, int codeReponse, int timerRep,
			int resultatFinal, String commentaireFinal) {
		super(idTest, image, question, reponse, codeReponse, timerRep);
		this.resultatFinal = resultatFinal;
		this.commentaireFinal = commentaireFinal;
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
	
	
	

}
