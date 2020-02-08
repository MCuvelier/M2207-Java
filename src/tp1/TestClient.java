package tp1;

public class TestClient {
	public static void main(String[] args) {
		
		//Declaration
		Client client ;
		Compte compte1 ;
		Compte c4 ;
		ClientMultiComptes Mathias ;
		
		//Exercice3
		compte1 = new Compte(1);
		client = new Client("Cuvelier","Mathias", compte1);
		
		//Exercice 1.4
		System.out.println("Le nom est " + client.getNom());
		System.out.println("Le prenom est " + client.getPrenom());
		//Exercice 3.3
		System.out.println("Compte numero " + compte1.getNumero());
		c4 = new Compte(4);
		Mathias = new ClientMultiComptes("Cuvelier", "Mathias", c4) ;
		c4.depot(205);
		compte1.depot(1);
		Mathias.ajouterCompte(compte1); 
			//V�rif exo 4.2
		System.out.println(Mathias.tabcomptes[1].getSolde());  
		System.out.println(Mathias.tabcomptes[2]);
			//Exo4.3
		System.out.println(Mathias.getSolde());
		
			//Exo 4.5
		Mathias.afficherEtatClient();
	}
}