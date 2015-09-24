package com.telmob.classes;

public abstract class Article {
	private int reference;
	private String intitule;
	private double prix;
	
	public Article(int reference, String intitule, double prix) {
		super();
		this.reference = reference;
		this.intitule = intitule;
		this.prix = prix;
	}

	public int getReference() {
		return reference;
	}
	
	public void setReference(int reference) {
		this.reference = reference;
	}
	
	public String getIntitule() {
		return intitule;
	}
	
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "référence : " + reference + "; intitulé : " + intitule
				+ " ; \n prix : " + prix + " euros ; ";
	}
	
}
