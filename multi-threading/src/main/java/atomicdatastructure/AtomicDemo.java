package atomicdatastructure;

public class AtomicDemo {
	public static void main(String[] args) {
		System.out.println("Atomic Integer demo");
		
		BiCounterWithAtomicIntegers biCounter = new BiCounterWithAtomicIntegers();
		
		biCounter.increment();
		biCounter.increment();
		
		System.out.println(biCounter.getI());
	}
	
	
	
	
}
