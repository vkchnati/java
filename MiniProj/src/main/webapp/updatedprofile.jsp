<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fName=(String)request.getAttribute("fname");
String msg=(String)request.getAttribute("msg");
out.print("Page belongs to User:"+fName+"<br>");
out.println(msg);
%>
<a href="view">ViewProfile</a>
<a href="edit">EditProfile</a>
<a href="logout">LogOut</a>
</body>
</html>