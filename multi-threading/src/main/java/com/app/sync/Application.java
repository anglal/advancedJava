package com.app.sync;

import com.appliances.sync.Printer;
import com.locations.sync.Lobby;
import com.locations.sync.Office;

public class Application {

	public static void main(String ... args) {

		Printer pr = new Printer();
		Lobby lobby = new Lobby(pr);
		lobby.start();
		
		Office office = new Office(pr);
		office.run();
	}
}
