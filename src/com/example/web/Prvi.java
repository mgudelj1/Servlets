package com.example.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Prvi
 */
@WebServlet(description = "Servlet za prvi zadatak", urlPatterns = { "/Prvi" })
public class Prvi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		RequestDispatcher view = request.getRequestDispatcher("PrviResult.jsp");
		Double num1 = 0.0;
		Double num2 = 0.0;
		try {
			num1 = Double.parseDouble(request.getParameter("FirstNumber"));
			num2 = Double.parseDouble(request.getParameter("SecondNumber"));
		} catch (NumberFormatException e) {
			request.setAttribute("ParseError", "One of the inputs is not number!");
			view.forward(request, response);
		}

		request.setAttribute("FirstNumber", num1);
		request.setAttribute("SecondNumber", num2);
		request.setAttribute("ServletMail", getInitParameter("ServletMail"));
		view.forward(request, response);
	}

}
