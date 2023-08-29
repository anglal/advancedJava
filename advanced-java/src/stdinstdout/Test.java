package stdinstdout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String ...strings) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		char ch = (char)reader.read();
		
		System.out.println(charSearch(str,ch));
	}

	public static int charSearch(String str, char ch) {
		// TODO Auto-generated method stub
		return 0;
	}
}
