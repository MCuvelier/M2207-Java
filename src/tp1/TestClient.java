package tp1;

public class TestClient {
	public static void main(String[] args) {
		
		//Declaration
		Client client ;
		Compte compte1 ;
		
		//Exercice3
		compte1 = new Compte(1);
		client = new Client("Cuvelier","Mathias", compte1);
		
		//Exercice 1.4
		System.out.println("Le nom est " + client.getNom());
		System.out.println("Le prenom est " + client.getPrenom());
		//Exercice 3.3
		System.out.println("Compte numero " + compte1.getNumero());
	}
}