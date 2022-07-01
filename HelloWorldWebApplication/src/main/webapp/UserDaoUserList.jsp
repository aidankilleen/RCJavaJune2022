<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="ie.rc.userdao.*, java.util.List" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		UserDao dao = new UserDao();
		List<User> users = dao.getUsers();
		dao.close();
	%>
	<h1>DAO User List</h1>
	
		<a href="AddUser.jsp">Add User</a>
		<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Active</th>
			</tr>
		</thead>
		<tbody>
		<% for (User u : users) { %>
			<tr>
				<td>
					<a href="UserDetail.jsp?id=<%=u.getId()%>">
						<%=u.getId() %>
					</a>
				</td>
				<td><%=u.getName() %></td>
				<td><a href="mailto:<%=u.getEmail()%>"><%=u.getEmail() %></a></td>
				<td>
					<%=u.isActive() ? "Active" : "Inactive" %>
				</td>
			</tr>
		<% } %>
	</tbody>
	</table>
</body>
</html>