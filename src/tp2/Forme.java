package tp2;

public class Forme {
	//Attributs
	//Exercice1.1
	private String couleur;
	private boolean coloriage;
	
	//Constructeurs 
	//Exercice 1.2
	public Forme() {
		couleur = "orange";
		coloriage = true;
	}
	
	public Forme(String c, boolean r) {
		couleur = c; 
		coloriage = r;
	}
	
	//Accesseurs
	//exercice 1.3
	public String getCouleur() {
		return couleur;
	}
		
	public void setCouleur(String c ) {
			 couleur = c;
	}
	
	public boolean isColoriage() {
			return coloriage;
	}
		
	public void setColoriage(boolean b) {
			coloriage = b;
	}
	//Methodes
	
	//Exercice 1.6
	public String seDecrire() {
		return " Une Forme de couleur " + couleur + " et de coloriage " + coloriage;
	}
}