package com.telmob.traitementArticles;

import java.util.Comparator;
import com.telmob.classes.Article;

public class CompareArticleParIntitule implements Comparator<Article>{

	@Override
	public int compare(Article a1, Article a2) {
		return a1.getIntitule().compareToIgnoreCase(a2.getIntitule());
	}
	
}
