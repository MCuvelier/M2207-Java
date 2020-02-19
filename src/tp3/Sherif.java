package tp3;

public class Sherif extends Cowboy {
	//Attributs
	private int nbBrigandsArretes;
	private String status;

	//Constructeurs
	public Sherif(String nom) {
		super(nom);
		status = "Sherif";
		nbBrigandsArretes = 0;
	}

	//Methodes

	//J'ajoute se presenter et quelEstTonNom afin de montrer que c'est un sherif et son "palmares"
	public void sePresenter() {
		super.sePresenter();
		if(nbBrigandsArretes <=1) {
			this.parler("J'ai deja arrete " + nbBrigandsArretes + " brigand, mouahaha ");	
		}else
			this.parler("J'ai deja arrete " + nbBrigandsArretes + " brigands, mouahaha "); //Ajout de la boucle for pour le s ou non , � brigand..
	}

	public String quelEstTonNom() {
		return " Le Sherif " + nom;
	}

	//Exercice 8.3
	public void coffrer(Brigand b) {
		b.emprisonner(this);
		nbBrigandsArretes = nbBrigandsArretes + 1;
		this.parler(b.quelEstTonNom() + ", Au nom de la loi, je vous arrete !!!");
	}
}