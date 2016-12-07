package Server;

import Communication.Server;

public class Main {

	public static void main(String[] args) {
		ChatServer chat = new ChatServer();
		Server server = new Server(110,chat);
		

	}

}
