package jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;

import org.apache.ibatis.jdbc.ScriptRunner;

/*
 * This file runs automatically and reads and executes sql queries in db.sql file
 */

public class RunningScripts {
	public void runDBScript() throws Exception{
		
		String connectionUrl = "jdbc:mysql://localhost:3306";
		String userName = "student";
		String password = "student";
		String filePath = "src/main/resources/db.sql";
		
		try {
			Connection con = DriverManager.getConnection(connectionUrl, userName, password);
			ScriptRunner scriptRunner = new ScriptRunner(con);
			Reader reader = new BufferedReader(new FileReader(filePath));

			scriptRunner.runScript(reader);
			reader.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
