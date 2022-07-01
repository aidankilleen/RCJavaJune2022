<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="ie.rc.userdao.*, java.util.List" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	boolean active = request.getParameter("active") != null;
	
	User newUser = new User(name, email, active);
	
	UserDao dao = new UserDao();
	User addedUser = dao.addUser(newUser);
	dao.close();
%>

</head>
<body>

<h1>Save the user</h1>

<%=addedUser %>

</body>
</html>