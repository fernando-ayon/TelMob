package com.telmob.classes;

import java.util.HashSet;

public class Accessoire extends Article {
	private HashSet<Telephone> modeleCompatible;

	public HashSet<Telephone> getModeleCompatible() {
		return modeleCompatible;
	}

	public void setModeleCompatible(HashSet<Telephone> modeleCompatible) {
		this.modeleCompatible = modeleCompatible;
	}

	public Accessoire(HashSet<Telephone> modeleCompatible) {
		super();
		this.modeleCompatible = modeleCompatible;
	}

	//ici
	public Accessoire() {
		super();
	}
	
	
	
}
