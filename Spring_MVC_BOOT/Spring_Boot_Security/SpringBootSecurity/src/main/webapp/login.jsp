<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	
	${SPRING_SECURITY_LAST_EXCEPTION.message} <br>
	<h1>Welcome</h1>
	<form method="post" action="/login">
		<input type="text" placeholder="Enter UserName : " name="n1"><br><br>
		<input type="password" placeholder="Enter Password : " name="p1"><br><br>
		<input  type="submit" value="Login">
	</form>
</body>
</html>