package tp4;

public class Combat {
	public static void main(String[] args) {

		//Declaration
		Pokemon pokemon1,pokemon2;
		
		//Instanciation
		pokemon1 = new Pokemon("Latas");
		pokemon2 = new Pokemon("Latos");

		pokemon1.sePresenter();
		pokemon2.sePresenter();
		int round = 0;
		
		//boucle qui compte les rounds et continue à s'attaquer tant que les deux pokemons sont envies
		while(pokemon1.getEnergie()>0 && pokemon2.getEnergie()>0){
			System.out.println("----------------------");
			pokemon1.attaquer(pokemon2);
			pokemon2.attaquer(pokemon1);
			round++;
			System.out.println("Round "+ round + " "+ pokemon1.getNom() +" : "+ pokemon1.getEnergie() +" || " + pokemon2.getNom() +" : " + pokemon2.getEnergie());
		}
		//condition d'égalite, de victoire et de défaite selon le nombre de point d'énergie restant
		if(pokemon1.getEnergie()==0 && pokemon2.getEnergie()==0) {
			System.out.println("egalite en " + round);
		} else if(pokemon2.getEnergie()==0 && pokemon1.getEnergie()>0) {
			System.out.println(pokemon1.getNom() + " gagne  en " + round + " round ");
		} else {
			System.out.println(pokemon2.getNom() + " gagne en " + round + " round ");
		}
	}
}