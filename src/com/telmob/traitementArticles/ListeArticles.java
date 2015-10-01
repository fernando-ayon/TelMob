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

	public ArrayList<Article> getLesArticles() {
		return lesArticles;
	}

	public void setLesArticles(ArrayList<Article> lesArticles) {
		this.lesArticles = lesArticles;
	}

	public ListeArticles(ArrayList<Article> lesArticles) {
		super();
		this.lesArticles = lesArticles;
	}

	public ListeArticles() {
		lesArticles = new ArrayList<Article>();
	}
	
	public Article ajoutArticle(Article a) {
		lesArticles.add(a);
		return a;
	}
	
	public Article supprArticle(Article a) {
		if(lesArticles.contains(a)) {
			lesArticles.remove(a);
		}
		return a;
	}

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
	
	public void tousLesArticles_ParIntitule(boolean isCroissant) {
		
		if (isCroissant) {
			System.out.println("Affichage de la liste d'articles par intitule de maniere croissant");
			Collections.sort(lesArticles, Article.Comparators.INTITULE);
		} else {
			System.out.println("Affichage de la liste d'articles par intitule de maniere decroissant");
			Collections.sort(lesArticles, Collections.reverseOrder(Article.Comparators.INTITULE));		}
		
		this.affiche();
	}

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
	
	public void affiche() {
		for (Article a : lesArticles) {
			System.out.println("+---------------------------------------");
			System.out.println(a.toString());
			System.out.println("+---------------------------------------");
		}
	}
	
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
