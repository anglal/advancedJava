package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student", "student"); // db, user, pasword
			System.out.println("Database connected successfully");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from employees");
			
			while(rs.next()) {
				System.out.println(rs.getString("first_name")+ " : " + rs.getDouble("salary") );
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				rs.close();
			}
			
			if(stmt != null) {
				stmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		}

	}

}
