package com.mindgate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId, password;
		userId = request.getParameter("username");
		password = request.getParameter("password");

		if (userId.equals("Anjali") && password.equals("Pandey")) {
			response.sendRedirect("home.html  ");
		} else {
			response.sendRedirect("invalid.html");
		}
	}

}
