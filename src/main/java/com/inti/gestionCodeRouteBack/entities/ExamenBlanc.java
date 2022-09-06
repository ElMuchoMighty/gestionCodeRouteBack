package com.inti.gestionCodeRouteBack.entities;

import javax.persistence.Entity;

@Entity
public class ExamenBlanc extends Test{
	
	private int resultatBlanc;
	private String commentaireBlanc;
	
	
	
	public ExamenBlanc() {
		super();
	}






	public ExamenBlanc(Long idTest, byte[] image, String question, String reponse, int codeReponse, int timerRep,
			int resultatBlanc, String commentaire) {
		super(idTest, image, question, reponse, codeReponse, timerRep);
		this.resultatBlanc = resultatBlanc;
		this.commentaireBlanc = commentaireBlanc;
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





}
