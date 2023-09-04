package inconsistency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Inconsitency {
	public static void main(String ... args) {
		Counter c = new Counter();
		BiCounter bc = new BiCounter();

	}
	
}

class Counter{
	private int i = 0;
	
	public void increment() {
		i++;
		//get
		//increment
		//set
	}
	
	public int getI() {
		return i;
	}
}

class BiCounter{
	private int i = 0;
	private int j = 0;
	
	public synchronized void incrementI() {
		i++;
		//get
		//increment
		//set
	}
	
	public synchronized void incrementJ() {
		j++;
	}
	
	public int getI() {
		return i;
	}
}

class BiCounterWithLock{
	private int i = 0;
	private int j = 0;
	
	
	//Locks
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public void incrementI() {
		
		//get a lock on i
		//increment
		//release
		lockForI.lock();
		i++;
		lockForI.unlock();

	}
	
	public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}
	
	public int getI() {
		return i;
	}
	
	public int getJ() {
		return j;
	}
}