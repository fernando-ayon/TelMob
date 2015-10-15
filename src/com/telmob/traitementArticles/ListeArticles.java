package com.telmob.traitementArticles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import com.telmob.classes.Article;

public class ListeArticles {
	private ArrayList<Article> lesArticles;

	/**
	 * Retourne le tableau des articles
	 * @return ArrayList
	 */
	public ArrayList<Article> getLesArticles() {
		return lesArticles;
	}

	/**
	 * Redefini le tableau des articles
	 * @param lesArticles
	 */
	public void setLesArticles(ArrayList<Article> lesArticles) {
		this.lesArticles = lesArticles;
	}

	/**
	 * Constructeur
	 * @param lesArticles
	 */
	public ListeArticles(ArrayList<Article> lesArticles) {
		super();
		this.lesArticles = lesArticles;
	}

	public ListeArticles() {
		lesArticles = new ArrayList<Article>();
	}
	
	/**
	 * Verifie si un article est dans la liste
	 * @param a Article
	 * @return boolean
	 */
	public boolean estDansLaListe(Article a) {
		if (lesArticles.contains(a)) {
			return true;
		} 
		return false;
	}
	
	/**
	 * Ajout d'un article dans le tableau
	 * @param a Article
	 * @return 
	 */
	public Article ajoutArticle(Article a) {
		if (estDansLaListe(a)) {
			System.out.println("L'article existe deja");
		} else {
			lesArticles.add(a);
			System.out.println("Article ajoute");
		}
		return a;
	}
	
	/**
	 * Suppression d'un article dans le tableau
	 * @param a Article
	 * @return
	 */
	public Article supprArticle(Article a) {
		if(estDansLaListe(a)) {
			lesArticles.remove(a);
			System.out.println("Article supprime");
		} else {
			System.out.println("L'article recherche n'est pas dans la liste");
		}
		return a;
	}

	/**
	 * Tri des article par leur référence
	 * @param isCroissant boolean 
	 */
	public void tousLesArticles_ParRef(boolean isCroissant) {
		
		if (isCroissant) {
			System.out.println("Affichage de la liste d'articles par reference de maniere croissant");
			Collections.sort(lesArticles, Article.Comparators.REFERENCE);
		} else {
			System.out.println("Affichage de la liste d'articles par reference de maniere decroissant");
			Collections.sort(lesArticles, Collections.reverseOrder(Article.Comparators.REFERENCE));
		}
		
		this.affiche();
	}
	
	/**
	 * Tri des article par leur intitulé
	 * @param isCroissant
	 */
	public void tousLesArticles_ParIntitule(boolean isCroissant) {
		
		if (isCroissant) {
			System.out.println("Affichage de la liste d'articles par intitule de maniere croissant");
			Collections.sort(lesArticles, Article.Comparators.INTITULE);
		} else {
			System.out.println("Affichage de la liste d'articles par intitule de maniere decroissant");
			Collections.sort(lesArticles, Collections.reverseOrder(Article.Comparators.INTITULE));		}
		
		this.affiche();
	}

	/**
	 * Tri des articles par leur prix
	 * @param isCroissant
	 */
	public void tousLesArticles_ParPrix(boolean isCroissant) {
		
		if (isCroissant) {
			System.out.println("Affichage de la liste d'articles par prix de maniere croissant");
			Collections.sort(lesArticles, Article.Comparators.PRIX);
		} else {
			System.out.println("Affichage de la liste d'articles par prix de maniere decroissant");
			Collections.sort(lesArticles, Collections.reverseOrder(Article.Comparators.PRIX));		
		}
		
		this.affiche();
	}
	
	/**
	 * Affichage de l'ensemble des articles
	 */
	public void affiche() {
		for (Article a : lesArticles) {
			System.out.println("+---------------------------------------");
			System.out.println(a.toString());
			System.out.println("+---------------------------------------");
		}
	}
	
	/**
	 * Sauvegarde du tableau des articles dans un fichier texte
	 * @param fileDest String Fichier de destination
	 * @param liste ListeArticles le tableau des articles à enregistrer
	 * @throws IOException
	 */
	public static void sauvegarde(String fileDest, ListeArticles liste) throws IOException {
		File file = new File(fileDest);
		
		// si le fichier n'existe pas, creer un nouveau fichier
		if (!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		// obtenir chaque article de la liste et ecrire dans le fichier
		for (Article a : liste.getLesArticles()) {
			bw.write(a.toString());
		}
		
		bw.close();
	}
}
