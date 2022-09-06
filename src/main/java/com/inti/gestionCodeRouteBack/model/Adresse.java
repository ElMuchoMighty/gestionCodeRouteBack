package com.inti.gestionCodeRouteBack.model;

public class Adresse {

	private String region;
	private String ville;
	private String adressePostale;
	private long codePostale;
	
	public Adresse() {
	}

	public Adresse(String region, String ville, String adressePostale, long codePostale) {
		this.region = region;
		this.ville = ville;
		this.adressePostale = adressePostale;
		this.codePostale = codePostale;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdressePostale() {
		return adressePostale;
	}

	public void setAdressePostale(String adressePostale) {
		this.adressePostale = adressePostale;
	}

	public long getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(long codePostale) {
		this.codePostale = codePostale;
	}
	
}
