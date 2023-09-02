package app.dtos;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Book {

		@JsonProperty("author_name")
		private String[] authorNames;
		
		@JsonProperty("title")
		private String bookTitle;
		
		public Book() {
			
		}

		public String[] getAuthorNames() {
			return authorNames;
		}

		public void setAuthorNames(String[] authorNames) {
			this.authorNames = authorNames;
		}

		public String getBookTitle() {
			return bookTitle;
		}

		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}

		@Override
		public String toString() {
			return "Book [authorNames=" + Arrays.toString(authorNames) + ", bookTitle=" + bookTitle + "]";
		}
		
		
}
