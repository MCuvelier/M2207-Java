package tp1;

public class MaBanque {
	public static void main(String[] args) {
		
		//Declaration
		Compte compte1;
		//Exercice 2.6
		Compte c2;
		//Exercice 3.4
		Client client1;
		//Exercice 4.1
		ClientMultiComptes client;
		//Exercice 4.4
		Compte compte10, compte20;
		ClientMultiComptes clientmulti;
		
		//Instanciation
		
		//Exercice2.3, afficher la situation du compte
		compte1 = new Compte(1) ;
		System.out.println("Le decouvert est de " + compte1.getDecouvert() + "euro") ;
		compte1.setDecouvert(100) ;
		System.out.println("Le nouveau decouvert est de " + compte1.getDecouvert() + "euro");
		System.out.println("Le solde est de " + compte1.getSolde() + "euro");
		//Exercice 2.4, effectuer un depot 
		compte1.depot(200);
		System.out.println("Le nouveau solde apres le depot est de " + compte1.getSolde() + "euro");
		
		//Exercice 2.5, effectuer un retrait
		System.out.println(compte1.retrait(300));
		compte1.afficherSolde();
		
		//Exerice 2.6, cycle complet
		c2 = new Compte(2) ;
		c2.depot(1000) ;
		c2.afficherSolde();
		c2.retrait(600); 
		c2.afficherSolde();
		System.out.println(c2.retrait(700));
		c2.setDecouvert(500); 
		System.out.println(c2.retrait(700));
		c2.afficherSolde();
		
		//Exercice 3.4
		client1 = new Client("Sarah","Croche" ,c2);
		client1.afficherSolde();
		
		//Exercice4.1 "tester"
		client = new ClientMultiComptes("Sarah", "Bada", c2);
		System.out.println(client.tabcomptes[0].getSolde());
		
		//Exercice 4.4
		compte10 = new Compte(10);
		compte10.depot(1000);
		clientmulti = new ClientMultiComptes("Cuvelier", "Mathias", compte10);
		System.out.println("Le solde du client est de " + clientmulti.getSolde() + "euro");
		compte20 = new Compte(20);
		compte20.depot(2500);
		clientmulti.ajouterCompte(compte20);
		System.out.println("Le solde du client est de " + clientmulti.getSolde() + "euro");
	}
}