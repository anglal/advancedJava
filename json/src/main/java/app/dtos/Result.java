package app.dtos;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
	
	@JsonProperty("docs")
	private Book[] docs;

	public Book[] getDocs() {
		return docs;
	}

	public void setDocs(Book[] docs) {
		this.docs = docs;
	}
	
	public Book getBook(int index) {
		return docs[index];
	}

	@Override
	public String toString() {
		return "Result [docs=" + Arrays.toString(docs) + "]";
	}
	
	
}
