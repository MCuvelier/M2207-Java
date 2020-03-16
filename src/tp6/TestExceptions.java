package tp6;

public class TestExceptions {
	public static void main(String[] args) {
		int x = 2, y = 0;
		try {
			System.out.println("x/y = " + x/y);
			System.out.println("y/x = " + y/x);
			System.out.println("Commande de fermeture du programme");
		}
		catch (Exception e) {
			System.out.println("Une exception a ete capturee");
		}
		System.out.println("Fin du programme");
	}

}
/* Exercice 1.3 Le programme s'execute correctement jusqu'a la premiere exception dans le bloc try
le reste des instructions dans le bloc try semble etre ignorees et non executees*/
