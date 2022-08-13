package com.mindagte.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {
	public NumberServlet() {
		super();
	}

	public int number(int Number1, int Number2) {

		return 0;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {
		int Number1 = Integer.parseInt(request.getParameter("num1"));
		int Number2 = Integer.parseInt(request.getParameter("num2"));
		String Choice = request.getParameter("opre");
		PrintWriter out = response.getWriter();

		switch (Choice) {
		case "Add":
			out.println("Addition of " + Number1 + " and " + Number2 + " is " + (Number1 + Number2));
			break;
		case "Substrat":
			out.println("Substration of " + Number1 + " and " + Number2 + " is " + (Number1 - Number2));
			break;

		}
	}
}
