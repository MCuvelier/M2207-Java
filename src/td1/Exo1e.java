package td1;

public class Exo1e {
	static String name ="BOB";
	static double age =18;
	static double poids =58;
	static double imc;
	static double taille= 1.82*1.82;
		public static void main(String[] args) {
			while (age<40) {
				age++;
				poids=poids+ 1.2;
			}
			imc=poids/taille;
			System.out.println(name+" a "+age+"ans "+", pèse "+poids+"kg et son indice IMC est"+imc);
		}
}
