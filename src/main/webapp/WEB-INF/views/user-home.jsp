<%@page import="com.empmanagement.services.Service"%>
<%@page import="com.empmanagement.entities.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
Employee employee = (Employee) session.getAttribute("emp"); 
if(employee==null){
	response.sendRedirect("home");
}
else{
%>
<%
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hi: <%=employee.getName() %></title>
<%@include file="bootstrap.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>
<a href="logout">Log out</a>
</body>
</html>
	
<%
}
%>

