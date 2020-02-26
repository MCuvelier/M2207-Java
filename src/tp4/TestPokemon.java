package tp4;

public class TestPokemon {
	public static void main(String[] args) {

		//Declaration
		Pokemon pokemon1, pokemon2, pokemon3;


		//Instanciation
		pokemon1 = new Pokemon("Maraboutage");

		//test exercice 1.4
		pokemon1.sePresenter();
		
		//test exercice 1.5
		pokemon1.manger();
		pokemon1.sePresenter();
	
		//test exercice 1.6
		pokemon1.vivre();
		pokemon1.sePresenter();
		
		//test exercice 1.7
		pokemon1.isAlive();
		pokemon1.sePresenter();
		
		//test exercice 1.8
		System.out.println("");
		System.out.println("--Test exercice 1.8 sur un nouveau pokemon (pokemon2)--");
		pokemon2 = new Pokemon("Zaworldo");
		pokemon2.sePresenter();
		pokemon2.compterCycles();
		
		//test exercice 2.2
		System.out.println("");
		System.out.println("-Test exercice 2.2 sur un nouveau pokemon ( pokemon3)- ");
		pokemon3 = new Pokemon("Giratin");
		pokemon3.sePresenter();
		pokemon3.perdreEnergie(3);
		

		
		//test exercice 2.3
		System.out.println("");
		pokemon1.sePresenter();
		pokemon3.attaquer(pokemon1); 
		pokemon1.sePresenter();
	}
}
