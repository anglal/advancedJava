package com.app.mutex;

import com.appliances.mutex.Printer;
import com.locations.mutex.Lobby;
import com.locations.mutex.Office;

public class Application {

	public static void main(String ... args) {

		Printer pr = new Printer();
		Lobby lobby = new Lobby(pr);
		lobby.start();
		
		Office office = new Office(pr);
		office.run();
	}
}
