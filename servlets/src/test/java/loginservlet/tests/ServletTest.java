package loginservlet.tests;

import static org.junit.Assert.assertEquals;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.servlets.LoginServlet;
import com.servlets.WelcomeServlet;
import com.util.RunningScripts;

public class ServletTest extends Mockito{
	@Mock
	HttpServletRequest request;
	
	@Mock
	HttpServletResponse response;
	
	@Mock
	RequestDispatcher reqDis;
	
	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
		RunningScripts rs = new RunningScripts();
		rs.contextInitialized(null);
	}
	
	@Test
	public void testLoginServlet() throws Exception{
		when(request.getParameter("email")).thenReturn("frescoplay@xyz");
		when(request.getParameter("password")).thenReturn("frescoplay");
		when(request.getRequestDispatcher("index.html")).thenReturn(reqDis);
		when(request.getRequestDispatcher("index")).thenReturn(reqDis);
		when(request.getRequestDispatcher("welcome")).thenReturn(reqDis);
		
		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		when(response.getWriter()).thenReturn(writer);
		
		LoginServlet loginServlet = new LoginServlet();
		loginServlet.doPost(request, response);
		String result = stringWriter.getBuffer().toString().trim();
		assertEquals(result, "Username or Password incorrect");
		
	}
	
	@Test
	public void testWelcomeServlet() throws Exception{
		StringWriter stringWriter  = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		when(response.getWriter()).thenReturn(writer);
		WelcomeServlet welcomeServlet = new WelcomeServlet();
		
		welcomeServlet.doPost(request, response);
		String result = stringWriter.getBuffer().toString().trim();
		assertEquals(result, "Welcome user");
	}
	
}
