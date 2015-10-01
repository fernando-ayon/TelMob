package com.telmob.classes;

import java.util.HashSet;

public class Cordon extends Accessoire {
	private int longueur;

	public int getLongeur() {
		return longueur;
	}

	public void setLongeur(int longeur) {
		this.longueur = longeur;
	}

	public Cordon(int reference, String intitule, double prix,
			HashSet<String> modeleCompatible, int longueur) {
		super(reference, intitule, prix, modeleCompatible);
		this.longueur = longueur;
	}

	@Override
	public String toString() {
		return super.toString() + " longueur : " + longueur;
	}

}