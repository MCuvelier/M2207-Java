package td1;

public class Exo1f {
	static String name ="BOB";
	static double age =18;
	static double poids =84;
	static double taille =1.82*1.82;
	static double imc =25;
	static double distance =0;
	
		public static void main(String[] args) {
			while (imc>23) {
				distance++;
				poids=poids-0.024;
				imc=poids/taille;
			}
			System.out.println(name+" pèse "+poids+"kg, il a parcouru "+distance+"km et son indice IMC est"+imc);
		}
}
