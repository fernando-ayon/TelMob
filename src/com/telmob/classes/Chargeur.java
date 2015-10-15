package com.telmob.classes;

import java.util.HashSet;

public class Chargeur extends Accessoire {
	private Type type;

	/**
    Renvoie le type de chargeur
	    @return Le type d'un chargeur
	 */
	public Type getType() {
		return type;
	}

	/**
    Permet de modifier le type d'un article
	    @param Le nouveau type de l'article
	 */
	public void setType(Type type) {
		this.type = type;
	}

	public Chargeur(int reference, String intitule, double prix,
			HashSet<String> modeleCompatible, Type type) {
		super(reference, intitule, prix, modeleCompatible);
		this.type = type;
	}

	/**
    Permet de lister l
	    @return La reference de l'article
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " type : " + type;
	}
	
	
}
