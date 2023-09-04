package implementations;

import interfaces.MyInterface;

public class MyInterfaceImpl implements MyInterface{
	
	public static void main(String ... args) {
		MyInterfaceImpl obj = new MyInterfaceImpl();
		obj.sayHi();
		obj.sayHello();
		MyInterface.sayBye();
	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Say hi from class. This implementation is from class");
	}
	
	//Override default method
	@Override
	public void sayHello() {
		System.out.println("This is default overridden method from class");
	}

}
