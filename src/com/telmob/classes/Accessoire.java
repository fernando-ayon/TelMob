package com.telmob.classes;

import java.util.HashSet;

public abstract class Accessoire extends Article {
	private HashSet<String> modeleCompatible;

	public HashSet<String> getModeleCompatible() {
		return modeleCompatible;
	}

	public void setModeleCompatible(HashSet<String> modeleCompatible) {
		this.modeleCompatible = modeleCompatible;
	}
	
	public void ajoutModeleCompatible(String modele) {
		this.modeleCompatible.add(modele);
	}
	
	public Accessoire(int reference, String intitule, double prix,
			HashSet<String> modeleCompatible) {
		super(reference, intitule, prix);
		this.modeleCompatible = modeleCompatible;
	}

	@Override
	public String toString() {
		String modeles = "[";
		for (String i : modeleCompatible) {
			modeles += i + ",";
		}
		modeles += "]";
		return super.toString() + " Telephones compatibles : " + modeles;
	}
	
}