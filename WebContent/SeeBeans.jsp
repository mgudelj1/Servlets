<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.model.*"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
  

 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="st1" class="com.example.model.Student" scope="request"/>
<jsp:useBean id="st2" class="com.example.model.Student" scope="request"/>
<jsp:useBean id="st3" class="com.example.model.Student" scope="request"/>
Name of Student1:
<jsp:getProperty name="st1" property="name" /><br>
Surname of Student2:
<jsp:getProperty name="st2" property="surname" /><br>
Age of Student3:
<jsp:getProperty name="st3" property="age" /><br>
<br>
Is Filter Used: ${filterUsed}

<br><br>
Demonstration of JSTL(Prints "age" number of times name of student, and on even times prints surname):<br>
<c:forEach var="i" begin="1" end="${st1.age}">
	<c:out value="${st1.name}"/>
	<c:if test="${i % 2 == 0 }">
	<c:out value="${st1.surname}"/>
	</c:if>

	<br>
</c:forEach>

<br>


</body>
</html>