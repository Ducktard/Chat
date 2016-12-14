package Client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import Messagesystem.Message;

public class Client {

	private  String serverAddress;
	
	public void connect() throws UnknownHostException, IOException{
		Socket server = new Socket(serverAddress,8080);
	}
	public void send(Message msg){
		
	}
}
