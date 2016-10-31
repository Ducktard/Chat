package Communication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import Messages.CloseMessage;

public class Connection extends Thread {

	private Server server;
	private Socket socket;
	private int clientID;
	private boolean online;
	
	
	public void run() {
		InputStream is;
		OutputStream os;

		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
			ObjectInputStream oInput = new ObjectInputStream(is);
			ObjectOutputStream oOutput = new ObjectOutputStream(os);
			while(online){
				Object rawObject = oInput.readObject();
				if(rawObject instanceof CloseMessage){
					
				}
				
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public Connection(Server server,Socket socket, int clientID) {
		this.server = server;
		this.socket = socket;
		this.clientID = clientID;
	}
	
	public Connection(){
	}

	

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

}
