<%@page import="com.empmanagement.entities.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
Employee employee = (Employee) request.getAttribute("emp");
%>
<title>User: Home</title>
</head>
<body>
<%=employee%>
</body>
</html>