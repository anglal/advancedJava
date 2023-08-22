package threadpool;

import java.util.Random;

public class Task implements Runnable{
	
	private String name;
	
	public Task(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		try {
			Random rand = new Random();
			int random = rand.nextInt(5) + 1;
			System.out.println("Started " + name);
			for (int i = 0; i <= random; i++) {
					
					Thread.sleep(1000);
					System.out.println("...working on : " + name);
				
			}
			
			System.out.println("Finished " + name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
}
