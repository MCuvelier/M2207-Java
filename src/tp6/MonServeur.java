package tp6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MonServeur {

	public static void main(String[] args) {
		Socket monSocketClient; //Creation du SocketClient
		ServerSocket monServerSocket; // Creation du SocketServeur
		BufferedReader monBufferedReader; //Creation du tampon pour stocker les messages, en bit, entrants

		try {
			monServerSocket = new ServerSocket(8888);  //Creation du serveur sur le port 8888
			monSocketClient = monServerSocket.accept();  // Autorisation de la connexion d'un client sur le serveur
			monBufferedReader = new BufferedReader(new InputStreamReader(monSocketClient.getInputStream())); //La capture du flux d'information et sa conversion se fait ici
			String message = monBufferedReader.readLine(); // Lecture du message dans la variable message
			System.out.println("ServerSocket: " + monServerSocket);
			System.out.println("Le client s'est connecte");
			System.out.println("Message : " + message);
			monSocketClient.close(); 	//Fermeture des clients et du serveur
			monServerSocket.close();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}