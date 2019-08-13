<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>${count } Donut Types</h1>
	
	<ol reversed>
		<c:forEach items="${donuts}" var="donuts">
		<li><a href="/donuts?id=${donuts.id }">${donuts.name}</a></li>
		
		</c:forEach>
	
	</ol>

</body>
</html>