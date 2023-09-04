package com.locations.sync;

import com.appliances.sync.Printer;

public class Lobby extends Thread{
	private Printer pr;
	
	public Lobby(Printer pr) {
		this.pr = pr;
	}
	@Override
	public void run() {
		pr.print("Lobby", 20);
	}
}
