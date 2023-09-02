package app;

import java.io.IOException;

import org.json.JSONObject;

import app.dtos.Result;
import app.services.BookService;
import app.utilities.JsonConverter;

public class BookApp {
	
	public static void main(String... args) throws IOException {
		BookService bookService = new BookService();
		JSONObject object = bookService.fetch("the lord of the rings");
		
		if(null != object) {
			System.out.println(object.toString());
			
			Result result = JsonConverter.map(object);
			
			System.out.println(result);
		}
	}
}
