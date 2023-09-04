package atomicdatastructure;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicIntegers {
	
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();
	
	
	public void increment() {
		i.incrementAndGet();
	}
	
	public void incrementJ() {
		j.incrementAndGet();
	}
	
	public AtomicInteger getI() {
		return i;
	}
	
	public AtomicInteger getJ() {
		return j;
	}
}
