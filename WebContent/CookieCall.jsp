<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Angry</title>
</head>
<body>

	<c:choose>
		<c:when test="${sessionScope.TimesCalled < 2}">
    		Well, since you are first time here, I want to welcome you!!
  		</c:when>

		<c:otherwise>
			<center>Why are you calling me for the
				${sessionScope.TimesCalled}. time ?</center>
			<ul>
				<c:forEach var="cookies" items="${cookie}">
					<li><c:out value="${cookies.key}" />: Object=<c:out
							value="${cookies.value}" />, value=<c:out
							value="${cookies.value.value}" /></li>
				</c:forEach>
			</ul>
		</c:otherwise>
	</c:choose>




</body>
</html>