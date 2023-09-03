package com.xml.entities;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.xml.utilities.BookListHandler;

public class XmlApp {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String filename = "src/main/resources/booklist.xml";
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		BookListHandler handler = new BookListHandler();
		saxParser.parse(new File(filename), handler);
		
		BookStore bookList = handler.getResult();
		
		for(Book book : bookList.getBooks()) {
			System.out.println(book);
		}
	}

}
