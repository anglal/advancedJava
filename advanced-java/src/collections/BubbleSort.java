package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import comparables.Book;

public class BubbleSort {
	
	public static void main(String ...strings) {
		Book b6 = new Book("Book6", 50000, new Date());
		Book b1 = new Book("Book1", 100, new Date());
		Book b2 = new Book("Book2", 600, new Date());
		Book b3 = new Book("Book3", 300, new Date());
		Book b4 = new Book("Book4", 1, new Date());
		Book b5 = new Book("Book5", 1100, new Date());
		
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);
		
		
		bubbleSort(books);
		
		books.stream().forEach(x -> System.out.println(x));
	}

	public static void bubbleSort(List<Book> books) {

		int length = books.size() - 1;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length-i; j++) {
				if (books.get(j).getPrice() > books.get(j + 1).getPrice()) {
					Book temp = books.get(j);
					books.set(j, books.get(j + 1));
					books.set(j + 1, temp);
				}
			}

		}
	}
}
