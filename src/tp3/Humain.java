package tp3;

public class Humain {

	//Attribruts
	//Exercice 1.1
	protected String nom, boissonpref;

	//Constructeurs

	//Exercice1.2
	public 	Humain(String nom) {
		this.nom=nom;
		boissonpref = "lait";
	}

	//Methodes

	//Exercice1.3
	public String quelEstTonNom() {
		return nom;
	}

	public String  quelleEstTaBoisson() {
		return boissonpref;
	}

		//exercice 1.4
	public void parler(String texte) {
		System.out.println("( " + nom + " ) " + " - " + texte);
	}

	//Exercice 1.5
	public void sePresenter() {
		this.parler("Bonjour, je suis " + this.quelEstTonNom() + " et ma boisson preferee est le " + this.quelleEstTaBoisson());
	}

	//Exercice 1.6
	public void boire() {
		this.parler("Ah ! un bon verre de " + this.quelleEstTaBoisson() + " ! GLOUPS ! ");
	}
}
