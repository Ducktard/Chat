package Communication;

import java.net.Socket;

public class Connect {
	
	private final int PORT;
	private final String SERVERADDRESS;
	
	public Connect(String SERVERADDRESS, int PORT){
		this.PORT = PORT;
		this.SERVERADDRESS = SERVERADDRESS;
		Socket server;
		
		try{
			server = new Socket(SERVERADDRESS,PORT);
		}catch(Exception e){
			
		}
	}
}
