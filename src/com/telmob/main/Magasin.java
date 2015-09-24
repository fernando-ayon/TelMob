package com.telmob.main;

import java.util.HashSet;

import com.telmob.classes.Accessoire;
import com.telmob.classes.Article;
import com.telmob.classes.Chargeur;
import com.telmob.classes.Coque;
import com.telmob.classes.Cordon;
import com.telmob.classes.Telephone;
import com.telmob.traitementArticles.ListeArticles;

public class Magasin {
	
	public void menu() {
		
	}
	
	public static void main(String[] args) {
		ListeArticles l = new ListeArticles();
		
		String tel = new String("Apple");
		HashSet<String> modeles = new HashSet<String>();
		modeles.add(tel);
		
		Accessoire coque = new Coque(17256, 
					"Aoque rose iPhone 4", 5.90,
					modeles, " rose");
//		System.out.println(coque);
//
		Accessoire cordon = new Cordon(45885, "Bordon bleue", 
				6.2, modeles, 25);
//		System.out.println(cordon);
//		
		Accessoire charg = new Chargeur(58514, "chargeur pour iPhones", 
				5.2, modeles, "normal");
//		System.out.println(charg);
//
		l.ajoutArticle(charg);
		l.ajoutArticle(coque);
		l.ajoutArticle(cordon);
		
		l.tousLesArticles_ParIntitule(false);
		l.tousLesArticles_ParPrix(true);
		l.tousLesArticles_ParRef(false);
		
	}

}
