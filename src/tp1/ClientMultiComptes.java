package tp1;

public class ClientMultiComptes {
		//Attributs
		//Exercice4.1
		public String nom, prenom;
		public int nbComptes = 0;
		public Compte tabcomptes[] = new Compte[10]; 
		
		//Constructeurs
		
		//Exercice 4.1
		public ClientMultiComptes (String nom, String prenom, Compte compte) {
			this.nom = nom;
			this.prenom = prenom;
			this.tabcomptes[0] = compte; 
		}
		//Methodes
	
		//exercice4.2
		public void ajouterCompte(Compte c) {
			while((this.tabcomptes[nbComptes]!=null) && (nbComptes<10) ) {
				nbComptes += 1;
			}
			this.tabcomptes[nbComptes] = c;
		}
		
		//exercice 4.3
		public double getSolde() {
			double somme =0;
				for(int i=0 ; i <= nbComptes; i++) {
					somme += this.tabcomptes[i].getSolde();	
			}
			return somme;
		}
		
		//Exo4.5
		public void afficherEtatClient() {
			System.out.println("Client : " +nom + " " +prenom);
			for(int i=0 ; i <= nbComptes; i++) {
				System.out.println("Compte : " + this.tabcomptes[i].getNumero() + " Solde : " + this.tabcomptes[i].getSolde());	
			}
			System.out.println("Solde client : " + getSolde());
		}		
}