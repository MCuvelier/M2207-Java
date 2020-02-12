package tp2;

public class TestForme {
	public static void main(String[] args) {	
		//Declaration
		//Exercice 1.4
		Forme f1,f2;
		
		//Exercice 1.4
		f1= new Forme();
		f2 = new Forme("vert", false);
		
		System.out.println("f1 : " + f1.getCouleur() + " - " + f1.isColoriage());
		System.out.println("f2 : " + f2.getCouleur() + " - " +  f2.isColoriage());
		
		//Exercice 1.5
		f1.setColoriage(false);
		f1.setCouleur("rouge");
		System.out.println("f1 : " + f1.getCouleur() + " - " + f1.isColoriage());
		
		//Instanciation
		//Exercice 1.7
		System.out.println(f1.seDecrire());
		System.out.println(f2.seDecrire());
	}
}