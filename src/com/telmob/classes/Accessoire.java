package com.telmob.classes;

import java.util.HashSet;

public abstract class Accessoire extends Article {
	private HashSet<Telephone> modeleCompatible;

	public HashSet<Telephone> getModeleCompatible() {
		return modeleCompatible;
	}

	public void setModeleCompatible(HashSet<Telephone> modeleCompatible) {
		this.modeleCompatible = modeleCompatible;
	}

	public Accessoire(int reference, String intitule, double prix,
			HashSet<Telephone> modeleCompatible) {
		super(reference, intitule, prix);
		this.modeleCompatible = modeleCompatible;
	}

	@Override
	public String toString() {
		String modeles = "";
		for (Telephone i : modeleCompatible) {
			modeles += i.getIntitule() + ", ";
		}
		return super.toString() + " Téléphones compatibles : " + modeles;
	}
	
}