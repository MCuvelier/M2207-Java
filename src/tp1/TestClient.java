package tp1;

public class TestClient {
	public static void main(String[] args) {
		
		//Declaration
		Client client = new Client("Cuvelier","Mathias");
		
		//Exercice 1.4
		System.out.println("Le nom est " + client.getNom());
		System.out.println("Le prenom est " + client.getPrenom());
	}
}