package com.appliances.mutex;

public class Printer {
	
	public void print(String docName, int noOfPages) {
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
