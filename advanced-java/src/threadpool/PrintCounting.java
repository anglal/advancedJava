package threadpool;

public class PrintCounting implements Runnable {
	
	private int count;
	
	public PrintCounting(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		for(int i = 0; i<= 10; i++) {
			System.out.println(count + " X " + i + "=" + i*count);
		}
	}

}
