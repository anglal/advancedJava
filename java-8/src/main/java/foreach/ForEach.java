package foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
	
	public static void main(String[] inputs) {
		
		List<Integer> myList = Arrays.asList(1,2,3,4,5);	
		// for each
		Consumer<Integer> funcInterface = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		};
		
		// takes functunal interface as an argument.
		myList.forEach(funcInterface);
		
		//Using lambda expression
		Consumer<Integer> lambda = x -> System.out.println(x);
		
		//Using lambda expression
		System.out.println("\nUsing lambda expression..............\n");
		
		myList.forEach(lambda);
		
		
		//Using lambda expression inline
		System.out.println("\nUsing inline lambda expression..............\n");
		
		myList.forEach(x -> System.out.println(x));
	}
	
}
