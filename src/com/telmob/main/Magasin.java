package com.telmob.main;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

import com.telmob.classes.Accessoire;
import com.telmob.classes.Article;
import com.telmob.classes.Chargeur;
import com.telmob.classes.Coque;
import com.telmob.classes.Cordon;
import com.telmob.classes.Telephone;
import com.telmob.classes.Type;
import com.telmob.traitementArticles.ListeArticles;

public class Magasin {
	
	//
	public int ecrireInt(Scanner sc, int opc){
		while (sc.hasNext()) {
			if(sc.hasNextInt()) { 
				opc = sc.nextInt(); 
				break;
			} else {
				System.out.println("Veuillez introduire un entier");
				sc.next();
			}
		}
		return opc;
	}
	
	public void menu() {
		ListeArticles lesArticles = new ListeArticles();
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		
		do {			
			System.out.println("+========================================+");
			System.out.println("|           MENU PRINCIPAL               |");
			System.out.println("+----------------------------------------+");
			System.out.println("|  1. Ajouter un article a la liste      |");
			System.out.println("|  2. Supprimer un article de la liste   |");
			System.out.println("|::::Afficher les articles:::::::::::::::|");
			System.out.println("|      3. Par intitule                   |");
			System.out.println("|      4. Par prix                       |");
			System.out.println("|      5. Par reference                  |");
			System.out.println("|  6. Sauvegarder la liste dans un .txt  |");
			System.out.println("+----------------------------------------+");
			System.out.println("|             0. Quitter                 |");
			System.out.println("+========================================+");
			
			opc = ecrireInt(sc, opc);
			
			switch (opc) {
			case 1:
				do {
					System.out.println("");
					System.out.println("+----------------------------------------+");
					System.out.println("|  ** Ajouter un article a la liste **   |");
					System.out.println("+----------------------------------------+");
					System.out.println("|        1. Telephone                    |");
					System.out.println("|        2. Coque                        |");
					System.out.println("|        3. Chargeur                     |");
					System.out.println("|        4. Cordon                       |");
					System.out.println("|        5. Retourner                    |");
					System.out.println("+----------------------------------------+");
					opc = ecrireInt(sc, opc);
					Article article;
					
					int ref;
					String inti;
					double prix;
					
					switch (opc) {
					case 1:
						String ope, mod;
						System.out.println("TELEPHONE");
						System.out.print("Introduisez la reference de l'article : ");
						ref = sc.nextInt(); 
						System.out.print("Introduisez l'intitule de l'article : ");
						inti = sc.nextLine();
						inti = sc.nextLine();
						System.out.print("Introduisez le prix de l'article : ");
						prix = sc.nextDouble();
						System.out.print("Introduisez l'operateur de l'article : ");
						ope = sc.next();
						System.out.print("Introduisez le modele de l'article : ");
						mod = sc.next();
						
						article = new Telephone(ref,inti,prix,ope,mod);
						lesArticles.ajoutArticle(article);
						break;
						
					case 2:
						HashSet<String> modelesCoque = null;
						String couleur;
						int cont = 0;
						
						System.out.println("COQUE");
						System.out.print("Introduisez la reference de l'article : ");
						ref = sc.nextInt();
						System.out.print("Introduisez l'intitule de l'article : ");
						inti = sc.nextLine();
						inti = sc.nextLine();
						
						for (Article t : lesArticles.getLesArticles()) {
							if (t instanceof Telephone) {
								System.out.println("Modeles : " + ((Telephone) t).getModele());
							}
						}
						
						System.out.println("Combien de modeles sont compatibles avec l'article ?");
						cont = sc.nextInt();
						for (int i = 0; i < cont; i++) {
							modelesCoque = new HashSet<String>();
							System.out.print("Introduisez le(s) modele(s) compatible(s) de l'article : ");
							modelesCoque.add(sc.next());
						}
						
						System.out.print("Introduisez le prix de l'article : ");
						prix = sc.nextDouble();
						System.out.print("Introduisez le couleur de l'article : ");
						couleur = sc.next();
						
						article = new Coque(ref,inti,prix,modelesCoque,couleur);
						lesArticles.ajoutArticle(article);
						break;
						
					case 3:
						HashSet<String> modelesCharg = null;
						Type type;
						cont = 0;
						
						System.out.println("CHARGEUR");
						System.out.print("Introduisez la reference de l'article : ");
						ref = sc.nextInt();
						System.out.print("Introduisez l'intitule de l'article : ");
						inti = sc.nextLine();
						inti = sc.nextLine();
						
						for (Article t : lesArticles.getLesArticles()) {
							if (t instanceof Telephone) {
								System.out.println("Modeles : " + ((Telephone) t).getModele());
							}
						}
						
						System.out.println("Combien de modeles sont compatibles avec l'article ?");
						cont = sc.nextInt();
						for (int i = 0; i < cont; i++) {
							modelesCharg = new HashSet<String>();
							System.out.print("Introduisez le(s) modele(s) compatible(s) de l'article : ");
							modelesCharg.add(sc.next());	
						}
						
						System.out.print("Introduisez le prix de l'article : ");
						prix = sc.nextDouble();
						
						System.out.println("Introduisez le type de l'article : ");
						System.out.println("   - Appuyez 1 pour " + String.valueOf(Type.ALLUME_CIGARE));
						System.out.println("   - Appuyez 2 pour " + String.valueOf(Type.SECTEUR));
						System.out.println("   - Appuyez 3 pour " + String.valueOf(Type.USB));
						cont = sc.nextInt();
						type = (cont == 1) ? Type.ALLUME_CIGARE : (cont == 2) ? Type.SECTEUR : Type.USB;
						
						article = new Chargeur(ref,inti,prix,modelesCharg,type);
						lesArticles.ajoutArticle(article);
						
						break;
						
					case 4:
						HashSet<String> modelesCordon = null;
						int longueur;
						cont = 0;
						
						System.out.println("CORDON");
						System.out.print("Introduisez la reference de l'article : ");
						ref = sc.nextInt();
						System.out.print("Introduisez l'intitule de l'article : ");
						inti = sc.nextLine();
						inti = sc.nextLine();
						
						for (Article t : lesArticles.getLesArticles()) {
							if (t instanceof Telephone) {
								System.out.println("Modeles : " + ((Telephone) t).getModele());
							}
						}
						
						System.out.println("Combien de modeles sont compatibles avec l'article ?");
						cont = sc.nextInt();
						for (int i = 0; i < cont; i++) {
							modelesCordon = new HashSet<String>();
							System.out.print("Introduisez le(s) modele(s) compatible(s) de l'article : ");
							modelesCordon.add(sc.next());
						}
						
						System.out.print("Introduisez le prix de l'article : ");
						prix = sc.nextDouble();
						System.out.print("Introduisez la longueur de l'article : ");
						longueur = sc.nextInt();
						
						article = new Cordon(ref,inti,prix,modelesCordon,longueur);
						lesArticles.ajoutArticle(article);
						
						break;
						
					case 5:	break;
					
					default: System.err.println("Veuillez selectionner une option valide"); break;
					
					} // Switch ajout articles
				} while (opc != 5); // while ajout articles
				break;
				
			case 2:
				System.out.println("SUPPRIMER UN ARTICLE");

				int selection = 0;
				for (Article a : lesArticles.getLesArticles()) {
					System.out.println(a);
					System.out.println("------Index de l'article : " + selection + "------");
					selection++;
				}
				
				System.out.println("Introduisez l'index de l'article que vous voulez supprimer");
				selection = sc.nextInt(); 
				Article a = lesArticles.getLesArticles().get(selection);
				lesArticles.supprArticle(a);
				
				break;
				
			case 3:
				System.out.println("Voulez-vous afficher les articles de maniere croissant ?");
				System.out.println("1: Oui,"
						+ "\n 2: Decroissant");
				selection = sc.nextInt();
				
				if (selection == 1) {
					lesArticles.tousLesArticles_ParIntitule(true);	
				} else {
					lesArticles.tousLesArticles_ParIntitule(false);
				}
				
				break;
			case 4:
				System.out.println("Voulez-vous afficher les articles de maniere croissant ?");
				System.out.println("1: Oui,"
						+ "\n 2: Decroissant");
				selection = sc.nextInt();
				
				if (selection == 1) {
					lesArticles.tousLesArticles_ParPrix(true);	
				} else {
					lesArticles.tousLesArticles_ParPrix(false);
				}
				
				break;
			case 5:
				System.out.println("Voulez-vous afficher les articles de maniere croissant ?");
				System.out.println("1: Oui,"
						+ "\n 2: Decroissant");
				selection = sc.nextInt();
				
				if (selection == 1) {
					lesArticles.tousLesArticles_ParRef(true);	
				} else {
					lesArticles.tousLesArticles_ParRef(false);
				}
				
				break;
			case 6:
				System.out.println("En train de sauvegarder la liste...");
				
				try {
					ListeArticles.sauvegarde("src/com/telmob/txt/articles.txt", lesArticles);
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println("Liste gardee !");
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
		Magasin m = new Magasin();
		m.menu();

		
		//Premier testing ->
//		ListeArticles l = new ListeArticles();
//	
//		String tel = new String("Apple");
//		HashSet<String> modeles = new HashSet<String>();
//		modeles.add(tel);
//		Telephone t = new Telephone(123213, "iPhone 6", 323.50, "free", "6");
//		
//		Accessoire coque = new Coque(17256, 
//					"Aoque rose iPhone 4", 5.90,
//					modeles, " rose");
////		System.out.println(coque);
////
//		Accessoire cordon = new Cordon(45885, "Bordon bleue", 
//				6.2, modeles, 25);
////		System.out.println(cordon);
////		
//		Accessoire charg = new Chargeur(58514, "chargeur pour iPhones", 
//				5.2, modeles, Type.ALLUME_CIGARE);
////		System.out.println(charg);
////
//		l.ajoutArticle(t);
//		l.ajoutArticle(charg);
//		l.ajoutArticle(coque);
//		l.ajoutArticle(cordon);
//		l.tousLesArticles_ParIntitule(false);
//		
//		Article a = charg;
//		l.supprArticle(a);
//		
//		l.tousLesArticles_ParIntitule(false);
////		l.tousLesArticles_ParPrix(false);
////		l.tousLesArticles_ParRef(false);
//		
//		try {
//			ListeArticles.sauvegarde("src/com/telmob/txt/articles.txt", l);
//		} catch (IOException e) {
//			System.out.println("IOException declenchee");
//		}
		
	}

}