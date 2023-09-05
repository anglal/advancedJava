package anonymousinnerclass;

import interfaces.MyFunctionalInterface;

public class MyAnonymousInnerClass {

	public static void main(String ... args) {
		
		// Anonymous inner class using interface
		MyFunctionalInterface obj = new MyFunctionalInterface() {

			@Override
			public void sayHi() {
				System.out.println("This is an anonymous class implemented.");
			}
			
		};
		
		obj.sayHi();
	}
}
