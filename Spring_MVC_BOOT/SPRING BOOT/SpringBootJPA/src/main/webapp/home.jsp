<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addAlien">
		<input type="text" name="aid" placeholder="Enter Id : "><br>
		<input type="text" name="aname" placeholder="Enter Name : "><br>
		<input type="submit" name="submit">
		
	</form> <br>
	
	<form action="getAlien">
		<input type="text" name="aid" placeholder="Enter Id To show its data"><br>
		<input type="submit">
	</form>

</body>
</html>