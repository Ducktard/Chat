package Messagesystem;

public class Message {

	protected String messageID;
	protected String target;

	public String getMessageID() {
		return messageID;
	}
	
	public Message(String messageID,String target){
		this.messageID = messageID;
		this.target = target;
	}
	
	
}
