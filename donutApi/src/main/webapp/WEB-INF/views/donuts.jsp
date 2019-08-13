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

	<h1>Donut</h1>
	
		
	<div class="container">
	
	<p>Name: ${donuts.name }</p>
	<p>Calories: ${donuts.calories }</p>
	<p>Extras:
	<c:forEach items="${donuts.extras}" var="i">
		<li>${i}
	
	</c:forEach>
	
		
	</div>
	
	
		
		
		
	
	</ul>

</body>
</html>