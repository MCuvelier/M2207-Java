package tp3;

public class Histoire {
	public static void main(String[] args) {

		//Declaration
		//exercice 1.7
		Humain humain1;
		Dame dame1;
		Brigand brigand1;
		Cowboy cowboy1,clint;
		Sherif sherif1;
		Prison prison1;
		Cachot cachot1;

		//instanciation

		//Exercice 1.7
		humain1 = new Humain("Bob");
		humain1.sePresenter();
		humain1.boire();

		//exercice 2.4

		dame1 = new Dame("Rachel");
		dame1.sePresenter();
		dame1.priseEnOtage();
		dame1.estLiberee();
		
		//Exercice3.2
		brigand1 = new Brigand("Gunther");
		brigand1.sePresenter();  

		//Exercice 4.3
		cowboy1 = new Cowboy("Simon");
		cowboy1.sePresenter();
		

		//Exercice 7.2
		//brigand1.enleve(dame1);//reset des valeurs, mes valeurs ne seront pas aux valeurs de bases
		//brigand1.sePresenter(); //Verfication que les variables ont bien ete changees.
		cowboy1.tire(brigand1);
		System.out.println("******SCENARIO 7.5********");

		dame1.sePresenter();
		brigand1.sePresenter();
		brigand1.enleve(dame1);
		brigand1.sePresenter();
		dame1.sePresenter();
		cowboy1.tire(brigand1);
		dame1.estLiberee();
		dame1.sePresenter();

		System.out.println("*******Fin du scenario 7******");
		//Test sherif
		sherif1 = new Sherif("Marshall");
		sherif1.sePresenter();

		System.out.println("***********SCENARIO 8.4******");

		sherif1.sePresenter();
		sherif1.coffrer(brigand1);
		sherif1.sePresenter();
		
		/* EXERCICE 9 
		 Les methodes accessibles sont celles de Cowboy et Humain car un cowboy est humain.
		 Un sherif est bien un cowboy, mais l'inverse n'est pas vrai, c'est le cas ici. 
		 Sherif peut utiliser les methodes de Cowboy car celle ci est une classe fille de Cowboy, mais Cowboy etant la classe mere, ne peut pas acceder aux methodes de Sherif.

		clint = new Sherif("Clint");*/
		
		//Exercice 10 
		System.out.println("***********SCENARIO 10***********");
		prison1 = new Prison();
		prison1.compterLesPrisoniers();
		prison1.mettreEnCellule(brigand1);
		prison1.compterLesPrisoniers();
		prison1.sortirDeCellule(brigand1);
		prison1.compterLesPrisoniers();
		System.out.println("***********FIN du SCENARIO 10***********");
	
	
		//Exercice 11 test de la classe Cachot 
		cachot1 = new Cachot();
		cachot1.compterLesPersonnes();
		cachot1.mettreEnCellule(sherif1);
		cachot1.mettreEnCellule(cowboy1);
		cachot1.compterLesPersonnes();
		cachot1.sortirDeCellule(sherif1);
		cachot1.compterLesPersonnes();
	}
}