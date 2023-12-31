package com.xml.entities;

public class Book {
	private String author;
	private String title;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [author=");
		builder.append(author);
		builder.append(", title=");
		builder.append(title);
		builder.append("]");
		return builder.toString();
	}

	
}
