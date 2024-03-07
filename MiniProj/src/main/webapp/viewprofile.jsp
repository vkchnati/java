<%@ page language="java" 
         contentType="text/html; charset=ISO-8859-1"
    	 pageEncoding="ISO-8859-1"
    	 import="testmini.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean)application.getAttribute("ubean");
String fN=(String)request.getAttribute("fName");
out.println("Page of User:"+ub.getuName()+"<br>");
out.println(ub.getfName()+"&nbsp&nbsp"+ub.getlName()+"&nbsp&nbsp"+ub.getAddr()+"&nbsp&nbsp"+ub.getmId()+"&nbsp&nbsp"+ub.getPhNo()+"<br>");

%>
<a href="edit">EditProfile</a>
<a href="logout">LogOut</a>
</body>
</html>