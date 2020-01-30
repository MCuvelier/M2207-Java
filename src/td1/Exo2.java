package td1;

public class Exo2 {
	public static void main(String[] arg) {
        int i;
        int somme;
        double moyenne;
        
        somme = 0;
        i = 1;
        while (i <= 100) { 
	    somme = somme + i;
	    i = i + 1;
        }
        moyenne= somme/101;
        System.out.println("Voila la somme des 100 premiers entiers : " + somme+" et la moyenne est "+moyenne);
    }
}
