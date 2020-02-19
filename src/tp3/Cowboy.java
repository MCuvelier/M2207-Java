package tp3;

public class Cowboy extends Humain {
	//Attributs
	private int popularite;
	private String caracteristique;

	//Constructeurs
	public Cowboy(String nom) {
		super(nom);
		boissonpref = "Whiskey"; 
		popularite = 0;
		caracteristique = "vaillant";
	}
	//Methodes

	//Exercice 7.3
	public void tire(Brigand brigand) {
		System.out.println("Le " + caracteristique + " " +  this.nom + " tire sur " + brigand.quelEstTonNom() + " PAN ! ");
		this.parler("Prend ça, voyou ! ");
	}

	//Exercice 7.4
	public void libere(Dame dame) {
		dame.estLiberee();
		popularite +=10;
	}
}