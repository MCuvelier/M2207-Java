package tp3;

public class Cachot {
	//Attributs
	private String nom;
	private Humain[] tab;
	private int nbPersonnes = 0;

	//Constructeurs
	public Cachot(){
		nom = "La chambre";
		tab = new Humain[10]; 
	}

	//Methodes 

	public void mettreEnCellule(Humain h) {
		tab[nbPersonnes]=h;
		System.out.println(h.quelEstTonNom() + " est mis dans " + nom + ", numero " + nbPersonnes );
		nbPersonnes++;  //ajoute 1
	}

	public void sortirDeCellule(Humain h) {
		tab[nbPersonnes]=null;
		nbPersonnes--; //Retire 1
		System.out.println(h.quelEstTonNom() +" est sorti de sa cellulle");
	}

	public void compterLesPersonnes() {
		System.out.println(" Il y a " + nbPersonnes + " personnes dans " + nom);
	}
}