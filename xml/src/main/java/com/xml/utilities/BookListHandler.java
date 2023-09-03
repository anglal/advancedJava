package com.xml.utilities;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.xml.entities.Book;
import com.xml.entities.BookStore;

public class BookListHandler extends DefaultHandler {
	
	// map the XML tags to contants
	private static final String BOOKS = "books";
	private static final String BOOK = "book";
	private static final String TITLE = "title";
	private static final String AUTHOR = "author";
	
	private BookStore rootElement;
	
	private StringBuilder data;
	private Book book;
	
	public BookListHandler() {
		data = new StringBuilder();
	}
	
	@Override
	public void startDocument() throws SAXException{
		rootElement = new BookStore();
		System.out.println("startDocuent()");
	}
	
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException{
		data.append(ch, start, length);
		System.out.println("  characters()");
	}
	
	@Override
	public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException{
		switch(qName) {
			case BOOKS:
				//<BOOKS>
				System.out.println("startElement() - " + qName);
				rootElement.setBooks(new ArrayList<Book>());
				break;
			case BOOK:
				System.out.println("\n   startElement() - " + qName);
				//opening book tag. create an empty book object.
				
				book = new Book();
				break;
			case TITLE:
			case AUTHOR:
				System.out.println("  startElement() - " + qName);
				//Opening author or title tag.
				//Clear the StringBuilder.
				data.setLength(0);
				break;
			
		}
	}

	@Override
	public void endElement(String uri, String LocanName, String qName) {
		switch(qName) {
		case BOOKS:
			System.out.println("\n   endElement() - " + qName);
			break;
		case BOOK:
			System.out.println("\n   endElement() - " + qName);
			//Closing book tag. create an empty book object.
			rootElement.getBooks().add(book);
			break;
		case TITLE:
			System.out.println("  endElement() - " + qName);
			//Closing author or title tag.
			//Clear the StringBuilder.
			book.setTitle(data.toString());
			break;
		case AUTHOR:
			System.out.println("  endElement() - " + qName);
			//Closing author or title tag.
			book.setAuthor(data.toString());
			break;
	}
	}
	
	@Override
	public void endDocument() {
		System.out.println("endDocument()");
	}
	
	public BookStore getResult() {
		return rootElement;
	}
}
