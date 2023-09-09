package jdbc;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JdbcTest {
	DbOperations dbOp = new DbOperations();
	@BeforeClass
	public static void test1() throws Exception{
		RunningScripts scr = new RunningScripts();
		scr.runDBScript();
	}
	
	@org.junit.Test
	public void test2() throws Exception {
		dbOp.insertSubject("Maths");
		dbOp.insertSubject("Science");
		dbOp.insertSubject("English");
		
		ArrayList record = dbOp.getSubjectById(2);
		assertEquals(record.get(0),2);
		assertEquals(record.get(1),"Science");
		ResultSet rs = dbOp.getAllSubjects();
		rs.next();
		assertEquals(rs.getInt("id"),1);
		assertEquals(rs.getString("name"), "Maths");
		rs.next();
		assertEquals(rs.getInt("id"),2);
		assertEquals(rs.getString("name"),"Science");
		rs.next();
		assertEquals(rs.getInt("id"), 3);
		assertEquals(rs.getString("name"), "English");
		
	}
	
	@org.junit.Test
	public void test3() throws Exception{
		ResultSet rs = DbUtil.getConnection().createStatement().executeQuery("select id, name from subject");
		rs.next();
		assertEquals(rs.getInt("id"),1);
		assertEquals(rs.getString("name"),"Maths");
		rs.next();
		assertEquals(rs.getInt("id"),2);
		assertEquals(rs.getString("name"),"Science");
		rs.next();
		assertEquals(rs.getInt("id"), 3);
		assertEquals(rs.getString("name"), "English");
	}
	
	
	public void helper1(ResultSet rs) throws SQLException {
		rs.next();
		assertEquals(rs.getInt("id"),1);
		assertEquals(rs.getString("student_name"),"Jhon");
		assertEquals((int)rs.getFloat("score"),67);
		assertEquals(rs.getInt("subject_id"),1);
		rs.next();
		assertEquals(rs.getInt("id"),2);
		assertEquals(rs.getString("student_name"),"Smith");
		assertEquals((int)rs.getFloat("score"),89);
		assertEquals(rs.getInt("subject_id"),2);
		
	}
	
	@org.junit.Test
	public void test4() throws Exception{
		dbOp.insertStudent("Jhon", 67, "Maths");
		dbOp.insertStudent("Smith", 89, "Science");
		ArrayList record = dbOp.getStudenById(1);
		assertEquals(record.get(0), 1);
		assertEquals(record.get(1), "Jhon");
		assertEquals(record.get(2), 67.0f);
		assertEquals(record.get(3),1);
		ResultSet rs = dbOp.getAllStudents();
		helper1(rs);
		
	}
}
