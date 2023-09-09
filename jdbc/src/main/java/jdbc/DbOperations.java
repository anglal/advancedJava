package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbOperations {
	Connection con;
	
	public DbOperations() {
		con = DbUtil.getConnection();
	}
	
	public boolean insertSubject(String name) throws SQLException{
		String query = "insert into subject(name) values('" + name + "');";
		return con.createStatement().execute(query);
		
	}

	public ArrayList getSubjectById(int i) throws SQLException {
		String query = "Select * from subject where id = " + i +";";
		ArrayList result = new ArrayList();
		result.add(i);
		ResultSet resultSet = con.createStatement().executeQuery(query);
		while(resultSet.next()) {
			result.add(resultSet.getString("name"));
		}
		return result;
	}

	public ResultSet getAllSubjects() throws SQLException {
		String query = "Select * from subject;";
		return con.createStatement().executeQuery(query);
	}

	public void insertStudent(String studentName, int score, String subject) throws SQLException {
		String query1 = "select * from subject where name = '" + subject + "';";
		ResultSet resultSet = con.createStatement().executeQuery(query1);
		resultSet.next();
		int subjectId = resultSet.getInt("id");	
		String query2 = "insert into student(student_name, score, subject_id) values('" + studentName + "'," + score + "," + subjectId + ")";
		System.out.println(query2);
		con.createStatement().execute(query2);
	}

	public ArrayList getStudenById(int id) throws SQLException{
		ArrayList record = new ArrayList();
		String query = "select * from student where id = " + id;
		ResultSet resultSet = con.createStatement().executeQuery(query);
		while(resultSet.next()) {
			record.add(resultSet.getInt("id"));
			record.add(resultSet.getString("student_name"));
			record.add(resultSet.getFloat("score"));
			record.add(resultSet.getInt("subject_id"));
		}
		return record;
	}

	public ResultSet getAllStudents() throws SQLException{
		String query = "select * from student";
		return con.createStatement().executeQuery(query);
	}
}
