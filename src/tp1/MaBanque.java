package tp1;

public class MaBanque {
	public static void main(String[] args) {
		
		//Declaration
		Compte compte1;
		//Exercice 2.6
		Compte c2;
		
		//Instanciation
		
			//Exercice2.3, afficher la situation du compte
		compte1 = new Compte(1) ;
		System.out.println("Le decouvert est de " + compte1.getDecouvert() + "euro") ;
		compte1.setDecouvert(100) ;
		System.out.println("Le nouveau decouvert est de " + compte1.getDecouvert() + "euro");
		System.out.println("Le solde est de " + compte1.getSolde() + "euro");

	}
}