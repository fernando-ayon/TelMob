package com.telmob.traitementArticles;

import com.telmob.classes.Article;

public class CompareArticleParReference extends CompareArticleParIntitule{

	@Override
	public int compare(Article a1, Article a2) {
		return (a1.getReference() == a2.getReference()) ? 0 : (a1.getReference() > a2.getReference()) ? 1 : -1;
	}
	
}
