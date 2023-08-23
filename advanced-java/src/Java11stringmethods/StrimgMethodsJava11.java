package Java11stringmethods;

import java.util.stream.Stream;

public class StrimgMethodsJava11 {

	public static void main(String[] args) {
		
	//1. isBlank()
	String blankString ="    ";
	String blankString1="";
	String blankString2="\t\t\t\t\n";
	System.out.println(blankString.isBlank());
	System.out.println(blankString1.isBlank());
	System.out.println(blankString2.isBlank());
	
	
	//2. lines()
	String lines = "first line \nsecond line \nthird line";
	Stream<String> lines2 = lines.lines();
	lines2.forEach( line -> System.out.println(line));
	
	
	//3. strip(), stripLeading(), stripTrailing()
	
	String str ="    abc  ";
	System.out.println("start:" + str.strip() + ":end");
	System.out.println("start:" + str.stripLeading() + ":end");
	System.out.println("start:" + str.stripTrailing() + ":end");
	
	//4. repeat
	String strr = "hello";
	System.out.println(strr.repeat(5));
	
	
	}

}
