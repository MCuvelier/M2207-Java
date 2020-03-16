package tp6;

import java.io.PrintWriter;
import java.net.Socket;

public class MonClient {

	public static void main(String[] args){
		Socket monSocket;
		PrintWriter monPrintWriter;

		try {
			monSocket = new Socket("localhost", 8888);
			monPrintWriter = new PrintWriter(monSocket.getOutputStream());
			System.out.println("Client: " + monSocket);
			System.out.println("Envoi du message : Hello World");
			monPrintWriter.println("Hello World");
			monPrintWriter.flush(); //methode flush c'est à dire je vide la variable monPrintWriter pour qu'il puisse prendre le prochain message
			monSocket.close();

		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}