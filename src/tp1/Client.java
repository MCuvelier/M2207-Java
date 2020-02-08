package tp1;

public class Client {
	//Attributs
	public String nom, prenom;
	private Compte compteCourant;

	//Constructeurs
	public Client(String n, String p, Compte compte){
		nom = n; 
		prenom = p;
		this.compteCourant = compte;
	}
	
	//Accesseurs
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	//Methodes
	//Exercice3.3
		
	void afficherSolde() {
		System.out.println("Le solde client est " + this.compteCourant.getSolde() + "euro");
	}
}