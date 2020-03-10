package tp5;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.event.*;

public class CompteurDeClic extends JFrame implements ActionListener{
	//Attributs
	private int n = 0;
	private JButton b = new JButton("CLICK !");
	private JLabel monLabel = new JLabel("Vous avez clique 0 fois");
	private Container panneau = getContentPane();


	//Constructeurs 
	public CompteurDeClic() {
		setTitle("Compteur de clic");
		setSize(200, 100);
		setLocation(20, 20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);    //Se met toujours a la fin du constructeur
		if(isVisible()==true) {
			System.out.println("La fenetre est créée !");  //Condition pour 1.2, s'affiche que si la fenetre s'affiche
		}

		panneau.setLayout( new FlowLayout());
		panneau.add(b);
		panneau.add(monLabel);
		b.addActionListener(this); // this correspond ici a la fenetre
	}

	//Methodes

	public void actionPerformed(ActionEvent e) { //Methode executee lors d'une action
		System.out.println("Une action a ete detectee");
		n++;
		monLabel.setText("Vous avez clique " + n + " fois !");
	}

	//Methode main 
	public static void main(String[] args) {
		CompteurDeClic app = new CompteurDeClic ();
	}
}