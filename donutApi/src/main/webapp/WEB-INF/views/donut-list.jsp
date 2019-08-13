<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="ISO-8859-1">
	<title>Donut's</title>
</head>
<body>

	<h1>${count } Donut's Types</h1>
	
	<ul>
		<c:forEach items="i" var="${donuts }">
		<li><a href="/donut/donut-list?id=${i.id }">${i.name}</a></li>
		
		</c:forEach>
	
	</ul>

</body>
</html>