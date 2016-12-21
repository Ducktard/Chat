package Messages;

import Messagesystem.Message;

public class Chatmessage extends Message {

	private String content;
	
	public Chatmessage(int id){
		id = 1;
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
