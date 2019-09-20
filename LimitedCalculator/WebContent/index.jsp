<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Limited Calculator</title>
</head>
<body>
<h1>Limited Calculator</h1>
<form action = "getCalculationServlet" method = "post">
   Enter first whole number:
   <input type = "text" name = "firstUserNumber" size = "7">
   Enter second whole number:
   <input type = "text" name = "secondUserNumber" size = "7">
   <input type = "submit" value = "Multiply" />
   </form>
</body>
</html>