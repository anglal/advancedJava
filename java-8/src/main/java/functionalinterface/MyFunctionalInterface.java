package functionalinterface;

public class MyFunctionalInterface {
	public static void main(String ... args) {
		
		MyFunctInterfaImpl obj = new MyFunctInterfaImpl();
		obj.sayHello("Jhon");
		
	}
}


@FunctionalInterface
interface MyFunctInterface {
	public void sayHello(String name);
}

// Regular Interface use
class MyFunctInterfaImpl implements MyFunctInterface{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
}

