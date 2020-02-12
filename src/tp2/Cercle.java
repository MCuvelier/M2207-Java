package tp2;

public class Cercle extends Forme {
	//Attributs
	//Exercice 2.1
	private double rayon;

	//Constructeurs
	//Exercice 2.2
	public Cercle() {
		super();
		rayon = 1.0;
	}

	//Exercice 2.6
	public Cercle(double r) {
		super();
		rayon = r;
	}
	
	//Exercice 2.9
 	public Cercle(double r,String couleur, boolean coloriage){
 		super(couleur,coloriage);
 		rayon = r; 		 
 	}
 	
	//Accesseurs
	//Exercice 2.4
	public void setRayon(double r) {
		rayon = r;
	}

	public double getRayon() {
		return rayon;
	}
	
	//Methodes 
	//Exercice 2.5
	public String seDecrire() {
		return " Un Cercle de rayon " + rayon + " cm " + super.seDecrire();
	}
	
	//Exercice 2.11
	public double calculerAire() {
		return Math.PI *rayon *rayon;
	}
	
	public double calculerPerimetre() {
		return 2*rayon*Math.PI;
	}
}