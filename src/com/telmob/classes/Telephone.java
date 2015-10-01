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
	
	@Override
	public String toString() {
		return super.toString() + " modele : " + modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Telephone(int reference, String intitule, double prix,
			String operateur, String modele) {
		super(reference, intitule, prix);
		this.operateur = operateur;
		this.modele = modele;
	}
	
}