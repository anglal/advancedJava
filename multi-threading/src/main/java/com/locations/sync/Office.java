package com.locations.sync;

import com.appliances.sync.Printer;

public class Office implements Runnable{
	private Printer pr;
	
	public Office(Printer pr) {
		this.pr = pr;
	}
	public void run() {
		pr.print("Office", 10);
	}

}
