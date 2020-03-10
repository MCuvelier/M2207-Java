package tp5;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MonAppliGraphique extends JFrame {

	//Attributs
	private JButton b = new JButton("HelloWorld !"); //Exercice 2.1
	private Container panneau = getContentPane();
	private JButton b1 = new JButton("Bouton 0");
	private JButton b2 = new JButton("Bouton 1");
	private JButton b3 = new JButton("Bouton 2");
	private JButton b4 = new JButton("Bouton 3");
	private JLabel monLabel = new JLabel("JE suis un JLabel");
	private JTextField monTextField = new JTextField("JE suis un JTextField");

	//Constructeur 
	public MonAppliGraphique() {
		setTitle("Ma premiere application");
		setSize(400, 200);
		setLocation(20, 20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);    //Se met toujours a la fin du constructeur
		if(isVisible()==true) {
			System.out.println("La fenetre est creee !");  //Condition pour 1.2, s'affiche que si la fenetre s'affiche

		}
		panneau.setLayout(new GridLayout(3,2));
		panneau.add(b);
		panneau.add(b1);
		panneau.add(b2);
		panneau.add(b3);
		panneau.add(b4);
		//panneau.add(monLabel);
		//panneau.add(monTextField);
	}
	//Methodes
	//Exercice 1.1 methode main
	public static void main(String[] args) {
		MonAppliGraphique app = new MonAppliGraphique ();
	}
}