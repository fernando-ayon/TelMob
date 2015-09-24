package com.telmob.classes;

import java.util.HashSet;

public class Chargeur extends Accessoire {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Chargeur(int reference, String intitule, double prix,
			HashSet<String> modeleCompatible, String type) {
		super(reference, intitule, prix, modeleCompatible);
		this.type = type;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " type : " + type;
	}
	
	
}
