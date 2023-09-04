package com.locations.mutex;

import com.appliances.mutex.Printer;

public class Office implements Runnable{
	private Printer pr;
	
	public Office(Printer pr) {
		this.pr = pr;
	}
	public void run() {
		synchronized(pr) {
		pr.print("Office", 10);
		}
	}

}
