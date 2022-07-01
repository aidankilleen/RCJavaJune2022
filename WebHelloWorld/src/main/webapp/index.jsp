<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="ie.rc.userdao.*, java.util.List, ie.rc.TestClass" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><%=TestClass.name %></h1>


<ul>
<% 
	UserDao dao = new UserDao();


	List<User> users = dao.getUsers();
	
	for (User u : users) {
		
		out.println("<li>" + u.getName() + "</li>");
	}
%>
</ul>

</body>
</html>