package tp1;

public class Compte {
	//Attributs
		private int numero ;
		private double solde, decouvert;
			
		//Constructeurs
		 public Compte(int numero) {
			 this.numero = numero;
			 solde = 0; 
			 decouvert = 0;
		 }
		
		//Accesseurs
		 
		 //Exercice 2.2
		 public void setDecouvert(double montant) {
			 decouvert = montant; 
			 
		 }
		 
		 public double getDecouvert() {
			 return decouvert;
			 
		 }
		 
		 public int getNumero() {
			 return numero;
			 
		 }
		 
		 public double getSolde() {
			 return solde;
			 
		 }
		
		//Methodes 
		 //Exercice 2.2
		public void afficherSolde() {
			 System.out.println("Le solde est de " + getSolde() + "euro");
		 }
		 
		 //Exercice 2.4
		 public void depot(double montant) {
			 solde = montant+solde ;
		 }
		 //Exercice 2.5
		 String retrait(double montant) {
			 if((solde+decouvert) < montant) {
				 return "Retrait refuse." ;
			 }else {
				 solde= solde-montant ;
				 return "Retrait effectue.";
			 }
		 }
}
