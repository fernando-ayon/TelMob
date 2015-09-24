package com.telmob.traitementArticles;

import java.util.ArrayList;

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
	
	
	
}
