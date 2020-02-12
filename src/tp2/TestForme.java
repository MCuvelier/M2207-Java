package tp2;

public class TestForme {
	public static void main(String[] args) {	
		//Declaration
		//Exercice 1.4
		Forme f1,f2;

		//Exercice 2.3
		Cercle c1, c2, c3;
		
		//Exercice 3.2
		Cylindre cy1, cy2;
		
		//Instanciation
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
		
		//Exercice 2.3 et 2.5 après modification
		c1 = new Cercle();
		System.out.println(c1.seDecrire()); 
		
		//Exercice 2.7
		c2 = new Cercle(2.5);
		System.out.println(c2.seDecrire());
		
		/*Exercice 2.8
		Sans super(x,x) dans le constructeur Cercle(double r,String couleur, boolean coloriage), l'objet prendra
		les valeures par defauts donc "orange et true", definies dans Forme(). 
		*/
		
		//Exercice 2.10
		c3 = new Cercle(3.2,"jaune",false);
		System.out.println(c3.seDecrire());
	
		//Exercice 2.11
		System.out.println("L'aire du cercle c2 est  " + c2.calculerAire() + " cm²" );
		System.out.println("Le perimetre de c2 est " + c2.calculerPerimetre() + " cm");
		System.out.println("L'aire du cercle c3 est " + c3.calculerAire() +  " cm²");
		System.out.println("Le perimetre du cercle c3 est " + c3.calculerPerimetre() + " cm");
	
		//Exercice 3.2
		cy1 = new Cylindre();
		System.out.println(cy1.seDecrire());
		
		//Exercice 3.4
		cy2 = new Cylindre(4.2,1.3,"bleu",true);
		System.out.println(cy2.seDecrire());
		
		//Exercice 3.5
		System.out.println("Le volume du cylindre 1 est de " + cy1.calculerVolume() + " cm^3 ");
		System.out.println("Le volume du cylindre 2 est de " + cy2.calculerVolume() + " cm^3 ");
				
	}
}