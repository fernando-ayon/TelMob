package com.telmob.classes;

public class Telephone extends Article {
	private String operateur;
	private String modele;
	
	public String getOperateur() {
		return operateur;
	}
	
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	
	public String getModele() {
		return modele;
	}
	
	public void setModele(String modele) {
		this.modele = modele;
	}

	public Telephone() {
		super();
		this.modele = "Aucun";
		this.operateur = "Aucun"; 
	}

	public Telephone(String operateur, String modele) {
		super();
		this.operateur = operateur;
		this.modele = modele;
	}
	
}
