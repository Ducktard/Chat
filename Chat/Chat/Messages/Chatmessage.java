package Messages;

import Messagesystem.Message;

public class Chatmessage extends Message {

	private String content;
	
	public Chatmessage(int id){
		super.id = 1;
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
