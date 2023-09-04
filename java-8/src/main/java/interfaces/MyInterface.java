package interfaces;

public interface MyInterface {

	void sayHi();
	
	//default methods
	default void sayHello() {
		System.out.println("Hello, this is default method from inteface");
	}
	
	//static methods
	static void sayBye() {
		System.out.println("Bye, this is static method from interface");
	}
}
