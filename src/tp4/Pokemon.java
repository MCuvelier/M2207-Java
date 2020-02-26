package tp4;

public class Pokemon {
	
	// Attributs
	//Exercice 1.1 
	private int energie, maxEnergie;
	private String nom;
	private static int nbCycles;
	
	//Accesseurs
	//Exercice 1.1
	public String getNom() {
		return nom;
	}

	public int getEnergie() {
		return energie;
	}
	//Constructeur
	//Exercice 1.2
	//Construteurs
	public Pokemon(String nom) {
		this.nom=nom;
		maxEnergie = 50 + (int)(Math.random() *((90-50) + 1)); 	//nb aleatoire entre 50 et 90
		energie = 30 + (int)(Math.random() *((maxEnergie - 30) + 1)); //aleatoire entre 30 et maxEnergie
	}
	
	//Methodes
	//Exercice 1.3
	public void sePresenter() {
		System.out.println("Bonjour, je suis " + this.getNom() + ", j'ai " + this.getEnergie() + " points d'energie " +"("+ maxEnergie + " max"+")");
	}
	
	//Exercice 1.5
	public void manger() {
		energie = energie + (10 + (int)(Math.random() *((30 - 10) + 1)));
		if (energie>maxEnergie) { //boucle if pour traiter le cas ou son energie depasse son energie max
			energie = maxEnergie;	
		}
	}
	//Exercice 1.6
	public void vivre() {
		energie = energie - (20 + (int)(Math.random() *((40 - 20) + 1)));
		if (energie<0) { 	//boucle if pour ne pas avoir d'energie negative
			energie = 0;
		}
	}
	//Exercice 1.7
	public boolean isAlive() {
		if(energie>0) {
			return true;
		}else {
			return false;
		}
	}
	//Exercice 1.8
	public void compterCycles() {
		while(energie>0) {
			this.manger();
			this.vivre();
			nbCycles++;
		}
		System.out.println(this.getNom() + " a vecu "+nbCycles+" cycles");
	}
}
