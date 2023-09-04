package com.appliances.sync;

public class Printer {
	
	public synchronized void print(String docName, int noOfPages) {
		for(int i = 1; i <= noOfPages; i++) {
			System.out.println("Printing " + docName + " page - " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("<---------------------------->");

	}
	
}
