<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Date</title>
</head>
<body>

<jsp:useBean id="today" class="java.util.Date" scope="page" />

[Format Date] <fmt:formatDate value="${today}" type="date" pattern="dd.MM.yyyy" /> <br>
[Standard Action] <jsp:getProperty property="date" name="today"/>.
<jsp:getProperty property="month" name="today"/>.
<jsp:getProperty property="year" name="today"/>

<br>
[Expression Language] ${today.date}.${today.month+1}.${today.year+1900} <br>

<c:choose>
  <c:when test="${today.day < 6}">Day of the week</c:when>
  <c:when test="${today.day > 5 }">Weekend day!</c:when>
  <c:otherwise>Something is wrong!</c:otherwise>
</c:choose>

</body>
</html>