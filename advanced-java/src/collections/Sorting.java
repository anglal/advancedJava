package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import comparables.Movie;
import comparables.Table;
import comparators.MovieComparatorByPrice;
import comparators.TableComparatorByColor;

public class Sorting {
	public static void main(String ...strings) {
		List<Integer> collection = new ArrayList<>();
		collection.add(-4);
		collection.add(5);
		collection.add(1);
		collection.add(34);
		collection.add(21);
		
		collection.stream().forEach( x-> System.out.println(x));
		System.out.println("----------");
		Collections.sort(collection);
		collection.stream().forEach( x -> System.out.println(x));
		System.out.println("----------");
		Collections.sort(collection, Collections.reverseOrder());
		collection.stream().forEach(x -> System.out.println(x));
		
		
		List<Table> tables = new ArrayList<>();
		
		Table table1 = new Table(3, "Red");
		Table table2 = new Table(1, "Black");
		Table table3 = new Table(13, "White");
		Table table4 = new Table(30, "Brown");
		Table table5 = new Table(123, "Green");
		Table table6 = new Table(38, "Burgandy");
		Table table7 = new Table(32, "Yellow");
		
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		tables.add(table4);
		tables.add(table5);
		tables.add(table6);
		tables.add(table7);
		
		
		Collections.sort(tables);
		
		tables.stream().forEach(x-> System.out.println(x));
		
		
		Collections.sort(tables, new TableComparatorByColor());
		System.out.println("----------");
		tables.stream().forEach(x-> System.out.println(x));
		
		
		List<Movie> movies = new LinkedList<>();
		Movie movie1 = new Movie(333.00, "Enter the Dragon");
		Movie movie2 = new Movie(3.00, "Center the Dragon");
		Movie movie3 = new Movie(313.00, "Monster the Dragon");
		Movie movie4 = new Movie(367.00, "Thunder the Dragon");
		Movie movie5 = new Movie(543.00, "Seeker the Dragon");
		Movie movie6 = new Movie(30.00, "Mingle the Dragon");
		Movie movie7 = new Movie(1.00, "Hunger the Dragon");
		Movie movie8 = new Movie(0.00, "Tinger the Dragon");
		
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		movies.add(movie5);
		movies.add(movie6);
		movies.add(movie7);
		movies.add(movie8);
		
		Collections.sort(movies, new MovieComparatorByPrice());
		System.out.println("----------");
		movies.stream().forEach(x -> System.out.println(x));
		
	}
	
}
