package com.telmob.classes;

import java.util.HashSet;

public class Chargeur extends Accessoire {
	private Type type;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Chargeur(int reference, String intitule, double prix,
			HashSet<String> modeleCompatible, Type type) {
		super(reference, intitule, prix, modeleCompatible);
		this.type = type;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " type : " + type;
	}
	
	
}
