package Communication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import Server.ChatServer;

public class Server extends Thread {

	private final int  MAX_CONNECTIONS = 20;
	private final int PORT;
	private ArrayList<Connection> connections = new ArrayList<Connection>();
	private int id;
	private ServerSocket serverSocket;
	private ChatServer chatServer;

	public Server(int PORT,ChatServer chatServer) {
		this.PORT = PORT;
		this.chatServer = chatServer;
		chatServer.setCommunicationServer(this);
	}

	public void run() {
		
		try {
			serverSocket = new ServerSocket(PORT);
			while (connections.size() < MAX_CONNECTIONS) {
				Socket socket = serverSocket.accept();
				if (socket.isConnected()) {
					Connection newConnection = new Connection(this,socket, id);
					id++;
					connections.add(newConnection);
					newConnection.start();
				}
				
			}
			
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
