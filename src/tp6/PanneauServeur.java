package tp6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//test telnet effectué et reussi
public class PanneauServeur extends JFrame implements ActionListener {
	// Attributs
	private Container panneau = getContentPane();
	private JTextArea monTextArea = new JTextArea();
	private JScrollPane maScrollBar = new JScrollPane(monTextArea);
	private JButton b1 = new JButton("Fin du Programme");
	private ServerSocket serveur;
	private Socket monSocketClient;
	private BufferedReader monBufferedReader;


	//Constructeur

	public PanneauServeur(){
		//Creation de ma fenetre
		setTitle("Serveur- Panneau d'affichage");
		setSize(400, 300);
		setLocation(20, 20);
		setVisible(true); //Se met toujours a la fin du constructeur * Si je le mets a la fin mon programme ne fonctionne pas correctement
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Positionnement a l'interieur de la fenetre
		panneau.setLayout( new BorderLayout());
		panneau.add(maScrollBar, BorderLayout.CENTER);  //Ajout de la scrollBar
		panneau.add(b1, BorderLayout.SOUTH);

		b1.addActionListener(this); //Mise en ecoute sur le boutton b1
		monTextArea.setText("Le panneau est actif\n");


		//Exercice 5.2
		try {
			serveur = new ServerSocket(8888);
			monTextArea.append("Serveur demarre\n");  //Utilisation de append pour garder la phrase precedente

		} catch (Exception e) {
			e.printStackTrace();
			monTextArea.append("Erreur de Creation ServerSocket\n");	
		}
		ecouter();
	}

	//Methode
	public static void main(String[] args) {
		PanneauServeur app = new PanneauServeur();
	}

	public void actionPerformed(ActionEvent e) { //Methode pour la fermture du programme via le boutton
		System.exit(-1);
	}

	public void ecouter() {


		String ligne;
		try {
			monTextArea.append("Serveur en attente de connexion...\n");
			monSocketClient = serveur.accept();
			monBufferedReader = new BufferedReader(new InputStreamReader(monSocketClient.getInputStream())); //La capture du flux d'informations et sa conversion
			monTextArea.append("Le client s'est connecte\n");
			while ((ligne = monBufferedReader.readLine()) != null){
				monTextArea.append("Message recu : " + ligne + "\n");
			}
			serveur.close();
			monSocketClient.close();

		} catch (Exception e) {
			e.printStackTrace();
			monTextArea.append("Erreur dans le traitement de la connexion");
		}
	}
}