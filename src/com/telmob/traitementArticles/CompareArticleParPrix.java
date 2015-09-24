package com.telmob.traitementArticles;

import com.telmob.classes.Article;

public class CompareArticleParPrix extends CompareArticleParIntitule {
	
	@Override
	public int compare(Article a1, Article a2) {
		return (a1.getPrix() == a2.getPrix()) ? 0 : (a1.getPrix() > a2.getPrix()) ? 1 : -1;
	}
	
}