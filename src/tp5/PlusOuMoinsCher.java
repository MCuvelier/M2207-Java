package tp5;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class PlusOuMoinsCher extends JFrame implements ActionListener{

	//Attributs
	private Container panneau = getContentPane();
	private JTextField monTextField = new JTextField("");
	private JLabel monLabel = new JLabel("Votre proposition : ");
	private JLabel monLabel2 = new JLabel("La reponse est..");
	private JButton b = new JButton("Verifie");

	private int nombreDeviner = 0 + (int)(Math.random() *((100 - 0) + 1));
	private int nombreDeCoups = 0;

	//Constructeurs
	public PlusOuMoinsCher() {
		setTitle("Plus cher ou moins cher");
		setSize(350, 150);
		setLocation(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);    //Se met toujours a la fin du constructeur
		if(isVisible()==true) {
			System.out.println("La fenetre est creee !"); //Condition pour 1.2, s'affiche que si la fenetre s'affiche
		}
		panneau.setLayout(new GridLayout(2,2));
		panneau.add(monLabel);
		panneau.add(monTextField);
		panneau.add(b);
		panneau.add(monLabel2);
		b.addActionListener(this); //Activation de l'ecoute du boutton b
		System.out.println(nombreDeviner);
	}

	//Methodes

	//Methode pour dectection sur le boutton
	public void actionPerformed(ActionEvent e) { //Methode executee lors d'une action sur le bouton
		System.out.println("Une action a ete detectee, dans la zone de saisie il y a : " + monTextField.getText());
		if(nombreDeCoups<8) {                            // Condition pour limiter le nombre de coups a 8
			if(Integer.parseInt(monTextField.getText())>nombreDeviner) { // if, else if et else , conditions de victoire ou defaite
				System.out.println("C'EST MOINS CHER ! ");
				monLabel2.setText("C'EST MOINS CHER !");
			}else if(Integer.parseInt(monTextField.getText())<nombreDeviner) {
				System.out.println("C'EST PLUS CHER ! ");
				monLabel2.setText("C'EST PLUS CHER !");
			}else {
				System.out.println("C'EST LE JUSTE PRIX");
				monLabel2.setText("C'EST LE JUSTE PRIX");
				this.init();
			}
			nombreDeCoups++; 					//Incrementation du nombre de coup pour compter le nombre de fois jouer
			System.out.println("Vous avez jouer " + nombreDeCoups + " fois");
		}else {
			System.out.println("Trop tard :) ");
			this.init();
		}
	}

	public void init() {
		System.out.println("NOUVELLE PARTIE AVEC UN NOUVEAU PRIX");
		nombreDeviner = 0 + (int)(Math.random() *((100 - 0) + 1));
		monLabel2.setText("La reponse est..");
		System.out.println(nombreDeviner);
	}

	//Methode main 
	public static void main(String[] args) {
		PlusOuMoinsCher app = new PlusOuMoinsCher ();
	}
}