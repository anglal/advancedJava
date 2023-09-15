package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
        String password = request.getParameter("password");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/Welcome");
        if(Validate.checkUser(email, password)) {
        	dispatcher.forward(request, response);
        }else {
        	response.getWriter().write("Username or Password incorrect");
        }
		
	}
	
}
