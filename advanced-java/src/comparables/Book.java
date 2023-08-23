package comparables;

import java.util.Date;

public class Book{

	private String name;
	private int price;
	private Date published;
	
	public Book(String name, int price, Date published) {
		this.name = name;
		this.price = price;
		this.published = published;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getPublished() {
		return published;
	}
	public void setPublished(Date published) {
		this.published = published;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", published=" + published + "]";
	}

}
