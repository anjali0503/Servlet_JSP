<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp file</title>
</head>
<body>
	<%!String message = "java is best";%>
	<%Date date = new Date(); %>
	<%
	for (int i = 0; i < 10; i++) {
	%>
	<h3>Java is grate!</h3>
	<%=message.toUpperCase()%>
	<%=date %>
	<%
	}
	%>
</body>
</html>