package com.telmob.classes;

import java.util.Comparator;

public abstract class Article implements Comparable<Article>{
	private int reference;
	private String intitule;
	private double prix;
	
	public Article(int reference, String intitule, double prix) {
		super();
		this.reference = reference;
		this.intitule = intitule;
		this.prix = prix;
	}

	public int getReference() {
		return reference;
	}
	
	public void setReference(int reference) {
		this.reference = reference;
	}
	
	public String getIntitule() {
		return intitule;
	}
	
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "\r\n\r\n reference : " + reference + "; \r\n intitule : " + intitule
				+ " ; \r\n prix : " + prix + " euros ; \r\n";
	}
	
	@Override
	public boolean equals(Object o) {
		if ( o instanceof Article ) {
			Article a = (Article)o;
			if ((this.reference == a.reference) && 
					this.intitule.equalsIgnoreCase(a.intitule))
				return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Article a) {
		return Comparators.INTITULE.compare(this, a);
	}
	
	public static class Comparators {
		public static Comparator<Article> INTITULE = new Comparator<Article>() {
            @Override
            public int compare(Article a1, Article a2) {
                return a1.intitule.compareTo(a2.intitule);
            }
        };
        public static Comparator<Article> PRIX = new Comparator<Article>() {
            @Override
            public int compare(Article a1, Article a2) {
                return (a1.prix > a2.prix) ? 1 : (a1.prix < a2.prix) ? -1 : 0;
            }
        };
        public static Comparator<Article> REFERENCE = new Comparator<Article>() {
            @Override
            public int compare(Article a1, Article a2) {
                return a1.reference - a2.reference;
            }
        };
	}
	
}
