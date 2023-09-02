package app.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.json.JSONTokener;

public class BookService {

	private static final String BASE = "https://openlibrary.org/search.json?";

	public JSONObject fetch(String search) throws IOException {

		JSONObject object = null;

		String joinedSearch = search.replaceAll(" ", "%20");

		String urlString = String.format("%sq=%s", BASE, joinedSearch);

		URL url = new URL(urlString);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("content-type", "application/json");
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		JSONTokener tokener = new JSONTokener(in);
		object = new JSONObject(tokener);
		in.close();
		return object;
	}

}
