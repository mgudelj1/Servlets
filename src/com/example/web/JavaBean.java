package com.example.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.model.*;
/**
 * Servlet implementation class JavaBean
 */
@WebServlet("/JavaBean")
public class JavaBean extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Student st1 = new Student();
		st1.setName("Ivan");
		st1.setSurname("Kosteliæ");
		st1.setAge(15);
		st1.setHometown("Zagreb");
		
		Student st2 = new Student();
		st2.setName("Ante");
		st2.setSurname("Glavota");
		st2.setAge(24);
		st2.setHometown("Split");
		
		Student st3 = new Student();
		st3.setName("Jure");
		st3.setSurname("Gabelica");
		st3.setAge(36);
		st3.setHometown("Osijek");
		
		request.setAttribute("st1", st1);
		request.setAttribute("st2", st2);
		request.setAttribute("st3", st3);
		
		RequestDispatcher view = request.getRequestDispatcher("SeeBeans.jsp");
		
		view.forward(request, response);
		
	}

	

}
