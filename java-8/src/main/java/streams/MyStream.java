package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStream {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,45,66,35);
		
		//Extended way
		System.out.println("Extended way...............");
		Predicate<Integer>filter = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}
			
		};
		
		numbers
		.stream()
		.filter(filter)
		.forEach(x -> System.out.println(x));
		
		
		//Clean way
		System.out.println("Clean way..............");
		numbers
		.stream()
		.filter(x -> x %2 == 0)
		.forEach(x -> System.out.println(x));
		
		
		// Find the squares of the elements in the odd numbers
		// Extended way
		System.out.println("\n\n\nPrinting squares of even numbers..........\nExtended way..................................\n");
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		//Functional Interface
		Function<Integer, Integer> fc = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * t;
			}
			
		};
		
		list
		.stream()
		.filter(filter)
		.map(fc)
		.forEach(x -> System.out.println(x));
		
		
		// Short way
		System.out.println("\n\n\nPrinting squares of even numbers..........\nUsing inline lambda expression ..................................\n");
		list.stream()
		.filter(x -> x % 2 == 0)
		.map(x -> x*x)
		.forEach(x -> System.out.println(x));
		
	}
}
