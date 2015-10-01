package com.telmob.main;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

import com.telmob.classes.Accessoire;
import com.telmob.classes.Chargeur;
import com.telmob.classes.Coque;
import com.telmob.classes.Cordon;
import com.telmob.classes.Telephone;
import com.telmob.classes.Type;
import com.telmob.traitementArticles.ListeArticles;

public class Magasin {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		
		do {			
			System.out.println("+====================+");
			System.out.println("|   MENU PRINCIPAL");
			System.out.println("+--------------------+");
			System.out.println("| 1. Ajouter un article a la liste");
			System.out.println("| 2. Supprimer un article de la liste");
			System.out.println("|   Afficher les articles ");
			System.out.println("|     3. Par intitule");
			System.out.println("|     4. Par prix");
			System.out.println("|     5. Par reference");
			System.out.println("| 6. Sauvegarder la liste d'articles comme un fichier de texte");
			System.out.println("+--------------------+");
			System.out.println("|0. Quitter");
			System.out.println("+====================+");
			
			while (sc.hasNext()) {
				if(sc.hasNextInt()) { 
					opc = sc.nextInt(); 
					break;
				} else {
					System.out.println("Veuillez introduire un nombre");
					sc.next();
				}
			}
			
			switch (opc) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			case 6:
				System.out.println("6");
				break;
			case 0: 
				System.out.println("Au revoir !");
				sc.close();
				System.exit(-1);
			default: System.err.println("Veuillez selectionner une option valide.");
				break;
			}
			
		} while (opc  != 0);
	}
	
	public static void main(String[] args) {
//		Magasin m = new Magasin();
//		m.menu();
		
		ListeArticles l = new ListeArticles();
		
		String tel = new String("Apple");
		HashSet<String> modeles = new HashSet<String>();
		modeles.add(tel);
		Telephone t = new Telephone(123213, "iPhone 6", 323.50, "free", "6");
		
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
				5.2, modeles, Type.ALLUME_CIGARE);
//		System.out.println(charg);
//
		l.ajoutArticle(t);
		l.ajoutArticle(charg);
		l.ajoutArticle(coque);
		l.ajoutArticle(cordon);
		
		l.tousLesArticles_ParIntitule(false);
		l.tousLesArticles_ParPrix(false);
		l.tousLesArticles_ParRef(false);
		
		try {
			ListeArticles.sauvegarde("src/com/telmob/txt/articles.txt", l);
		} catch (IOException e) {
			System.out.println("IOException declenchee");
		}
		
	}

}