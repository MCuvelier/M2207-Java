package tp4;
import java.util.Scanner;

public class CombatAvecJoueur {
	public static String nomPkm1, nomPkm2;
	public static Scanner sc = new Scanner(System.in);
	public static int round=0;
	public static int choix;

	public static void main(String[] args)
	{
		System.out.println("Saisir le nom du premier combattant : ");
		nomPkm1= sc.nextLine();
		Pokemon pkm1 = new Pokemon(nomPkm1);
		System.out.println("Saisir le nom du deuxième combattant : ");
		nomPkm2= sc.nextLine();
		Pokemon pkm2 = new Pokemon(nomPkm2);
		System.out.println("------------------------");
	//boucle qui compte les rounds et continue à s'attaquer tant que les deux pokemons sont envies
			while(pkm1.getEnergie()>0 && pkm2.getEnergie()>0){
				System.out.println("----------------------");
				pkm1.sePresenter();
				pkm2.sePresenter();
				
				System.out.println(nomPkm1+" : Manger(0) ou Attaquer (1)");
				choix = sc.nextInt();
				if(choix == 0) {
					pkm1.manger();
				} else if(choix == 1) {
				pkm1.attaquer(pkm2);
				} else {
					System.out.println("Choix inexistant");
				}
				System.out.println(nomPkm2+" : Manger(0) ou Attaquer (1)");
				choix = sc.nextInt();
				if(choix == 0) {
					pkm2.manger();
				} else if(choix == 1) {
				pkm2.attaquer(pkm1);
				} else {
					System.out.println("Choix inexistant");
				}
				round++;
				System.out.println("Round "+ round + " "+pkm1.getNom() +" : (en)"+ pkm1.getEnergie() +" (atk) " + pkm1.getPuissance() +" || " + pkm2.getNom() +" : (en)" + pkm2.getEnergie() + " (atk) " +pkm2.getPuissance());
			}
			//condition d'égalite, de victoire et de défaite selon le nombre de point d'énergie restant
			if(pkm1.getEnergie()==0 && pkm2.getEnergie()==0) {
				System.out.println("----------------------");
				System.out.println("egalite en " + round +" rounds");
			} else if(pkm2.getEnergie()==0 && pkm1.getEnergie()>0) {
				System.out.println("----------------------");
				System.out.println(pkm1.getNom() + " gagne  en " + round + " rounds ");
			} else {
				System.out.println("----------------------");
				System.out.println(pkm2.getNom() + " gagne en " + round + " rounds ");
			}
	}
	
}