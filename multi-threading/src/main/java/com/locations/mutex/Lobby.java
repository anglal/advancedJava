package com.locations.mutex;

import com.appliances.mutex.Printer;

public class Lobby extends Thread{
	private Printer pr;
	
	public Lobby(Printer pr) {
		this.pr = pr;
	}
	@Override
	public void run() {
		synchronized(pr) {
			pr.print("Lobby", 20);
		}
	}
}
