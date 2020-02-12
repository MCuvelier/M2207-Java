package tp2;

public class Cylindre extends Cercle {
	
	//Attributs
	//exercice3.1
	private double hauteur;
		
	//Constructeurs
	//Exercice3.1
	public Cylindre() {
		super();
		hauteur = 1.0;
	}
	
	//exercice 3.3
	public Cylindre(double hauteur,double r, String couleur, boolean coloriage){
		super(r,couleur,coloriage);
		this.hauteur = hauteur; 
	}
	
	//Accesseurs
	//Exercice 3.1
	public void setHauteur(double h) {
		hauteur = h;
	}
		
	public double getHauteur() {
		return hauteur;
	}
	
	//Methodes
	//exercice 3.1
	public String seDecrire() {
		return " Un Cylindre de hauteur  " + hauteur + " cm " + super.seDecrire() ;
	}
	//Exercice 3.5
	public double calculerVolume() {
		return Math.PI * getRayon() * getRayon() * hauteur;
	}
}