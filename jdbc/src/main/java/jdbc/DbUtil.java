package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	private static String DB_URL = "jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8";
	private static String USERNAME  = "student";
	private static String PASSWORD = "student";
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return con;
	}

	public static void closeConnection(Connection con) {
		try {
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
