package com.example.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Drugi
 */
@WebServlet("/Drugi")
public class Drugi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameterNames().hasMoreElements()) {
			response.sendRedirect("http://www.net.hr");
		} else {
			RequestDispatcher view = request.getRequestDispatcher("ErrorPage.jsp");
			view.forward(request, response);
		}
	}

}
