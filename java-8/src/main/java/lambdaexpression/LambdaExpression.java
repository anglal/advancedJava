package lambdaexpression;

public class LambdaExpression {
	//Expression for single abstract method that is present in functional interface
	
	public static void main(String[] abc) {
		FunctInterface obj = new FunctInterface(){
			@Override
			public void method1() {
					System.out.println("Anonymous Inner class implementation of an Interface.");			
			}
		
	};
	
	obj.method1();
	
	// lambda expression 1
	// One way to implement the only abastract method of functunal interface
		FunctInterface obj2 = () -> {System.out.println("Lambda expression implementation of an Interface.");};			
		
		obj2.method1();
		
	// labmda expression 2
		FunctInterface1 obj3 = (x) -> System.out.println("Hello " + x +"!");
		
		obj3.sayName("John");
	
	}
	
	
	
	
	
}
