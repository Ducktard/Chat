package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import Messagesystem.Message;

public class Client {

	private  String serverAddress;
	private String clientName;
	private Socket server;
	
	
	public void connect(){
		try{
			server = new Socket(serverAddress,8080);
		}
		catch(Exception e){
			
		}
	}
	public void send(Message msg){
		try {
			OutputStream os = server.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Message receive(){
		try{
			InputStream is = server.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			Object receivedObject = ois.readObject();
			
			if(receivedObject instanceof Message){
				return (Message) receivedObject;
			}
			else{
				return null;
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public String getClientName() {
		return clientName;
	}

}
