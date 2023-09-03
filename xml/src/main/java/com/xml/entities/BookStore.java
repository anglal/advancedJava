package com.xml.entities;

import java.util.List;

public class BookStore {

	private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookStore [books=");
		builder.append(books);
		builder.append("]");
		return builder.toString();
	}

}
