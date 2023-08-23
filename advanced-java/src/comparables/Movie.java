package comparables;

public class Movie {
	private double price;
	private String name;
	
	
	public Movie(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Movie [price=" + price + ", name=" + name + "]";
	}
	
	
}
