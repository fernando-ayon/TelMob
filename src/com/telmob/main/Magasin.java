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
		
		Article tel = new Telephone(15575, "iPhone 4", 35.50, "Free", "Apple");
		Article tel1 = new Telephone(15576, "iPhone 5", 38.50, "Orange", "Apple");
		HashSet<Telephone> modeles = new HashSet<Telephone>();
		modeles.add((Telephone) tel);
		modeles.add((Telephone) tel1);
		
		Accessoire coque = new Coque(17256, 
					"Coque rose iPhone 4", 12.90,
					modeles, " rose");
		System.out.println(coque);

		Accessoire cordon = new Cordon(45885, "Cordon bleue", 
				5.2, modeles, 25);
		System.out.println(cordon);
		
		Accessoire charg = new Chargeur(58514, "chargeur pour iPhones", 
				35.2, modeles, "normal");
		System.out.println(charg);
		
		
	}

}
