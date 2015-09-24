package com.telmob.traitementArticles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		Comparator<Article> c;
		
		if (isCroissant) {
			System.out.println("Affichage de la liste d'articles par référence de manière croissant");
			Collections.sort(lesArticles, Article.Comparators.REFERENCE);
		} else {
			System.out.println("Affichage de la liste d'articles par référence de manière décroissant");
			Collections.sort(lesArticles, Article.Comparators.REFERENCE);
		}
		
		this.affiche();
	}
	
	public void tousLesArticles_ParIntitule(boolean isCroissant) {
		Comparator<Article> c;
		
		if (isCroissant) {
			System.out.println("Affichage de la liste d'articles par intitulé de manière croissant");
			c = new CompareArticleParIntitule();
		} else {
			System.out.println("Affichage de la liste d'articles par intitulé de manière décroissant");
			c = Collections.reverseOrder(new CompareArticleParIntitule());
		}
		
		this.affiche();
	}

	public void tousLesArticles_ParPrix(boolean isCroissant) {
		Comparator<Article> c;
		
		if (isCroissant) {
			System.out.println("Affichage de la liste d'articles par prix de manière croissant");
			c = new CompareArticleParPrix();
		} else {
			System.out.println("Affichage de la liste d'articles par prix de manière décroissant");
			c = Collections.reverseOrder(new CompareArticleParPrix());
		}
		
		this.affiche();
	}
	
	public void affiche() {
		for (Article a : lesArticles) {
			System.out.println("+---------------------------------------");
			System.out.println("|");
			System.out.println("| Intitulé : " + a.getIntitule());
			System.out.println("| Référence : " + a.getReference());
			System.out.println("| Prix : " + a.getPrix());
			System.out.println("|");
			System.out.println("+---------------------------------------");
		}
	}
}
