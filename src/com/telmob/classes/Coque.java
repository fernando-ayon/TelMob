package com.telmob.classes;

import java.util.HashSet;

public class Coque extends Accessoire {
	private String couleur;

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Coque(int reference, String intitule, double prix,
			HashSet<Telephone> modeleCompatible, String couleur) {
		super(reference, intitule, prix, modeleCompatible);
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return super.toString() + " couleur : " + couleur;
	}
	
}