package Client;

import Messagesystem.Message;

public class Main {

	private static void main (String[]args){
		
		Client client = new Client();
		
		//test
		Message msg = new Message();
		client.send(msg);
	}
	
}
