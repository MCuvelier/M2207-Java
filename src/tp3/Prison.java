package tp3;
import java.util.*;

public class Prison {
	//Attributs
	private String nom;
	//private Brigand[] tab;
	private Vector v;
	private int nbPrisonniers = 0;

	//Constructeurs
	public Prison(){
		nom = "Fort Alamo";
		v = new Vector(); //Par defaut, le vector vaut 10
	}
	
	//Methodes 
	public void mettreEnCellule(Brigand b) {
		v.add(b);
		System.out.println(b.quelEstTonNom() + " est mis dans la cellule " + nbPrisonniers );
		nbPrisonniers++;  //ajoute 1 pour le prochain prisonniers
	}

	public void sortirDeCellule(Brigand b) {
		v.remove(null);
		nbPrisonniers--; //Retire 1 lorsqu'un prisonniers
		System.out.println(b.quelEstTonNom() +" est sorti de sa cellulle");
	}

	public void compterLesPrisoniers() {
		System.out.println(" Il y a " + nbPrisonniers + " prisonniers à la prison " + nom);
	}
}