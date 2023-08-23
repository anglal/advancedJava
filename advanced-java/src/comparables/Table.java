package comparables;

public class Table implements Comparable<Table>{
	
	private int age;
	private String color;
	
	

	public Table(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public int compareTo(Table o) {
		return this.age - o.getAge();
	}



	@Override
	public String toString() {
		return "Table [age=" + age + ", color=" + color + "]";
	}

	
}
