package tp6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//les deux panneaux fonctionnent correctement ensemble
//le panneau client se connecte bien au panneau serveur
//le panneau serveur reçoie les messages du panneau client

public class PanneauClient extends JFrame implements ActionListener {
	// Attributs
	private Container panneau = getContentPane();
	private JTextField monTextField = new JTextField();
	private JButton b1 = new JButton("Envoyer le message");
	private Socket monSocket;
	private PrintWriter monPrintWriter;

	//Constructeur

	public PanneauClient(){
		//Creation de ma fenetre
		setTitle("Client- Panneau d'envoi de messages");
		setSize(250, 120);
		setLocation(0, 20);
		setVisible(true); //Se met toujours a la fin du constructeur * Si je le mets a la fin mon programme ne fonctionne pas correctement

		//Positionnement a l'interieur de la fenetre
		panneau.setLayout(new BorderLayout());
		panneau.add(b1, BorderLayout.SOUTH);
		panneau.add(monTextField, BorderLayout.CENTER);

		try {
			monSocket = new Socket("localhost", 8888);
			monPrintWriter = new PrintWriter(monSocket.getOutputStream());
		}catch(Exception e) {
			e.printStackTrace();

		}

		b1.addActionListener(this);

	}

	//Methode
	public static void main(String[] args) {
		PanneauClient app = new PanneauClient();
	}

	public void emettre() {
		try {
			monPrintWriter.println(monTextField.getText());
			System.out.println("Envoi du message");
			monPrintWriter.flush();
			monTextField.setText(""); // efface le champ d'ecriture
			System.out.println("Message envoye");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erreur lors de l'envoi du message");
		}

	}

	public void actionPerformed(ActionEvent arg0) {
		emettre();
	}
}