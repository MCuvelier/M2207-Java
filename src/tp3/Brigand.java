package tp3;

public class Brigand extends Humain {

	//Attributs
	private String look;
	private int nbDamesCapturees, recompense;
	private boolean prison;

	//Constructeurs

	//exercice 3.2
	public Brigand(String nom) {
		super(nom);
		look = "mechant";
		prison = false;
		recompense = 100;
		nbDamesCapturees = 0; 
		boissonpref = "Cognac";
	}

	//Methodes

	//exercice 3.3
	public int getRecompense() {
		return recompense;
	}
	
	//Exercice 5.2 redefinition de methode
	public String quelEstTonNom() {
		return nom + " le " + look;
	}
	
	//Exercice 6.1 
	public void sePresenter() {
		super.sePresenter();
		this.parler("J'ai l'air " + look + " et j'ai enleve " + nbDamesCapturees + " dames");
		this.parler("Ma tete est mise à prix, à  " + recompense + " $!!!!");
	}
	//Exercice 7.1 LE KIDNAPPING
	public void enleve(Dame dame) {
		nbDamesCapturees = nbDamesCapturees + 1;
		recompense = recompense + 100;
		this.parler("Ah ah ! " + dame.quelEstTonNom() + ", tu es ma prisonniere ! ");
		dame.priseEnOtage();
	}
	//Exercice 8.2
	public void emprisonner(Sherif s) {
		this.parler("Damned, je suis fait ! " + s.quelEstTonNom() + ", tu m'as eu !");
	}
}