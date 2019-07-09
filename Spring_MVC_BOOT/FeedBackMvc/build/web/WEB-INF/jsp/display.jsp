<%-- 
    Document   : display
    Created on : Feb 24, 2019, 5:54:09 PM
    Author     : mohit2906
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FeedBack</title>
        <style type="text/css">
		.formdemo
		{
			padding:20px;
			margin: 5px;
			width:30vw;
			border:none;
			border-bottom: 1px solid black;
		}
		#sub
		{
			width:100px;
			height:50px;
			padding:5px;
			margin:10px;
			background-color: green;
			color:white;
			border:none;
			font-size: 20px;

		}
		#sub:hover{
			background-color: red;
		}
	</style>
    </head>
    <body>
        <center><h1>Give FeedBack!!</h1></center>
	<center>
		<form action="addData" method="GET"> 
			<table>
				<tr><input type="text" id="name" name="uname" placeholder="Enter Your Name : " class="formdemo" required="true"></tr><br>

				<tr><input type="email" id="email" name="email" placeholder="Enter your Mail : " class="formdemo" required="true"></tr><br>

				<tr><select id="reg" name="choice" required="true" class="formdemo" style="width:31.8vw;">
					<option value="">Enter Your Choice</option>
					<option value="1">Quora Article</option>
					<option value="2">Github</option>
				</select>
				</tr>

				<br>

				<tr>
					<input type="text" id="code" name="code" placeholder="Enter Quora article link or Github Link" class="formdemo">
				</tr>

				<br>

				<tr>
					<textarea id="msg" name="msg" class="formdemo" placeholder="Enter your Message About My article or Code"></textarea>
				</tr>

				<br>

				<tr>
					<select id="rat" name="rating" class="formdemo" style="width:31.8vw;" required="true">
						<option value="">Rate My Code Or Article</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>
				</tr>

				<br>

				<input type="submit" name="adddata" value="SUBMIT" id="sub">


			</table>
		</form>

	</center>

    </body>
</html>
