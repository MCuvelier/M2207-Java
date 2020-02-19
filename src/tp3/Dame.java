package tp3;

public class Dame extends Humain {
	//Attributs

	//Exercice 2.1
	private boolean libre;

	//exercice2.2

	//Constructeurs
	public Dame(String nom) {
		super(nom);
		boissonpref = "Martini" ;
		libre = true;
	}

	//Methodes

	//Exercice 2.3
	public void priseEnOtage() {
		libre = false;
		this.parler("AU SECOURS ! ");
	}

	public void estLiberee() {
		libre = true;
		this.parler("MERCI COWBOYYY !  ");
	}

	//Exercice 5.1 redefinition des methodes
	public String quelEstTonNom() {
		return "Miss " + nom;
	}

	//Exercice 6.2
	public void sePresenter() {
		super.sePresenter();
		if(libre==true) {
			this.parler("Actuellement, je suis libre");
		}else
			this.parler("Actuellement, je suis kidnappee");
	}
}