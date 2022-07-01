<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Add User</h1>
	
	<form action="AddUserSave.jsp">
		<!-- this is a comment -->
		<input type="text" name="name" placeholder="Enter Name"/><br>
		<input type="text" name="email" placeholder="name@domain.com"/><br>
		Active:<input type="checkbox" name="active"/><br>
		<input type="submit" value="submit"/>
	</form>
	
</body>
</html>