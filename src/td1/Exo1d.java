package td1;

public class Exo1d {
	static String name ="BOB";
	static double age =18;
	static double poids =58;
		
		public static void main(String[] args) {
			while (poids<=70) {
				age++;
				poids=poids+ 1.2;
			}
			System.out.println(name+" a "+age+"ans "+" et pèse "+poids+"kg.");
		}
}
