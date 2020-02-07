package tp1;

public class Client {
	//Attributs
	public String nom, prenom ; 
	
	//Constructeurs
	public Client(String n, String p){
		nom = n; 
		prenom = p;
	}
	//Accesseurs
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
}
