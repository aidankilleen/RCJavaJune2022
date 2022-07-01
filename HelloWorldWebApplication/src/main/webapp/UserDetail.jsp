<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="ie.rc.userdao.*, java.util.List" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%
	String sid = request.getParameter("id");
	int id = Integer.parseInt(sid);
	
	UserDao dao = new UserDao();
	User u = dao.getUser(id);
	dao.close();
%>
</head>
<body>

	<h1>User Details <%=sid %></h1>
	
	<%=u %>
	
</body>
</html>