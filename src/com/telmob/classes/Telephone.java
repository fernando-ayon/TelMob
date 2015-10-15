package com.telmob.classes;

public class Telephone extends Article {
	private String operateur;
	private String modele;
	
	/**
	 * Retourne l'opérateur du telephone
	 * @return operateur
	 */
	public String getOperateur() {
		return operateur;
	}
	
	/**
	 * Defini l'operateur d'un telephone
	 * @param operateur
	 */
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	
	/**
	 * Retourne le modele du telephone
	 * @return
	 */
	public String getModele() {
		return modele;
	}
	
	@Override
	public String toString() {
		return super.toString() + " modele : " + modele;
	}

	/**
	 * Defini le modèle du telephone
	 * @param modele
	 */
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