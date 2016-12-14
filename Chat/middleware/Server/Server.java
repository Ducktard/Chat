package Server;

import java.util.ArrayList;

import Server.Session;

public class Server {

	// variables
	private boolean isActive = false;
	private ArrayList<Session> sessions = new ArrayList<Session>();
	// Konstanten
	final private int MAX_SESSIONS = 10;

	// Server Start

	public  synchronized void start(){
		this.isActive = true;
	}

	// Serverloop
	public void serverloop() {
		while (this.isActive && this.sessions.size() < this.MAX_SESSIONS) {

		}
	}

}
