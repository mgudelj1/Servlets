package com.example.model;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTag extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		
		
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
		
		Student stu[] = {st1, st2, st3};
		
		out.println("<table>");
		out.println("<tr>");
		out.println("<th> Name   </th> <th> Last Name   </th> <th> Hometown   </th> <th>   Age </th>");
		out.println("</tr>");
		for(int i=0;i<stu.length;i++){
			out.println("<tr>");
			out.println("<th>" + stu[i].getName() + "</th>");
			out.println("<th>" + stu[i].getSurname() + "</th>");
			out.println("<th>" + stu[i].getHometown() + "</th>");
			out.println("<th>" + stu[i].getAge() + "</th>");
			out.println("</tr>");
		}
		out.println("</table>");
		
	}
}
