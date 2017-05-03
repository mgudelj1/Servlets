package com.example.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookieTest
 */
@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer i;
		
		RequestDispatcher view = request.getRequestDispatcher("CookieCall.jsp");
		
		HttpSession session = request.getSession(false);
		
		if(session == null){
			session = request.getSession();
			session.setAttribute("TimesCalled", 1);
		}else{
			i = (Integer) session.getAttribute("TimesCalled");
			session.setAttribute("TimesCalled", i+1);
			
		}
		
		view.forward(request, response);
	}

	

}
