<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="ie.rc.membermanager.Member, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String title = "Hello World Web App";
	
		Member m = new Member(1, "Alice", "alice@gmail.com", false);
		
		ArrayList<Member> members = new ArrayList<Member>();
		
		members.add(new Member(1, "Alice", "alice@gmail.com", false));
		members.add(new Member(2, "Bob", "bob@gmail.com", true));
		members.add(new Member(3, "Carol", "carol@gmail.com", true));
		members.add(new Member(4, "Dan", "dan@gmail.com", true));
		members.add(new Member(5, "Eve", "eve@gmail.com", false));
		members.add(new Member(6, "Fred", "fred@gmail.com", true));
	%>

	<h1><%=title %></h1>
	
	
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
		<% for (Member member : members) { %>
			<tr>
				<td><%=member.getId() %></td>
				<td><%=member.getName() %></td>
				<td><%=member.getEmail() %></td>
				<td><%=member.isActive() ? "Active" : "Inactive" %></td>
			</tr>
		<% } %>
		</tbody>
	</table>
	
	

	<ul>
	
		<% for (Member member : members) { %>
		
			<li><%=member.getName() %></li>
			
		<% } %>
	</ul>




	
	<table>
		<tbody>
			<tr>
				<td>ID</td><td><%=m.getId() %></td>
			</tr>
			<tr>
				<td>Name</td><td><%=m.getName() %></td>
			</tr>
			<tr>
				<td>Email</td><td><%=m.getEmail() %></td>
			</tr>
			<tr>
				<td>Active</td>
				<td>
					<%=m.isActive()?"Active":"Inactive"%>
				</td>
			</tr>
			
		</tbody>
	</table>
	
	

	
	
	<%
		for (int i=1; i<=6; i++) {
	%>
			<h<%=i%>>Heading <%=i %></h<%=i%>>
	<%
		}
	%>
	
	<%
		// this is java code 
		out.print("<h2>Java Server Page Example</h2>");
	%>
	
	

	
	
	<ol>
		<li>one</li>
		<li>two</li>
		<li>three</li>
		<li>four</li>
	</ol>
	
</body>
</html>