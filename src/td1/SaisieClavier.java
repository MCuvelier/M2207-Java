package td1;
import java.util.Scanner;

public class SaisieClavier() {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Saisissez un entier: ");
	int N = sc.nextInt();
	sc.nextLine();
	
	System.out.print("Saisissez un réel : ");
	double f = sc.nextDouble();
	sc.nextLine();
	
	System.out.println("Saisissez une chaine de caractère pour le prénom : ");
	String str = sc.nextLine();
	System.out.println("Bonjour"+str+"La somme de"+i"et "+f" est :"+ (i+f));

}
